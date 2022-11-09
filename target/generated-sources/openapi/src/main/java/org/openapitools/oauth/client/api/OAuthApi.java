package org.openapitools.oauth.client.api;

import org.openapitools.oauth.client.ApiClient;

import org.openapitools.oauth.client.model.GenerateTokenSuccessResponse;
import org.openapitools.oauth.client.model.TokenErrorResponse;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-09T11:49:45.247072200-05:00[America/New_York]")
@Component("org.openapitools.oauth.client.api.OAuthApi")
public class OAuthApi {
    private ApiClient apiClient;

    public OAuthApi() {
        this(new ApiClient());
    }

    @Autowired
    public OAuthApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid Request
     * <p><b>401</b> - Unauthorized Request
     * <p><b>403</b> - Blocked Merchant
     * <p><b>429</b> - Quota Limit Exceeded
     * @param grantType Valid values: client_credentials (required)
     * @param xMerchantId Client merchant ID (optional)
     * @return GenerateTokenSuccessResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public GenerateTokenSuccessResponse generateToken(String grantType, String xMerchantId) throws RestClientException {
        return generateTokenWithHttpInfo(grantType, xMerchantId).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid Request
     * <p><b>401</b> - Unauthorized Request
     * <p><b>403</b> - Blocked Merchant
     * <p><b>429</b> - Quota Limit Exceeded
     * @param grantType Valid values: client_credentials (required)
     * @param xMerchantId Client merchant ID (optional)
     * @return ResponseEntity&lt;GenerateTokenSuccessResponse&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<GenerateTokenSuccessResponse> generateTokenWithHttpInfo(String grantType, String xMerchantId) throws RestClientException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'grantType' when calling generateToken");
        }
        

        final MultiValueMap<String, String> localVarQueryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders localVarHeaderParams = new HttpHeaders();
        final MultiValueMap<String, String> localVarCookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> localVarFormParams = new LinkedMultiValueMap<String, Object>();

        if (xMerchantId != null)
        localVarHeaderParams.add("x-merchant-id", apiClient.parameterToString(xMerchantId));

        if (grantType != null)
            localVarFormParams.add("grant_type", grantType);

        final String[] localVarAccepts = { 
            "application/json"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/x-www-form-urlencoded"
         };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "basicAuth" };

        ParameterizedTypeReference<GenerateTokenSuccessResponse> localReturnType = new ParameterizedTypeReference<GenerateTokenSuccessResponse>() {};
        return apiClient.invokeAPI("/security/v1/oauth/token", HttpMethod.POST, Collections.<String, Object>emptyMap(), localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localReturnType);
    }
}
