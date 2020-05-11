# MemberMerchantApi

All URIs are relative to *http://api.mastercard.com/mlc/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteMemberMerchantLoyaltyProgram**](MemberMerchantApi.md#deleteMemberMerchantLoyaltyProgram) | **DELETE** /members/{member_reference_id}/loyalty-programs/{member_merchant_reference_id} | Disconnect a loyalty program for a member
[**getAllMemberMerchantLoyaltyProgram**](MemberMerchantApi.md#getAllMemberMerchantLoyaltyProgram) | **GET** /members/{member_reference_id}/loyalty-programs | Get loyalty programs for a member
[**getMemberMerchantLoyaltyProgram**](MemberMerchantApi.md#getMemberMerchantLoyaltyProgram) | **GET** /members/{member_reference_id}/loyalty-programs/{member_merchant_reference_id} | Get details for a specific Merchant Loyalty Program
[**joinOrConnectMerchantLoyaltyProgram**](MemberMerchantApi.md#joinOrConnectMerchantLoyaltyProgram) | **POST** /members/{member_reference_id}/loyalty-programs | Enroll a member in a Merchant Loyalty Program
[**updateMerchantLoyaltyProgram**](MemberMerchantApi.md#updateMerchantLoyaltyProgram) | **PUT** /members/{member_reference_id}/loyalty-programs/{member_merchant_reference_id}/loyalty-id | Update member Merchant Loyalty Program


<a name="deleteMemberMerchantLoyaltyProgram"></a>
# **deleteMemberMerchantLoyaltyProgram**
> deleteMemberMerchantLoyaltyProgram(memberReferenceId, memberMerchantReferenceId, xMerchantKey)

Disconnect a loyalty program for a member

Deletes an existing Member and Merchant Loyalty Program association

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.MemberMerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com/mlc/api");

    MemberMerchantApi apiInstance = new MemberMerchantApi(defaultClient);
    String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | A system generated unique identifier for the Member enrolled in MLC
    String memberMerchantReferenceId = "\"3ed6cfa1-f7d9-40ba-9a86-d443ad302ad0\""; // String | A system generated unique identifier for the Member and Merchant Loyalty ID connection
    String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
    try {
      apiInstance.deleteMemberMerchantLoyaltyProgram(memberReferenceId, memberMerchantReferenceId, xMerchantKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberMerchantApi#deleteMemberMerchantLoyaltyProgram");
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
 **memberMerchantReferenceId** | **String**| A system generated unique identifier for the Member and Merchant Loyalty ID connection | [default to &quot;3ed6cfa1-f7d9-40ba-9a86-d443ad302ad0&quot;]
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
**202** | Merchant loyalty program deleted successfully |  -  |
**400** | Member reference id not found |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

<a name="getAllMemberMerchantLoyaltyProgram"></a>
# **getAllMemberMerchantLoyaltyProgram**
> MerchantLoyaltyProgramSearchResponse getAllMemberMerchantLoyaltyProgram(memberReferenceId, xMerchantKey, loyaltyId, merchantCode)

Get loyalty programs for a member

Returns all loyalty programs in which the member is enrolled. If the member wants to view the details for a specific Merchant Loyalty program the member is enrolled in, then merchant code and Loyalty ID must be provided.

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.MemberMerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com/mlc/api");

    MemberMerchantApi apiInstance = new MemberMerchantApi(defaultClient);
    String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | A system generated unique identifier for the Member enrolled in MLC
    String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
    String loyaltyId = "\"jsmith@mastercard.com\""; // String | Unique Identifier assigned by Merchant to its every Member
    String merchantCode = "\"MLCMerchant\""; // String | Unique Identifier assigned by Mastercard to every partner onboarded with MLC
    try {
      MerchantLoyaltyProgramSearchResponse result = apiInstance.getAllMemberMerchantLoyaltyProgram(memberReferenceId, xMerchantKey, loyaltyId, merchantCode);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberMerchantApi#getAllMemberMerchantLoyaltyProgram");
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
 **loyaltyId** | **String**| Unique Identifier assigned by Merchant to its every Member | [optional] [default to &quot;jsmith@mastercard.com&quot;]
 **merchantCode** | **String**| Unique Identifier assigned by Mastercard to every partner onboarded with MLC | [optional] [default to &quot;MLCMerchant&quot;]

### Return type

[**MerchantLoyaltyProgramSearchResponse**](MerchantLoyaltyProgramSearchResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully filtered merchant loyalty program |  -  |
**400** | Member reference id not found |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

<a name="getMemberMerchantLoyaltyProgram"></a>
# **getMemberMerchantLoyaltyProgram**
> MemberMerchantLoyaltyDetails getMemberMerchantLoyaltyProgram(memberReferenceId, memberMerchantReferenceId, xMerchantKey)

Get details for a specific Merchant Loyalty Program

Returns Loyalty ID and point balance for a specific Merchant Loyalty Program associated with the member.

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.MemberMerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com/mlc/api");

    MemberMerchantApi apiInstance = new MemberMerchantApi(defaultClient);
    String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | A system generated unique identifier for the Member enrolled in MLC
    String memberMerchantReferenceId = "\"3ed6cfa1-f7d9-40ba-9a86-d443ad302ad0\""; // String | A system generated unique identifier for the Member and Merchant Loyalty ID connection
    String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
    try {
      MemberMerchantLoyaltyDetails result = apiInstance.getMemberMerchantLoyaltyProgram(memberReferenceId, memberMerchantReferenceId, xMerchantKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberMerchantApi#getMemberMerchantLoyaltyProgram");
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
 **memberMerchantReferenceId** | **String**| A system generated unique identifier for the Member and Merchant Loyalty ID connection | [default to &quot;3ed6cfa1-f7d9-40ba-9a86-d443ad302ad0&quot;]
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

### Return type

[**MemberMerchantLoyaltyDetails**](MemberMerchantLoyaltyDetails.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Merchant loyalty program retrieved successfully |  -  |
**400** | Member reference id not found |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

<a name="joinOrConnectMerchantLoyaltyProgram"></a>
# **joinOrConnectMerchantLoyaltyProgram**
> MerchantLoyaltyProgramResponse joinOrConnectMerchantLoyaltyProgram(memberReferenceId, merchantLoyaltyProgram, xMerchantKey)

Enroll a member in a Merchant Loyalty Program

Enrolls the member in a Merchant Loyalty Program. Alternately, the member can connect an existing Loyalty ID for the Merchant Loyalty Program.

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.MemberMerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com/mlc/api");

    MemberMerchantApi apiInstance = new MemberMerchantApi(defaultClient);
    String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | A system generated unique identifier for the Member enrolled in MLC
    MerchantLoyaltyProgram merchantLoyaltyProgram = new MerchantLoyaltyProgram(); // MerchantLoyaltyProgram | Contains merchant loyalty program details
    String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
    try {
      MerchantLoyaltyProgramResponse result = apiInstance.joinOrConnectMerchantLoyaltyProgram(memberReferenceId, merchantLoyaltyProgram, xMerchantKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberMerchantApi#joinOrConnectMerchantLoyaltyProgram");
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
 **merchantLoyaltyProgram** | [**MerchantLoyaltyProgram**](MerchantLoyaltyProgram.md)| Contains merchant loyalty program details |
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

### Return type

[**MerchantLoyaltyProgramResponse**](MerchantLoyaltyProgramResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Successfully joined/connected in Merchant Loyalty Program |  -  |
**400** | Member reference id not found |  -  |
**401** | Unauthorized access to information |  -  |
**409** | Member has already joined/connected to merchant loyalty program |  -  |
**500** | Service not available |  -  |

<a name="updateMerchantLoyaltyProgram"></a>
# **updateMerchantLoyaltyProgram**
> updateMerchantLoyaltyProgram(memberReferenceId, memberMerchantReferenceId, loyaltyProgram, xMerchantKey)

Update member Merchant Loyalty Program

Updates the Merchant Loyalty Program for an existing member in MLC.

### Example
```java
// Import classes:
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.Configuration;
import com.mastercard.developer.mastercard_loyalty_connect_client.models.*;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.MemberMerchantApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://api.mastercard.com/mlc/api");

    MemberMerchantApi apiInstance = new MemberMerchantApi(defaultClient);
    String memberReferenceId = "\"kT87TFbPtw6z100047\""; // String | Unique reference key for a member
    String memberMerchantReferenceId = "\"3ed6cfa1-f7d9-40ba-9a86-d443ad302ad0\""; // String | Unique reference key that identifies member and merchant loyalty program association
    LoyaltyProgram loyaltyProgram = new LoyaltyProgram(); // LoyaltyProgram | loyaltyProgram
    String xMerchantKey = "\"108d9290-5516-4235-ac0d-fddb04c6b003\""; // String | Key assigned to a 'Merchant' Business Partner at the time of onboarding
    try {
      apiInstance.updateMerchantLoyaltyProgram(memberReferenceId, memberMerchantReferenceId, loyaltyProgram, xMerchantKey);
    } catch (ApiException e) {
      System.err.println("Exception when calling MemberMerchantApi#updateMerchantLoyaltyProgram");
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
 **memberReferenceId** | **String**| Unique reference key for a member | [default to &quot;kT87TFbPtw6z100047&quot;]
 **memberMerchantReferenceId** | **String**| Unique reference key that identifies member and merchant loyalty program association | [default to &quot;3ed6cfa1-f7d9-40ba-9a86-d443ad302ad0&quot;]
 **loyaltyProgram** | [**LoyaltyProgram**](LoyaltyProgram.md)| loyaltyProgram |
 **xMerchantKey** | **String**| Key assigned to a &#39;Merchant&#39; Business Partner at the time of onboarding | [optional] [default to &quot;108d9290-5516-4235-ac0d-fddb04c6b003&quot;]

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
**204** | Merchant loyalty program is updated successfully |  -  |
**400** | Member reference id not found |  -  |
**401** | Unauthorized access to information |  -  |
**500** | Service not available |  -  |

