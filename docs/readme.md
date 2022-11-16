# Open Account - Shipper Account Request
## Introduction

UPS Open Account API enables UPS 3rd Party Vendors to request a UPS Shipper Account. If the UPS Shipper Account request is approved, an UPS Shipper Account Number is generated. The UPS Ready Vendor user should first complete the registration process and get a My UPS ID before requesting a Shipper Account. Addresses are validated for accuracy. The User is expected to provide the primary reason for requesting a Shipper Account and the estimated number of Packages to be shipped.

## Run Procedure
- fork a copy of the repo in GitHub
- get a local copy of the project
```sh
git clone <forked repo url>
```
- build project
```sh
cd <project home>
mvn clean package
```
- update your information in src/main/resources/application.properties file

|Property Name|Description|
| :------: | :------: |
|```api.oauth.partner.client.id```| client id obtained in the onboarding process|
|```api.oauth.partner.secret```| client secret obtained in the onboarding process|
>    These are the properties in a section marked with "# UPS partner specific properties 
(change them!)" where you update with your client specific information like client id and secret.


- run com.ups.dap.OpenAccountApplication
```sh
java -jar openAccount-x.x.x.jar             # ex. java -jar openAccount-0.0.1-SNAPSHOT.jar
```
- check console output for application result


## Code Walk Through
There are 2 notable classes in this tutorial, namely com.ups.dap.app.AppConfig 
and com.ups.dap.app.OpenAccountDemo.  The AppConfig class is a configuration class leveraging 
Spring injection to incorporate the property value from src/main/resources/application.properties 
file.  The OpenAccountDemo is to illustrate how to use the ShipperAccountRequest api.

```java
 String accessToken = Util.getAccessToken(appConfig, restTemplate);
```
> Get an access token via OAuth client_credentials grant type.

```java
 // Prepare Shipper Account Request api access.
 final ShipperAccountRequestApi shipperAccountRequestApi = initializeApi(restTemplate,
                                                                            appConfig.getOpenAccountBaseUrl(),
                                                                            accessToken);
```
> initializeApi function is to create a ShipperAccountRequestApi object with the base url and populated the HTTP Authorization header with the access token.
					
```java
    OpenAccountRequest openAccountRequest = Util.createRequestFromJsonFile(entry.getKey(),
																			entry.getValue().get(AppConfig.SCENARIO_PROPERTIES_JSON_FILE_NAME),
																			OpenAccountRequest.class,
																			appConfig,
																			Arrays.asList(new CreateRequestEnricher() {}));
```
> It reconstructs a OpenAccountRequest object from a json file for a successful shipper account request and a missing pickup address case.  In a typical application, an OpenAccountRequest object would be created via a default constructor followed by a set of setter to populate the necessary attribute.

```java
	final OpenRequestResponse openRequestResponse = shipperAccountRequestApi.shipperAccountRequest(transId,
                                                                appConfig.getTransactionSrc(),
                                                                requestOption,
                                                                null,
                                                                null,
                                                            	openAccountRequest);
```
> An OpenRequestResponse object with shipper account will be returned from a server if everything is in order. Otherwise, a Http response of Bad Request (400) is being returned with Errors object including code and message.

### Data Schema 
- [Request Schema OpenAccountRequest](../docs/OpenAccountRequest.md)

- [Response Schema OpenRequestResponse](../docs/OpenRequestResponse.md)

- [Error Schema Errors](../docs/Errors.md)

