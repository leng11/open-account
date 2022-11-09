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
import org.openapitools.rate.client.model.ShipmentTotalWeightUnitOfMeasurement;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Shipment Total Weight Container. This container is only applicable for \&quot;ratetimeintransit\&quot; and \&quot;shoptimeintransit\&quot; request options.  Required for all international shipments when retreiving time in transit information, including letters and documents shipments.
 */
@ApiModel(description = "Shipment Total Weight Container. This container is only applicable for \"ratetimeintransit\" and \"shoptimeintransit\" request options.  Required for all international shipments when retreiving time in transit information, including letters and documents shipments.")
@JsonPropertyOrder({
  ShipmentShipmentTotalWeight.JSON_PROPERTY_UNIT_OF_MEASUREMENT,
  ShipmentShipmentTotalWeight.JSON_PROPERTY_WEIGHT
})
@JsonTypeName("Shipment_ShipmentTotalWeight")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class ShipmentShipmentTotalWeight {
  public static final String JSON_PROPERTY_UNIT_OF_MEASUREMENT = "UnitOfMeasurement";
  private ShipmentTotalWeightUnitOfMeasurement unitOfMeasurement;

  public static final String JSON_PROPERTY_WEIGHT = "Weight";
  private String weight;

  public ShipmentShipmentTotalWeight() {
  }

  public ShipmentShipmentTotalWeight unitOfMeasurement(ShipmentTotalWeightUnitOfMeasurement unitOfMeasurement) {
    
    this.unitOfMeasurement = unitOfMeasurement;
    return this;
  }

   /**
   * Get unitOfMeasurement
   * @return unitOfMeasurement
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_UNIT_OF_MEASUREMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipmentTotalWeightUnitOfMeasurement getUnitOfMeasurement() {
    return unitOfMeasurement;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_OF_MEASUREMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnitOfMeasurement(ShipmentTotalWeightUnitOfMeasurement unitOfMeasurement) {
    this.unitOfMeasurement = unitOfMeasurement;
  }


  public ShipmentShipmentTotalWeight weight(String weight) {
    
    this.weight = weight;
    return this;
  }

   /**
   * Non-zero total weight of all packages in the shipment.
   * @return weight
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Non-zero total weight of all packages in the shipment.")
  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getWeight() {
    return weight;
  }


  @JsonProperty(JSON_PROPERTY_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    ShipmentShipmentTotalWeight shipmentShipmentTotalWeight = (ShipmentShipmentTotalWeight) o;
    return Objects.equals(this.unitOfMeasurement, shipmentShipmentTotalWeight.unitOfMeasurement) &&
        Objects.equals(this.weight, shipmentShipmentTotalWeight.weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unitOfMeasurement, weight);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentShipmentTotalWeight {\n");
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
