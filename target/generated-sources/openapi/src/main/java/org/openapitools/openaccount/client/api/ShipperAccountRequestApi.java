package org.openapitools.openaccount.client.api;

import org.openapitools.openaccount.client.ApiClient;

import org.openapitools.openaccount.client.model.ErrorResponseWrapper;
import org.openapitools.openaccount.client.model.OpenAccountRequest;
import org.openapitools.openaccount.client.model.OpenRequestResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-09T11:49:46.244314200-05:00[America/New_York]")
@Component("org.openapitools.openaccount.client.api.ShipperAccountRequestApi")
public class ShipperAccountRequestApi {
    private ApiClient apiClient;

    public ShipperAccountRequestApi() {
        this(new ApiClient());
    }

    @Autowired
    public ShipperAccountRequestApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Request Shipper Accounts
     * Request Shipper Accounts
     * <p><b>200</b> - Customer Account Created Successfully
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * @param xTransactionId Unique Transaction Id (optional)
     * @param xTransactionSource Transaction Origin Source (optional)
     * @param requestOption Request Options (optional)
     * @param subVersion Sub-version Number if any (optional)
     * @param xCustomerContext Customer Context if any (optional)
     * @param openAccountRequest Generate sample code for popular API requests by selecting an example below. To view a full sample request and response, first click \&quot;Authorize\&quot; and enter your application credentials, then populate the required parameters above and click \&quot;Try it out\&quot;. (optional)
     * @return OpenRequestResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public OpenRequestResponse shipperAccountRequest(String xTransactionId, String xTransactionSource, String requestOption, String subVersion, String xCustomerContext, OpenAccountRequest openAccountRequest) throws RestClientException {
        return shipperAccountRequestWithHttpInfo(xTransactionId, xTransactionSource, requestOption, subVersion, xCustomerContext, openAccountRequest).getBody();
    }

    /**
     * Request Shipper Accounts
     * Request Shipper Accounts
     * <p><b>200</b> - Customer Account Created Successfully
     * <p><b>400</b> - Bad Request
     * <p><b>401</b> - Unauthorized
     * @param xTransactionId Unique Transaction Id (optional)
     * @param xTransactionSource Transaction Origin Source (optional)
     * @param requestOption Request Options (optional)
     * @param subVersion Sub-version Number if any (optional)
     * @param xCustomerContext Customer Context if any (optional)
     * @param openAccountRequest Generate sample code for popular API requests by selecting an example below. To view a full sample request and response, first click \&quot;Authorize\&quot; and enter your application credentials, then populate the required parameters above and click \&quot;Try it out\&quot;. (optional)
     * @return ResponseEntity&lt;OpenRequestResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<OpenRequestResponse> shipperAccountRequestWithHttpInfo(String xTransactionId, String xTransactionSource, String requestOption, String subVersion, String xCustomerContext, OpenAccountRequest openAccountRequest) throws RestClientException {
        Object localVarPostBody = openAccountRequest;
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "requestOption", requestOption));
        localVarQueryParams.putAll(apiClient.parameterToMultiValueMap(null, "subVersion", subVersion));

        if (xTransactionId != null)
        localVarHeaderParams.add("x-transaction-id", apiClient.parameterToString(xTransactionId));
        if (xTransactionSource != null)
        localVarHeaderParams.add("x-transaction-source", apiClient.parameterToString(xTransactionSource));
        if (xCustomerContext != null)
        localVarHeaderParams.add("x-customer-context", apiClient.parameterToString(xCustomerContext));

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "oauth2" };

        ParameterizedTypeReference<OpenRequestResponse> localReturnType = new ParameterizedTypeReference<OpenRequestResponse>() {};
        return apiClient.invokeAPI("/customers/v1/account", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
