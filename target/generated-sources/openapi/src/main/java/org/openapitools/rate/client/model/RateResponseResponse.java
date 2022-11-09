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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.rate.client.model.ResponseAlert;
import org.openapitools.rate.client.model.ResponseAlertDetail;
import org.openapitools.rate.client.model.ResponseResponseStatus;
import org.openapitools.rate.client.model.ResponseTransactionReference;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Response Container.
 */
@ApiModel(description = "Response Container.")
@JsonPropertyOrder({
  RateResponseResponse.JSON_PROPERTY_RESPONSE_STATUS,
  RateResponseResponse.JSON_PROPERTY_ALERT,
  RateResponseResponse.JSON_PROPERTY_ALERT_DETAIL,
  RateResponseResponse.JSON_PROPERTY_TRANSACTION_REFERENCE
})
@JsonTypeName("RateResponse_Response")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class RateResponseResponse {
  public static final String JSON_PROPERTY_RESPONSE_STATUS = "ResponseStatus";
  private ResponseResponseStatus responseStatus;

  public static final String JSON_PROPERTY_ALERT = "Alert";
  private List<ResponseAlert> alert = null;

  public static final String JSON_PROPERTY_ALERT_DETAIL = "AlertDetail";
  private ResponseAlertDetail alertDetail;

  public static final String JSON_PROPERTY_TRANSACTION_REFERENCE = "TransactionReference";
  private ResponseTransactionReference transactionReference;

  public RateResponseResponse() {
  }

  public RateResponseResponse responseStatus(ResponseResponseStatus responseStatus) {
    
    this.responseStatus = responseStatus;
    return this;
  }

   /**
   * Get responseStatus
   * @return responseStatus
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_RESPONSE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ResponseResponseStatus getResponseStatus() {
    return responseStatus;
  }


  @JsonProperty(JSON_PROPERTY_RESPONSE_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setResponseStatus(ResponseResponseStatus responseStatus) {
    this.responseStatus = responseStatus;
  }


  public RateResponseResponse alert(List<ResponseAlert> alert) {
    
    this.alert = alert;
    return this;
  }

  public RateResponseResponse addAlertItem(ResponseAlert alertItem) {
    if (this.alert == null) {
      this.alert = new ArrayList<>();
    }
    this.alert.add(alertItem);
    return this;
  }

   /**
   * Get alert
   * @return alert
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ResponseAlert> getAlert() {
    return alert;
  }


  @JsonProperty(JSON_PROPERTY_ALERT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlert(List<ResponseAlert> alert) {
    this.alert = alert;
  }


  public RateResponseResponse alertDetail(ResponseAlertDetail alertDetail) {
    
    this.alertDetail = alertDetail;
    return this;
  }

   /**
   * Get alertDetail
   * @return alertDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALERT_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResponseAlertDetail getAlertDetail() {
    return alertDetail;
  }


  @JsonProperty(JSON_PROPERTY_ALERT_DETAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlertDetail(ResponseAlertDetail alertDetail) {
    this.alertDetail = alertDetail;
  }


  public RateResponseResponse transactionReference(ResponseTransactionReference transactionReference) {
    
    this.transactionReference = transactionReference;
    return this;
  }

   /**
   * Get transactionReference
   * @return transactionReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResponseTransactionReference getTransactionReference() {
    return transactionReference;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionReference(ResponseTransactionReference transactionReference) {
    this.transactionReference = transactionReference;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateResponseResponse rateResponseResponse = (RateResponseResponse) o;
    return Objects.equals(this.responseStatus, rateResponseResponse.responseStatus) &&
        Objects.equals(this.alert, rateResponseResponse.alert) &&
        Objects.equals(this.alertDetail, rateResponseResponse.alertDetail) &&
        Objects.equals(this.transactionReference, rateResponseResponse.transactionReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseStatus, alert, alertDetail, transactionReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateResponseResponse {\n");
    sb.append("    responseStatus: ").append(toIndentedString(responseStatus)).append("\n");
    sb.append("    alert: ").append(toIndentedString(alert)).append("\n");
    sb.append("    alertDetail: ").append(toIndentedString(alertDetail)).append("\n");
    sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
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
