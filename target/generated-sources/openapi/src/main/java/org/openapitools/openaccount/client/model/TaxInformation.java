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
import org.openapitools.openaccount.client.model.TaxInformationVAT;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * TaxInformation
 */
@JsonPropertyOrder({
  TaxInformation.JSON_PROPERTY_TAX_ID,
  TaxInformation.JSON_PROPERTY_V_A_T
})
@JsonTypeName("taxInformation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-09T11:49:46.244314200-05:00[America/New_York]")
public class TaxInformation {
  public static final String JSON_PROPERTY_TAX_ID = "taxId";
  private String taxId;

  public static final String JSON_PROPERTY_V_A_T = "VAT";
  private TaxInformationVAT VAT;

  public TaxInformation() {
  }

  public TaxInformation taxId(String taxId) {
    
    this.taxId = taxId;
    return this;
  }

   /**
   * Tax Id or EID for the Shipper Account
   * @return taxId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Tax Id or EID for the Shipper Account")
  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxId() {
    return taxId;
  }


  @JsonProperty(JSON_PROPERTY_TAX_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxId(String taxId) {
    this.taxId = taxId;
  }


  public TaxInformation VAT(TaxInformationVAT VAT) {
    
    this.VAT = VAT;
    return this;
  }

   /**
   * Get VAT
   * @return VAT
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_V_A_T)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaxInformationVAT getVAT() {
    return VAT;
  }


  @JsonProperty(JSON_PROPERTY_V_A_T)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVAT(TaxInformationVAT VAT) {
    this.VAT = VAT;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TaxInformation taxInformation = (TaxInformation) o;
    return Objects.equals(this.taxId, taxInformation.taxId) &&
        Objects.equals(this.VAT, taxInformation.VAT);
  }

  @Override
  public int hashCode() {
    return Objects.hash(taxId, VAT);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TaxInformation {\n");
    sb.append("    taxId: ").append(toIndentedString(taxId)).append("\n");
    sb.append("    VAT: ").append(toIndentedString(VAT)).append("\n");
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

