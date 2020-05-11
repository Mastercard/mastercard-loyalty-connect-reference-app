# LoyaltyConnectApi

All URIs are relative to *http://api.mastercard.com/mlc/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteLoyaltyConnect**](LoyaltyConnectApi.md#deleteLoyaltyConnect) | **DELETE** /members/{member_reference_id}/loyalty-connects/{loyalty_connect_reference_id} | Disconnects a specific payment card and Loyalty ID for a member
[**enrollLoyaltyConnect**](LoyaltyConnectApi.md#enrollLoyaltyConnect) | **POST** /members/{member_reference_id}/loyalty-connects | Connects payment card and Loyalty ID for a member
[**getLoyaltyConnect**](LoyaltyConnectApi.md#getLoyaltyConnect) | **GET** /members/{member_reference_id}/loyalty-connects/{loyalty_connect_reference_id} | Get a specific Loyalty ID and payment card connection details for a member
[**getLoyaltyConnects**](LoyaltyConnectApi.md#getLoyaltyConnects) | **GET** /members/{member_reference_id}/loyalty-connects | Get payment card and Loyalty ID connection details for a member


<a name="deleteLoyaltyConnect"></a>
# **deleteLoyaltyConnect**
> deleteLoyaltyConnect(memberReferenceId, loyaltyConnectReferenceId, xMerchantKey)

Disconnects a specific payment card and Loyalty ID for a member

Delete a specific Loyalty ID and payment card connection for a member based on the unique reference key for the connection.

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.LoyaltyConnectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com/mlc/api");

    LoyaltyConnectApi apiInstance = new LoyaltyConnectApi(defaultClient);
    String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | A system generated unique identifier for the Member enrolled in MLC
    String loyaltyConnectReferenceId = "\"f962ad86-d408-467c-8b74-14983569d36c\""; // String | A system generated unique identifier for the Member's Payment Card and Merchant Loyalty ID connection
    String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
    try {
      apiInstance.deleteLoyaltyConnect(memberReferenceId, loyaltyConnectReferenceId, xMerchantKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltyConnectApi#deleteLoyaltyConnect");
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
 **memberReferenceId** | **String**| A system generated unique identifier for the Member enrolled in MLC | [default to &quot;kT87TFbPtw6z100047&quot;]
 **loyaltyConnectReferenceId** | **String**| A system generated unique identifier for the Member&#39;s Payment Card and Merchant Loyalty ID connection | [default to &quot;f962ad86-d408-467c-8b74-14983569d36c&quot;]
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Loyalty Connect successfully deleted |  -  |
**400** | Member reference id not found |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

<a name="enrollLoyaltyConnect"></a>
# **enrollLoyaltyConnect**
> EnrollLoyaltyConnectResponse enrollLoyaltyConnect(memberReferenceId, loyaltyConnect, xMerchantKey)

Connects payment card and Loyalty ID for a member

Connects a member&#39;s payment card with Loyalty ID. The member must have the payment card and Loyalty ID enrolled before making this connection.

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.LoyaltyConnectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com/mlc/api");

    LoyaltyConnectApi apiInstance = new LoyaltyConnectApi(defaultClient);
    String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | A system generated unique identifier for the Member enrolled in MLC
    LoyaltyConnect loyaltyConnect = new LoyaltyConnect(); // LoyaltyConnect | Contains payment card and loyalty program details
    String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
    try {
      EnrollLoyaltyConnectResponse result = apiInstance.enrollLoyaltyConnect(memberReferenceId, loyaltyConnect, xMerchantKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltyConnectApi#enrollLoyaltyConnect");
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
 **memberReferenceId** | **String**| A system generated unique identifier for the Member enrolled in MLC | [default to &quot;kT87TFbPtw6z100047&quot;]
 **loyaltyConnect** | [**LoyaltyConnect**](LoyaltyConnect.md)| Contains payment card and loyalty program details |
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

### Return type

[**EnrollLoyaltyConnectResponse**](EnrollLoyaltyConnectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successfully connected payment card to loyalty |  -  |
**400** | Member reference id not found |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

<a name="getLoyaltyConnect"></a>
# **getLoyaltyConnect**
> LoyaltyConnectResponse getLoyaltyConnect(memberReferenceId, loyaltyConnectReferenceId, xMerchantKey)

Get a specific Loyalty ID and payment card connection details for a member

Returns the Loyalty ID and payment card details for a member if the Loyalty ID exists as connected with the payment card based on the unique reference key for the connection.

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.LoyaltyConnectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com/mlc/api");

    LoyaltyConnectApi apiInstance = new LoyaltyConnectApi(defaultClient);
    String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | A system generated unique identifier for the Member enrolled in MLC
    String loyaltyConnectReferenceId = "\"f962ad86-d408-467c-8b74-14983569d36c\""; // String | A system generated unique identifier for the Member's Payment Card and Merchant Loyalty ID connection
    String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
    try {
      LoyaltyConnectResponse result = apiInstance.getLoyaltyConnect(memberReferenceId, loyaltyConnectReferenceId, xMerchantKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltyConnectApi#getLoyaltyConnect");
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
 **memberReferenceId** | **String**| A system generated unique identifier for the Member enrolled in MLC | [default to &quot;kT87TFbPtw6z100047&quot;]
 **loyaltyConnectReferenceId** | **String**| A system generated unique identifier for the Member&#39;s Payment Card and Merchant Loyalty ID connection | [default to &quot;f962ad86-d408-467c-8b74-14983569d36c&quot;]
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

### Return type

[**LoyaltyConnectResponse**](LoyaltyConnectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Loyalty Connect is successfully fetched |  -  |
**400** | Member reference id not found |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

<a name="getLoyaltyConnects"></a>
# **getLoyaltyConnects**
> List&lt;LoyaltyConnectResponse&gt; getLoyaltyConnects(memberReferenceId, xMerchantKey, memberMerchantReferenceId, paymentCardReferenceId)

Get payment card and Loyalty ID connection details for a member

Returns all payment card and Loyalty ID connections for the member. If the member wants to view the payment cards connected for a specific Loyalty ID, then the member merchant reference key must be provided. If the member wants to view the Loyalty IDs connected for a specific payment card, then the payment card reference key must be provided.

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.LoyaltyConnectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com/mlc/api");

    LoyaltyConnectApi apiInstance = new LoyaltyConnectApi(defaultClient);
    String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | A system generated unique identifier for the Member enrolled in MLC
    String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
    String memberMerchantReferenceId = "\"3ed6cfa1-f7d9-40ba-9a86-d443ad302ad0\""; // String | A system generated unique identifier for the Member and Merchant Loyalty ID connection
    String paymentCardReferenceId = "\"5f0d07c1-6fc4-4e74-9152-0e20bb7104d9\""; // String | A system generated unique identifier for the Payment card enrolled for the Member
    try {
      List<LoyaltyConnectResponse> result = apiInstance.getLoyaltyConnects(memberReferenceId, xMerchantKey, memberMerchantReferenceId, paymentCardReferenceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LoyaltyConnectApi#getLoyaltyConnects");
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
 **memberReferenceId** | **String**| A system generated unique identifier for the Member enrolled in MLC | [default to &quot;kT87TFbPtw6z100047&quot;]
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]
 **memberMerchantReferenceId** | **String**| A system generated unique identifier for the Member and Merchant Loyalty ID connection | [optional] [default to &quot;3ed6cfa1-f7d9-40ba-9a86-d443ad302ad0&quot;]
 **paymentCardReferenceId** | **String**| A system generated unique identifier for the Payment card enrolled for the Member | [optional] [default to &quot;5f0d07c1-6fc4-4e74-9152-0e20bb7104d9&quot;]

### Return type

[**List&lt;LoyaltyConnectResponse&gt;**](LoyaltyConnectResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Loyalty Connects are successfully fetched |  -  |
**400** | Member reference id not found |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

