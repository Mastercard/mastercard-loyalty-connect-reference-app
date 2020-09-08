package com.mastercard.lts.rewards.apis;

import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.BusinessPartnerStoresApi;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.BusinessPartnerStoreDetails;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.BusinessPartnerStoreResponse;

import java.util.logging.Logger;

public class BusinessPartnerStores {

    private static final Logger logger = Logger.getLogger(BusinessPartnerStores.class.getName());

    /**
     * Store company location details
     * <p>
     * Store a company location into Mastercard Loyalty Connect (MLC)
     *
     * @throws ApiException if the Api call fails
     */
    public static BusinessPartnerStoreResponse enrollBusinessPartnerLocation(ApiClient apiClient, BusinessPartnerStoreDetails businessPartnerStoreDetails) throws ApiException {
        BusinessPartnerStoresApi api = new BusinessPartnerStoresApi(apiClient);
        BusinessPartnerStoreResponse response = api.createOrUpdateBusinessPartnerLocations(businessPartnerStoreDetails);
        logger.info("Response of enroll business partner location " + response.toString());
        return response;
    }

}
