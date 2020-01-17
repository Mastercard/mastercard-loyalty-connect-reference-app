package com.mastercard.lts.rewards;

import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.lts.rewards.config.MlcConfig;
import com.mastercard.lts.rewards.service.MlcService;

import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;

public class MastercardLoyaltyConnectReference {

    private static final ApiClient apiClient = new ApiClient();

    public static void main(String args[]) throws
            CertificateException, UnrecoverableKeyException,
            NoSuchAlgorithmException, IOException,
            KeyStoreException, NoSuchProviderException, ApiException {

        MlcConfig.setupMlc(apiClient);

        MlcService.executeMasterCardLoyaltyConnectApis(apiClient);
    }
}
