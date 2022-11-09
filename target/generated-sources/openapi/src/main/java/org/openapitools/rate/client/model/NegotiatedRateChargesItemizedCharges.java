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
 * Itemized Charges are returned only when the subversion element is present and greater than or equal to &#39;1601&#39;.  These charges would be returned only when subversion is greater than or equal to 1601
 */
@ApiModel(description = "Itemized Charges are returned only when the subversion element is present and greater than or equal to '1601'.  These charges would be returned only when subversion is greater than or equal to 1601")
@JsonPropertyOrder({
  NegotiatedRateChargesItemizedCharges.JSON_PROPERTY_CODE,
  NegotiatedRateChargesItemizedCharges.JSON_PROPERTY_DESCRIPTION,
  NegotiatedRateChargesItemizedCharges.JSON_PROPERTY_CURRENCY_CODE,
  NegotiatedRateChargesItemizedCharges.JSON_PROPERTY_MONETARY_VALUE,
  NegotiatedRateChargesItemizedCharges.JSON_PROPERTY_SUB_TYPE
})
@JsonTypeName("NegotiatedRateCharges_ItemizedCharges")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class NegotiatedRateChargesItemizedCharges {
  public static final String JSON_PROPERTY_CODE = "Code";
  private String code;

  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public static final String JSON_PROPERTY_CURRENCY_CODE = "CurrencyCode";
  private String currencyCode;

  public static final String JSON_PROPERTY_MONETARY_VALUE = "MonetaryValue";
  private String monetaryValue;

  public static final String JSON_PROPERTY_SUB_TYPE = "SubType";
  private String subType;

  public NegotiatedRateChargesItemizedCharges() {
  }

  public NegotiatedRateChargesItemizedCharges code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Identification code for itemized charge.
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Identification code for itemized charge.")
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


  public NegotiatedRateChargesItemizedCharges description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Description of Itemized Charge that had been charged.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Description of Itemized Charge that had been charged.")
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


  public NegotiatedRateChargesItemizedCharges currencyCode(String currencyCode) {
    
    this.currencyCode = currencyCode;
    return this;
  }

   /**
   * The IATA currency code associated with the Itemized Charge costs for the shipment.
   * @return currencyCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The IATA currency code associated with the Itemized Charge costs for the shipment.")
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


  public NegotiatedRateChargesItemizedCharges monetaryValue(String monetaryValue) {
    
    this.monetaryValue = monetaryValue;
    return this;
  }

   /**
   * The value for Itemized Charge costs associated with the shipment.
   * @return monetaryValue
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The value for Itemized Charge costs associated with the shipment.")
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


  public NegotiatedRateChargesItemizedCharges subType(String subType) {
    
    this.subType = subType;
    return this;
  }

   /**
   * The sub-type of Itemized Charge type.
   * @return subType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The sub-type of Itemized Charge type.")
  @JsonProperty(JSON_PROPERTY_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSubType() {
    return subType;
  }


  @JsonProperty(JSON_PROPERTY_SUB_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSubType(String subType) {
    this.subType = subType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NegotiatedRateChargesItemizedCharges negotiatedRateChargesItemizedCharges = (NegotiatedRateChargesItemizedCharges) o;
    return Objects.equals(this.code, negotiatedRateChargesItemizedCharges.code) &&
        Objects.equals(this.description, negotiatedRateChargesItemizedCharges.description) &&
        Objects.equals(this.currencyCode, negotiatedRateChargesItemizedCharges.currencyCode) &&
        Objects.equals(this.monetaryValue, negotiatedRateChargesItemizedCharges.monetaryValue) &&
        Objects.equals(this.subType, negotiatedRateChargesItemizedCharges.subType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description, currencyCode, monetaryValue, subType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NegotiatedRateChargesItemizedCharges {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currencyCode: ").append(toIndentedString(currencyCode)).append("\n");
    sb.append("    monetaryValue: ").append(toIndentedString(monetaryValue)).append("\n");
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
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
