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
 * 
 */
@ApiModel(description = "")
@JsonPropertyOrder({
  PaymentInformation.JSON_PROPERTY_PAYMENT_CARD_TYPE,
  PaymentInformation.JSON_PROPERTY_PAYMENT_CARD_NUMBER,
  PaymentInformation.JSON_PROPERTY_EXPIRATION_DATE,
  PaymentInformation.JSON_PROPERTY_SECURITY_CODE
})
@JsonTypeName("paymentInformation")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-14T11:32:27.678763700-05:00[America/New_York]")
public class PaymentInformation {
  /**
   * 01 &#x3D; American Express 03 &#x3D; Discover Card 04 &#x3D; Master Card 05 &#x3D; Optima 06 &#x3D; Discover 07 &#x3D; Bravo 08 &#x3D; Diners Club 10 &#x3D; Carte Blanche 11 &#x3D; Bancontact/Mister Cash 13 &#x3D; Dankort 14 &#x3D; Hipercard 15 &#x3D; Jcb 16 &#x3D; Maestro 17 &#x3D; Postepay 18 &#x3D; Unionpay 19 &#x3D; Visa Electron 20 &#x3D; Vpay 21 &#x3D; Carte Bleue 
   */
  public enum PaymentCardTypeEnum {
    _01("01"),
    
    _03("03"),
    
    _04("04"),
    
    _05("05"),
    
    _06("06"),
    
    _07("07"),
    
    _08("08"),
    
    _10("10"),
    
    _11("11"),
    
    _13("13"),
    
    _14("14"),
    
    _15("15"),
    
    _16("16"),
    
    _17("17"),
    
    _18("18"),
    
    _19("19"),
    
    _20("20"),
    
    _21("21");

    private String value;

    PaymentCardTypeEnum(String value) {
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
    public static PaymentCardTypeEnum fromValue(String value) {
      for (PaymentCardTypeEnum b : PaymentCardTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_PAYMENT_CARD_TYPE = "paymentCardType";
  private PaymentCardTypeEnum paymentCardType;

  public static final String JSON_PROPERTY_PAYMENT_CARD_NUMBER = "paymentCardNumber";
  private String paymentCardNumber;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expirationDate";
  private String expirationDate;

  public static final String JSON_PROPERTY_SECURITY_CODE = "securityCode";
  private String securityCode;

  public PaymentInformation() {
  }

  public PaymentInformation paymentCardType(PaymentCardTypeEnum paymentCardType) {
    
    this.paymentCardType = paymentCardType;
    return this;
  }

   /**
   * 01 &#x3D; American Express 03 &#x3D; Discover Card 04 &#x3D; Master Card 05 &#x3D; Optima 06 &#x3D; Discover 07 &#x3D; Bravo 08 &#x3D; Diners Club 10 &#x3D; Carte Blanche 11 &#x3D; Bancontact/Mister Cash 13 &#x3D; Dankort 14 &#x3D; Hipercard 15 &#x3D; Jcb 16 &#x3D; Maestro 17 &#x3D; Postepay 18 &#x3D; Unionpay 19 &#x3D; Visa Electron 20 &#x3D; Vpay 21 &#x3D; Carte Bleue 
   * @return paymentCardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "06", value = "01 = American Express 03 = Discover Card 04 = Master Card 05 = Optima 06 = Discover 07 = Bravo 08 = Diners Club 10 = Carte Blanche 11 = Bancontact/Mister Cash 13 = Dankort 14 = Hipercard 15 = Jcb 16 = Maestro 17 = Postepay 18 = Unionpay 19 = Visa Electron 20 = Vpay 21 = Carte Bleue ")
  @JsonProperty(JSON_PROPERTY_PAYMENT_CARD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PaymentCardTypeEnum getPaymentCardType() {
    return paymentCardType;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_CARD_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentCardType(PaymentCardTypeEnum paymentCardType) {
    this.paymentCardType = paymentCardType;
  }


  public PaymentInformation paymentCardNumber(String paymentCardNumber) {
    
    this.paymentCardNumber = paymentCardNumber;
    return this;
  }

   /**
   * Get paymentCardNumber
   * @return paymentCardNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PAYMENT_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentCardNumber() {
    return paymentCardNumber;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_CARD_NUMBER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentCardNumber(String paymentCardNumber) {
    this.paymentCardNumber = paymentCardNumber;
  }


  public PaymentInformation expirationDate(String expirationDate) {
    
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * YYYYMM format
   * @return expirationDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "202205", value = "YYYYMM format")
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExpirationDate() {
    return expirationDate;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExpirationDate(String expirationDate) {
    this.expirationDate = expirationDate;
  }


  public PaymentInformation securityCode(String securityCode) {
    
    this.securityCode = securityCode;
    return this;
  }

   /**
   * Get securityCode
   * @return securityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "098", value = "")
  @JsonProperty(JSON_PROPERTY_SECURITY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecurityCode() {
    return securityCode;
  }


  @JsonProperty(JSON_PROPERTY_SECURITY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSecurityCode(String securityCode) {
    this.securityCode = securityCode;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInformation paymentInformation = (PaymentInformation) o;
    return Objects.equals(this.paymentCardType, paymentInformation.paymentCardType) &&
        Objects.equals(this.paymentCardNumber, paymentInformation.paymentCardNumber) &&
        Objects.equals(this.expirationDate, paymentInformation.expirationDate) &&
        Objects.equals(this.securityCode, paymentInformation.securityCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentCardType, paymentCardNumber, expirationDate, securityCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformation {\n");
    sb.append("    paymentCardType: ").append(toIndentedString(paymentCardType)).append("\n");
    sb.append("    paymentCardNumber: ").append(toIndentedString(paymentCardNumber)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    securityCode: ").append(toIndentedString(securityCode)).append("\n");
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

