package com.mastercard.lts.rewards.service;

import com.mastercard.developer.mastercard_loyalty_connect_client.ApiClient;
import com.mastercard.developer.mastercard_loyalty_connect_client.ApiException;
import com.mastercard.developer.mastercard_loyalty_connect_client.model.*;
import com.mastercard.lts.rewards.apis.BusinessPartnerStores;
import com.mastercard.lts.rewards.apis.LoyaltyConnect;
import com.mastercard.lts.rewards.apis.Member;
import com.mastercard.lts.rewards.apis.MemberMerchant;
import com.mastercard.lts.rewards.config.MlcConfig;

import java.util.ArrayList;
import java.util.List;

import static com.mastercard.lts.rewards.apis.LoyaltyConnect.deleteLoyaltyConnect;
import static com.mastercard.lts.rewards.apis.Member.deleteMember;
import static com.mastercard.lts.rewards.apis.Member.getMember;
import static com.mastercard.lts.rewards.apis.Member.searchMember;
import static com.mastercard.lts.rewards.apis.MemberMerchant.getAllMemberMerchantLoyaltyProgram;
import static com.mastercard.lts.rewards.apis.MemberMerchant.getMemberMerchantLoyaltyProgram;

public class MlcService {

    public static void executeMasterCardLoyaltyConnectApis(ApiClient apiClient) throws ApiException {

        MemberMerchantResponse memberMerchantResponse = enrollMember(apiClient);

        getMember(apiClient, memberMerchantResponse.getMemberReferenceId());

        searchMember(apiClient, getMemberSearch());

        PaymentCardResponse paymentCardResponse = enrollPaymentCard(apiClient, memberMerchantResponse.getMemberReferenceId());

        com.mastercard.lts.rewards.apis.PaymentCard.getPaymentCardDetails(apiClient, memberMerchantResponse.getMemberReferenceId(), paymentCardResponse.getPaymentCardReferenceId());

        EnrollLoyaltyConnectResponse enrollLoyaltyConnectResponse = enrollLoyaltyConnect(apiClient, memberMerchantResponse.getMemberReferenceId(), memberMerchantResponse.getMemberMerchantReferenceId(), paymentCardResponse.getPaymentCardReferenceId());

        LoyaltyConnect.getLoyaltyConnect(apiClient, memberMerchantResponse.getMemberReferenceId(), enrollLoyaltyConnectResponse.getLoyaltyConnectReferenceId());

        MerchantLoyaltyProgramResponse merchantLoyaltyProgramResponse = enrollMerchantLoyaltyProgram(apiClient, memberMerchantResponse.getMemberReferenceId());

        getMemberMerchantLoyaltyProgram(apiClient, merchantLoyaltyProgramResponse.getMemberMerchantReferenceId(), memberMerchantResponse.getMemberReferenceId());

        getAllMemberMerchantLoyaltyProgram(apiClient, null, null, memberMerchantResponse.getMemberReferenceId());

        updateMerchantLoyaltyProgram(apiClient, memberMerchantResponse.getMemberMerchantReferenceId(), memberMerchantResponse.getMemberReferenceId());

        getMember(apiClient, memberMerchantResponse.getMemberReferenceId());

        searchMember(apiClient, getMemberSearch());

        updateMember(apiClient, memberMerchantResponse.getMemberReferenceId());

        getMember(apiClient, memberMerchantResponse.getMemberReferenceId());

        searchMember(apiClient, getMemberSearch());

        deleteLoyaltyConnect(apiClient, memberMerchantResponse.getMemberReferenceId(), enrollLoyaltyConnectResponse.getLoyaltyConnectReferenceId());

        com.mastercard.lts.rewards.apis.PaymentCard.deletePaymentCard(apiClient, memberMerchantResponse.getMemberReferenceId(), paymentCardResponse.getPaymentCardReferenceId());

        getMember(apiClient, memberMerchantResponse.getMemberReferenceId());

        searchMember(apiClient, getMemberSearch());

        deleteMember(apiClient, memberMerchantResponse.getMemberReferenceId());

        createBusinessPartnerStores(apiClient);
    }

    private static MemberSearch getMemberSearch() {
        MemberSearch memberSearch = new MemberSearch();
        memberSearch.setUserId("james.anderson@mastercard.com");
        return memberSearch;
    }

