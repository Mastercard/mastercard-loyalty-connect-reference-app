package com.mastercard.lts.rewards.apis;

import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.LoyaltyConnectApi;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.EnrollLoyaltyConnectResponse;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.LoyaltyConnectResponse;
import com.mastercard.lts.rewards.config.MlcConfig;

import java.util.List;
import java.util.logging.Logger;

public class LoyaltyConnect {

    private static final Logger logger = Logger.getLogger(Member.class.getName());


    /**
     * Disconnects a specific payment card and Loyalty ID for a member
     * <p>
     * Delete a specific Loyalty ID and payment card connection for a member based on the unique reference key for the connection.
     *
     * @throws ApiException if the Api call fails
     */
    public static void deleteLoyaltyConnect(ApiClient apiClient, String memberReferenceId, String loyaltyConnectReferenceId) throws ApiException {
        LoyaltyConnectApi api = new LoyaltyConnectApi(apiClient);
        String xMerchantKey = MlcConfig.X_MERCHANT_KEY;
        api.deleteLoyaltyConnect(memberReferenceId, loyaltyConnectReferenceId, xMerchantKey);
        logger.info("Loyalty Connect for a member got deleted! ");
    }

    /**
     * Connects payment card and Loyalty ID for a member
     * <p>
     * Connects a member&#39;s payment card with Loyalty ID. The member must have the payment card and Loyalty ID enrolled before making this connection.
     *
     * @throws ApiException if the Api call fails
     */
    public static EnrollLoyaltyConnectResponse enrollLoyaltyConnect(ApiClient apiClient, String memberReferenceId,
                                                                    com.mastercard.developer.mastercard_loyalty_connect_client.model.LoyaltyConnect loyaltyConnect) throws ApiException {
        LoyaltyConnectApi api = new LoyaltyConnectApi(apiClient);
        String xMerchantKey = MlcConfig.X_MERCHANT_KEY;
        EnrollLoyaltyConnectResponse response = api.enrollLoyaltyConnect(memberReferenceId, loyaltyConnect, xMerchantKey);
        logger.info("Response of enroll Loyalty Connect api " + response.toString());
        return response;
    }

    /**
     * Get a specific Loyalty ID and payment card connection details for a member
     * <p>
     * Returns the Loyalty ID and payment card details for a member if the Loyalty ID exists as connected with the payment card based on the unique reference key for the connection.
     *
     * @throws ApiException if the Api call fails
     */
    public static LoyaltyConnectResponse getLoyaltyConnect(ApiClient apiClient, String memberReferenceId, String loyaltyConnectReferenceId) throws ApiException {
        LoyaltyConnectApi api = new LoyaltyConnectApi(apiClient);
        String xMerchantKey = MlcConfig.X_MERCHANT_KEY;
        LoyaltyConnectResponse response = api.getLoyaltyConnect(memberReferenceId, loyaltyConnectReferenceId, xMerchantKey);
        logger.info("Response of get Loyalty Connect api based on loyaltyConnectReferenceId" + response.toString());
        return response;
    }

    /**
     * Get payment card and Loyalty ID connection details for a member
     * <p>
     * Returns all payment card and Loyalty ID connections for the member. If the member wants to view the payment cards connected for a specific Loyalty ID, then the member merchant reference key must be provided. If the member wants to view the Loyalty IDs connected for a specific payment card, then the payment card reference key must be provided.
     *
     * @throws ApiException if the Api call fails
     */
    public static LoyaltyConnectResponse getLoyaltyConnects(ApiClient apiClient, String memberReferenceId, String memberMerchantReferenceId, String paymentCardReferenceId) throws ApiException {
        LoyaltyConnectApi api = new LoyaltyConnectApi(apiClient);
        String xMerchantKey = MlcConfig.X_MERCHANT_KEY;
        LoyaltyConnectResponse response = api.getLoyaltyConnects(memberReferenceId, xMerchantKey, memberMerchantReferenceId, paymentCardReferenceId);
        logger.info("Response of get Loyalty Connect api based on memberMerchantReferenceId and paymentCardReferenceId " + response.toString());
        return response;
    }
}
