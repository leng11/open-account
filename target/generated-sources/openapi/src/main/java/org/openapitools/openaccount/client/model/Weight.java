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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Weight
 */
@JsonPropertyOrder({
  Weight.JSON_PROPERTY_UNIT_OF_MEASUREMENT,
  Weight.JSON_PROPERTY_WEIGHT
})
@JsonTypeName("weight")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-16T16:23:57.675426900-05:00[America/New_York]")
public class Weight {
  /**
   * Gets or Sets unitOfMeasurement
   */
  public enum UnitOfMeasurementEnum {
    LB("LB"),
    
    KG("KG");

    private String value;

    UnitOfMeasurementEnum(String value) {
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
    public static UnitOfMeasurementEnum fromValue(String value) {
      for (UnitOfMeasurementEnum b : UnitOfMeasurementEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_UNIT_OF_MEASUREMENT = "unitOfMeasurement";
  private UnitOfMeasurementEnum unitOfMeasurement;

  public static final String JSON_PROPERTY_WEIGHT = "weight";
  private String weight;

  public Weight() {
  }

  public Weight unitOfMeasurement(UnitOfMeasurementEnum unitOfMeasurement) {
    
    this.unitOfMeasurement = unitOfMeasurement;
    return this;
  }

   /**
   * Get unitOfMeasurement
   * @return unitOfMeasurement
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "LB", value = "")
  @JsonProperty(JSON_PROPERTY_UNIT_OF_MEASUREMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public UnitOfMeasurementEnum getUnitOfMeasurement() {
    return unitOfMeasurement;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_OF_MEASUREMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnitOfMeasurement(UnitOfMeasurementEnum unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
  }


  public Weight weight(String weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Get weight
   * @return weight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWeight(String weight) {
    this.weight = weight;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Weight weight = (Weight) o;
    return Objects.equals(this.unitOfMeasurement, weight.unitOfMeasurement) &&
        Objects.equals(this.weight, weight.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitOfMeasurement, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Weight {\n");
    sb.append("    unitOfMeasurement: ").append(toIndentedString(unitOfMeasurement)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
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

