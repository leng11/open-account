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
import org.openapitools.rate.client.model.FRSPaymentInformationAddress;
import org.openapitools.rate.client.model.FRSPaymentInformationType;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * UPS Ground Freight Pricing (GFP) Payment Information container.  Required only for GFP and when the FRSIndicator is present.
 */
@ApiModel(description = "UPS Ground Freight Pricing (GFP) Payment Information container.  Required only for GFP and when the FRSIndicator is present.")
@JsonPropertyOrder({
  ShipmentFRSPaymentInformation.JSON_PROPERTY_TYPE,
  ShipmentFRSPaymentInformation.JSON_PROPERTY_ACCOUNT_NUMBER,
  ShipmentFRSPaymentInformation.JSON_PROPERTY_ADDRESS
})
@JsonTypeName("Shipment_FRSPaymentInformation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class ShipmentFRSPaymentInformation {
  public static final String JSON_PROPERTY_TYPE = "Type";
  private FRSPaymentInformationType type;

  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "AccountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_ADDRESS = "Address";
  private FRSPaymentInformationAddress address;

  public ShipmentFRSPaymentInformation() {
  }

  public ShipmentFRSPaymentInformation type(FRSPaymentInformationType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public FRSPaymentInformationType getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(FRSPaymentInformationType type) {
    this.type = type;
  }


  public ShipmentFRSPaymentInformation accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * UPS Account Number.
   * @return accountNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UPS Account Number.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public ShipmentFRSPaymentInformation address(FRSPaymentInformationAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public FRSPaymentInformationAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAddress(FRSPaymentInformationAddress address) {
    this.address = address;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentFRSPaymentInformation shipmentFRSPaymentInformation = (ShipmentFRSPaymentInformation) o;
    return Objects.equals(this.type, shipmentFRSPaymentInformation.type) &&
        Objects.equals(this.accountNumber, shipmentFRSPaymentInformation.accountNumber) &&
        Objects.equals(this.address, shipmentFRSPaymentInformation.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, accountNumber, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentFRSPaymentInformation {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
