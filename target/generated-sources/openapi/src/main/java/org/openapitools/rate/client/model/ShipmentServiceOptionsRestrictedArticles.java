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
 * Restricted Articles container.  Valid for UPS World Wide Express Freight shipments.
 */
@ApiModel(description = "Restricted Articles container.  Valid for UPS World Wide Express Freight shipments.")
@JsonPropertyOrder({
  ShipmentServiceOptionsRestrictedArticles.JSON_PROPERTY_ALCOHOLIC_BEVERAGES_INDICATOR,
  ShipmentServiceOptionsRestrictedArticles.JSON_PROPERTY_DIAGNOSTIC_SPECIMENS_INDICATOR,
  ShipmentServiceOptionsRestrictedArticles.JSON_PROPERTY_PERISHABLES_INDICATOR,
  ShipmentServiceOptionsRestrictedArticles.JSON_PROPERTY_PLANTS_INDICATOR,
  ShipmentServiceOptionsRestrictedArticles.JSON_PROPERTY_SEEDS_INDICATOR,
  ShipmentServiceOptionsRestrictedArticles.JSON_PROPERTY_SPECIAL_EXCEPTIONS_INDICATOR,
  ShipmentServiceOptionsRestrictedArticles.JSON_PROPERTY_TOBACCO_INDICATOR,
  ShipmentServiceOptionsRestrictedArticles.JSON_PROPERTY_ECIGARETTES_INDICATOR,
  ShipmentServiceOptionsRestrictedArticles.JSON_PROPERTY_HEMP_C_B_D_INDICATOR
})
@JsonTypeName("ShipmentServiceOptions_RestrictedArticles")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class ShipmentServiceOptionsRestrictedArticles {
  public static final String JSON_PROPERTY_ALCOHOLIC_BEVERAGES_INDICATOR = "AlcoholicBeveragesIndicator";
  private String alcoholicBeveragesIndicator;

  public static final String JSON_PROPERTY_DIAGNOSTIC_SPECIMENS_INDICATOR = "DiagnosticSpecimensIndicator";
  private String diagnosticSpecimensIndicator;

  public static final String JSON_PROPERTY_PERISHABLES_INDICATOR = "PerishablesIndicator";
  private String perishablesIndicator;

  public static final String JSON_PROPERTY_PLANTS_INDICATOR = "PlantsIndicator";
  private String plantsIndicator;

  public static final String JSON_PROPERTY_SEEDS_INDICATOR = "SeedsIndicator";
  private String seedsIndicator;

  public static final String JSON_PROPERTY_SPECIAL_EXCEPTIONS_INDICATOR = "SpecialExceptionsIndicator";
  private String specialExceptionsIndicator;

  public static final String JSON_PROPERTY_TOBACCO_INDICATOR = "TobaccoIndicator";
  private String tobaccoIndicator;

  public static final String JSON_PROPERTY_ECIGARETTES_INDICATOR = "ECigarettesIndicator";
  private String ecigarettesIndicator;

  public static final String JSON_PROPERTY_HEMP_C_B_D_INDICATOR = "HempCBDIndicator";
  private String hempCBDIndicator;

  public ShipmentServiceOptionsRestrictedArticles() {
  }

  public ShipmentServiceOptionsRestrictedArticles alcoholicBeveragesIndicator(String alcoholicBeveragesIndicator) {
    
    this.alcoholicBeveragesIndicator = alcoholicBeveragesIndicator;
    return this;
  }

   /**
   * This field is a flag to indicate if the package has Alcohol. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.
   * @return alcoholicBeveragesIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is a flag to indicate if the package has Alcohol. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.")
  @JsonProperty(JSON_PROPERTY_ALCOHOLIC_BEVERAGES_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAlcoholicBeveragesIndicator() {
    return alcoholicBeveragesIndicator;
  }


  @JsonProperty(JSON_PROPERTY_ALCOHOLIC_BEVERAGES_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlcoholicBeveragesIndicator(String alcoholicBeveragesIndicator) {
    this.alcoholicBeveragesIndicator = alcoholicBeveragesIndicator;
  }


  public ShipmentServiceOptionsRestrictedArticles diagnosticSpecimensIndicator(String diagnosticSpecimensIndicator) {
    
    this.diagnosticSpecimensIndicator = diagnosticSpecimensIndicator;
    return this;
  }

   /**
   * This field is a flag to indicate if the package has Biological substances. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments. Lane check will happen based on postal code/ city.
   * @return diagnosticSpecimensIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is a flag to indicate if the package has Biological substances. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments. Lane check will happen based on postal code/ city.")
  @JsonProperty(JSON_PROPERTY_DIAGNOSTIC_SPECIMENS_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDiagnosticSpecimensIndicator() {
    return diagnosticSpecimensIndicator;
  }


  @JsonProperty(JSON_PROPERTY_DIAGNOSTIC_SPECIMENS_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDiagnosticSpecimensIndicator(String diagnosticSpecimensIndicator) {
    this.diagnosticSpecimensIndicator = diagnosticSpecimensIndicator;
  }


  public ShipmentServiceOptionsRestrictedArticles perishablesIndicator(String perishablesIndicator) {
    
    this.perishablesIndicator = perishablesIndicator;
    return this;
  }

   /**
   * This field is a flag to indicate if the package has Perishables. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.
   * @return perishablesIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is a flag to indicate if the package has Perishables. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.")
  @JsonProperty(JSON_PROPERTY_PERISHABLES_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPerishablesIndicator() {
    return perishablesIndicator;
  }


  @JsonProperty(JSON_PROPERTY_PERISHABLES_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPerishablesIndicator(String perishablesIndicator) {
    this.perishablesIndicator = perishablesIndicator;
  }


  public ShipmentServiceOptionsRestrictedArticles plantsIndicator(String plantsIndicator) {
    
    this.plantsIndicator = plantsIndicator;
    return this;
  }

   /**
   * This field is a flag to indicate if the package has Plants. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.
   * @return plantsIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is a flag to indicate if the package has Plants. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.")
  @JsonProperty(JSON_PROPERTY_PLANTS_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPlantsIndicator() {
    return plantsIndicator;
  }


  @JsonProperty(JSON_PROPERTY_PLANTS_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlantsIndicator(String plantsIndicator) {
    this.plantsIndicator = plantsIndicator;
  }


  public ShipmentServiceOptionsRestrictedArticles seedsIndicator(String seedsIndicator) {
    
    this.seedsIndicator = seedsIndicator;
    return this;
  }

   /**
   * This field is a flag to indicate if the package has Seeds. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.
   * @return seedsIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is a flag to indicate if the package has Seeds. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.")
  @JsonProperty(JSON_PROPERTY_SEEDS_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSeedsIndicator() {
    return seedsIndicator;
  }


  @JsonProperty(JSON_PROPERTY_SEEDS_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeedsIndicator(String seedsIndicator) {
    this.seedsIndicator = seedsIndicator;
  }


  public ShipmentServiceOptionsRestrictedArticles specialExceptionsIndicator(String specialExceptionsIndicator) {
    
    this.specialExceptionsIndicator = specialExceptionsIndicator;
    return this;
  }

   /**
   * This field is a flag to indicate if the package has Special Exceptions Restricted Materials. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.
   * @return specialExceptionsIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is a flag to indicate if the package has Special Exceptions Restricted Materials. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.")
  @JsonProperty(JSON_PROPERTY_SPECIAL_EXCEPTIONS_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSpecialExceptionsIndicator() {
    return specialExceptionsIndicator;
  }


  @JsonProperty(JSON_PROPERTY_SPECIAL_EXCEPTIONS_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSpecialExceptionsIndicator(String specialExceptionsIndicator) {
    this.specialExceptionsIndicator = specialExceptionsIndicator;
  }


  public ShipmentServiceOptionsRestrictedArticles tobaccoIndicator(String tobaccoIndicator) {
    
    this.tobaccoIndicator = tobaccoIndicator;
    return this;
  }

   /**
   * This field is a flag to indicate if the package has Tobacco. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.
   * @return tobaccoIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is a flag to indicate if the package has Tobacco. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.")
  @JsonProperty(JSON_PROPERTY_TOBACCO_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTobaccoIndicator() {
    return tobaccoIndicator;
  }


  @JsonProperty(JSON_PROPERTY_TOBACCO_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTobaccoIndicator(String tobaccoIndicator) {
    this.tobaccoIndicator = tobaccoIndicator;
  }


  public ShipmentServiceOptionsRestrictedArticles ecigarettesIndicator(String ecigarettesIndicator) {
    
    this.ecigarettesIndicator = ecigarettesIndicator;
    return this;
  }

   /**
   * This field is a flag to indicate if the package has E-Cigarettes. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.
   * @return ecigarettesIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is a flag to indicate if the package has E-Cigarettes. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.")
  @JsonProperty(JSON_PROPERTY_ECIGARETTES_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEcigarettesIndicator() {
    return ecigarettesIndicator;
  }


  @JsonProperty(JSON_PROPERTY_ECIGARETTES_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEcigarettesIndicator(String ecigarettesIndicator) {
    this.ecigarettesIndicator = ecigarettesIndicator;
  }


  public ShipmentServiceOptionsRestrictedArticles hempCBDIndicator(String hempCBDIndicator) {
    
    this.hempCBDIndicator = hempCBDIndicator;
    return this;
  }

   /**
   * This field is a flag to indicate if the package has Hemp/CBD. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.
   * @return hempCBDIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This field is a flag to indicate if the package has Hemp/CBD. True if present; false otherwise.  Valid for UPS World Wide Express Freight shipments.")
  @JsonProperty(JSON_PROPERTY_HEMP_C_B_D_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getHempCBDIndicator() {
    return hempCBDIndicator;
  }


  @JsonProperty(JSON_PROPERTY_HEMP_C_B_D_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHempCBDIndicator(String hempCBDIndicator) {
    this.hempCBDIndicator = hempCBDIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentServiceOptionsRestrictedArticles shipmentServiceOptionsRestrictedArticles = (ShipmentServiceOptionsRestrictedArticles) o;
    return Objects.equals(this.alcoholicBeveragesIndicator, shipmentServiceOptionsRestrictedArticles.alcoholicBeveragesIndicator) &&
        Objects.equals(this.diagnosticSpecimensIndicator, shipmentServiceOptionsRestrictedArticles.diagnosticSpecimensIndicator) &&
        Objects.equals(this.perishablesIndicator, shipmentServiceOptionsRestrictedArticles.perishablesIndicator) &&
        Objects.equals(this.plantsIndicator, shipmentServiceOptionsRestrictedArticles.plantsIndicator) &&
        Objects.equals(this.seedsIndicator, shipmentServiceOptionsRestrictedArticles.seedsIndicator) &&
        Objects.equals(this.specialExceptionsIndicator, shipmentServiceOptionsRestrictedArticles.specialExceptionsIndicator) &&
        Objects.equals(this.tobaccoIndicator, shipmentServiceOptionsRestrictedArticles.tobaccoIndicator) &&
        Objects.equals(this.ecigarettesIndicator, shipmentServiceOptionsRestrictedArticles.ecigarettesIndicator) &&
        Objects.equals(this.hempCBDIndicator, shipmentServiceOptionsRestrictedArticles.hempCBDIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(alcoholicBeveragesIndicator, diagnosticSpecimensIndicator, perishablesIndicator, plantsIndicator, seedsIndicator, specialExceptionsIndicator, tobaccoIndicator, ecigarettesIndicator, hempCBDIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentServiceOptionsRestrictedArticles {\n");
    sb.append("    alcoholicBeveragesIndicator: ").append(toIndentedString(alcoholicBeveragesIndicator)).append("\n");
    sb.append("    diagnosticSpecimensIndicator: ").append(toIndentedString(diagnosticSpecimensIndicator)).append("\n");
    sb.append("    perishablesIndicator: ").append(toIndentedString(perishablesIndicator)).append("\n");
    sb.append("    plantsIndicator: ").append(toIndentedString(plantsIndicator)).append("\n");
    sb.append("    seedsIndicator: ").append(toIndentedString(seedsIndicator)).append("\n");
    sb.append("    specialExceptionsIndicator: ").append(toIndentedString(specialExceptionsIndicator)).append("\n");
    sb.append("    tobaccoIndicator: ").append(toIndentedString(tobaccoIndicator)).append("\n");
    sb.append("    ecigarettesIndicator: ").append(toIndentedString(ecigarettesIndicator)).append("\n");
    sb.append("    hempCBDIndicator: ").append(toIndentedString(hempCBDIndicator)).append("\n");
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
