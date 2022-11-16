/*
 * UPS Accounts API
 * UPS Open Account API enables UPS 3rd Party Vendors to request a UPS Shipper Account. If the UPS Shipper Account request is approved, an UPS Shipper Account Number is generated. The UPS Ready Vendor user should first complete the registration process and get a My UPS ID before requesting a Shipper Account. Addresses are validated for accuracy. The User is expected to provide the primary reason for requesting a Shipper Account and the estimated number of Packages to be shipped.
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.openaccount.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.openaccount.client.model.Weight;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * ShipmentInformation
 */
@JsonPropertyOrder({
  ShipmentInformation.JSON_PROPERTY_TYPE,
  ShipmentInformation.JSON_PROPERTY_SHIPPING_FREQUENCY,
  ShipmentInformation.JSON_PROPERTY_NO_OF_PACKAGES,
  ShipmentInformation.JSON_PROPERTY_PACKAGE_WEIGHT
})
@JsonTypeName("shipmentInformation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-16T16:23:57.675426900-05:00[America/New_York]")
public class ShipmentInformation {
  /**
   * 01 - Ground 02 - Air 03 - International
   */
  public enum TypeEnum {
    _01("01"),
    
    _02("02"),
    
    _03("03");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  /**
   * Gets or Sets shippingFrequency
   */
  public enum ShippingFrequencyEnum {
    WEEKLY("Weekly");

    private String value;

    ShippingFrequencyEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ShippingFrequencyEnum fromValue(String value) {
      for (ShippingFrequencyEnum b : ShippingFrequencyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SHIPPING_FREQUENCY = "shippingFrequency";
  private ShippingFrequencyEnum shippingFrequency;

  public static final String JSON_PROPERTY_NO_OF_PACKAGES = "noOfPackages";
  private String noOfPackages;

  public static final String JSON_PROPERTY_PACKAGE_WEIGHT = "packageWeight";
  private Weight packageWeight;

  public ShipmentInformation() {
  }

  public ShipmentInformation type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * 01 - Ground 02 - Air 03 - International
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "01 - Ground 02 - Air 03 - International")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ShipmentInformation shippingFrequency(ShippingFrequencyEnum shippingFrequency) {
    
    this.shippingFrequency = shippingFrequency;
    return this;
  }

   /**
   * Get shippingFrequency
   * @return shippingFrequency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPING_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShippingFrequencyEnum getShippingFrequency() {
    return shippingFrequency;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPING_FREQUENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShippingFrequency(ShippingFrequencyEnum shippingFrequency) {
    this.shippingFrequency = shippingFrequency;
  }


  public ShipmentInformation noOfPackages(String noOfPackages) {
    
    this.noOfPackages = noOfPackages;
    return this;
  }

   /**
   * Identifies the averages of packages that will be shipped in a week
   * @return noOfPackages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Identifies the averages of packages that will be shipped in a week")
  @JsonProperty(JSON_PROPERTY_NO_OF_PACKAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNoOfPackages() {
    return noOfPackages;
  }


  @JsonProperty(JSON_PROPERTY_NO_OF_PACKAGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoOfPackages(String noOfPackages) {
    this.noOfPackages = noOfPackages;
  }


  public ShipmentInformation packageWeight(Weight packageWeight) {
    
    this.packageWeight = packageWeight;
    return this;
  }

   /**
   * Get packageWeight
   * @return packageWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PACKAGE_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Weight getPackageWeight() {
    return packageWeight;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackageWeight(Weight packageWeight) {
    this.packageWeight = packageWeight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentInformation shipmentInformation = (ShipmentInformation) o;
    return Objects.equals(this.type, shipmentInformation.type) &&
        Objects.equals(this.shippingFrequency, shipmentInformation.shippingFrequency) &&
        Objects.equals(this.noOfPackages, shipmentInformation.noOfPackages) &&
        Objects.equals(this.packageWeight, shipmentInformation.packageWeight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, shippingFrequency, noOfPackages, packageWeight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentInformation {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shippingFrequency: ").append(toIndentedString(shippingFrequency)).append("\n");
    sb.append("    noOfPackages: ").append(toIndentedString(noOfPackages)).append("\n");
    sb.append("    packageWeight: ").append(toIndentedString(packageWeight)).append("\n");
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

