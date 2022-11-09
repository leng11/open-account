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
 * PromotionalDiscountInformation container. This container contains discount information that the customer wants to request each time while placing a shipment.
 */
@ApiModel(description = "PromotionalDiscountInformation container. This container contains discount information that the customer wants to request each time while placing a shipment.")
@JsonPropertyOrder({
  ShipmentPromotionalDiscountInformation.JSON_PROPERTY_PROMO_CODE,
  ShipmentPromotionalDiscountInformation.JSON_PROPERTY_PROMO_ALIAS_CODE
})
@JsonTypeName("Shipment_PromotionalDiscountInformation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class ShipmentPromotionalDiscountInformation {
  public static final String JSON_PROPERTY_PROMO_CODE = "PromoCode";
  private String promoCode;

  public static final String JSON_PROPERTY_PROMO_ALIAS_CODE = "PromoAliasCode";
  private String promoAliasCode;

  public ShipmentPromotionalDiscountInformation() {
  }

  public ShipmentPromotionalDiscountInformation promoCode(String promoCode) {
    
    this.promoCode = promoCode;
    return this;
  }

   /**
   * Promotion Code. A discount that is applied to the user.  Required if PromotionalDiscountInformation container is present.
   * @return promoCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Promotion Code. A discount that is applied to the user.  Required if PromotionalDiscountInformation container is present.")
  @JsonProperty(JSON_PROPERTY_PROMO_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPromoCode() {
    return promoCode;
  }


  @JsonProperty(JSON_PROPERTY_PROMO_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPromoCode(String promoCode) {
    this.promoCode = promoCode;
  }


  public ShipmentPromotionalDiscountInformation promoAliasCode(String promoAliasCode) {
    
    this.promoAliasCode = promoAliasCode;
    return this;
  }

   /**
   * Promotion Alias code  Required if PromotionalDiscountInformation container is present.
   * @return promoAliasCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Promotion Alias code  Required if PromotionalDiscountInformation container is present.")
  @JsonProperty(JSON_PROPERTY_PROMO_ALIAS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPromoAliasCode() {
    return promoAliasCode;
  }


  @JsonProperty(JSON_PROPERTY_PROMO_ALIAS_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPromoAliasCode(String promoAliasCode) {
    this.promoAliasCode = promoAliasCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentPromotionalDiscountInformation shipmentPromotionalDiscountInformation = (ShipmentPromotionalDiscountInformation) o;
    return Objects.equals(this.promoCode, shipmentPromotionalDiscountInformation.promoCode) &&
        Objects.equals(this.promoAliasCode, shipmentPromotionalDiscountInformation.promoAliasCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promoCode, promoAliasCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentPromotionalDiscountInformation {\n");
    sb.append("    promoCode: ").append(toIndentedString(promoCode)).append("\n");
    sb.append("    promoAliasCode: ").append(toIndentedString(promoAliasCode)).append("\n");
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
