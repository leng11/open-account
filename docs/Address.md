

# Address

UPS Common Data Model for Address

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**addressType** | [**AddressTypeEnum**](#AddressTypeEnum) |  |  [optional] |
|**streetAddress** | [**StreetAddress**](StreetAddress.md) |  |  [optional] |
|**city** | **String** |  |  [optional] |
|**stateOrProvinceCode** | **String** |  |  [optional] |
|**postalCode** | **String** |  |  [optional] |
|**countryCode** | **String** |  |  [optional] |



## Enum: AddressTypeEnum

| Name | Value |
|---- | -----|
| BUSINESS | &quot;business&quot; |
| RESIDENTIAL | &quot;residential&quot; |
| PICKUP | &quot;pickup&quot; |
| BILLING | &quot;billing&quot; |
| ACCOUNT_VERIFICATION | &quot;account-verification&quot; |



