/*
 * Rate
 * The Rating API is used when rating or shopping a shipment.
 *
 * The version of the OpenAPI document: 1.0.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.rate.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Container for type of Return Services.
 */
@ApiModel(description = "Container for type of Return Services.")
@JsonPropertyOrder({
  ShipmentServiceOptionsReturnService.JSON_PROPERTY_CODE,
  ShipmentServiceOptionsReturnService.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("ShipmentServiceOptions_ReturnService")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class ShipmentServiceOptionsReturnService {
  public static final String JSON_PROPERTY_CODE = "Code";
  private String code;

  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public ShipmentServiceOptionsReturnService() {
  }

  public ShipmentServiceOptionsReturnService code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Code for type of Return shipment.  Valid values are: &#39;2&#39; &#x3D; UPS Print and Mail Return Label  &#39;3&#39; &#x3D;UPS One-Attempt Return Label &#39;5&#39; &#x3D; UPS Three Attempt Return Label &#39;8&#39; &#x3D; UPS Electronic Return Label &#39;9&#39; &#x3D; UPS Print Return Label &#39;10&#39; &#x3D; UPS Exchange Print Return Label                            &#39;11&#39; &#x3D; UPS Pack &amp; Collect Service 1-Attempt Box 1  &#39;12&#39; &#x3D; UPS Pack &amp; Collect Service 1-Attempt Box 2  &#39;13&#39; &#x3D; UPS Pack &amp; Collect Service 1-Attempt Box 3  &#39;14&#39; &#x3D; UPS Pack &amp; Collect Service 1-Attempt Box 4  &#39;15&#39; &#x3D; UPS Pack &amp; Collect Service 1-Attempt Box 5  &#39;16&#39; &#x3D; UPS Pack &amp; Collect Service 3-Attempt Box 1  &#39;17&#39; &#x3D; UPS Pack &amp; Collect Service 3-Attempt Box 2  &#39;18&#39; &#x3D; UPS Pack &amp; Collect Service 3-Attempt Box 3  &#39;19&#39; &#x3D; UPS Pack &amp; Collect Service 3-Attempt Box 4  &#39;20&#39; &#x3D; UPS Pack &amp; Collect Service 3-Attempt Box 5   10 &#x3D; UPS Exchange Print Return Label and 5 &#x3D; UPS Three Attempt Return Label are not valid for UPS WorldWide Express Freight and UPS Worldwide Express Freight Midday Services.   3 &#x3D; UPS One-Attempt Return Label is not valid return service with UPS Premium Care accessorial.
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Code for type of Return shipment.  Valid values are: '2' = UPS Print and Mail Return Label  '3' =UPS One-Attempt Return Label '5' = UPS Three Attempt Return Label '8' = UPS Electronic Return Label '9' = UPS Print Return Label '10' = UPS Exchange Print Return Label                            '11' = UPS Pack & Collect Service 1-Attempt Box 1  '12' = UPS Pack & Collect Service 1-Attempt Box 2  '13' = UPS Pack & Collect Service 1-Attempt Box 3  '14' = UPS Pack & Collect Service 1-Attempt Box 4  '15' = UPS Pack & Collect Service 1-Attempt Box 5  '16' = UPS Pack & Collect Service 3-Attempt Box 1  '17' = UPS Pack & Collect Service 3-Attempt Box 2  '18' = UPS Pack & Collect Service 3-Attempt Box 3  '19' = UPS Pack & Collect Service 3-Attempt Box 4  '20' = UPS Pack & Collect Service 3-Attempt Box 5   10 = UPS Exchange Print Return Label and 5 = UPS Three Attempt Return Label are not valid for UPS WorldWide Express Freight and UPS Worldwide Express Freight Midday Services.   3 = UPS One-Attempt Return Label is not valid return service with UPS Premium Care accessorial.")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public ShipmentServiceOptionsReturnService description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description for type of Return Service.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description for type of Return Service.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentServiceOptionsReturnService shipmentServiceOptionsReturnService = (ShipmentServiceOptionsReturnService) o;
    return Objects.equals(this.code, shipmentServiceOptionsReturnService.code) &&
        Objects.equals(this.description, shipmentServiceOptionsReturnService.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentServiceOptionsReturnService {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
