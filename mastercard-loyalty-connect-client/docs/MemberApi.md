# MemberApi

All URIs are relative to *http://api.mastercard.com/mlc/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMember**](MemberApi.md#deleteMember) | **DELETE** /members/{member_reference_id} | Delete a member
[**enrollMember**](MemberApi.md#enrollMember) | **POST** /members | Enroll a member
[**getMember**](MemberApi.md#getMember) | **GET** /members/{member_reference_id} | Get a Member
[**updateMember**](MemberApi.md#updateMember) | **PUT** /members/{member_reference_id} | Update a member


<a name="deleteMember"></a>
# **deleteMember**
> deleteMember(memberReferenceId, xMerchantKey)

Delete a member

This API is called when an existing member opts out of MLC. All information related to the member is deleted whenever this API is called.

### Example
```java
// Import classes:
//import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
//import com.mastercard.developer.mastercard_loyalty_connect_client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | Unique reference key for a member
String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
try {
    apiInstance.deleteMember(memberReferenceId, xMerchantKey);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#deleteMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberReferenceId** | **String**| Unique reference key for a member | [default to &quot;kT87TFbPtw6z100047&quot;]
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="enrollMember"></a>
# **enrollMember**
> MemberMerchantResponse enrollMember(member, xMerchantKey)

Enroll a member

Enrolls a new member in MLC. Every member is identified by the business partner (partner code) and member identifier (user id). The member may or may not provide other demographic information for enrollment.

### Example
```java
// Import classes:
//import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
//import com.mastercard.developer.mastercard_loyalty_connect_client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
Member member = new Member(); // Member | In order to enroll a member, the partner code, user type and user ID attributes must be provided along with other optional demographic data attributes. The user type can be either 'BANK_CUSTOMER_NUMBER' or 'MERCHANT_LOYALTY_ID' depending on the business partner setup.
String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
try {
    MemberMerchantResponse result = apiInstance.enrollMember(member, xMerchantKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#enrollMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **member** | [**Member**](Member.md)| In order to enroll a member, the partner code, user type and user ID attributes must be provided along with other optional demographic data attributes. The user type can be either &#39;BANK_CUSTOMER_NUMBER&#39; or &#39;MERCHANT_LOYALTY_ID&#39; depending on the business partner setup. |
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

### Return type

[**MemberMerchantResponse**](MemberMerchantResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMember"></a>
# **getMember**
> MemberResponse getMember(memberReferenceId, xMerchantKey)

Get a Member

Returns the demographic information related to the existing MLC Member.

### Example
```java
// Import classes:
//import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
//import com.mastercard.developer.mastercard_loyalty_connect_client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | Unique reference key for a member
String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
try {
    MemberResponse result = apiInstance.getMember(memberReferenceId, xMerchantKey);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#getMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberReferenceId** | **String**| Unique reference key for a member | [default to &quot;kT87TFbPtw6z100047&quot;]
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

### Return type

[**MemberResponse**](MemberResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateMember"></a>
# **updateMember**
> updateMember(memberReferenceId, memberDetails, xMerchantKey)

Update a member

Updates the demographic information for an existing member in MLC. The member may or may not provide all demographic information.

### Example
```java
// Import classes:
//import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
//import com.mastercard.developer.mastercard_loyalty_connect_client.api.MemberApi;


MemberApi apiInstance = new MemberApi();
String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | Unique reference key for a member
MemberDetails memberDetails = new MemberDetails(); // MemberDetails | In order to update the demographic information for a member, the unique reference key must be provided. The member must be an existing one in MLC based on the unique reference key. The member may or may not provide all demographic information for update.
String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
try {
    apiInstance.updateMember(memberReferenceId, memberDetails, xMerchantKey);
} catch (ApiException e) {
    System.err.println("Exception when calling MemberApi#updateMember");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **memberReferenceId** | **String**| Unique reference key for a member | [default to &quot;kT87TFbPtw6z100047&quot;]
 **memberDetails** | [**MemberDetails**](MemberDetails.md)| In order to update the demographic information for a member, the unique reference key must be provided. The member must be an existing one in MLC based on the unique reference key. The member may or may not provide all demographic information for update. |
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

