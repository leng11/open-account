/*
 * OAuth
 * Retrive OAuth Bearer token on behalf of personal resources, not on behalf of another user
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.oauth.client.api;

import org.openapitools.oauth.client.model.GenerateTokenSuccessResponse;
import org.openapitools.oauth.client.model.TokenErrorResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for OAuthApi
 */
@Ignore
public class OAuthApiTest {

    private final OAuthApi api = new OAuthApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateTokenTest() {
        String grantType = null;
        String xMerchantId = null;
        GenerateTokenSuccessResponse response = api.generateToken(grantType, xMerchantId);

        // TODO: test validations
    }
    
}
