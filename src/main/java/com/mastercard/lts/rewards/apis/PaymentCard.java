package com.mastercard.lts.rewards.apis;

import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.PaymentCardApi;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.PaymentCardDetails;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.PaymentCardResponse;
import com.mastercard.lts.rewards.config.MlcConfig;

import java.util.List;
import java.util.logging.Logger;

public class PaymentCard {

    private static final Logger logger = Logger.getLogger(PaymentCard.class.getName());

    /**
     * Connect payment card for a member
     * <p>
     * Connects payment card for an existing member.
     *
     * @throws ApiException if the Api call fails
     */
    public static PaymentCardResponse enrollPaymentCard(ApiClient apiClient,
                                                        String memberReferenceId,
                                                        com.mastercard.developer.mastercard_loyalty_connect_client.model.PaymentCard paymentCard) throws ApiException {
        PaymentCardApi api = new PaymentCardApi(apiClient);
        String xMerchantKey = MlcConfig.X_MERCHANT_KEY;
        PaymentCardResponse response = api.enrollPaymentCard(memberReferenceId, paymentCard, xMerchantKey);
        logger.info("Response of enrollPaymentCard api " + response.toString());
        return response;
    }

    /**
     * Disconnects a payment card for a member
     * <p>
     * Deletes a payment card connected by the member.
     *
     * @throws ApiException if the Api call fails
     */
    public static void deletePaymentCard(ApiClient apiClient, String memberReferenceId, String paymentCardReferenceId) throws ApiException {
        PaymentCardApi api = new PaymentCardApi(apiClient);
        String xMerchantKey = MlcConfig.X_MERCHANT_KEY;
        api.deletePaymentCard(memberReferenceId, paymentCardReferenceId, xMerchantKey);
        logger.info("Payment Card Deleted! ");
    }

    /**
     * Get payment card details for a member
     * <p>
     * Returns details for a specific payment card connected by the member.
     *
     * @throws ApiException if the Api call fails
     */
    public static PaymentCardDetails getPaymentCardDetails(ApiClient apiClient, String memberReferenceId, String paymentCardReferenceId) throws ApiException {
        PaymentCardApi api = new PaymentCardApi(apiClient);
        String xMerchantKey = MlcConfig.X_MERCHANT_KEY;
        PaymentCardDetails response = api.getPaymentCardDetails(memberReferenceId, paymentCardReferenceId, xMerchantKey);
        logger.info("Response of getPaymentCardDetails api based on payment card reference id " + response.toString());
        return response;
    }

    /**
     * Get all payment cards for a member
     * <p>
     * Returns all the payment cards connected by a member.
     *
     * @throws ApiException if the Api call fails
     */
    public static List<PaymentCardDetails> getPaymentCards(ApiClient apiClient, String memberReferenceId) throws ApiException {
        PaymentCardApi api = new PaymentCardApi(apiClient);
        String xMerchantKey = MlcConfig.X_MERCHANT_KEY;
        List<PaymentCardDetails> response = api.getPaymentCards(memberReferenceId, xMerchantKey);
        logger.info("Response of get all Payment Cards api " + response.toString());
        return response;
    }

    /**
     * Update a payment card for a member
     * <p>
     * Updates the details of a specific payment card connected by the member.
     *
     * @throws ApiException if the Api call fails
     */
    public static void updatePaymentCard(ApiClient apiClient,
                                             String memberReferenceId,
                                             String paymentCardReferenceId,
                                             com.mastercard.developer.mastercard_loyalty_connect_client.model.PaymentCard paymentCard) throws ApiException {
        PaymentCardApi api = new PaymentCardApi(apiClient);
        String xMerchantKey = MlcConfig.X_MERCHANT_KEY;
        api.updatePaymentCard(memberReferenceId, paymentCardReferenceId, paymentCard, xMerchantKey);
        logger.info("Payment Card Updated! ");
    }
}
