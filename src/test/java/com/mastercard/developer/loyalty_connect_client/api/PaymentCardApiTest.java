
/*
 * Copyright 2016 MasterCard International.
 *
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice, this list of
 * conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of
 * conditions and the following disclaimer in the documentation and/or other materials
 * provided with the distribution.
 * Neither the name of the MasterCard International Incorporated nor the names of its
 * contributors may be used to endorse or promote products derived from this software
 * without specific prior written permission.
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY
 * EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT
 * SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED
 * TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS;
 * OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER
 * IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING
 * IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 *
 */
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


package com.mastercard.developer.loyalty_connect_client.api;

import com.mastercard.developer.loyalty_connect_client.ApiException;
import com.mastercard.developer.loyalty_connect_client.model.Error;
import com.mastercard.developer.loyalty_connect_client.model.PaymentCard;
import com.mastercard.developer.loyalty_connect_client.model.PaymentCardDetails;
import com.mastercard.developer.loyalty_connect_client.model.PaymentCardResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PaymentCardApi
 */
@Ignore
public class PaymentCardApiTest {

    private final PaymentCardApi api = new PaymentCardApi();

    
    /**
     * Disconnects a payment card for a member
     *
     * Deletes a payment card connected by the member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePaymentCardTest() throws ApiException {
        String memberReferenceId = null;
        String paymentCardReferenceId = null;
        String xMerchantKey = null;
        api.deletePaymentCard(memberReferenceId, paymentCardReferenceId, xMerchantKey);

        // TODO: test validations
    }
    
    /**
     * Connect payment card for a member
     *
     * Connects payment card for an existing member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void enrollPaymentCardTest() throws ApiException {
        String memberReferenceId = null;
        PaymentCard paymentCard = null;
        String xMerchantKey = null;
        PaymentCardResponse response = api.enrollPaymentCard(memberReferenceId, paymentCard, xMerchantKey);

        // TODO: test validations
    }
    
    /**
     * Get payment card details for a member
     *
     * Returns details for a specific payment card connected by the member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentCardDetailsTest() throws ApiException {
        String memberReferenceId = null;
        String paymentCardReferenceId = null;
        String xMerchantKey = null;
        PaymentCardDetails response = api.getPaymentCardDetails(memberReferenceId, paymentCardReferenceId, xMerchantKey);

        // TODO: test validations
    }
    
    /**
     * Get all payment cards for a member
     *
     * Returns all the payment cards connected by a member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPaymentCardsTest() throws ApiException {
        String memberReferenceId = null;
        String xMerchantKey = null;
        List<PaymentCardDetails> response = api.getPaymentCards(memberReferenceId, xMerchantKey);

        // TODO: test validations
    }
    
    /**
     * Update a payment card for a member
     *
     * Updates the details of a specific payment card connected by the member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updatePaymentCardTest() throws ApiException {
        String memberReferenceId = null;
        String paymentCardReferenceId = null;
        PaymentCard paymentCard = null;
        String xMerchantKey = null;
        api.updatePaymentCard(memberReferenceId, paymentCardReferenceId, paymentCard, xMerchantKey);

        // TODO: test validations
    }
    
}
