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
import org.openapitools.openaccount.client.model.ContactName;
import org.openapitools.openaccount.client.model.EmailInformation;
import org.openapitools.openaccount.client.model.MyUPSId;
import org.openapitools.openaccount.client.model.TaxInformation;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * CustomerAccountCharacteristics
 */
@JsonPropertyOrder({
  CustomerAccountCharacteristics.JSON_PROPERTY_CUSTOMER_CLASSIFICATION,
  CustomerAccountCharacteristics.JSON_PROPERTY_CUSTOMER_NAME,
  CustomerAccountCharacteristics.JSON_PROPERTY_TAX_INFORMATION,
  CustomerAccountCharacteristics.JSON_PROPERTY_CREDIT_CARD_TOKEN,
  CustomerAccountCharacteristics.JSON_PROPERTY_ACCOUNT_REASON,
  CustomerAccountCharacteristics.JSON_PROPERTY_CURRENT_CARRIER,
  CustomerAccountCharacteristics.JSON_PROPERTY_EMAIL,
  CustomerAccountCharacteristics.JSON_PROPERTY_MY_U_P_S_ID
})
@JsonTypeName("customerAccountCharacteristics")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-09T11:49:46.244314200-05:00[America/New_York]")
public class CustomerAccountCharacteristics {
  /**
   * 01&#x3D;Business 02&#x3D;Personal
   */
  public enum CustomerClassificationEnum {
    _01("01"),
    
    _02("02");

    private String value;

