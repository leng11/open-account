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
import org.openapitools.rate.client.model.ShipFromAddress;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Ship From Container.  N/A
 */
@ApiModel(description = "Ship From Container.  N/A")
@JsonPropertyOrder({
  ShipmentShipFrom.JSON_PROPERTY_NAME,
  ShipmentShipFrom.JSON_PROPERTY_ATTENTION_NAME,
  ShipmentShipFrom.JSON_PROPERTY_ADDRESS
})
@JsonTypeName("Shipment_ShipFrom")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class ShipmentShipFrom {
  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public static final String JSON_PROPERTY_ATTENTION_NAME = "AttentionName";
  private String attentionName;

  public static final String JSON_PROPERTY_ADDRESS = "Address";
  private ShipFromAddress address;

  public ShipmentShipFrom() {
  }

  public ShipmentShipFrom name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Origin attention name or company name.  Length is not validated.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Origin attention name or company name.  Length is not validated.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public ShipmentShipFrom attentionName(String attentionName) {
    
    this.attentionName = attentionName;
    return this;
  }

   /**
   * Origin attention name.  Length is not validated.
   * @return attentionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Origin attention name.  Length is not validated.")
  @JsonProperty(JSON_PROPERTY_ATTENTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAttentionName() {
    return attentionName;
  }


  @JsonProperty(JSON_PROPERTY_ATTENTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttentionName(String attentionName) {
    this.attentionName = attentionName;
  }


  public ShipmentShipFrom address(ShipFromAddress address) {
    
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

  public ShipFromAddress getAddress() {
    return address;
  }


  @JsonProperty(JSON_PROPERTY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAddress(ShipFromAddress address) {
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
    ShipmentShipFrom shipmentShipFrom = (ShipmentShipFrom) o;
    return Objects.equals(this.name, shipmentShipFrom.name) &&
        Objects.equals(this.attentionName, shipmentShipFrom.attentionName) &&
        Objects.equals(this.address, shipmentShipFrom.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, attentionName, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentShipFrom {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    attentionName: ").append(toIndentedString(attentionName)).append("\n");
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

