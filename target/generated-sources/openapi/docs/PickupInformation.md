

# PickupInformation



## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | 01 &#x3D; Regular Daily Pickup 02 &#x3D; SMART Pickup 07 &#x3D; Daily-On Route 08 &#x3D; No Scheduled Pickup 99 &#x3D; Day Specific Pickup  |  [optional] |
|**location** | [**LocationEnum**](#LocationEnum) |  |  [optional] |
|**earliestPickupTime** | **String** | Format: hhmmss   e.g. 230000 for 11:00PM  Valid Values  hh: 1-23 mm: 00, 15, 30, 45 ss: 00 |  [optional] |
|**preferredPickupTime** | **String** | Format: hhmmss   e.g. 230000 for 11:00PM  Valid Values  hh: 1-23 mm: 00, 15, 30, 45 ss: 00 |  [optional] |
|**latestPickupTime** | **String** | Format: hhmmss   e.g. 230000 for 11:00PM  Valid Values  hh: 1-23 mm: 00, 15, 30, 45 ss: 00 |  [optional] |
|**pickupStartDate** | **String** | YYYYMMDD Format |  [optional] |
|**pickupDays** | [**List&lt;PickupDaysEnum&gt;**](#List&lt;PickupDaysEnum&gt;) |  |  [optional] |
|**weekendDeliveryOptions** | [**WeekendDeliveryOptionsEnum**](#WeekendDeliveryOptionsEnum) | Only used for Weekend Pickup  01 &#x3D; Saturday Eligible Commercial |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| _01 | &quot;01&quot; |
| _02 | &quot;02&quot; |
| _07 | &quot;07&quot; |
| _08 | &quot;08&quot; |
| _99 | &quot;99&quot; |



## Enum: LocationEnum

| Name | Value |
|---- | -----|
| FRONT_DOOR | &quot;Front Door&quot; |
| BACK_DOOR | &quot;Back Door&quot; |
| SIDE_DOOR | &quot;Side Door&quot; |
| SHIPPING | &quot;Shipping&quot; |
| RECEIVING | &quot;Receiving&quot; |
| RECEPTION | &quot;Reception&quot; |
| OFFICE | &quot;Office&quot; |
| MAIL_ROOM | &quot;Mail Room&quot; |
| GARAGE | &quot;Garage&quot; |
| UPSTAIRS | &quot;Upstairs&quot; |
| DOWNSTAIRS | &quot;Downstairs&quot; |
| THIRD_PARTY | &quot;Third Party&quot; |
| GUARD_ROOM | &quot;Guard Room&quot; |
| WAREHOUSE | &quot;Warehouse&quot; |



## Enum: List&lt;PickupDaysEnum&gt;

| Name | Value |
|---- | -----|
| MONDAY | &quot;Monday&quot; |
| TUESDAY | &quot;Tuesday&quot; |
| WEDNESDAY | &quot;Wednesday&quot; |
| THURSDAY | &quot;Thursday&quot; |
| FRIDAY | &quot;Friday&quot; |
| SATURDAY | &quot;Saturday&quot; |



## Enum: WeekendDeliveryOptionsEnum

| Name | Value |
|---- | -----|
| SATURDAY_ELIGIBLE_COMMERCIAL | &quot;Saturday Eligible Commercial&quot; |



