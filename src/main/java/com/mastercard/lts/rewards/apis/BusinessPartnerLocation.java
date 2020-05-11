package com.mastercard.lts.rewards.apis;

import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.api.BusinessPartnerLocationsApi;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.BusinessPartnerLocationDetails;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.BusinessPartnerLocationsResponse;

import java.util.logging.Logger;

public class BusinessPartnerLocation {

    private static final Logger logger = Logger.getLogger(BusinessPartnerLocation.class.getName());

    /**
     * Store company location details
     * <p>
     * Store a company location into Mastercard Loyalty Connect (MLC)
     *
     * @throws ApiException if the Api call fails
     */
    public static BusinessPartnerLocationsResponse enrollBusinessPartnerLocation(ApiClient apiClient, String locationId, String terminalId,
                                                                                 BusinessPartnerLocationDetails businessPartnerLocationDetails) throws ApiException {
        BusinessPartnerLocationsApi api = new BusinessPartnerLocationsApi(apiClient);
        BusinessPartnerLocationsResponse response = api.createOrUpdateBusinessPartnerLocations(locationId, terminalId, businessPartnerLocationDetails);
        logger.info("Response of enroll business partner location " + response.toString());
        return response;
    }

}
