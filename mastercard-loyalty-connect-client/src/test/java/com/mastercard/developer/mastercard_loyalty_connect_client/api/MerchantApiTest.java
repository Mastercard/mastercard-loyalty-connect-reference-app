/*
 * Mastercard Loyalty Connect Service
 * Rest Service for linking payment cards with loyalty programme
 *
 * OpenAPI spec version: 1.0
 * Contact: apisupport@mastercard.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.mastercard_loyalty_connect_client.api;

import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.Error;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.Merchant;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantApi
 */
@Ignore
public class MerchantApiTest {

    private final MerchantApi api = new MerchantApi();

    
    /**
     * Get Merchants
     *
     * Get all on-boarded merchants.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMerchantsTest() throws ApiException {
        List<Merchant> response = api.getMerchants();

        // TODO: test validations
    }
    
}
