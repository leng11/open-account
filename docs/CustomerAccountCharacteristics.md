

# CustomerAccountCharacteristics


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**customerClassification** | [**CustomerClassificationEnum**](#CustomerClassificationEnum) | 01&#x3D;Business 02&#x3D;Personal |  |
|**customerName** | [**ContactName**](ContactName.md) |  |  [optional] |
|**taxInformation** | [**TaxInformation**](TaxInformation.md) |  |  [optional] |
|**creditCardToken** | **String** | Required if Customer Classification is of type \&quot;personal\&quot; |  [optional] |
|**accountReason** | **String** | 01 &#x3D; Starting a new business 02 &#x3D; Currently using another carrier 06 &#x3D; Occassional Shipping needs |  [optional] |
|**currentCarrier** | [**CurrentCarrierEnum**](#CurrentCarrierEnum) | 31 &#x3D; DHL 32 &#x3D; FedEx 33 &#x3D; US Postal Service 34 &#x3D; Other |  [optional] |
|**email** | **String** |  |  [optional] |
|**myUPSId** | [**MyUPSId**](MyUPSId.md) |  |  [optional] |



## Enum: CustomerClassificationEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |



## Enum: CurrentCarrierEnum

| Name | Value |
|---- | -----|
| _31 | &quot;31&quot; |
| _32 | &quot;32&quot; |
| _33 | &quot;33&quot; |
| _34 | &quot;34&quot; |



