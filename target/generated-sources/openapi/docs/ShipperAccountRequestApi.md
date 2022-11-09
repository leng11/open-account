# ShipperAccountRequestApi

All URIs are relative to *https://wwwcie.ups.com/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**shipperAccountRequest**](ShipperAccountRequestApi.md#shipperAccountRequest) | **POST** /customers/v1/account | Request Shipper Accounts |



## shipperAccountRequest

> OpenRequestResponse shipperAccountRequest(xTransactionId, xTransactionSource, requestOption, subVersion, xCustomerContext, openAccountRequest)

Request Shipper Accounts

Request Shipper Accounts

### Example

```java
// Import classes:
import org.openapitools.openaccount.client.ApiClient;
import org.openapitools.openaccount.client.ApiException;
import org.openapitools.openaccount.client.Configuration;
import org.openapitools.openaccount.client.auth.*;
import org.openapitools.openaccount.client.models.*;
import org.openapitools.openaccount.client.api.ShipperAccountRequestApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://wwwcie.ups.com/api");
        
        // Configure OAuth2 access token for authorization: oauth2
        OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
        oauth2.setAccessToken("YOUR ACCESS TOKEN");

        ShipperAccountRequestApi apiInstance = new ShipperAccountRequestApi(defaultClient);
        String xTransactionId = "xTransactionId_example"; // String | Unique Transaction Id
        String xTransactionSource = "xTransactionSource_example"; // String | Transaction Origin Source
        String requestOption = "Y"; // String | Request Options
        String subVersion = "subVersion_example"; // String | Sub-version Number if any
        String xCustomerContext = "xCustomerContext_example"; // String | Customer Context if any
        OpenAccountRequest openAccountRequest = new OpenAccountRequest(); // OpenAccountRequest | Generate sample code for popular API requests by selecting an example below. To view a full sample request and response, first click \"Authorize\" and enter your application credentials, then populate the required parameters above and click \"Try it out\".
        try {
            OpenRequestResponse result = apiInstance.shipperAccountRequest(xTransactionId, xTransactionSource, requestOption, subVersion, xCustomerContext, openAccountRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipperAccountRequestApi#shipperAccountRequest");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **xTransactionId** | **String**| Unique Transaction Id | [optional] |
| **xTransactionSource** | **String**| Transaction Origin Source | [optional] |
| **requestOption** | **String**| Request Options | [optional] [enum: Y, N] |
| **subVersion** | **String**| Sub-version Number if any | [optional] |
| **xCustomerContext** | **String**| Customer Context if any | [optional] |
| **openAccountRequest** | [**OpenAccountRequest**](OpenAccountRequest.md)| Generate sample code for popular API requests by selecting an example below. To view a full sample request and response, first click \&quot;Authorize\&quot; and enter your application credentials, then populate the required parameters above and click \&quot;Try it out\&quot;. | [optional] |

### Return type

[**OpenRequestResponse**](OpenRequestResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Customer Account Created Successfully |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |

