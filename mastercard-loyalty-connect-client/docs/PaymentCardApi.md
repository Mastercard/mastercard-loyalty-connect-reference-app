# PaymentCardApi

All URIs are relative to *http://api.mastercard.com/mlc/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePaymentCard**](PaymentCardApi.md#deletePaymentCard) | **DELETE** /members/{member_reference_id}/payment-cards/{payment_card_reference_id} | Disconnects a payment card for a member
[**enrollPaymentCard**](PaymentCardApi.md#enrollPaymentCard) | **POST** /members/{member_reference_id}/payment-cards | Connect payment card for a member
[**getPaymentCardDetails**](PaymentCardApi.md#getPaymentCardDetails) | **GET** /members/{member_reference_id}/payment-cards/{payment_card_reference_id} | Get payment card details for a member
[**getPaymentCards**](PaymentCardApi.md#getPaymentCards) | **GET** /members/{member_reference_id}/payment-cards | Get all payment cards for a member
[**updatePaymentCard**](PaymentCardApi.md#updatePaymentCard) | **PUT** /members/{member_reference_id}/payment-cards/{payment_card_reference_id} | Update a payment card for a member


<a name="deletePaymentCard"></a>
# **deletePaymentCard**
> deletePaymentCard(memberReferenceId, paymentCardReferenceId, xMerchantKey)

Disconnects a payment card for a member

Deletes a payment card connected by the member.

### Example
```java
// Import classes:
//import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
//import com.mastercard.developer.mastercard_loyalty_connect_client.api.PaymentCardApi;


PaymentCardApi apiInstance = new PaymentCardApi();
String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | Unique reference key for a member
String paymentCardReferenceId = "\"5f0d07c1-6fc4-4e74-9152-0e20bb7104d9\""; // String | Unique reference key for a member's payment card
String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
try {
    apiInstance.deletePaymentCard(memberReferenceId, paymentCardReferenceId, xMerchantKey);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentCardApi#deletePaymentCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberReferenceId** | **String**| Unique reference key for a member | [default to &quot;kT87TFbPtw6z100047&quot;]
 **paymentCardReferenceId** | **String**| Unique reference key for a member&#39;s payment card | [default to &quot;5f0d07c1-6fc4-4e74-9152-0e20bb7104d9&quot;]
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enrollPaymentCard"></a>
# **enrollPaymentCard**
> PaymentCardResponse enrollPaymentCard(memberReferenceId, paymentCard, xMerchantKey)

Connect payment card for a member

Connects payment card for an existing member.

### Example
```java
// Import classes:
//import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
//import com.mastercard.developer.mastercard_loyalty_connect_client.api.PaymentCardApi;


PaymentCardApi apiInstance = new PaymentCardApi();
String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | Unique reference key for a member
PaymentCard paymentCard = new PaymentCard(); // PaymentCard | Contains payment card details
String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
try {
    PaymentCardResponse result = apiInstance.enrollPaymentCard(memberReferenceId, paymentCard, xMerchantKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentCardApi#enrollPaymentCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberReferenceId** | **String**| Unique reference key for a member | [default to &quot;kT87TFbPtw6z100047&quot;]
 **paymentCard** | [**PaymentCard**](PaymentCard.md)| Contains payment card details |
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

### Return type

[**PaymentCardResponse**](PaymentCardResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPaymentCardDetails"></a>
# **getPaymentCardDetails**
> PaymentCardDetails getPaymentCardDetails(memberReferenceId, paymentCardReferenceId, xMerchantKey)

Get payment card details for a member

Returns details for a specific payment card connected by the member.

### Example
```java
// Import classes:
//import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
//import com.mastercard.developer.mastercard_loyalty_connect_client.api.PaymentCardApi;


PaymentCardApi apiInstance = new PaymentCardApi();
String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | Unique reference key for a member
String paymentCardReferenceId = "\"5f0d07c1-6fc4-4e74-9152-0e20bb7104d9\""; // String | Unique reference key for a member's payment card
String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
try {
    PaymentCardDetails result = apiInstance.getPaymentCardDetails(memberReferenceId, paymentCardReferenceId, xMerchantKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentCardApi#getPaymentCardDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberReferenceId** | **String**| Unique reference key for a member | [default to &quot;kT87TFbPtw6z100047&quot;]
 **paymentCardReferenceId** | **String**| Unique reference key for a member&#39;s payment card | [default to &quot;5f0d07c1-6fc4-4e74-9152-0e20bb7104d9&quot;]
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

### Return type

[**PaymentCardDetails**](PaymentCardDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPaymentCards"></a>
# **getPaymentCards**
> List&lt;PaymentCardDetails&gt; getPaymentCards(memberReferenceId, xMerchantKey)

Get all payment cards for a member

Returns all the payment cards connected by a member.

### Example
```java
// Import classes:
//import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
//import com.mastercard.developer.mastercard_loyalty_connect_client.api.PaymentCardApi;


PaymentCardApi apiInstance = new PaymentCardApi();
String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | Unique reference key for a member
String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
try {
    List<PaymentCardDetails> result = apiInstance.getPaymentCards(memberReferenceId, xMerchantKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentCardApi#getPaymentCards");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberReferenceId** | **String**| Unique reference key for a member | [default to &quot;kT87TFbPtw6z100047&quot;]
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

### Return type

[**List&lt;PaymentCardDetails&gt;**](PaymentCardDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updatePaymentCard"></a>
# **updatePaymentCard**
> updatePaymentCard(memberReferenceId, paymentCardReferenceId, paymentCard, xMerchantKey)

Update a payment card for a member

Updates the details of a specific payment card connected by the member.

### Example
```java
// Import classes:
//import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
//import com.mastercard.developer.mastercard_loyalty_connect_client.api.PaymentCardApi;


PaymentCardApi apiInstance = new PaymentCardApi();
String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | Unique reference key for a member
String paymentCardReferenceId = "\"5f0d07c1-6fc4-4e74-9152-0e20bb7104d9\""; // String | Unique reference key for a member's payment card
PaymentCard paymentCard = new PaymentCard(); // PaymentCard | Contains payment card details
String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
try {
    apiInstance.updatePaymentCard(memberReferenceId, paymentCardReferenceId, paymentCard, xMerchantKey);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentCardApi#updatePaymentCard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberReferenceId** | **String**| Unique reference key for a member | [default to &quot;kT87TFbPtw6z100047&quot;]
 **paymentCardReferenceId** | **String**| Unique reference key for a member&#39;s payment card | [default to &quot;5f0d07c1-6fc4-4e74-9152-0e20bb7104d9&quot;]
 **paymentCard** | [**PaymentCard**](PaymentCard.md)| Contains payment card details |
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

