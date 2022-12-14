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
import org.openapitools.openaccount.client.model.ContactName1;
import org.openapitools.openaccount.client.model.CustomerPreferences;
import org.openapitools.openaccount.client.model.Phone;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Contact
 */
@JsonPropertyOrder({
  Contact.JSON_PROPERTY_CONTACT_TYPE,
  Contact.JSON_PROPERTY_CONTACT_NAME,
  Contact.JSON_PROPERTY_ATTENTION_NAME,
  Contact.JSON_PROPERTY_BUSINESS_NAME,
  Contact.JSON_PROPERTY_DEPARTMENT_NAME,
  Contact.JSON_PROPERTY_MAILSTOP_CODE,
  Contact.JSON_PROPERTY_CUSTOMER_COMMUNICATION,
  Contact.JSON_PROPERTY_EMAIL,
  Contact.JSON_PROPERTY_PHONE
})
@JsonTypeName("contact")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-16T16:23:57.675426900-05:00[America/New_York]")
public class Contact {
  /**
   * Gets or Sets contactType
   */
  public enum ContactTypeEnum {
    BUSINESS("business"),
    
    PERSONAL("personal"),
    
    TAX("tax"),
    
    BILLING("billing"),
    
    PICKUP("pickup");

    private String value;

    ContactTypeEnum(String value) {
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
    public static ContactTypeEnum fromValue(String value) {
      for (ContactTypeEnum b : ContactTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CONTACT_TYPE = "contactType";
  private ContactTypeEnum contactType;

  public static final String JSON_PROPERTY_CONTACT_NAME = "contactName";
  private ContactName1 contactName;

  public static final String JSON_PROPERTY_ATTENTION_NAME = "attentionName";
  private String attentionName;

  public static final String JSON_PROPERTY_BUSINESS_NAME = "businessName";
  private String businessName;

  public static final String JSON_PROPERTY_DEPARTMENT_NAME = "departmentName";
  private String departmentName;

  public static final String JSON_PROPERTY_MAILSTOP_CODE = "mailstopCode";
  private String mailstopCode;

  public static final String JSON_PROPERTY_CUSTOMER_COMMUNICATION = "customerCommunication";
  private CustomerPreferences customerCommunication;

  public static final String JSON_PROPERTY_EMAIL = "email";
  private String email;

  public static final String JSON_PROPERTY_PHONE = "phone";
  private Phone phone;

  public Contact() {
  }

  public Contact contactType(ContactTypeEnum contactType) {
    
    this.contactType = contactType;
    return this;
  }

   /**
   * Get contactType
   * @return contactType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "business", value = "")
  @JsonProperty(JSON_PROPERTY_CONTACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContactTypeEnum getContactType() {
    return contactType;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactType(ContactTypeEnum contactType) {
    this.contactType = contactType;
  }


  public Contact contactName(ContactName1 contactName) {
    
    this.contactName = contactName;
    return this;
  }

   /**
   * Get contactName
   * @return contactName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CONTACT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ContactName1 getContactName() {
    return contactName;
  }


  @JsonProperty(JSON_PROPERTY_CONTACT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContactName(ContactName1 contactName) {
    this.contactName = contactName;
  }


  public Contact attentionName(String attentionName) {
    
    this.attentionName = attentionName;
    return this;
  }

   /**
   * Get attentionName
   * @return attentionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ATTENTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAttentionName() {
    return attentionName;
  }


  @JsonProperty(JSON_PROPERTY_ATTENTION_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAttentionName(String attentionName) {
    this.attentionName = attentionName;
  }


  public Contact businessName(String businessName) {
    
    this.businessName = businessName;
    return this;
  }

   /**
   * Get businessName
   * @return businessName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBusinessName() {
    return businessName;
  }


  @JsonProperty(JSON_PROPERTY_BUSINESS_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }


  public Contact departmentName(String departmentName) {
    
    this.departmentName = departmentName;
    return this;
  }

   /**
   * Get departmentName
   * @return departmentName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DEPARTMENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDepartmentName() {
    return departmentName;
  }


  @JsonProperty(JSON_PROPERTY_DEPARTMENT_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDepartmentName(String departmentName) {
    this.departmentName = departmentName;
  }


  public Contact mailstopCode(String mailstopCode) {
    
    this.mailstopCode = mailstopCode;
    return this;
  }

   /**
   * Get mailstopCode
   * @return mailstopCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_MAILSTOP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMailstopCode() {
    return mailstopCode;
  }


  @JsonProperty(JSON_PROPERTY_MAILSTOP_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMailstopCode(String mailstopCode) {
    this.mailstopCode = mailstopCode;
  }


  public Contact customerCommunication(CustomerPreferences customerCommunication) {
    
    this.customerCommunication = customerCommunication;
    return this;
  }

   /**
   * Get customerCommunication
   * @return customerCommunication
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_COMMUNICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public CustomerPreferences getCustomerCommunication() {
    return customerCommunication;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_COMMUNICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerCommunication(CustomerPreferences customerCommunication) {
    this.customerCommunication = customerCommunication;
  }


  public Contact email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "from@to.com", value = "")
  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getEmail() {
    return email;
  }


  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEmail(String email) {
    this.email = email;
  }


  public Contact phone(Phone phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * Get phone
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Phone getPhone() {
    return phone;
  }


  @JsonProperty(JSON_PROPERTY_PHONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPhone(Phone phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.contactType, contact.contactType) &&
        Objects.equals(this.contactName, contact.contactName) &&
        Objects.equals(this.attentionName, contact.attentionName) &&
        Objects.equals(this.businessName, contact.businessName) &&
        Objects.equals(this.departmentName, contact.departmentName) &&
        Objects.equals(this.mailstopCode, contact.mailstopCode) &&
        Objects.equals(this.customerCommunication, contact.customerCommunication) &&
        Objects.equals(this.email, contact.email) &&
        Objects.equals(this.phone, contact.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contactType, contactName, attentionName, businessName, departmentName, mailstopCode, customerCommunication, email, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    sb.append("    contactType: ").append(toIndentedString(contactType)).append("\n");
    sb.append("    contactName: ").append(toIndentedString(contactName)).append("\n");
    sb.append("    attentionName: ").append(toIndentedString(attentionName)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    departmentName: ").append(toIndentedString(departmentName)).append("\n");
    sb.append("    mailstopCode: ").append(toIndentedString(mailstopCode)).append("\n");
    sb.append("    customerCommunication: ").append(toIndentedString(customerCommunication)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

