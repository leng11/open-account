package com.ups.dap.app;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.openapitools.openaccount.client.api.ShipperAccountRequestApi;
import org.openapitools.openaccount.client.model.OpenAccountRequest;
import org.openapitools.openaccount.client.model.OpenRequestResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.ups.dap.OpenAccountApplication;
import com.ups.dap.app.tool.CreateRequestEnricher;
import com.ups.dap.app.tool.Util;

@SpringBootTest(classes = OpenAccountApplication.class)
class OpenAccountApplicationTests {
	@Autowired
	AppConfig appConfig;
	
	@Autowired
	RestTemplate restTemplate;
	
	@Test
    void testMain() {
		assertDoesNotThrow(() -> {
	        OpenAccountApplication.main(new String[]{
	                "--spring.main.web-environment=false",
	                "--spring.autoconfigure.exclude=blahblahblah"
	        });
		});
    }
	
	@Test
	void allJsonFileExist() throws ClassNotFoundException {
		for(Map.Entry<String, List<String>> entry : appConfig.getScenarioProperties().entrySet()) {
			Class<?> classType = Class.forName(entry.getValue().get(AppConfig.SCENARIO_PROPERTIES_CLASS_NAME));
		
			Object request = Util.createRequestFromJsonFile(entry.getKey(),
															entry.getValue().get(AppConfig.SCENARIO_PROPERTIES_JSON_FILE_NAME),
															classType,
															appConfig,
															Collections.emptyList());
			assertNotNull(request);
			assertTrue(request instanceof OpenAccountRequest);
			assertNotNull(((OpenAccountRequest)request).getEndUserInformation());
		}
	}
	
	@Test
	void notExistJsonFile() throws ClassNotFoundException {	
		assertThrows(IllegalStateException.class, () -> {
			Util.createRequestFromJsonFile("Non-existing Json file",
												"unknownFile",
												OpenAccountRequest.class,
												null,
												null);
		});
	}    	

	@Test
	void scenarioSyntax() throws ClassNotFoundException {
		Map<String, List<String>> mapToRequestInfo = appConfig.getScenarioProperties();
		for(Map.Entry<String, List<String>> entry : mapToRequestInfo.entrySet()) {
			final String scenarioName = entry.getKey();
			final String jsonFileName = entry.getValue().get(AppConfig.SCENARIO_PROPERTIES_JSON_FILE_NAME);
			final String className = entry.getValue().get(AppConfig.SCENARIO_PROPERTIES_CLASS_NAME);

			assertNotNull(scenarioName);
			assertNotNull(jsonFileName);
			assertNotNull(className);
			
			if(entry.getValue().size() > AppConfig.SCENARIO_PORPERTY_REQUEST_OPTION_PARAMETER) {
				assertNotNull(entry.getValue().get(AppConfig.SCENARIO_PORPERTY_REQUEST_OPTION_PARAMETER));
			}
			
			Class<?> classType = Class.forName(className);
			assertTrue(classType instanceof Class);
		}
	}
	
	@Test
	void getAccessToken() {
		String accessToken = Util.getAccessToken(appConfig, restTemplate);
		assertNotNull(accessToken);
	}
	
	@Test
	void getResponse() throws JsonMappingException, JsonProcessingException {
		String accessToken = Util.getAccessToken(appConfig, restTemplate);
		// Prepare Shipper Account Request api access.
		final ShipperAccountRequestApi shipperAccountRequestApi = OpenAccountDemo.initializeApi(restTemplate, appConfig.getRateBaseUrl(), accessToken);
				
				
		final List<String> successScenarioParameters = appConfig.getScenarioProperties().get(AppConfig.OPEN_ACCOUNT_SUCCESS_SCENARIO);
		final String successScenarioJsonFileName = successScenarioParameters.get(AppConfig.SCENARIO_PROPERTIES_JSON_FILE_NAME);
		
		OpenAccountRequest openAccountRequest = Util.createRequestFromJsonFile(AppConfig.OPEN_ACCOUNT_SUCCESS_SCENARIO,
																								successScenarioJsonFileName,
																								OpenAccountRequest.class,
																								appConfig,
																								Arrays.asList(new CreateRequestEnricher() {}));
					
		// create a 32 character unique id.
		final String transId = UUID.randomUUID().toString().replace("-", "");
					
		String requestOption = null;
		if(successScenarioParameters.size() > AppConfig.SCENARIO_PORPERTY_REQUEST_OPTION_PARAMETER) {
			requestOption = successScenarioParameters.get(AppConfig.SCENARIO_PORPERTY_REQUEST_OPTION_PARAMETER);			
		}
						
		final OpenRequestResponse openRequestResponse = shipperAccountRequestApi.shipperAccountRequest(transId,
																											appConfig.getTransactionSrc(),
																											requestOption,
																											null,
																											null,
																											openAccountRequest);
		assertNotNull(openAccountRequest);
		assertNotNull(openRequestResponse);
		assertNotNull(openAccountRequest.getEndUserInformation());
		assertNotNull(openRequestResponse.getShipperNumber());
	}
	
	@Test
	void restTemplateInjection() {
		assertNotNull(restTemplate);
	}
}
