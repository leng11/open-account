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
 * Pickup Type container tag.  N/A
 */
@ApiModel(description = "Pickup Type container tag.  N/A")
@JsonPropertyOrder({
  RateRequestPickupType.JSON_PROPERTY_CODE,
  RateRequestPickupType.JSON_PROPERTY_DESCRIPTION
})
@JsonTypeName("RateRequest_PickupType")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class RateRequestPickupType {
  public static final String JSON_PROPERTY_CODE = "Code";
  private String code;

  public static final String JSON_PROPERTY_DESCRIPTION = "Description";
  private String description;

  public RateRequestPickupType() {
  }

  public RateRequestPickupType code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Pickup Type Code.  Valid values:  01 - Daily Pickup (Default - used when an invalid pickup type code is provided) 03 - Customer Counter 06 - One Time Pickup 19 - Letter Center 20 - Air Service Center Length is not validated.  When negotiated rates are requested, 07 (onCallAir) will be ignored.  Refer to the Rate Types Table in the Appendix for rate type based on Pickup Type and Customer Classification Code.
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Pickup Type Code.  Valid values:  01 - Daily Pickup (Default - used when an invalid pickup type code is provided) 03 - Customer Counter 06 - One Time Pickup 19 - Letter Center 20 - Air Service Center Length is not validated.  When negotiated rates are requested, 07 (onCallAir) will be ignored.  Refer to the Rate Types Table in the Appendix for rate type based on Pickup Type and Customer Classification Code.")
  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCode() {
    return code;
  }


  @JsonProperty(JSON_PROPERTY_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCode(String code) {
    this.code = code;
  }


  public RateRequestPickupType description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Pickup Type Description.  Ignored if provided in the Request.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pickup Type Description.  Ignored if provided in the Request.")
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
    RateRequestPickupType rateRequestPickupType = (RateRequestPickupType) o;
    return Objects.equals(this.code, rateRequestPickupType.code) &&
        Objects.equals(this.description, rateRequestPickupType.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateRequestPickupType {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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
