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
 * Commodities
 */
@JsonPropertyOrder({
  Commodities.JSON_PROPERTY_COMMODITY
})
@JsonTypeName("commodities")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-16T16:23:57.675426900-05:00[America/New_York]")
public class Commodities {
  /**
   * Commodity Codes  03 - Animal Related Goods 04 - Apparel 05 - Automotive Parts 06 - Books, Periodicals, Documents 07 - Chemicals 08 - Other Consumer Goods 10 - Food and Non-Alcoholic Beverage 11 - Healthcare 12 - Industrial Products 13 - Logistic Services 15 - Retail Services 16 - Technology Products 18 - Wholesale Goods 99 - Other 
   */
  public enum CommodityEnum {
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _06("06"),
    
    _07("07"),
    
    _08("08"),
    
    _10("10"),
    
    _11("11"),
    
    _12("12"),
    
    _13("13"),
    
    _15("15"),
    
    _16("16"),
    
    _18("18"),
    
    _99("99");

    private String value;

    CommodityEnum(String value) {
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
    public static CommodityEnum fromValue(String value) {
      for (CommodityEnum b : CommodityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_COMMODITY = "commodity";
  private CommodityEnum commodity;

  public Commodities() {
  }

  public Commodities commodity(CommodityEnum commodity) {
    
    this.commodity = commodity;
    return this;
  }

   /**
   * Commodity Codes  03 - Animal Related Goods 04 - Apparel 05 - Automotive Parts 06 - Books, Periodicals, Documents 07 - Chemicals 08 - Other Consumer Goods 10 - Food and Non-Alcoholic Beverage 11 - Healthcare 12 - Industrial Products 13 - Logistic Services 15 - Retail Services 16 - Technology Products 18 - Wholesale Goods 99 - Other 
   * @return commodity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "06", value = "Commodity Codes  03 - Animal Related Goods 04 - Apparel 05 - Automotive Parts 06 - Books, Periodicals, Documents 07 - Chemicals 08 - Other Consumer Goods 10 - Food and Non-Alcoholic Beverage 11 - Healthcare 12 - Industrial Products 13 - Logistic Services 15 - Retail Services 16 - Technology Products 18 - Wholesale Goods 99 - Other ")
  @JsonProperty(JSON_PROPERTY_COMMODITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CommodityEnum getCommodity() {
    return commodity;
  }


  @JsonProperty(JSON_PROPERTY_COMMODITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCommodity(CommodityEnum commodity) {
    this.commodity = commodity;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Commodities commodities = (Commodities) o;
    return Objects.equals(this.commodity, commodities.commodity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commodity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Commodities {\n");
    sb.append("    commodity: ").append(toIndentedString(commodity)).append("\n");
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