    private static void createBusinessPartnerStores(ApiClient apiClient) throws ApiException {
        BusinessPartnerStoreDetails businessPartnerStoreDetails = new BusinessPartnerStoreDetails();
        Store store = new Store();
        store.setName("IRC London");
        store.setCountry("UK");
        store.setEmailAddress("ircLondon@irc.com");
        store.setKey("GH3464265");
        store.setTaxNumber("GD7586");

        List<String> tags = new ArrayList<>();
        tags.add("full-price");
        store.setTags(tags);

        List<Device> devices = new ArrayList<>();
        Device device = new Device();
        device.setKey("terminal-id");
        devices.add(device);

        Telephone telephone = new Telephone();
        Daytime daytime = new Daytime();
        daytime.setText("0178 897 9999");
        telephone.setDaytime(daytime);

        store.setTelephone(telephone);

        Address address = new Address();
        List<String> streets = new ArrayList<>();
        streets.add("14 John Dalton Street");
        streets.add("Manchester M2 6JR");
        address.setStreets(streets);

        store.setAddress(address);
        businessPartnerStoreDetails.setDevices(devices);
        businessPartnerStoreDetails.setStore(store);
        BusinessPartnerStores.enrollBusinessPartnerLocation(apiClient,businessPartnerStoreDetails);
    }

    private static MemberMerchantResponse enrollMember(ApiClient apiClient) throws ApiException {
        com.mastercard.developer.mastercard_loyalty_connect_client.model.Member member = new com.mastercard.developer.mastercard_loyalty_connect_client.model.Member();
        member.setUserId("james.anderson@mastercard.com");
        member.setUserType("MERCHANT_LOYALTY_ID");
        member.setPartnerCode(MlcConfig.PARTNER_CODE);
        member.setAddressLine1("120 trump tower");
        member.setAddressLine2("Rosemary garden");
        member.setAddressLine3("AddressLine 3");
        member.setCityName("Nottingham");
        member.setStateProvinceCode("NT");
        member.setCountryCode("UK");
        member.setPostalCode("UK 2345");
        member.setTitle("Mr");
        member.setFirstName("James");
        member.setLastName("Anderson");
        member.setMobilePhoneNumber("+44 (0) 7970 225 256");
        member.setEmailAddress("james.anderson@mastercard.com");
        return Member.enrollMember(apiClient, member);
    }

    private static void updateMember(ApiClient apiClient, String memberReferenceId) throws ApiException {
        MemberDetails memberDetails = new MemberDetails();
        memberDetails.setAddressLine1("110 trump tower");
        memberDetails.setAddressLine2("Rosemary garden");
        memberDetails.setAddressLine3("AddressLine 3");
        memberDetails.setCityName("Nottingham");
        memberDetails.setStateProvinceCode("NT");
        memberDetails.setCountryCode("UK");
        memberDetails.setPostalCode("SN 4560");
        memberDetails.setTitle("Mr");
        memberDetails.setFirstName("James");
        memberDetails.setLastName("Anderson");
        memberDetails.setMobilePhoneNumber("+44 (0) 7970 225 256");
        memberDetails.setEmailAddress("james.anderson@yahoo.co.uk");
        Member.updateMember(apiClient, memberReferenceId, memberDetails);
    }

    private static void updateMerchantLoyaltyProgram(ApiClient apiClient, String memberMerchantReferenceId, String memberReferenceId) throws ApiException {
        LoyaltyProgram loyaltyProgram = new LoyaltyProgram();
        loyaltyProgram.setLoyaltyId("james.anderson@yahoo.co.uk");
        MemberMerchant.updateMerchantLoyaltyProgram(apiClient, memberMerchantReferenceId, memberReferenceId, loyaltyProgram);
    }

    private static MerchantLoyaltyProgramResponse enrollMerchantLoyaltyProgram(ApiClient apiClient, String memberReferenceId) throws ApiException {
        MerchantLoyaltyProgram merchantLoyaltyProgram = new MerchantLoyaltyProgram();
        merchantLoyaltyProgram.setLoyaltyId("james.anderson@gmail.com");
        merchantLoyaltyProgram.setMerchantCode(MlcConfig.PARTNER_CODE);
        return MemberMerchant.joinOrConnectMerchantLoyaltyProgram(apiClient, memberReferenceId, merchantLoyaltyProgram);
    }

    private static EnrollLoyaltyConnectResponse enrollLoyaltyConnect(ApiClient apiClient, String memberReferenceId, String memberMerchantReferenceId, String paymentCardReferenceId) throws ApiException {
        com.mastercard.developer.mastercard_loyalty_connect_client.model.LoyaltyConnect loyaltyConnect = new com.mastercard.developer.mastercard_loyalty_connect_client.model.LoyaltyConnect();
        loyaltyConnect.setMemberMerchantReferenceId(memberMerchantReferenceId);
        loyaltyConnect.setPaymentCardReferenceId(paymentCardReferenceId);
        return LoyaltyConnect.enrollLoyaltyConnect(apiClient, memberReferenceId, loyaltyConnect);
    }

    private static PaymentCardResponse enrollPaymentCard(ApiClient apiClient, String memberReferenceId) throws ApiException {
        PaymentCard paymentCard = new PaymentCard();
        paymentCard.setBankCardNumber("4761739001010010"); //DO NOT CHANGE for SANDBOX
        paymentCard.setBankCardProduct("BLACK");
        return com.mastercard.lts.rewards.apis.PaymentCard.enrollPaymentCard(apiClient, memberReferenceId, paymentCard);
    }

}