### Sample Request/Response
- Shipper Account Request
```json
{
    "endUserInformation": {
        "deviceIdentity": "10.25.2.1",
        "email": "sgm@ups.com",
        "ipAddress":"10.26.1.1"
    },
    "accountCharacteristics": {
        "customerClassification": "01",
        "customerName": {
            "firstName": "John",
            "middleInitial": "A.",
            "surname": "Smith",
            "suffix": "Jr"
        },
        "taxInformation": {
            "taxId": "372886623"
        },
        "accountReason": "01",
        "currentCarrier": "31",
        "email": "sgm@ups.com",
        "myUPSId": {
            "id": "OAQA_XOLT_ps"
        }
    },
    "businessInformation": {
        "industry": "8000",
        "numberOfEmployees": "06",
        "shipmentInformation": {
            "type": "01",
            "noOfPackages": "50",
            "packageWeight":{
                "unitOfMeasurement":"LB"
            }
        },
        "shipperRequirements": [
            {
                "type": "01",
                "answer": true,
                "licenseInAllStates": true
            },
            {
                "type": "02",
                "answer": false
            },
            {
                "type": "08",
                "answer": false
            }
        ],
        "importBrokerage": {
            "type": "02",
            "name": "ABC Brokerage"
        }
    },
    "accountVerification": {
        "principalName": {
            "title": "CEO",
            "firstName": "John",
            "middleInitial": "A.",
            "surname": "Smith",
            "suffix": "Jr"
        },
        "accountInitiator": {
            "firstName": "John",
            "middleInitial": "A.",
            "surname": "Smith",
            "suffix": "Jr"
        },
        "documentation": {
        
            "documentOwnerName": {
                "firstName": "John",
                "middleInitial": "A.",
                "surname": "Smith",
                "suffix": "Jr"
            },
            "documentOwnerAddress": {
                "streetAddress": {
                    "addressLine1": "2010 Warsaw Road"
                },
                "city": "Roswell",
                "stateOrProvinceCode": "GA",
                "postalCode": "30076",
                "countryCode": "US"
            }
        },
        "paymentType": {
            "type": "Credit Card"
        },
        "commodities": {
            "commodity": "06"
        }
    },
    "billingContactInformation": {  
        "contactName": {
            "firstName": "Mary",
            "surname": "Jane"
        },
        "attentionName": "Billing",
        "businessName": "ABC Shipping Company",
        "email": "sgm@ups.com",
        "phone": {
            "phoneNumber": "6785851000",
            "extension": "1327"
        }
    },
    "billingAddress": {
        "streetAddress": {
            "addressLine1": "2010 Warsaw Road",
            "addressLine2": "Suite 100"
        },
        "city": "Roswell",
        "stateOrProvinceCode": "GA",
        "postalCode": "30076",
        "countryCode": "US"
    },
    "billingInformation": {
        "enrollmentOption": "01",
        "transactionPreference": "02",
        "emailReceipt": {
            "notificationPreference": "01"
        },
        "email": "sgm@ups.com"
    },
    "pickupContactInformation": {
        "contactName": {
            "firstName": "Jeff",
            "surname": "Thompson"
        },
        "attentionName": "Shipping Pickup",
        "businessName": "ABC Shipping Company",
        "phone": {
            "phoneNumber": "6787464100",
            "extension": "6033"
        },
        "email": "sgm@ups.com"
    },
    "pickupAddress": {
        "streetAddress": {
            "addressLine1": "12380 Morris Road",
            "addressLine2": "Suite S318B"
        },
        "city": "Alpharetta",
        "stateOrProvinceCode": "GA",
        "postalCode": "30005",
        "countryCode": "US"
    },
    "pickupInformation": {
        "type": "01",
        "location": "Front Door",
        "earliestPickupTime": "090000",
        "preferredPickupTime": "120000",
        "latestPickupTime": "180000",
        "pickupStartDate": "20221124",
        "pickupDays": [
            "Monday",
            "Tuesday"
        ]
    },
     "locale": {
        "languageCode": "EN",
        "countryCode": "US"
    }
   
}
```


- A successful Shipper Account response
```json
{
  "openAccountResponse": null,
  "shipperNumber": "TESTAN",
  "notifyTime": null,
  "addressCandidate": null
}
```

- A missing pickup address error response
```json
{
  "errors": [
    {
      "code": "100061",
      "message": "Missing or Invalid Pickup Address."
    }
  ]
}
```


### Related tutorial

|Name|Description|
| :------: | :------: |
|OAuth|[Get/refresh access token](http://localhost:8080/GitHub/link/placeHolder)|

### Glossary

|Term|Definition|
| :------: | :------: |
