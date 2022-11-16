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
 * CommonResponseAdditionalInfoInner
 */
@JsonPropertyOrder({
  CommonResponseAdditionalInfoInner.JSON_PROPERTY_INFORMATION_TYPE,
  CommonResponseAdditionalInfoInner.JSON_PROPERTY_CODE,
  CommonResponseAdditionalInfoInner.JSON_PROPERTY_SEVERITY,
  CommonResponseAdditionalInfoInner.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("commonResponse_additionalInfo_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-16T16:23:57.675426900-05:00[America/New_York]")
public class CommonResponseAdditionalInfoInner {
  /**
   * Gets or Sets informationType
   */
  public enum InformationTypeEnum {
    ERROR("error"),
    
    ALERT("alert"),
    
    INFO("info");

    private String value;

    InformationTypeEnum(String value) {
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
    public static InformationTypeEnum fromValue(String value) {
      for (InformationTypeEnum b : InformationTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INFORMATION_TYPE = "informationType";
  private InformationTypeEnum informationType;

  public static final String JSON_PROPERTY_CODE = "code";
  private String code;

  /**
   * Gets or Sets severity
   */
  public enum SeverityEnum {
    HARD("hard"),
    
    TRANSIENT("transient"),
    
    ALERT("alert");

    private String value;

    SeverityEnum(String value) {
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
    public static SeverityEnum fromValue(String value) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private SeverityEnum severity;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public CommonResponseAdditionalInfoInner() {
  }

  public CommonResponseAdditionalInfoInner informationType(InformationTypeEnum informationType) {
    
    this.informationType = informationType;
    return this;
  }

   /**
   * Get informationType
   * @return informationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INFORMATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public InformationTypeEnum getInformationType() {
    return informationType;
  }


  @JsonProperty(JSON_PROPERTY_INFORMATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInformationType(InformationTypeEnum informationType) {
    this.informationType = informationType;
  }


  public CommonResponseAdditionalInfoInner code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Get code
   * @return code
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCode(String code) {
    this.code = code;
  }


  public CommonResponseAdditionalInfoInner severity(SeverityEnum severity) {
    
    this.severity = severity;
    return this;
  }

   /**
   * Get severity
   * @return severity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SeverityEnum getSeverity() {
    return severity;
  }


  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }


  public CommonResponseAdditionalInfoInner description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Account will be effective in 24 hours", value = "")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDescription(String description) {
    this.description = description;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonResponseAdditionalInfoInner commonResponseAdditionalInfoInner = (CommonResponseAdditionalInfoInner) o;
    return Objects.equals(this.informationType, commonResponseAdditionalInfoInner.informationType) &&
        Objects.equals(this.code, commonResponseAdditionalInfoInner.code) &&
        Objects.equals(this.severity, commonResponseAdditionalInfoInner.severity) &&
        Objects.equals(this.description, commonResponseAdditionalInfoInner.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(informationType, code, severity, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonResponseAdditionalInfoInner {\n");
    sb.append("    informationType: ").append(toIndentedString(informationType)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

