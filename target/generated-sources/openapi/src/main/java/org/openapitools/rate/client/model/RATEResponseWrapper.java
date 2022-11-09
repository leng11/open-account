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
import org.openapitools.rate.client.model.RateResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * N/A  
 */
@ApiModel(description = "N/A  ")
@JsonPropertyOrder({
  RATEResponseWrapper.JSON_PROPERTY_RATE_RESPONSE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class RATEResponseWrapper {
  public static final String JSON_PROPERTY_RATE_RESPONSE = "RateResponse";
  private RateResponse rateResponse;

  public RATEResponseWrapper() {
  }

  public RATEResponseWrapper rateResponse(RateResponse rateResponse) {
    
    this.rateResponse = rateResponse;
    return this;
  }

   /**
   * Get rateResponse
   * @return rateResponse
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RATE_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public RateResponse getRateResponse() {
    return rateResponse;
  }


  @JsonProperty(JSON_PROPERTY_RATE_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRateResponse(RateResponse rateResponse) {
    this.rateResponse = rateResponse;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RATEResponseWrapper raTEResponseWrapper = (RATEResponseWrapper) o;
    return Objects.equals(this.rateResponse, raTEResponseWrapper.rateResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RATEResponseWrapper {\n");
    sb.append("    rateResponse: ").append(toIndentedString(rateResponse)).append("\n");
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