    CustomerClassificationEnum(String value) {
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
    public static CustomerClassificationEnum fromValue(String value) {
      for (CustomerClassificationEnum b : CustomerClassificationEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CUSTOMER_CLASSIFICATION = "customerClassification";
  private CustomerClassificationEnum customerClassification;

  public static final String JSON_PROPERTY_CUSTOMER_NAME = "customerName";
  private ContactName customerName;

  public static final String JSON_PROPERTY_TAX_INFORMATION = "taxInformation";
  private TaxInformation taxInformation;

  public static final String JSON_PROPERTY_CREDIT_CARD_TOKEN = "creditCardToken";
  private String creditCardToken;

  public static final String JSON_PROPERTY_ACCOUNT_REASON = "accountReason";
  private String accountReason;

  /**
   * 31 &#x3D; DHL 32 &#x3D; FedEx 33 &#x3D; US Postal Service 34 &#x3D; Other
   */
  public enum CurrentCarrierEnum {
    _31("31"),
    
    _32("32"),
    
    _33("33"),
    
    _34("34");

    private String value;

    CurrentCarrierEnum(String value) {
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
    public static CurrentCarrierEnum fromValue(String value) {
      for (CurrentCarrierEnum b : CurrentCarrierEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CURRENT_CARRIER = "currentCarrier";
  private CurrentCarrierEnum currentCarrier;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private EmailInformation email;

  public static final String JSON_PROPERTY_MY_U_P_S_ID = "myUPSId";
  private MyUPSId myUPSId;

  public CustomerAccountCharacteristics() {
  }

  public CustomerAccountCharacteristics customerClassification(CustomerClassificationEnum customerClassification) {
    
    this.customerClassification = customerClassification;
    return this;
  }

   /**
   * 01&#x3D;Business 02&#x3D;Personal
   * @return customerClassification
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "01", required = true, value = "01=Business 02=Personal")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CustomerClassificationEnum getCustomerClassification() {
    return customerClassification;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_CLASSIFICATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCustomerClassification(CustomerClassificationEnum customerClassification) {
    this.customerClassification = customerClassification;
  }


  public CustomerAccountCharacteristics customerName(ContactName customerName) {
    
    this.customerName = customerName;
    return this;
  }

   /**
   * Get customerName
   * @return customerName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContactName getCustomerName() {
    return customerName;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerName(ContactName customerName) {
    this.customerName = customerName;
  }


  public CustomerAccountCharacteristics taxInformation(TaxInformation taxInformation) {
    
    this.taxInformation = taxInformation;
    return this;
  }

   /**
   * Get taxInformation
   * @return taxInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TAX_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TaxInformation getTaxInformation() {
    return taxInformation;
  }


  @JsonProperty(JSON_PROPERTY_TAX_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxInformation(TaxInformation taxInformation) {
    this.taxInformation = taxInformation;
  }


  public CustomerAccountCharacteristics creditCardToken(String creditCardToken) {
    
    this.creditCardToken = creditCardToken;
    return this;
  }

   /**
   * Required if Customer Classification is of type \&quot;personal\&quot;
   * @return creditCardToken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4199350000000002", value = "Required if Customer Classification is of type \"personal\"")
  @JsonProperty(JSON_PROPERTY_CREDIT_CARD_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreditCardToken() {
    return creditCardToken;
  }


  @JsonProperty(JSON_PROPERTY_CREDIT_CARD_TOKEN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreditCardToken(String creditCardToken) {
    this.creditCardToken = creditCardToken;
  }


  public CustomerAccountCharacteristics accountReason(String accountReason) {
    
    this.accountReason = accountReason;
    return this;
  }

   /**
   * 01 &#x3D; Starting a new business 02 &#x3D; Currently using another carrier 06 &#x3D; Occassional Shipping needs
   * @return accountReason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "01", value = "01 = Starting a new business 02 = Currently using another carrier 06 = Occassional Shipping needs")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountReason() {
    return accountReason;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAccountReason(String accountReason) {
    this.accountReason = accountReason;
  }


  public CustomerAccountCharacteristics currentCarrier(CurrentCarrierEnum currentCarrier) {
    
    this.currentCarrier = currentCarrier;
    return this;
  }

   /**
   * 31 &#x3D; DHL 32 &#x3D; FedEx 33 &#x3D; US Postal Service 34 &#x3D; Other
   * @return currentCarrier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "31", value = "31 = DHL 32 = FedEx 33 = US Postal Service 34 = Other")
  @JsonProperty(JSON_PROPERTY_CURRENT_CARRIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CurrentCarrierEnum getCurrentCarrier() {
    return currentCarrier;
  }


  @JsonProperty(JSON_PROPERTY_CURRENT_CARRIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrentCarrier(CurrentCarrierEnum currentCarrier) {
    this.currentCarrier = currentCarrier;
  }


  public CustomerAccountCharacteristics email(EmailInformation email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public EmailInformation getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(EmailInformation email) {
    this.email = email;
  }


  public CustomerAccountCharacteristics myUPSId(MyUPSId myUPSId) {
    
    this.myUPSId = myUPSId;
    return this;
  }

   /**
   * Get myUPSId
   * @return myUPSId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MY_U_P_S_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public MyUPSId getMyUPSId() {
    return myUPSId;
  }


  @JsonProperty(JSON_PROPERTY_MY_U_P_S_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMyUPSId(MyUPSId myUPSId) {
    this.myUPSId = myUPSId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAccountCharacteristics customerAccountCharacteristics = (CustomerAccountCharacteristics) o;
    return Objects.equals(this.customerClassification, customerAccountCharacteristics.customerClassification) &&
        Objects.equals(this.customerName, customerAccountCharacteristics.customerName) &&
        Objects.equals(this.taxInformation, customerAccountCharacteristics.taxInformation) &&
        Objects.equals(this.creditCardToken, customerAccountCharacteristics.creditCardToken) &&
        Objects.equals(this.accountReason, customerAccountCharacteristics.accountReason) &&
        Objects.equals(this.currentCarrier, customerAccountCharacteristics.currentCarrier) &&
        Objects.equals(this.email, customerAccountCharacteristics.email) &&
        Objects.equals(this.myUPSId, customerAccountCharacteristics.myUPSId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerClassification, customerName, taxInformation, creditCardToken, accountReason, currentCarrier, email, myUPSId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAccountCharacteristics {\n");
    sb.append("    customerClassification: ").append(toIndentedString(customerClassification)).append("\n");
    sb.append("    customerName: ").append(toIndentedString(customerName)).append("\n");
    sb.append("    taxInformation: ").append(toIndentedString(taxInformation)).append("\n");
    sb.append("    creditCardToken: ").append(toIndentedString(creditCardToken)).append("\n");
    sb.append("    accountReason: ").append(toIndentedString(accountReason)).append("\n");
    sb.append("    currentCarrier: ").append(toIndentedString(currentCarrier)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    myUPSId: ").append(toIndentedString(myUPSId)).append("\n");
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

