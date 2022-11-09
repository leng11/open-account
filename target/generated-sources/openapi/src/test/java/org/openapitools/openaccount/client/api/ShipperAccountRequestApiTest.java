/*
 * UPS Accounts API
 * UPS Open Account API enables UPS 3rd Party Vendors to request a UPS Shipper Account. If the UPS Shipper Account request is approved, an UPS Shipper Account Number is generated. The UPS Ready Vendor user should first complete the registration process and get a My UPS ID before requesting a Shipper Account. Addresses are validated for accuracy. The User is expected to provide the primary reason for requesting a Shipper Account and the estimated number of Packages to be shipped.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.openaccount.client.api;

import org.openapitools.openaccount.client.model.ErrorResponseWrapper;
import org.openapitools.openaccount.client.model.OpenAccountRequest;
import org.openapitools.openaccount.client.model.OpenRequestResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ShipperAccountRequestApi
 */
@Ignore
public class ShipperAccountRequestApiTest {

    private final ShipperAccountRequestApi api = new ShipperAccountRequestApi();

    
    /**
     * Request Shipper Accounts
     *
     * Request Shipper Accounts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void shipperAccountRequestTest() {
        String xTransactionId = null;
        String xTransactionSource = null;
        String requestOption = null;
        String subVersion = null;
        String xCustomerContext = null;
        OpenAccountRequest openAccountRequest = null;
        OpenRequestResponse response = api.shipperAccountRequest(xTransactionId, xTransactionSource, requestOption, subVersion, xCustomerContext, openAccountRequest);

        // TODO: test validations
    }
    
}