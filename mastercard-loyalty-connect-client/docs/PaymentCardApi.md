# PaymentCardApi

All URIs are relative to *http://api.mastercard.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePaymentCard**](PaymentCardApi.md#deletePaymentCard) | **DELETE** /members/{member_reference_id}/payment-cards/{payment_card_reference_id} | Disconnects a payment card for a member
[**enrollPaymentCard**](PaymentCardApi.md#enrollPaymentCard) | **POST** /members/{member_reference_id}/payment-cards | Connect payment card for a member
[**getPaymentCardDetails**](PaymentCardApi.md#getPaymentCardDetails) | **GET** /members/{member_reference_id}/payment-cards/{payment_card_reference_id} | Get payment card details for a member
[**getPaymentCards**](PaymentCardApi.md#getPaymentCards) | **GET** /members/{member_reference_id}/payment-cards | Get all payment cards for a member
[**updatePaymentCard**](PaymentCardApi.md#updatePaymentCard) | **PUT** /members/{member_reference_id}/payment-cards/{payment_card_reference_id} | Update a payment card for a member


<a name="deletePaymentCard"></a>
# **deletePaymentCard**
> deletePaymentCard(xMerchantKey, memberReferenceId, paymentCardReferenceId)

Disconnects a payment card for a member

Deletes a payment card connected by the member.

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.PaymentCardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com");

    PaymentCardApi apiInstance = new PaymentCardApi(defaultClient);
    String xMerchantKey = 108d9290-5516-4235-ac0d-fddb04c6b003; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
    String memberReferenceId = kT87TFbPtw6z100047; // String | Unique reference key for a member
    String paymentCardReferenceId = 5f0d07c1-6fc4-4e74-9152-0e20bb7104d9; // String | Unique reference key for a member's payment card
    try {
      apiInstance.deletePaymentCard(xMerchantKey, memberReferenceId, paymentCardReferenceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentCardApi#deletePaymentCard");
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
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding |
 **memberReferenceId** | **String**| Unique reference key for a member |
 **paymentCardReferenceId** | **String**| Unique reference key for a member&#39;s payment card |

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
**202** | Payment card is successfully deleted |  -  |
**400** | Member reference id not found |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

<a name="enrollPaymentCard"></a>
# **enrollPaymentCard**
> PaymentCardResponse enrollPaymentCard(xMerchantKey, memberReferenceId, paymentCard)

Connect payment card for a member

Connects payment card for an existing member.

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.PaymentCardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com");

    PaymentCardApi apiInstance = new PaymentCardApi(defaultClient);
    String xMerchantKey = 108d9290-5516-4235-ac0d-fddb04c6b003; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
    String memberReferenceId = kT87TFbPtw6z100047; // String | Unique reference key for a member
    PaymentCard paymentCard = new PaymentCard(); // PaymentCard | Contains payment card details
    try {
      PaymentCardResponse result = apiInstance.enrollPaymentCard(xMerchantKey, memberReferenceId, paymentCard);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentCardApi#enrollPaymentCard");
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
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding |
 **memberReferenceId** | **String**| Unique reference key for a member |
 **paymentCard** | [**PaymentCard**](PaymentCard.md)| Contains payment card details |

### Return type

[**PaymentCardResponse**](PaymentCardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successfully enrolled payment card for given partner code |  -  |
**400** | Member reference id not found |  -  |
**409** | Payment Card already enrolled for the member |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

<a name="getPaymentCardDetails"></a>
# **getPaymentCardDetails**
> PaymentCardDetails getPaymentCardDetails(xMerchantKey, memberReferenceId, paymentCardReferenceId)

Get payment card details for a member

Returns details for a specific payment card connected by the member.

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.PaymentCardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com");

    PaymentCardApi apiInstance = new PaymentCardApi(defaultClient);
    String xMerchantKey = 108d9290-5516-4235-ac0d-fddb04c6b003; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
    String memberReferenceId = kT87TFbPtw6z100047; // String | Unique reference key for a member
    String paymentCardReferenceId = 5f0d07c1-6fc4-4e74-9152-0e20bb7104d9; // String | Unique reference key for a member's payment card
    try {
      PaymentCardDetails result = apiInstance.getPaymentCardDetails(xMerchantKey, memberReferenceId, paymentCardReferenceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentCardApi#getPaymentCardDetails");
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
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding |
 **memberReferenceId** | **String**| Unique reference key for a member |
 **paymentCardReferenceId** | **String**| Unique reference key for a member&#39;s payment card |

### Return type

[**PaymentCardDetails**](PaymentCardDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Payment Card successfully fetched |  -  |
**400** | Member reference id should not be blank |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

<a name="getPaymentCards"></a>
# **getPaymentCards**
> PaymentCardDetails getPaymentCards(xMerchantKey, memberReferenceId)

Get all payment cards for a member

Returns all the payment cards connected by a member.

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.PaymentCardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com");

    PaymentCardApi apiInstance = new PaymentCardApi(defaultClient);
    String xMerchantKey = 108d9290-5516-4235-ac0d-fddb04c6b003; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
    String memberReferenceId = kT87TFbPtw6z100047; // String | Unique reference key for a member
    try {
      PaymentCardDetails result = apiInstance.getPaymentCards(xMerchantKey, memberReferenceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentCardApi#getPaymentCards");
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
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding |
 **memberReferenceId** | **String**| Unique reference key for a member |

### Return type

[**PaymentCardDetails**](PaymentCardDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Payment Cards successfully fetched |  -  |
**400** | Member reference id not found |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

<a name="updatePaymentCard"></a>
# **updatePaymentCard**
> updatePaymentCard(xMerchantKey, memberReferenceId, paymentCardReferenceId, paymentCard)

Update a payment card for a member

Updates the details of a specific payment card connected by the member.

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.PaymentCardApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com");

    PaymentCardApi apiInstance = new PaymentCardApi(defaultClient);
    String xMerchantKey = 108d9290-5516-4235-ac0d-fddb04c6b003; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
    String memberReferenceId = kT87TFbPtw6z100047; // String | Unique reference key for a member
    String paymentCardReferenceId = 5f0d07c1-6fc4-4e74-9152-0e20bb7104d9; // String | Unique reference key for a member's payment card
    PaymentCard paymentCard = new PaymentCard(); // PaymentCard | Contains payment card details
    try {
      apiInstance.updatePaymentCard(xMerchantKey, memberReferenceId, paymentCardReferenceId, paymentCard);
    } catch (ApiException e) {
      System.err.println("Exception when calling PaymentCardApi#updatePaymentCard");
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
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding |
 **memberReferenceId** | **String**| Unique reference key for a member |
 **paymentCardReferenceId** | **String**| Unique reference key for a member&#39;s payment card |
 **paymentCard** | [**PaymentCard**](PaymentCard.md)| Contains payment card details |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Payment Card is successfully updated |  -  |
**400** | Member reference id not found |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

