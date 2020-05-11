package com.mastercard.lts.rewards.config;

import com.mastercard.developer.interceptors.OkHttpOAuth1Interceptor;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.utils.AuthenticationUtils;
import okhttp3.OkHttpClient;

import java.net.URL;
import java.security.PrivateKey;

public class MlcConfig {

    private static final String CONSUMER_KEY = "your_consumer_key";
    private static final String KEYSTORE_PASSWORD = "your_keystore_password";
    public static final String X_MERCHANT_KEY = "your_merchant_key";
    private static final String KEY_ALIAS = "your_key_alias";
    public static final String PARTNER_CODE = "your_partner_code";
    private static final String P12_KEY_FILE_NAME = "mastercard-loyalty-connect-sandbox.p12";
    private static final ClassLoader loader = MlcConfig.class.getClassLoader();
    private static final String API_BASE_PATH = "https://sandbox.api.mastercard.com/mlc/api";


    public static void setup(ApiClient apiClient) throws Exception {
        URL url = loader.getResource(P12_KEY_FILE_NAME);
        System.out.println("p12 file : " + url.getPath());
        OkHttpClient.Builder httpClientBuilder = apiClient.getHttpClient().newBuilder();
        apiClient.setBasePath(API_BASE_PATH);

        // Add the interceptor code responsible for signing HTTP requests
        PrivateKey signingKey = AuthenticationUtils.loadSigningKey(url.getPath(), KEY_ALIAS, KEYSTORE_PASSWORD);

        httpClientBuilder.addInterceptor(new OkHttpOAuth1Interceptor(CONSUMER_KEY, signingKey));
        OkHttpClient okHttpClient = httpClientBuilder.build();
        apiClient.setHttpClient(okHttpClient);
    }

}
