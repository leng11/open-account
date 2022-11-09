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
import org.openapitools.rate.client.model.BillThirdPartyAddress;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Container for the third party billing option.  This element or its sibling element, BillShipper, BillReceiver or Consignee Billed, must be present but no more than one can be present.
 */
@ApiModel(description = "Container for the third party billing option.  This element or its sibling element, BillShipper, BillReceiver or Consignee Billed, must be present but no more than one can be present.")
@JsonPropertyOrder({
  ShipmentChargeBillThirdParty.JSON_PROPERTY_ACCOUNT_NUMBER,
  ShipmentChargeBillThirdParty.JSON_PROPERTY_ADDRESS
})
@JsonTypeName("ShipmentCharge_BillThirdParty")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class ShipmentChargeBillThirdParty {
  public static final String JSON_PROPERTY_ACCOUNT_NUMBER = "AccountNumber";
  private String accountNumber;

  public static final String JSON_PROPERTY_ADDRESS = "Address";
  private BillThirdPartyAddress address;

  public ShipmentChargeBillThirdParty() {
  }

  public ShipmentChargeBillThirdParty accountNumber(String accountNumber) {
    
    this.accountNumber = accountNumber;
    return this;
  }

   /**
   * The UPS account number of the third party shipper.  The account must be a valid UPS account number that is active. For US, PR and CA accounts, the account must be either a daily pickup account, an occasional account, or a customer B.I.N account, or a drop shipper account. All other accounts must be either a daily pickup account, an occasional account, a drop shipper account, or a non-shipping account.
   * @return accountNumber
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The UPS account number of the third party shipper.  The account must be a valid UPS account number that is active. For US, PR and CA accounts, the account must be either a daily pickup account, an occasional account, or a customer B.I.N account, or a drop shipper account. All other accounts must be either a daily pickup account, an occasional account, a drop shipper account, or a non-shipping account.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountNumber() {
    return accountNumber;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_NUMBER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  public ShipmentChargeBillThirdParty address(BillThirdPartyAddress address) {
    
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public BillThirdPartyAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(BillThirdPartyAddress address) {
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
    ShipmentChargeBillThirdParty shipmentChargeBillThirdParty = (ShipmentChargeBillThirdParty) o;
    return Objects.equals(this.accountNumber, shipmentChargeBillThirdParty.accountNumber) &&
        Objects.equals(this.address, shipmentChargeBillThirdParty.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNumber, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentChargeBillThirdParty {\n");
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
