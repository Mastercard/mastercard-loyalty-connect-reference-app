package com.mastercard.lts.rewards;

import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.lts.rewards.config.MlcConfig;
import com.mastercard.lts.rewards.service.MlcService;

public class MastercardLoyaltyConnectReference {

    private static final ApiClient apiClient = new ApiClient();

    public static void main(String args[]) throws Exception {

        MlcConfig.setup(apiClient);

        MlcService.executeMasterCardLoyaltyConnectApis(apiClient);
    }
}
