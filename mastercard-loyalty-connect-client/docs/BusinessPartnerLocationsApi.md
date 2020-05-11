# BusinessPartnerLocationsApi

All URIs are relative to *http://api.mastercard.com/mlc/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrUpdateBusinessPartnerLocations**](BusinessPartnerLocationsApi.md#createOrUpdateBusinessPartnerLocations) | **POST** /business-partner-locations/{location_id}/terminals/{terminal_id} | Store company location details


<a name="createOrUpdateBusinessPartnerLocations"></a>
# **createOrUpdateBusinessPartnerLocations**
> BusinessPartnerLocationsResponse createOrUpdateBusinessPartnerLocations(locationId, terminalId, businessPartnerLocationDetails)

Store company location details

Store a company location into Mastercard Loyalty Connect (MLC)

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.BusinessPartnerLocationsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com/mlc/api");

    BusinessPartnerLocationsApi apiInstance = new BusinessPartnerLocationsApi(defaultClient);
    String locationId = "\"G3243423J4534\""; // String | Business Partner Location Details identification associated with payment terminal
    String terminalId = "\"K42398732L3290\""; // String | Payment Terminal Identification.
    BusinessPartnerLocationDetails businessPartnerLocationDetails = new BusinessPartnerLocationDetails(); // BusinessPartnerLocationDetails | Enroll a business partner location
    try {
      BusinessPartnerLocationsResponse result = apiInstance.createOrUpdateBusinessPartnerLocations(locationId, terminalId, businessPartnerLocationDetails);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BusinessPartnerLocationsApi#createOrUpdateBusinessPartnerLocations");
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
 **locationId** | **String**| Business Partner Location Details identification associated with payment terminal | [default to &quot;G3243423J4534&quot;]
 **terminalId** | **String**| Payment Terminal Identification. | [default to &quot;K42398732L3290&quot;]
 **businessPartnerLocationDetails** | [**BusinessPartnerLocationDetails**](BusinessPartnerLocationDetails.md)| Enroll a business partner location |

### Return type

[**BusinessPartnerLocationsResponse**](BusinessPartnerLocationsResponse.md)

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
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

