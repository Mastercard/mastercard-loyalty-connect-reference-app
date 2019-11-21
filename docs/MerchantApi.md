# MerchantApi

All URIs are relative to *http://api.mastercard.com/mlc/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMerchants**](MerchantApi.md#getMerchants) | **GET** /merchants | Get Merchants


<a name="getMerchants"></a>
# **getMerchants**
> List&lt;Merchant&gt; getMerchants()

Get Merchants

Get all on-boarded merchants.

### Example
```java
// Import classes:
//import com.mastercard.developer.loyalty_connect_client.ApiException;
//import com.mastercard.developer.loyalty_connect_client.api.MerchantApi;


MerchantApi apiInstance = new MerchantApi();
try {
    List<Merchant> result = apiInstance.getMerchants();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MerchantApi#getMerchants");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**List&lt;Merchant&gt;**](Merchant.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

