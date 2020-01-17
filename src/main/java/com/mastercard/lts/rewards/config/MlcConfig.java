package com.mastercard.lts.rewards.config;

import com.mastercard.developer.interceptors.OkHttp2OAuth1Interceptor;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.utils.AuthenticationUtils;
import com.mastercard.lts.rewards.MastercardLoyaltyConnectReference;
import com.squareup.okhttp.Interceptor;

import java.io.IOException;
import java.net.URL;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.List;

public class MlcConfig {

    private static final String CONSUMER_KEY = "your_consumer_key";
    private static final String KEYSTORE_PASSWORD = "your_keystore_password";
    public static final String X_MERCHANT_KEY = "your_merchant_key";
    private static final String KEY_ALIAS = "your_key_alias";
    public static final String PARTNER_CODE = "your_partner_code";
    private static final String P12_KEY_FILE_NAME = "mastercard-loyalty-connect-sandbox.p12";

    public static void setupMlc(ApiClient apiClient) throws CertificateException, UnrecoverableKeyException, NoSuchAlgorithmException, IOException, KeyStoreException, NoSuchProviderException {
        ClassLoader loader = MastercardLoyaltyConnectReference.class.getClassLoader();
        URL url = loader.getResource(P12_KEY_FILE_NAME);
        List<Interceptor> interceptors = apiClient.getHttpClient().interceptors();
        apiClient.setBasePath("https://sandbox.api.mastercard.com/mlc/api");
        PrivateKey signingKey = AuthenticationUtils.loadSigningKey(url.getPath(), KEY_ALIAS, KEYSTORE_PASSWORD);
        interceptors.add(new OkHttp2OAuth1Interceptor(CONSUMER_KEY, signingKey));
    }
}
