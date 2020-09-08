package com.mastercard.lts.rewards.apis;

import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.MemberApi;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.MemberDetails;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.MemberMerchantResponse;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.MemberResponse;
import com.mastercard.lts.rewards.config.MlcConfig;

import java.util.logging.Logger;

public class Member {

    private static final Logger logger = Logger.getLogger(Member.class.getName());

    /**
     * Enroll a member
     * <p>
     * Enrolls a new member in MLC. Every member is identified by the business partner (partner code) and member identifier (user id). The member may or may not provide other demographic information for enrollment.
     *
     * @throws ApiException if the Api call fails
     */
    public static MemberMerchantResponse enrollMember(ApiClient apiClient,
                                                      com.mastercard.developer.mastercard_loyalty_connect_client.model.Member member) throws ApiException {
        MemberApi api = new MemberApi(apiClient);
        MemberMerchantResponse memberMerchantResponse = api.enrollMember(MlcConfig.X_MERCHANT_KEY, member);
        logger.info("Response of enroll Member api " + memberMerchantResponse.toString());
        return memberMerchantResponse;
    }

    /**
     * Get a Member
     * <p>
     * Returns the demographic information related to the existing MLC Member.
     *
     * @throws ApiException if the Api call fails
     */
    public static void getMember(ApiClient apiClient, String memberReferenceId) throws ApiException {
        MemberApi api = new MemberApi(apiClient);
        MemberResponse memberResponse = api.getMember(memberReferenceId, MlcConfig.X_MERCHANT_KEY);
        logger.info("Response of get Member api " + memberResponse.toString());
    }

    /**
     * Update a member
     * <p>
     * Updates the demographic information for an existing member in MLC. The member may or may not provide all demographic information.
     *
     * @throws ApiException if the Api call fails
     */
    public static void updateMember(ApiClient apiClient, String memberReferenceId, MemberDetails memberDetails) throws ApiException {
        MemberApi api = new MemberApi(apiClient);
        api.updateMember(MlcConfig.X_MERCHANT_KEY, memberReferenceId, memberDetails);
        logger.info("Member updated!");
    }

    /**
     * Delete a member
     * <p>
     * This API is called when an existing member opts out of MLC. All information related to the member is deleted whenever this API is called.
     *
     * @throws ApiException if the Api call fails
     */
    public static void deleteMember(ApiClient apiClient, String memberReferenceId) throws ApiException {
        MemberApi api = new MemberApi(apiClient);
        api.deleteMember(memberReferenceId, MlcConfig.X_MERCHANT_KEY);
        logger.info("Member deleted!");
    }
}
