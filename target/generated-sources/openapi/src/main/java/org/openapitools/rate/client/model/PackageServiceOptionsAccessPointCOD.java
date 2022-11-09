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
 * Access Point COD indicates Package COD is requested for a shipment.  Valid only for : 01 - Hold For Pickup At UPS Access Point, Shipment Indication type.  Package Access Point COD is valid only for shipment without return service from US/PR to US/PR and CA to CA.  Not valid with (Package) COD.
 */
@ApiModel(description = "Access Point COD indicates Package COD is requested for a shipment.  Valid only for : 01 - Hold For Pickup At UPS Access Point, Shipment Indication type.  Package Access Point COD is valid only for shipment without return service from US/PR to US/PR and CA to CA.  Not valid with (Package) COD.")
@JsonPropertyOrder({
  PackageServiceOptionsAccessPointCOD.JSON_PROPERTY_CURRENCY_CODE,
  PackageServiceOptionsAccessPointCOD.JSON_PROPERTY_MONETARY_VALUE
})
@JsonTypeName("PackageServiceOptions_AccessPointCOD")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class PackageServiceOptionsAccessPointCOD {
  public static final String JSON_PROPERTY_CURRENCY_CODE = "CurrencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_MONETARY_VALUE = "MonetaryValue";
  private String monetaryValue;

  public PackageServiceOptionsAccessPointCOD() {
  }

  public PackageServiceOptionsAccessPointCOD currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * Access Point COD Currency Code.  Required if Access Point COD container is present. UPS does not support all international currency codes. Refer to the appendix for a list of valid codes.
   * @return currencyCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Access Point COD Currency Code.  Required if Access Point COD container is present. UPS does not support all international currency codes. Refer to the appendix for a list of valid codes.")
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrencyCode() {
    return currencyCode;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrencyCode(String currencyCode) {
    this.currencyCode = currencyCode;
  }


  public PackageServiceOptionsAccessPointCOD monetaryValue(String monetaryValue) {
    
    this.monetaryValue = monetaryValue;
    return this;
  }

   /**
   * Access Point COD Monetary Value.  Required if Access Point COD container is present.
   * @return monetaryValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Access Point COD Monetary Value.  Required if Access Point COD container is present.")
  @JsonProperty(JSON_PROPERTY_MONETARY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getMonetaryValue() {
    return monetaryValue;
  }


  @JsonProperty(JSON_PROPERTY_MONETARY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMonetaryValue(String monetaryValue) {
    this.monetaryValue = monetaryValue;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PackageServiceOptionsAccessPointCOD packageServiceOptionsAccessPointCOD = (PackageServiceOptionsAccessPointCOD) o;
    return Objects.equals(this.currencyCode, packageServiceOptionsAccessPointCOD.currencyCode) &&
        Objects.equals(this.monetaryValue, packageServiceOptionsAccessPointCOD.monetaryValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCode, monetaryValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PackageServiceOptionsAccessPointCOD {\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    monetaryValue: ").append(toIndentedString(monetaryValue)).append("\n");
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
