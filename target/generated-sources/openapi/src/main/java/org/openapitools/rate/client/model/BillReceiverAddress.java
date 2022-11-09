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
 * Container for additional information for the bill receiver�s UPS accounts address.
 */
@ApiModel(description = "Container for additional information for the bill receiver�s UPS accounts address.")
@JsonPropertyOrder({
  BillReceiverAddress.JSON_PROPERTY_POSTAL_CODE
})
@JsonTypeName("BillReceiver_Address")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class BillReceiverAddress {
  public static final String JSON_PROPERTY_POSTAL_CODE = "PostalCode";
  private String postalCode;

  public BillReceiverAddress() {
  }

  public BillReceiverAddress postalCode(String postalCode) {
    
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Postal Code for UPS accounts billing address.  Postal Code  may be present when the FRS Payment Information type &#x3D; 02 and type &#x3D; 03.
   * @return postalCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Postal Code for UPS accounts billing address.  Postal Code  may be present when the FRS Payment Information type = 02 and type = 03.")
  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPostalCode() {
    return postalCode;
  }


  @JsonProperty(JSON_PROPERTY_POSTAL_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillReceiverAddress billReceiverAddress = (BillReceiverAddress) o;
    return Objects.equals(this.postalCode, billReceiverAddress.postalCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(postalCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillReceiverAddress {\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
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

