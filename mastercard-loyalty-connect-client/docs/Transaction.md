

# Transaction

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bankCardNumber** | **String** | A cipher text that represents the encrypted value of the payment card number used by the Customer when he/she taps the payment card on the NFC based Loyalty Connect Reader. An application installed on this reader, receives the encrypted payment card number and invokes this endpoint with other details related to the card and Merchant. MLC decrypts and looks up the payment card number to retrieve the associated Loyalty ID for the Merchant. | 
**issuerName** | **String** | Name of the issuer |  [optional]
**iv** | **String** | Initialization vector used in decryption and identification of payment card number |  [optional]
**ksn** | **String** | Key Serial Number to lookup the decryption key for payment card number | 
**merchantLocationId** | **String** | Merchant location id as sent from the Merchant system |  [optional]
**paymentCardNetworkDetails** | **String** | Network provider of the payment card used in the transaction |  [optional]
**terminalId** | **String** | Merchant terminal id as sent from the Merchant system |  [optional]



