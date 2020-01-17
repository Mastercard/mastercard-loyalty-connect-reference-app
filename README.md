# MasterCard Loyalty Connect Reference Application

## Description
This Reference Application is a guide for using MasterCard Loyalty Connect API's.

## Requirements

Reference Application requires:
1. Java 1.7+
2. Maven/Gradle

## Usage
### 1. Download the latest swagger file in YAML format from [here](https://developer.mastercard.com/devzone/api/secure/servicespec/mastercardloyaltyconnectservice/swaggerui-yaml)

### 2. Generate the client library
Go to the link [here](https://developer.mastercard.com/platform/documentation/generating-and-configuring-a-mastercard-api-client/) 
to read up on how to generate the client library with the openapi-generator.

We are using this command that generate the mastercard_loyalty_connect_client folder.  
`openapi-generator generate -g java --library okhttp-gson -i Loyalty_Connect.yaml -c mastercard-loyalty-connect-config.json -o mastercard_loyalty_connect_client`

We have included the swagger file and mastercard-loyalty-connect-client folder that are embedded in the app

### 3. Maven Build
Go to the `mastercard-loyalty-connect-client` and run `mvn clean package`

### 4. Copy the library to lib folder
In the `mastercard-loyalty-connect-client`, go to `/target` and copy `mastercard-loyalty-connect-client-<version number>.jar` to the `lib folder` of this reference application.

### 5. Create a new project on Mastercard developer zone under your account
1. Go to <https://developer.mastercard.com/>
2. Create a new project
3. Add "MasterCard Loyalty Connect" to your project
4. Download and save your keystore and client id

### 6. Replace the p12 file and your credentials 
1. Go to src/main/resources and add your keystore p12 file that obtained from **step 5**
2. (**IMPORTANT**) Rename your keystore p12 certificate in `src/main/resources` to `mastercard-loyalty-connect-sandbox.p12`. 
3. Replace your values for `CONSUMER_KEY`, `KEY_ALIAS`, `KEYSTORE_PASSWORD`,`X_MERCHANT_KEY`,`PARTNER_CODE` in config/MlcConfig.java

### 7. Run the MastercardLoyaltyConnectReference.java with this Maven Command
1. Update the pom.xml to ensure the target main class is correct: `<argument>com.mastercard.lts.rewards.MastercardLoyaltyConnectReference</argument>`
2. Go to `project root directory` and run `mvn clean compile exec:exec -Dexec.executable=java -Dexec.classpathScope=compile`

## Use Case
This reference app describes one end to end flow for using MasterCard Loyalty Connect API's it skips some endpoints :
1. Enroll Member and obtain memberReferenceId and memberMerchantReferenceId
2. Get Member using memberReferenceId
3. Enroll Payment Card using memberReferenceId and obtain paymentCardReferenceId
4. Get Payment Card using memberReferenceId and paymentCardReferenceId
5. Enroll Loyalty_Connect using memberReferenceId and obtain loyaltyConnectReferenceId 
6. Get Loyalty Connect using memberReferenceId and loyaltyConnectReferenceId
7. Enroll another Merchant Loyalty Program using memberReferenceId and obtain memberMerchantReferenceId
8. Get Merchant LoyaltyProgram using memberReferenceId and memberMerchantReferenceId
9. Get all Merchant Loyalty Program associated using memberReferenceId
10. Update Merchant loyalty Program using memberReferenceId and memberMerchantReferenceId
11. Get Member to fetch all details like it's associated Payment Card's, Merchant Loyalty Programs and Loyalty Connect
12. Update Member details using memberReferenceId
13. Get Member to verify updated member details using memberReferenceId  
14. Delete Loyalty Connect using memberReferenceId and loyaltyConnectReferenceId
15. Delete Payment Card using memberReferenceId and paymentCardReferenceId
16. Get Member to verify Loyalty Connect and Payment Card got deleted or not
17. Finally, delete Member to delete member using memberReferenceId

## API Expected sample Response but values varies for reference id's
### Enroll Member
Expected response from MasterCard Loyalty Connect API:
```
{
    memberMerchantReferenceId: c49f2b32-efe0-4543-9e3c-669c09b12584
    memberReferenceId: DUDeHlh48NOH1067649
}
```
### Get Member
Expected response from MasterCard Loyalty Connect API:
```
{
    addressLine1: AddressLine 3
    addressLine2: Rosemary garden
    addressLine3: AddressLine 3
    cityName: Nottingham
    countryCode: UK
    emailAddress: james.anderson@mastercard.com
    firstName: James
    lastName: Anderson
    loyaltyConnectResponses: []
    memberReferenceId: DUDeHlh48NOH1067649
    merchantLoyaltyDetails: [ {
        loyaltyId: james.anderson@mastercard.com
        memberMerchantReferenceId: c49f2b32-efe0-4543-9e3c-669c09b12584
        merchantCode: 989898
        merchantName: Jmeter
        pointBalance: null
    }]
    mobilePhoneNumber: +44 (0) 7970 225 256
    paymentCards: []
    postalCode: UK 2345
    stateProvinceCode: NT
    title: Mr
}
```
### Enroll Payment Card using memberReferenceId
Expected response from MasterCard Loyalty Connect API:
```
{
    paymentCardReferenceId: 1faed7bf-4b26-4230-b59c-54fd5eeb7985
}
```
### Get Payment Card using memberReferenceId and paymentCardReferenceId
Expected response from MasterCard Loyalty Connect API:
```
{
    bankCardNumber: XXXXXXXXXXXX0010
    bankCardProduct: BLACK
    paymentCardReferenceId: 1faed7bf-4b26-4230-b59c-54fd5eeb7985
}
```
### Enroll Loyalty_Connect using memberReferenceId
Expected response from MasterCard Loyalty Connect API:
```
{
    loyaltyConnectReferenceId: 45efc565-8fcb-4f62-960e-769cdc46e453
}
```
### Get Loyalty Connect using memberReferenceId and loyaltyConnectReferenceId
Expected response from MasterCard Loyalty Connect API:
```
{
    bankCardNumber: XXXXXXXXXXXX0010
    loyaltyConnectReferenceId: 45efc565-8fcb-4f62-960e-769cdc46e453
    loyaltyId: james.anderson@mastercard.com
    memberMerchantReferenceId: c49f2b32-efe0-4543-9e3c-669c09b12584
    merchantCode: 989898
    paymentCardReferenceId: 1faed7bf-4b26-4230-b59c-54fd5eeb7985
}
```
### Enroll another Merchant Loyalty Program using memberReferenceId
Expected response from MasterCard Loyalty Connect API:
```
{
    loyaltyId: james.anderson@gmail.com
    memberMerchantReferenceId: 272bb799-74da-47a7-a713-d91e6f5d709c
}
```
### Get Merchant LoyaltyProgram using memberReferenceId and memberMerchantReferenceId
Expected response from MasterCard Loyalty Connect API:
```
{
    loyaltyId: james.anderson@gmail.com
    memberMerchantReferenceId: 272bb799-74da-47a7-a713-d91e6f5d709c
    merchantCode: 989898
    merchantName: Jmeter
    pointBalance: null
}
```
### Get all Merchant Loyalty Program associated using memberReferenceId
Expected response from MasterCard Loyalty Connect API:
```
{
    memberMerchantLoyaltyDetails: 
    [ {
        loyaltyId: james.anderson@mastercard.com
        memberMerchantReferenceId: c49f2b32-efe0-4543-9e3c-669c09b12584
        merchantCode: 989898
        merchantName: Jmeter
        pointBalance: null
    },  
    {
        loyaltyId: james.anderson@gmail.com
        memberMerchantReferenceId: 272bb799-74da-47a7-a713-d91e6f5d709c
        merchantCode: 989898
        merchantName: Jmeter
        pointBalance: null
    }]
    memberReferenceId: DUDeHlh48NOH1067649
}
```
### Update Merchant loyalty Program using memberReferenceId and memberMerchantReferenceId
Expected response from MasterCard Loyalty Connect API: 201 
```
Merchant loyalty program is updated successfully
```
### Get Member to fetch all details like it's associated Payment Card's, Merchant Loyalty Programs and Loyalty Connect
Expected response from MasterCard Loyalty Connect API: 
```
{
    addressLine1: AddressLine 3
    addressLine2: null
    addressLine3: null
    cityName: Nottingham
    countryCode: UK
    emailAddress: james.anderson@mastercard.com
    firstName: James
    lastName: Anderson
    loyaltyConnectResponses: [ {
        bankCardNumber: XXXXXXXXXXXX0010
        loyaltyConnectReferenceId: 45efc565-8fcb-4f62-960e-769cdc46e453
        loyaltyId: james.anderson@yahoo.co.uk
        memberMerchantReferenceId: c49f2b32-efe0-4543-9e3c-669c09b12584
        merchantCode: 989898
        paymentCardReferenceId: 1faed7bf-4b26-4230-b59c-54fd5eeb7985
    }]
    memberReferenceId: DUDeHlh48NOH1067649
    merchantLoyaltyDetails: [ {
        loyaltyId: james.anderson@yahoo.co.uk
        memberMerchantReferenceId: c49f2b32-efe0-4543-9e3c-669c09b12584
        merchantCode: 989898
        merchantName: Jmeter
        pointBalance: null
    },  {
        loyaltyId: james.anderson@gmail.com
        memberMerchantReferenceId: 272bb799-74da-47a7-a713-d91e6f5d709c
        merchantCode: 989898
        merchantName: Jmeter
        pointBalance: null
    }]
    mobilePhoneNumber: +44 (0) 7970 225 256
    paymentCards: [class PaymentCardDetails {
        bankCardNumber: XXXXXXXXXXXX0010
        bankCardProduct: BLACK
        paymentCardReferenceId: 1faed7bf-4b26-4230-b59c-54fd5eeb7985
    }]
    postalCode: UK 2345
    stateProvinceCode: NT
    title: Mr
}
```
### Update Member details using memberReferenceId
Expected response from MasterCard Loyalty Connect API: 204
```
Member is updated successfully
```
### Get Member to verify updated member details using memberReferenceId 
Expected response from MasterCard Loyalty Connect API:
```
{
    addressLine1: 110 trump tower
    addressLine2: Rosemary garden
    addressLine3: AddressLine 3
    cityName: Nottingham
    countryCode: UK
    emailAddress: james.anderson@yahoo.co.uk
    firstName: James
    lastName: Anderson
    loyaltyConnectResponses: [ {
        bankCardNumber: XXXXXXXXXXXX0010
        loyaltyConnectReferenceId: 45efc565-8fcb-4f62-960e-769cdc46e453
        loyaltyId: james.anderson@yahoo.co.uk
        memberMerchantReferenceId: c49f2b32-efe0-4543-9e3c-669c09b12584
        merchantCode: 989898
        paymentCardReferenceId: 1faed7bf-4b26-4230-b59c-54fd5eeb7985
    }]
    memberReferenceId: DUDeHlh48NOH1067649
    merchantLoyaltyDetails: [ {
        loyaltyId: james.anderson@yahoo.co.uk
        memberMerchantReferenceId: c49f2b32-efe0-4543-9e3c-669c09b12584
        merchantCode: 989898
        merchantName: Jmeter
        pointBalance: null
    },  {
        loyaltyId: james.anderson@gmail.com
        memberMerchantReferenceId: 272bb799-74da-47a7-a713-d91e6f5d709c
        merchantCode: 989898
        merchantName: Jmeter
        pointBalance: null
    }]
    mobilePhoneNumber: +44 (0) 7970 225 256
    paymentCards: [class PaymentCardDetails {
        bankCardNumber: XXXXXXXXXXXX0010
        bankCardProduct: BLACK
        paymentCardReferenceId: 1faed7bf-4b26-4230-b59c-54fd5eeb7985
    }]
    postalCode: SN 4560
    stateProvinceCode: NT
    title: Mr
}
```
### Delete Loyalty Connect using memberReferenceId and loyaltyConnectReferenceId
Expected response from MasterCard Loyalty Connect API: 202
```
Loyalty Connect successfully deleted
```
### Delete Payment Card using memberReferenceId and paymentCardReferenceId
Expected response from MasterCard Loyalty Connect API: 202
```
Payment card is successfully deleted
```
### Get Member to verify Loyalty Connect and Payment Card got deleted or not
Expected response from MasterCard Loyalty Connect API:
```
{
    addressLine1: 110 trump tower
    addressLine2: Rosemary garden
    addressLine3: AddressLine 3
    cityName: Nottingham
    countryCode: UK
    emailAddress: james.anderson@yahoo.co.uk
    firstName: James
    lastName: Anderson
    loyaltyConnectResponses: []
    memberReferenceId: DUDeHlh48NOH1067649
    merchantLoyaltyDetails: [{
        loyaltyId: james.anderson@yahoo.co.uk
        memberMerchantReferenceId: c49f2b32-efe0-4543-9e3c-669c09b12584
        merchantCode: 989898
        merchantName: Jmeter
        pointBalance: null
    },  {
        loyaltyId: james.anderson@gmail.com
        memberMerchantReferenceId: 272bb799-74da-47a7-a713-d91e6f5d709c
        merchantCode: 989898
        merchantName: Jmeter
        pointBalance: null
    }]
    mobilePhoneNumber: +44 (0) 7970 225 256
    paymentCards: []
    postalCode: SN 4560
    stateProvinceCode: NT
    title: Mr
}
```
### Finally, delete Member to delete member using memberReferenceId
Expected response from MasterCard Loyalty Connect API: 202
```
Member is successfully deleted
```
## Author
- Name: **Mastercard**
- Contact: **apisupport@mastercard.com**

## Support
Please email to **apisupport@mastercard.com** for additional support if required. 

## License
Apache 2 License

### Copyright © 1994-2019, All Right Reserved by Mastercard.

