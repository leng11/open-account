package com.ups.dap.app;


import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.openapitools.openaccount.client.ApiClient;
import org.openapitools.openaccount.client.api.ShipperAccountRequestApi;
import org.openapitools.openaccount.client.model.Address;
import org.openapitools.openaccount.client.model.CommonResponse;
import org.openapitools.openaccount.client.model.CommonResponseAdditionalInfoInner;
import org.openapitools.openaccount.client.model.OpenAccountRequest;
import org.openapitools.openaccount.client.model.OpenRequestResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ups.dap.app.tool.CreateRequestEnricher;
import com.ups.dap.app.tool.Util;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@AllArgsConstructor
public class OpenAccountDemo implements CommandLineRunner {
	private static final String SCENARIO_NAME_LOG_FORMAT = "Rate Response for scenario: {}";
	
	RestTemplate restTemplate;
	AppConfig appConfig; 

	@Override
	public void run(String... args) throws Exception {
		try {
			// Get an access token.
			String accessToken = Util.getAccessToken(appConfig, restTemplate);
			
			openAccountActivity(accessToken);
		
		} catch (Exception ex) {
			applicationErrorHandler(ex);
		}
	}
	
	private void openAccountActivity(final String accessToken) {
		// Prepare Shipper Account Request api access.
		final ShipperAccountRequestApi shipperAccountRequestApi = initializeApi(restTemplate, appConfig.getRateBaseUrl(), accessToken);
		
		ObjectMapper objectMapper = new ObjectMapper();
					
		// Run through different Shipper Account request, ie. OpenAccountSuccess, invalid UPS id(like "badUPSId").
		// 
		// Each iteration will create a OpenAccountRequest from a pre-determined json file verses
		// creating a OpenAccountRequest object and calling a setter for particular attribute.
		for(Map.Entry<String, List<String>> entry : appConfig.getScenarioProperties().entrySet()) {
			try {
				OpenAccountRequest openAccountRequest = Util.createRequestFromJsonFile(entry.getKey(),
																							entry.getValue().get(AppConfig.SCENARIO_PROPERTIES_JSON_FILE_NAME),
																							OpenAccountRequest.class,
																							appConfig,
																							Arrays.asList(new CreateRequestEnricher() {}));
			
				// create a 32 character unique id.
				final String transId = UUID.randomUUID().toString().replace("-", "");
			
				String requestOption = "";
				if(entry.getValue().size() > AppConfig.SCENARIO_PORPERTY_REQUEST_OPTION_PARAMETER) {
					requestOption = entry.getValue().get(AppConfig.SCENARIO_PORPERTY_REQUEST_OPTION_PARAMETER);			
				}
				
				log.info("transId: {}\nrequestOption: [{}]", transId, requestOption);
				final OpenRequestResponse openRequestResponse = shipperAccountRequestApi.shipperAccountRequest(transId,
																													appConfig.getTransactionSrc(),
																													requestOption,
																													null,
																													null,
																													openAccountRequest);
				
				log.info("response json: [{}]", objectMapper.writeValueAsString(openRequestResponse));
				processResult(entry.getKey(), openRequestResponse);
			} catch(HttpClientErrorException httpClientException) {
				log.warn(SCENARIO_NAME_LOG_FORMAT, entry.getKey());
				log.warn("Http exception - " + httpClientException.getStatusCode(), httpClientException);
			} catch(JsonProcessingException jsonProcessingException) {
				log.warn(SCENARIO_NAME_LOG_FORMAT, entry.getKey());
				log.warn("failed to write object into json format for logging.", jsonProcessingException);
			} catch(Exception ex) {
				log.warn(SCENARIO_NAME_LOG_FORMAT, entry.getKey());
				log.warn("failed to run scenario.", ex);
			}
			log.info("\n");
		}
	}
	
	public static ShipperAccountRequestApi initializeApi(final RestTemplate restTemplate, final String rateBaseUrl, final String accessToken) {
		ShipperAccountRequestApi shipperAccountRequestApi = new ShipperAccountRequestApi(new ApiClient(restTemplate));
		shipperAccountRequestApi.getApiClient().setBasePath(rateBaseUrl);
		shipperAccountRequestApi.getApiClient().addDefaultHeader(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
		return shipperAccountRequestApi;
	}
	
	private void processResult(final String scenarioName, final OpenRequestResponse openRequestResponse) {
		log.info(SCENARIO_NAME_LOG_FORMAT, scenarioName);
		
		printStatus(openRequestResponse.getOpenAccountResponse());
		printShipNumber(openRequestResponse.getShipperNumber());
		printAddressCandidate(openRequestResponse.getAddressCandidate());
	}
	
	private void printStatus(final CommonResponse response) {
		log.info("\tResponse");
		log.info("\t\tStatus: {}", response.getStatus());
		
		List<CommonResponseAdditionalInfoInner> responseInfo = response.getAdditionalInfo();
		if(!responseInfo.isEmpty()) {
			log.info("\t\tAdditionalInfo:");
			responseInfo.forEach(info->{
											log.info("\t\t\t{} {} {}", info.getInformationType(),
																		info.getCode(),
																		info.getDescription());
										});
		}
	}
	
	private void printShipNumber(final String shipNumber) {
		log.info("\t\tShipNumber: {}", shipNumber);
	}
	
	private void printAddressCandidate(final Address address) {
		if(null == address) {
			return;
		}
	
		log.info("\t\tAddressCandidate:");
		log.info("\t\t\taddressType: {}", address.getAddressType());
		log.info("\t\t\tcity: {}, state: {}, postal code: {}", address.getCity(),
																address.getStateOrProvinceCode(),
																address.getPostalCode());
	}
	
	private void applicationErrorHandler(Exception ex) {
		log.warn("failed to complete request", ex);
	}
}
