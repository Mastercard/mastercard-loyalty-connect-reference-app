# MerchantApi

All URIs are relative to *http://api.mastercard.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchants**](MerchantApi.md#getMerchants) | **GET** /merchants | Get Merchants


<a name="getMerchants"></a>
# **getMerchants**
> Merchant getMerchants()

Get Merchants

Get all on-boarded merchants

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.MerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com");

    MerchantApi apiInstance = new MerchantApi(defaultClient);
    try {
      Merchant result = apiInstance.getMerchants();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MerchantApi#getMerchants");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Merchant**](Merchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Merchant loyalty program retrieved successfully |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

