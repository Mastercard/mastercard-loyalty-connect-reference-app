package com.mastercard.lts.rewards.apis;

import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.MemberMerchantApi;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.LoyaltyProgram;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.MemberMerchantLoyaltyDetails;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.MerchantLoyaltyProgram;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.MerchantLoyaltyProgramResponse;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.MerchantLoyaltyProgramSearchResponse;
import com.mastercard.lts.rewards.config.MlcConfig;

import java.util.logging.Logger;

public class MemberMerchant {

    private static final Logger logger = Logger.getLogger(MemberMerchant.class.getName());


    /**
     * Disconnect a loyalty program for a member
     * <p>
     * Deletes an existing Member and Merchant Loyalty Program association
     *
     * @throws ApiException if the Api call fails
     */
    public static void deleteMemberMerchantLoyaltyProgram(ApiClient apiClient, String memberMerchantReferenceId, String memberReferenceId) throws ApiException {
        MemberMerchantApi api = new MemberMerchantApi(apiClient);
        String xMerchantKey = MlcConfig.X_MERCHANT_KEY;
        api.deleteMemberMerchantLoyaltyProgram(memberReferenceId, memberMerchantReferenceId, xMerchantKey);
    }

    /**
     * Get loyalty programs for a member
     * <p>
     * Returns all loyalty programs in which the member is enrolled. If the member wants to view the details for a specific Merchant Loyalty program the member is enrolled in, then merchant code and Loyalty ID must be provided.
     *
     * @throws ApiException if the Api call fails
     */
    public static MerchantLoyaltyProgramSearchResponse getAllMemberMerchantLoyaltyProgram(ApiClient apiClient, String loyaltyId, String merchantCode, String memberReferenceId) throws ApiException {
        MemberMerchantApi api = new MemberMerchantApi(apiClient);
        String xMerchantKey = MlcConfig.X_MERCHANT_KEY;
        MerchantLoyaltyProgramSearchResponse response = api.getAllMemberMerchantLoyaltyProgram(memberReferenceId, xMerchantKey, loyaltyId, merchantCode);
        logger.info("Response of getAllMemberMerchantLoyaltyProgram api based on loyalty id and merchant code " + response.toString());
        return response;
    }

    /**
     * Get details for a specific Merchant Loyalty Program
     * <p>
     * Returns Loyalty ID and point balance for a specific Merchant Loyalty Program associated with the member.
     *
     * @throws ApiException if the Api call fails
     */
    public static MemberMerchantLoyaltyDetails getMemberMerchantLoyaltyProgram(ApiClient apiClient, String memberMerchantReferenceId, String memberReferenceId) throws ApiException {
        MemberMerchantApi api = new MemberMerchantApi(apiClient);
        String xMerchantKey = MlcConfig.X_MERCHANT_KEY;
        MemberMerchantLoyaltyDetails response = api.getMemberMerchantLoyaltyProgram(memberReferenceId, memberMerchantReferenceId, xMerchantKey);
        logger.info("Response of getMemberMerchantLoyaltyProgram api based member merchant reference id " + response.toString());
        return response;
    }

    /**
     * Enroll a member in a Merchant Loyalty Program
     * <p>
     * Enrolls the member in a Merchant Loyalty Program. Alternately, the member can connect an existing Loyalty ID for the Merchant Loyalty Program.
     *
     * @throws ApiException if the Api call fails
     */
    public static MerchantLoyaltyProgramResponse joinOrConnectMerchantLoyaltyProgram(ApiClient apiClient,
                                                                                     String memberReferenceId,
                                                                                     MerchantLoyaltyProgram merchantLoyaltyProgram) throws ApiException {
        MemberMerchantApi api = new MemberMerchantApi(apiClient);
        String xMerchantKey = MlcConfig.X_MERCHANT_KEY;
        MerchantLoyaltyProgramResponse response = api.joinOrConnectMerchantLoyaltyProgram(memberReferenceId, merchantLoyaltyProgram, xMerchantKey);
        logger.info("Response of joinOrConnectMerchantLoyaltyProgram " + response.toString());
        return response;
    }

    /**
     * Update member Merchant Loyalty Program
     * <p>
     * Updates the Merchant Loyalty Program for an existing member in MLC.
     *
     * @throws ApiException if the Api call fails
     */
    public static void updateMerchantLoyaltyProgram(ApiClient apiClient, String memberMerchantReferenceId,
                                             String memberReferenceId,
                                             LoyaltyProgram loyaltyProgram) throws ApiException {
        MemberMerchantApi api = new MemberMerchantApi(apiClient);
        String xMerchantKey = MlcConfig.X_MERCHANT_KEY;
        api.updateMerchantLoyaltyProgram(memberReferenceId, memberMerchantReferenceId, loyaltyProgram, xMerchantKey);
        logger.info("Merchant Loyalty Program Updated!");
    }
}
