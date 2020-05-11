# TransactionApi

All URIs are relative to *http://api.mastercard.com/mlc/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLoyaltyId**](TransactionApi.md#getLoyaltyId) | **POST** /loyalty-ids/searches | Get loyalty id


<a name="getLoyaltyId"></a>
# **getLoyaltyId**
> TransactionResponse getLoyaltyId(transaction)

Get loyalty id

Returns the Loyalty ID connected with a payment card for a specific Merchant. This API is called when a Member transacts using a payment card connected in MLC at a participating Merchant store.

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com/mlc/api");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    Transaction transaction = new Transaction(); // Transaction | The payment card number and merchant code / identifier must be provided in the request body to retrieve the Loyalty ID
    try {
      TransactionResponse result = apiInstance.getLoyaltyId(transaction);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getLoyaltyId");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction** | [**Transaction**](Transaction.md)| The payment card number and merchant code / identifier must be provided in the request body to retrieve the Loyalty ID |

### Return type

[**TransactionResponse**](TransactionResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully returned loyalty id |  -  |
**400** | Invalid Key Serial Number |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

