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
 * Delivery Confirmation Container. For a list of valid origin/destination countries or territories please refer to appendix.  DeliveryConfirmation and COD are mutually exclusive.
 */
@ApiModel(description = "Delivery Confirmation Container. For a list of valid origin/destination countries or territories please refer to appendix.  DeliveryConfirmation and COD are mutually exclusive.")
@JsonPropertyOrder({
  PackageServiceOptionsDeliveryConfirmation.JSON_PROPERTY_DC_I_S_TYPE
})
@JsonTypeName("PackageServiceOptions_DeliveryConfirmation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class PackageServiceOptionsDeliveryConfirmation {
  public static final String JSON_PROPERTY_DC_I_S_TYPE = "DCISType";
  private String dcISType;

  public PackageServiceOptionsDeliveryConfirmation() {
  }

  public PackageServiceOptionsDeliveryConfirmation dcISType(String dcISType) {
    
    this.dcISType = dcISType;
    return this;
  }

   /**
   * Type of delivery confirmation.  Valid values:  1 - Delivery Confirmation Signature Required  2 - Delivery Confirmation Adult Signature Required
   * @return dcISType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of delivery confirmation.  Valid values:  1 - Delivery Confirmation Signature Required  2 - Delivery Confirmation Adult Signature Required")
  @JsonProperty(JSON_PROPERTY_DC_I_S_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDcISType() {
    return dcISType;
  }


  @JsonProperty(JSON_PROPERTY_DC_I_S_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDcISType(String dcISType) {
    this.dcISType = dcISType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageServiceOptionsDeliveryConfirmation packageServiceOptionsDeliveryConfirmation = (PackageServiceOptionsDeliveryConfirmation) o;
    return Objects.equals(this.dcISType, packageServiceOptionsDeliveryConfirmation.dcISType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dcISType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageServiceOptionsDeliveryConfirmation {\n");
    sb.append("    dcISType: ").append(toIndentedString(dcISType)).append("\n");
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

