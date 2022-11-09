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
 * Shipment Rating Options container.  N/A
 */
@ApiModel(description = "Shipment Rating Options container.  N/A")
@JsonPropertyOrder({
  ShipmentShipmentRatingOptions.JSON_PROPERTY_NEGOTIATED_RATES_INDICATOR,
  ShipmentShipmentRatingOptions.JSON_PROPERTY_FR_S_SHIPMENT_INDICATOR,
  ShipmentShipmentRatingOptions.JSON_PROPERTY_RATE_CHART_INDICATOR,
  ShipmentShipmentRatingOptions.JSON_PROPERTY_USER_LEVEL_DISCOUNT_INDICATOR,
  ShipmentShipmentRatingOptions.JSON_PROPERTY_TP_F_C_NEGOTIATED_RATES_INDICATOR
})
@JsonTypeName("Shipment_ShipmentRatingOptions")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class ShipmentShipmentRatingOptions {
  public static final String JSON_PROPERTY_NEGOTIATED_RATES_INDICATOR = "NegotiatedRatesIndicator";
  private String negotiatedRatesIndicator;

  public static final String JSON_PROPERTY_FR_S_SHIPMENT_INDICATOR = "FRSShipmentIndicator";
  private String frSShipmentIndicator;

  public static final String JSON_PROPERTY_RATE_CHART_INDICATOR = "RateChartIndicator";
  private String rateChartIndicator;

  public static final String JSON_PROPERTY_USER_LEVEL_DISCOUNT_INDICATOR = "UserLevelDiscountIndicator";
  private String userLevelDiscountIndicator;

  public static final String JSON_PROPERTY_TP_F_C_NEGOTIATED_RATES_INDICATOR = "TPFCNegotiatedRatesIndicator";
  private String tpFCNegotiatedRatesIndicator;

  public ShipmentShipmentRatingOptions() {
  }

  public ShipmentShipmentRatingOptions negotiatedRatesIndicator(String negotiatedRatesIndicator) {
    
    this.negotiatedRatesIndicator = negotiatedRatesIndicator;
    return this;
  }

   /**
   * NegotiatedRatesIndicator -  Required to display two types of discounts:  1) Bids or Account Based Rates 2) Web/Promotional Discounts Bids  Account Based Rates: If the indicator is present, the Shipper is authorized, and the Rating API XML Request is configured to return Negotiated Rates, then Negotiated Rates should be returned in the response.   Web/Promotional Discounts: If the indicator is present, the Shipper is authorized for Web/Promotional Discounts then Negotiated Rates should be returned in the response.
   * @return negotiatedRatesIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NegotiatedRatesIndicator -  Required to display two types of discounts:  1) Bids or Account Based Rates 2) Web/Promotional Discounts Bids  Account Based Rates: If the indicator is present, the Shipper is authorized, and the Rating API XML Request is configured to return Negotiated Rates, then Negotiated Rates should be returned in the response.   Web/Promotional Discounts: If the indicator is present, the Shipper is authorized for Web/Promotional Discounts then Negotiated Rates should be returned in the response.")
  @JsonProperty(JSON_PROPERTY_NEGOTIATED_RATES_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNegotiatedRatesIndicator() {
    return negotiatedRatesIndicator;
  }


  @JsonProperty(JSON_PROPERTY_NEGOTIATED_RATES_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNegotiatedRatesIndicator(String negotiatedRatesIndicator) {
    this.negotiatedRatesIndicator = negotiatedRatesIndicator;
  }


  public ShipmentShipmentRatingOptions frSShipmentIndicator(String frSShipmentIndicator) {
    
    this.frSShipmentIndicator = frSShipmentIndicator;
    return this;
  }

   /**
   * FRS Indicator. The indicator is required to obtain rates for UPS Ground Freight Pricing (GFP).  The account number must be enabled for GFP.
   * @return frSShipmentIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "FRS Indicator. The indicator is required to obtain rates for UPS Ground Freight Pricing (GFP).  The account number must be enabled for GFP.")
  @JsonProperty(JSON_PROPERTY_FR_S_SHIPMENT_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getFrSShipmentIndicator() {
    return frSShipmentIndicator;
  }


  @JsonProperty(JSON_PROPERTY_FR_S_SHIPMENT_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrSShipmentIndicator(String frSShipmentIndicator) {
    this.frSShipmentIndicator = frSShipmentIndicator;
  }


  public ShipmentShipmentRatingOptions rateChartIndicator(String rateChartIndicator) {
    
    this.rateChartIndicator = rateChartIndicator;
    return this;
  }

   /**
   * RateChartIndicator -  If present in a request, the response will contain a RateChart element.
   * @return rateChartIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RateChartIndicator -  If present in a request, the response will contain a RateChart element.")
  @JsonProperty(JSON_PROPERTY_RATE_CHART_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRateChartIndicator() {
    return rateChartIndicator;
  }


  @JsonProperty(JSON_PROPERTY_RATE_CHART_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRateChartIndicator(String rateChartIndicator) {
    this.rateChartIndicator = rateChartIndicator;
  }


  public ShipmentShipmentRatingOptions userLevelDiscountIndicator(String userLevelDiscountIndicator) {
    
    this.userLevelDiscountIndicator = userLevelDiscountIndicator;
    return this;
  }

   /**
   * UserLevelDiscountIndicator - required to obtain rates for User Level Promotions.  This is required to obtain User Level Discounts. There must also be no ShipperNumber in the Shipper container.
   * @return userLevelDiscountIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "UserLevelDiscountIndicator - required to obtain rates for User Level Promotions.  This is required to obtain User Level Discounts. There must also be no ShipperNumber in the Shipper container.")
  @JsonProperty(JSON_PROPERTY_USER_LEVEL_DISCOUNT_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUserLevelDiscountIndicator() {
    return userLevelDiscountIndicator;
  }


  @JsonProperty(JSON_PROPERTY_USER_LEVEL_DISCOUNT_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserLevelDiscountIndicator(String userLevelDiscountIndicator) {
    this.userLevelDiscountIndicator = userLevelDiscountIndicator;
  }


  public ShipmentShipmentRatingOptions tpFCNegotiatedRatesIndicator(String tpFCNegotiatedRatesIndicator) {
    
    this.tpFCNegotiatedRatesIndicator = tpFCNegotiatedRatesIndicator;
    return this;
  }

   /**
   * This indicator applies for a third party (3P) / Freight collect (FC) shipment only.   For 3P/FC shipment if the shipper wishes to request for the negotiated rates of the third party then this indicator should be included in the request.   If authorized the 3P/FC negotiated rates will be applied to the shipment and rates will be returned in response.
   * @return tpFCNegotiatedRatesIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "This indicator applies for a third party (3P) / Freight collect (FC) shipment only.   For 3P/FC shipment if the shipper wishes to request for the negotiated rates of the third party then this indicator should be included in the request.   If authorized the 3P/FC negotiated rates will be applied to the shipment and rates will be returned in response.")
  @JsonProperty(JSON_PROPERTY_TP_F_C_NEGOTIATED_RATES_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTpFCNegotiatedRatesIndicator() {
    return tpFCNegotiatedRatesIndicator;
  }


  @JsonProperty(JSON_PROPERTY_TP_F_C_NEGOTIATED_RATES_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTpFCNegotiatedRatesIndicator(String tpFCNegotiatedRatesIndicator) {
    this.tpFCNegotiatedRatesIndicator = tpFCNegotiatedRatesIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentShipmentRatingOptions shipmentShipmentRatingOptions = (ShipmentShipmentRatingOptions) o;
    return Objects.equals(this.negotiatedRatesIndicator, shipmentShipmentRatingOptions.negotiatedRatesIndicator) &&
        Objects.equals(this.frSShipmentIndicator, shipmentShipmentRatingOptions.frSShipmentIndicator) &&
        Objects.equals(this.rateChartIndicator, shipmentShipmentRatingOptions.rateChartIndicator) &&
        Objects.equals(this.userLevelDiscountIndicator, shipmentShipmentRatingOptions.userLevelDiscountIndicator) &&
        Objects.equals(this.tpFCNegotiatedRatesIndicator, shipmentShipmentRatingOptions.tpFCNegotiatedRatesIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(negotiatedRatesIndicator, frSShipmentIndicator, rateChartIndicator, userLevelDiscountIndicator, tpFCNegotiatedRatesIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentShipmentRatingOptions {\n");
    sb.append("    negotiatedRatesIndicator: ").append(toIndentedString(negotiatedRatesIndicator)).append("\n");
    sb.append("    frSShipmentIndicator: ").append(toIndentedString(frSShipmentIndicator)).append("\n");
    sb.append("    rateChartIndicator: ").append(toIndentedString(rateChartIndicator)).append("\n");
    sb.append("    userLevelDiscountIndicator: ").append(toIndentedString(userLevelDiscountIndicator)).append("\n");
    sb.append("    tpFCNegotiatedRatesIndicator: ").append(toIndentedString(tpFCNegotiatedRatesIndicator)).append("\n");
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
