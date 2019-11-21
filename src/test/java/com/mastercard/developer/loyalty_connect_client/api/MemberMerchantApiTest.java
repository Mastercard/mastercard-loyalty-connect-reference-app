
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
import com.mastercard.developer.loyalty_connect_client.model.MerchantLoyaltyProgram;
import com.mastercard.developer.loyalty_connect_client.model.MerchantLoyaltyProgramResponse;
import com.mastercard.developer.loyalty_connect_client.model.MerchantLoyaltyProgramSearchResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MemberMerchantApi
 */
@Ignore
public class MemberMerchantApiTest {

    private final MemberMerchantApi api = new MemberMerchantApi();

    
    /**
     * Disconnect a loyalty program for a member
     *
     * Deletes an existing Member and Merchant Loyalty Program association
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMemberMerchantLoyaltyProgramTest() throws ApiException {
        String memberReferenceId = null;
        String memberMerchantReferenceId = null;
        String xMerchantKey = null;
        api.deleteMemberMerchantLoyaltyProgram(memberReferenceId, memberMerchantReferenceId, xMerchantKey);

        // TODO: test validations
    }
    
    /**
     * Get loyalty programs for a member
     *
     * Returns all loyalty programs in which the member is enrolled. If the member wants to view the details for a specific Merchant Loyalty program the member is enrolled in, then merchant code and Loyalty ID must be provided.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllMemberMerchantLoyaltyProgramTest() throws ApiException {
        String memberReferenceId = null;
        String xMerchantKey = null;
        String loyaltyId = null;
        String merchantCode = null;
        MerchantLoyaltyProgramSearchResponse response = api.getAllMemberMerchantLoyaltyProgram(memberReferenceId, xMerchantKey, loyaltyId, merchantCode);

        // TODO: test validations
    }
    
    /**
     * Get details for a specific Merchant Loyalty Program
     *
     * Returns Loyalty ID and point balance for a specific Merchant Loyalty Program associated with the member.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMemberMerchantLoyaltyProgramTest() throws ApiException {
        String memberReferenceId = null;
        String memberMerchantReferenceId = null;
        String xMerchantKey = null;
        MerchantLoyaltyProgramSearchResponse response = api.getMemberMerchantLoyaltyProgram(memberReferenceId, memberMerchantReferenceId, xMerchantKey);

        // TODO: test validations
    }
    
    /**
     * Enroll a member in a Merchant Loyalty Program
     *
     * Enrolls the member in a Merchant Loyalty Program. Alternately, the member can connect an existing Loyalty ID for the Merchant Loyalty Program.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void joinOrConnectMerchantLoyaltyProgramTest() throws ApiException {
        String memberReferenceId = null;
        MerchantLoyaltyProgram merchantLoyaltyProgram = null;
        String xMerchantKey = null;
        MerchantLoyaltyProgramResponse response = api.joinOrConnectMerchantLoyaltyProgram(memberReferenceId, merchantLoyaltyProgram, xMerchantKey);

        // TODO: test validations
    }
    
}
