# BusinessPartnerStoresApi

All URIs are relative to *http://api.mastercard.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateBusinessPartnerLocations**](BusinessPartnerStoresApi.md#createOrUpdateBusinessPartnerLocations) | **POST** /business-partner-stores | Store company location details


<a name="createOrUpdateBusinessPartnerLocations"></a>
# **createOrUpdateBusinessPartnerLocations**
> BusinessPartnerStoreResponse createOrUpdateBusinessPartnerLocations(businessPartnerStoreDetails)

Store company location details

Store a company location into Mastercard Loyalty Connect (MLC)

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.BusinessPartnerStoresApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com");

    BusinessPartnerStoresApi apiInstance = new BusinessPartnerStoresApi(defaultClient);
    BusinessPartnerStoreDetails businessPartnerStoreDetails = new BusinessPartnerStoreDetails(); // BusinessPartnerStoreDetails | 
    try {
      BusinessPartnerStoreResponse result = apiInstance.createOrUpdateBusinessPartnerLocations(businessPartnerStoreDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessPartnerStoresApi#createOrUpdateBusinessPartnerLocations");
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
 **businessPartnerStoreDetails** | [**BusinessPartnerStoreDetails**](BusinessPartnerStoreDetails.md)|  |

### Return type

[**BusinessPartnerStoreResponse**](BusinessPartnerStoreResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully enrolled business partner location |  -  |
**400** | Invalid Request |  -  |
**401** | Invalid access request |  -  |
**500** | Service not available |  -  |

