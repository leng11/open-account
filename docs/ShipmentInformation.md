

# ShipmentInformation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | 01 - Ground 02 - Air 03 - International |  [optional] |
|**shippingFrequency** | [**ShippingFrequencyEnum**](#ShippingFrequencyEnum) |  |  [optional] |
|**noOfPackages** | **String** | Identifies the averages of packages that will be shipped in a week |  [optional] |
|**packageWeight** | [**Weight**](Weight.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _03 | &quot;03&quot; |



## Enum: ShippingFrequencyEnum

| Name | Value |
|---- | -----|
| WEEKLY | &quot;Weekly&quot; |



