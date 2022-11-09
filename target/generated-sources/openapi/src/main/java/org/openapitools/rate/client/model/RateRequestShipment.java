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
import org.openapitools.rate.client.model.ShipmentAlternateDeliveryAddress;
import org.openapitools.rate.client.model.ShipmentDeliveryTimeInformation;
import org.openapitools.rate.client.model.ShipmentFRSPaymentInformation;
import org.openapitools.rate.client.model.ShipmentFreightShipmentInformation;
import org.openapitools.rate.client.model.ShipmentInvoiceLineTotal;
import org.openapitools.rate.client.model.ShipmentPromotionalDiscountInformation;
import org.openapitools.rate.client.model.ShipmentService;
import org.openapitools.rate.client.model.ShipmentShipFrom;
import org.openapitools.rate.client.model.ShipmentShipTo;
import org.openapitools.rate.client.model.ShipmentShipmentIndicationType;
import org.openapitools.rate.client.model.ShipmentShipmentRatingOptions;
import org.openapitools.rate.client.model.ShipmentShipmentServiceOptions;
import org.openapitools.rate.client.model.ShipmentShipmentTotalWeight;
import org.openapitools.rate.client.model.ShipmentShipper;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Container for Shipment Information.  N/A
 */
@ApiModel(description = "Container for Shipment Information.  N/A")
@JsonPropertyOrder({
  RateRequestShipment.JSON_PROPERTY_ORIGIN_RECORD_TRANSACTION_TIMESTAMP,
  RateRequestShipment.JSON_PROPERTY_SHIPPER,
  RateRequestShipment.JSON_PROPERTY_SHIP_TO,
  RateRequestShipment.JSON_PROPERTY_SHIP_FROM,
  RateRequestShipment.JSON_PROPERTY_ALTERNATE_DELIVERY_ADDRESS,
  RateRequestShipment.JSON_PROPERTY_SHIPMENT_INDICATION_TYPE,
  RateRequestShipment.JSON_PROPERTY_PAYMENT_DETAILS,
  RateRequestShipment.JSON_PROPERTY_FR_S_PAYMENT_INFORMATION,
  RateRequestShipment.JSON_PROPERTY_FREIGHT_SHIPMENT_INFORMATION,
  RateRequestShipment.JSON_PROPERTY_GOODS_NOT_IN_FREE_CIRCULATION_INDICATOR,
  RateRequestShipment.JSON_PROPERTY_SERVICE,
  RateRequestShipment.JSON_PROPERTY_NUM_OF_PIECES,
  RateRequestShipment.JSON_PROPERTY_SHIPMENT_TOTAL_WEIGHT,
  RateRequestShipment.JSON_PROPERTY_DOCUMENTS_ONLY_INDICATOR,
  RateRequestShipment.JSON_PROPERTY_PACKAGE,
  RateRequestShipment.JSON_PROPERTY_SHIPMENT_SERVICE_OPTIONS,
  RateRequestShipment.JSON_PROPERTY_SHIPMENT_RATING_OPTIONS,
  RateRequestShipment.JSON_PROPERTY_INVOICE_LINE_TOTAL,
  RateRequestShipment.JSON_PROPERTY_RATING_METHOD_REQUESTED_INDICATOR,
  RateRequestShipment.JSON_PROPERTY_TAX_INFORMATION_INDICATOR,
  RateRequestShipment.JSON_PROPERTY_PROMOTIONAL_DISCOUNT_INFORMATION,
  RateRequestShipment.JSON_PROPERTY_DELIVERY_TIME_INFORMATION,
  RateRequestShipment.JSON_PROPERTY_MASTER_CARTON_INDICATOR,
  RateRequestShipment.JSON_PROPERTY_WW_E_SHIPMENT_INDICATOR
})
@JsonTypeName("RateRequest_Shipment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class RateRequestShipment {
  public static final String JSON_PROPERTY_ORIGIN_RECORD_TRANSACTION_TIMESTAMP = "OriginRecordTransactionTimestamp";
  private String originRecordTransactionTimestamp;

  public static final String JSON_PROPERTY_SHIPPER = "Shipper";
  private ShipmentShipper shipper;

  public static final String JSON_PROPERTY_SHIP_TO = "ShipTo";
  private ShipmentShipTo shipTo;

  public static final String JSON_PROPERTY_SHIP_FROM = "ShipFrom";
  private ShipmentShipFrom shipFrom;

  public static final String JSON_PROPERTY_ALTERNATE_DELIVERY_ADDRESS = "AlternateDeliveryAddress";
  private ShipmentAlternateDeliveryAddress alternateDeliveryAddress;

  public static final String JSON_PROPERTY_SHIPMENT_INDICATION_TYPE = "ShipmentIndicationType";
  private ShipmentShipmentIndicationType shipmentIndicationType;

  public static final String JSON_PROPERTY_PAYMENT_DETAILS = "PaymentDetails";
  private Object paymentDetails;

  public static final String JSON_PROPERTY_FR_S_PAYMENT_INFORMATION = "FRSPaymentInformation";
  private ShipmentFRSPaymentInformation frSPaymentInformation;

  public static final String JSON_PROPERTY_FREIGHT_SHIPMENT_INFORMATION = "FreightShipmentInformation";
  private ShipmentFreightShipmentInformation freightShipmentInformation;

  public static final String JSON_PROPERTY_GOODS_NOT_IN_FREE_CIRCULATION_INDICATOR = "GoodsNotInFreeCirculationIndicator";
  private String goodsNotInFreeCirculationIndicator;

  public static final String JSON_PROPERTY_SERVICE = "Service";
  private ShipmentService service;

  public static final String JSON_PROPERTY_NUM_OF_PIECES = "NumOfPieces";
  private String numOfPieces;

  public static final String JSON_PROPERTY_SHIPMENT_TOTAL_WEIGHT = "ShipmentTotalWeight";
  private ShipmentShipmentTotalWeight shipmentTotalWeight;

  public static final String JSON_PROPERTY_DOCUMENTS_ONLY_INDICATOR = "DocumentsOnlyIndicator";
  private String documentsOnlyIndicator;

  public static final String JSON_PROPERTY_PACKAGE = "Package";
  private Object _package;

  public static final String JSON_PROPERTY_SHIPMENT_SERVICE_OPTIONS = "ShipmentServiceOptions";
  private ShipmentShipmentServiceOptions shipmentServiceOptions;

  public static final String JSON_PROPERTY_SHIPMENT_RATING_OPTIONS = "ShipmentRatingOptions";
  private ShipmentShipmentRatingOptions shipmentRatingOptions;

  public static final String JSON_PROPERTY_INVOICE_LINE_TOTAL = "InvoiceLineTotal";
  private ShipmentInvoiceLineTotal invoiceLineTotal;

  public static final String JSON_PROPERTY_RATING_METHOD_REQUESTED_INDICATOR = "RatingMethodRequestedIndicator";
  private String ratingMethodRequestedIndicator;

  public static final String JSON_PROPERTY_TAX_INFORMATION_INDICATOR = "TaxInformationIndicator";
  private String taxInformationIndicator;

  public static final String JSON_PROPERTY_PROMOTIONAL_DISCOUNT_INFORMATION = "PromotionalDiscountInformation";
  private ShipmentPromotionalDiscountInformation promotionalDiscountInformation;

  public static final String JSON_PROPERTY_DELIVERY_TIME_INFORMATION = "DeliveryTimeInformation";
  private ShipmentDeliveryTimeInformation deliveryTimeInformation;

  public static final String JSON_PROPERTY_MASTER_CARTON_INDICATOR = "MasterCartonIndicator";
  private String masterCartonIndicator;

  public static final String JSON_PROPERTY_WW_E_SHIPMENT_INDICATOR = "WWEShipmentIndicator";
  private String wwEShipmentIndicator;

  public RateRequestShipment() {
  }

  public RateRequestShipment originRecordTransactionTimestamp(String originRecordTransactionTimestamp) {
    
    this.originRecordTransactionTimestamp = originRecordTransactionTimestamp;
    return this;
  }

   /**
   * The time that the request was made from the originating system. UTC time down to milliseconds. Example - 2016-07-14T12:01:33.999  Applicable only for HazMat request and with subversion greater than or equal to 1701.
   * @return originRecordTransactionTimestamp
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The time that the request was made from the originating system. UTC time down to milliseconds. Example - 2016-07-14T12:01:33.999  Applicable only for HazMat request and with subversion greater than or equal to 1701.")
  @JsonProperty(JSON_PROPERTY_ORIGIN_RECORD_TRANSACTION_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOriginRecordTransactionTimestamp() {
    return originRecordTransactionTimestamp;
  }


  @JsonProperty(JSON_PROPERTY_ORIGIN_RECORD_TRANSACTION_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOriginRecordTransactionTimestamp(String originRecordTransactionTimestamp) {
    this.originRecordTransactionTimestamp = originRecordTransactionTimestamp;
  }


  public RateRequestShipment shipper(ShipmentShipper shipper) {
    
    this.shipper = shipper;
    return this;
  }

   /**
   * Get shipper
   * @return shipper
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SHIPPER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipmentShipper getShipper() {
    return shipper;
  }


  @JsonProperty(JSON_PROPERTY_SHIPPER)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShipper(ShipmentShipper shipper) {
    this.shipper = shipper;
  }


  public RateRequestShipment shipTo(ShipmentShipTo shipTo) {
    
    this.shipTo = shipTo;
    return this;
  }

   /**
   * Get shipTo
   * @return shipTo
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_SHIP_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ShipmentShipTo getShipTo() {
    return shipTo;
  }


  @JsonProperty(JSON_PROPERTY_SHIP_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShipTo(ShipmentShipTo shipTo) {
    this.shipTo = shipTo;
  }


  public RateRequestShipment shipFrom(ShipmentShipFrom shipFrom) {
    
    this.shipFrom = shipFrom;
    return this;
  }

   /**
   * Get shipFrom
   * @return shipFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIP_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentShipFrom getShipFrom() {
    return shipFrom;
  }


  @JsonProperty(JSON_PROPERTY_SHIP_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipFrom(ShipmentShipFrom shipFrom) {
    this.shipFrom = shipFrom;
  }


  public RateRequestShipment alternateDeliveryAddress(ShipmentAlternateDeliveryAddress alternateDeliveryAddress) {
    
    this.alternateDeliveryAddress = alternateDeliveryAddress;
    return this;
  }

   /**
   * Get alternateDeliveryAddress
   * @return alternateDeliveryAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_ALTERNATE_DELIVERY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentAlternateDeliveryAddress getAlternateDeliveryAddress() {
    return alternateDeliveryAddress;
  }


  @JsonProperty(JSON_PROPERTY_ALTERNATE_DELIVERY_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAlternateDeliveryAddress(ShipmentAlternateDeliveryAddress alternateDeliveryAddress) {
    this.alternateDeliveryAddress = alternateDeliveryAddress;
  }


  public RateRequestShipment shipmentIndicationType(ShipmentShipmentIndicationType shipmentIndicationType) {
    
    this.shipmentIndicationType = shipmentIndicationType;
    return this;
  }

   /**
   * Get shipmentIndicationType
   * @return shipmentIndicationType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPMENT_INDICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentShipmentIndicationType getShipmentIndicationType() {
    return shipmentIndicationType;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENT_INDICATION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipmentIndicationType(ShipmentShipmentIndicationType shipmentIndicationType) {
    this.shipmentIndicationType = shipmentIndicationType;
  }


  public RateRequestShipment paymentDetails(Object paymentDetails) {
    
    this.paymentDetails = paymentDetails;
    return this;
  }

   /**
   * Payment details container for detailed shipment charges. The two shipment charges that are available for specification are Transportation charges and Duties and Taxes.  This container is used for Who Pays What functionality.
   * @return paymentDetails
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Payment details container for detailed shipment charges. The two shipment charges that are available for specification are Transportation charges and Duties and Taxes.  This container is used for Who Pays What functionality.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getPaymentDetails() {
    return paymentDetails;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_DETAILS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentDetails(Object paymentDetails) {
    this.paymentDetails = paymentDetails;
  }


  public RateRequestShipment frSPaymentInformation(ShipmentFRSPaymentInformation frSPaymentInformation) {
    
    this.frSPaymentInformation = frSPaymentInformation;
    return this;
  }

   /**
   * Get frSPaymentInformation
   * @return frSPaymentInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FR_S_PAYMENT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentFRSPaymentInformation getFrSPaymentInformation() {
    return frSPaymentInformation;
  }


  @JsonProperty(JSON_PROPERTY_FR_S_PAYMENT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFrSPaymentInformation(ShipmentFRSPaymentInformation frSPaymentInformation) {
    this.frSPaymentInformation = frSPaymentInformation;
  }


  public RateRequestShipment freightShipmentInformation(ShipmentFreightShipmentInformation freightShipmentInformation) {
    
    this.freightShipmentInformation = freightShipmentInformation;
    return this;
  }

   /**
   * Get freightShipmentInformation
   * @return freightShipmentInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FREIGHT_SHIPMENT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentFreightShipmentInformation getFreightShipmentInformation() {
    return freightShipmentInformation;
  }


  @JsonProperty(JSON_PROPERTY_FREIGHT_SHIPMENT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFreightShipmentInformation(ShipmentFreightShipmentInformation freightShipmentInformation) {
    this.freightShipmentInformation = freightShipmentInformation;
  }


  public RateRequestShipment goodsNotInFreeCirculationIndicator(String goodsNotInFreeCirculationIndicator) {
    
    this.goodsNotInFreeCirculationIndicator = goodsNotInFreeCirculationIndicator;
    return this;
  }

   /**
   * Goods Not In Free Circulation indicator.  This is an empty tag, any value inside is ignored. This indicator is invalid for a package type of UPS Letter and DocumentsOnly.
   * @return goodsNotInFreeCirculationIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Goods Not In Free Circulation indicator.  This is an empty tag, any value inside is ignored. This indicator is invalid for a package type of UPS Letter and DocumentsOnly.")
  @JsonProperty(JSON_PROPERTY_GOODS_NOT_IN_FREE_CIRCULATION_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGoodsNotInFreeCirculationIndicator() {
    return goodsNotInFreeCirculationIndicator;
  }


  @JsonProperty(JSON_PROPERTY_GOODS_NOT_IN_FREE_CIRCULATION_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGoodsNotInFreeCirculationIndicator(String goodsNotInFreeCirculationIndicator) {
    this.goodsNotInFreeCirculationIndicator = goodsNotInFreeCirculationIndicator;
  }


  public RateRequestShipment service(ShipmentService service) {
    
    this.service = service;
    return this;
  }

   /**
   * Get service
   * @return service
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentService getService() {
    return service;
  }


  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setService(ShipmentService service) {
    this.service = service;
  }


  public RateRequestShipment numOfPieces(String numOfPieces) {
    
    this.numOfPieces = numOfPieces;
    return this;
  }

   /**
   * Total number of pieces in all pallets. Required for UPS Worldwide Express Freight and UPS Worldwide Express Freight Midday shipments.
   * @return numOfPieces
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Total number of pieces in all pallets. Required for UPS Worldwide Express Freight and UPS Worldwide Express Freight Midday shipments.")
  @JsonProperty(JSON_PROPERTY_NUM_OF_PIECES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getNumOfPieces() {
    return numOfPieces;
  }


  @JsonProperty(JSON_PROPERTY_NUM_OF_PIECES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNumOfPieces(String numOfPieces) {
    this.numOfPieces = numOfPieces;
  }


  public RateRequestShipment shipmentTotalWeight(ShipmentShipmentTotalWeight shipmentTotalWeight) {
    
    this.shipmentTotalWeight = shipmentTotalWeight;
    return this;
  }

   /**
   * Get shipmentTotalWeight
   * @return shipmentTotalWeight
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPMENT_TOTAL_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentShipmentTotalWeight getShipmentTotalWeight() {
    return shipmentTotalWeight;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENT_TOTAL_WEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipmentTotalWeight(ShipmentShipmentTotalWeight shipmentTotalWeight) {
    this.shipmentTotalWeight = shipmentTotalWeight;
  }


  public RateRequestShipment documentsOnlyIndicator(String documentsOnlyIndicator) {
    
    this.documentsOnlyIndicator = documentsOnlyIndicator;
    return this;
  }

   /**
   * Valid values are Document and Non-document. If the indicator is present then the value is Document else Non-Document. Note: Not applicable for FRS rating  requests.  Empty Tag.
   * @return documentsOnlyIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Valid values are Document and Non-document. If the indicator is present then the value is Document else Non-Document. Note: Not applicable for FRS rating  requests.  Empty Tag.")
  @JsonProperty(JSON_PROPERTY_DOCUMENTS_ONLY_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDocumentsOnlyIndicator() {
    return documentsOnlyIndicator;
  }


  @JsonProperty(JSON_PROPERTY_DOCUMENTS_ONLY_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDocumentsOnlyIndicator(String documentsOnlyIndicator) {
    this.documentsOnlyIndicator = documentsOnlyIndicator;
  }


  public RateRequestShipment _package(Object _package) {
    
    this._package = _package;
    return this;
  }

   /**
   * Get _package
   * @return _package
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Object getPackage() {
    return _package;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPackage(Object _package) {
    this._package = _package;
  }


  public RateRequestShipment shipmentServiceOptions(ShipmentShipmentServiceOptions shipmentServiceOptions) {
    
    this.shipmentServiceOptions = shipmentServiceOptions;
    return this;
  }

   /**
   * Get shipmentServiceOptions
   * @return shipmentServiceOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPMENT_SERVICE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentShipmentServiceOptions getShipmentServiceOptions() {
    return shipmentServiceOptions;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENT_SERVICE_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipmentServiceOptions(ShipmentShipmentServiceOptions shipmentServiceOptions) {
    this.shipmentServiceOptions = shipmentServiceOptions;
  }


  public RateRequestShipment shipmentRatingOptions(ShipmentShipmentRatingOptions shipmentRatingOptions) {
    
    this.shipmentRatingOptions = shipmentRatingOptions;
    return this;
  }

   /**
   * Get shipmentRatingOptions
   * @return shipmentRatingOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SHIPMENT_RATING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentShipmentRatingOptions getShipmentRatingOptions() {
    return shipmentRatingOptions;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENT_RATING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShipmentRatingOptions(ShipmentShipmentRatingOptions shipmentRatingOptions) {
    this.shipmentRatingOptions = shipmentRatingOptions;
  }


  public RateRequestShipment invoiceLineTotal(ShipmentInvoiceLineTotal invoiceLineTotal) {
    
    this.invoiceLineTotal = invoiceLineTotal;
    return this;
  }

   /**
   * Get invoiceLineTotal
   * @return invoiceLineTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_INVOICE_LINE_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentInvoiceLineTotal getInvoiceLineTotal() {
    return invoiceLineTotal;
  }


  @JsonProperty(JSON_PROPERTY_INVOICE_LINE_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInvoiceLineTotal(ShipmentInvoiceLineTotal invoiceLineTotal) {
    this.invoiceLineTotal = invoiceLineTotal;
  }


  public RateRequestShipment ratingMethodRequestedIndicator(String ratingMethodRequestedIndicator) {
    
    this.ratingMethodRequestedIndicator = ratingMethodRequestedIndicator;
    return this;
  }

   /**
   * Presence/Absence Indicator. Any value inside is ignored. RatingMethodRequestedIndicator is an indicator. If present, Billable Weight Calculation method and Rating Method information would be returned in response.
   * @return ratingMethodRequestedIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Presence/Absence Indicator. Any value inside is ignored. RatingMethodRequestedIndicator is an indicator. If present, Billable Weight Calculation method and Rating Method information would be returned in response.")
  @JsonProperty(JSON_PROPERTY_RATING_METHOD_REQUESTED_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getRatingMethodRequestedIndicator() {
    return ratingMethodRequestedIndicator;
  }


  @JsonProperty(JSON_PROPERTY_RATING_METHOD_REQUESTED_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRatingMethodRequestedIndicator(String ratingMethodRequestedIndicator) {
    this.ratingMethodRequestedIndicator = ratingMethodRequestedIndicator;
  }


  public RateRequestShipment taxInformationIndicator(String taxInformationIndicator) {
    
    this.taxInformationIndicator = taxInformationIndicator;
    return this;
  }

   /**
   * Presence/Absence Indicator. Any value inside is ignored. TaxInformationIndicator is an indicator.   The Tax related information includes any type of Taxes, corresponding Monetary Values, Total Charges with Taxes and disclaimers (if applicable) would be returned in response.  If present, any taxes that may be applicable to a shipment would be returned in response.   If this indicator is requested with NegotiatedRatesIndicator, Tax related information, if applicable, would be returned only for Negotiated Rates and not for Published Rates.
   * @return taxInformationIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Presence/Absence Indicator. Any value inside is ignored. TaxInformationIndicator is an indicator.   The Tax related information includes any type of Taxes, corresponding Monetary Values, Total Charges with Taxes and disclaimers (if applicable) would be returned in response.  If present, any taxes that may be applicable to a shipment would be returned in response.   If this indicator is requested with NegotiatedRatesIndicator, Tax related information, if applicable, would be returned only for Negotiated Rates and not for Published Rates.")
  @JsonProperty(JSON_PROPERTY_TAX_INFORMATION_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTaxInformationIndicator() {
    return taxInformationIndicator;
  }


  @JsonProperty(JSON_PROPERTY_TAX_INFORMATION_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTaxInformationIndicator(String taxInformationIndicator) {
    this.taxInformationIndicator = taxInformationIndicator;
  }


  public RateRequestShipment promotionalDiscountInformation(ShipmentPromotionalDiscountInformation promotionalDiscountInformation) {
    
    this.promotionalDiscountInformation = promotionalDiscountInformation;
    return this;
  }

   /**
   * Get promotionalDiscountInformation
   * @return promotionalDiscountInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROMOTIONAL_DISCOUNT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentPromotionalDiscountInformation getPromotionalDiscountInformation() {
    return promotionalDiscountInformation;
  }


  @JsonProperty(JSON_PROPERTY_PROMOTIONAL_DISCOUNT_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPromotionalDiscountInformation(ShipmentPromotionalDiscountInformation promotionalDiscountInformation) {
    this.promotionalDiscountInformation = promotionalDiscountInformation;
  }


  public RateRequestShipment deliveryTimeInformation(ShipmentDeliveryTimeInformation deliveryTimeInformation) {
    
    this.deliveryTimeInformation = deliveryTimeInformation;
    return this;
  }

   /**
   * Get deliveryTimeInformation
   * @return deliveryTimeInformation
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DELIVERY_TIME_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ShipmentDeliveryTimeInformation getDeliveryTimeInformation() {
    return deliveryTimeInformation;
  }


  @JsonProperty(JSON_PROPERTY_DELIVERY_TIME_INFORMATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDeliveryTimeInformation(ShipmentDeliveryTimeInformation deliveryTimeInformation) {
    this.deliveryTimeInformation = deliveryTimeInformation;
  }


  public RateRequestShipment masterCartonIndicator(String masterCartonIndicator) {
    
    this.masterCartonIndicator = masterCartonIndicator;
    return this;
  }

   /**
   * Presence/Absence Indicator. Any value inside is ignored. MasterCartonIndicator is an indicator and presence implies that shipment is Master Carton type.  If present, the shipment will be rated as a Master Carton Type. If this indicator is requested with NegotiatedRatesIndicator, rates would be returned only for Negotiated Rates and not for Published Rates.
   * @return masterCartonIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Presence/Absence Indicator. Any value inside is ignored. MasterCartonIndicator is an indicator and presence implies that shipment is Master Carton type.  If present, the shipment will be rated as a Master Carton Type. If this indicator is requested with NegotiatedRatesIndicator, rates would be returned only for Negotiated Rates and not for Published Rates.")
  @JsonProperty(JSON_PROPERTY_MASTER_CARTON_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getMasterCartonIndicator() {
    return masterCartonIndicator;
  }


  @JsonProperty(JSON_PROPERTY_MASTER_CARTON_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMasterCartonIndicator(String masterCartonIndicator) {
    this.masterCartonIndicator = masterCartonIndicator;
  }


  public RateRequestShipment wwEShipmentIndicator(String wwEShipmentIndicator) {
    
    this.wwEShipmentIndicator = wwEShipmentIndicator;
    return this;
  }

   /**
   * Presence/Absence Indicator. Any value inside is ignored. WWEShipmentIndicator is an indicator and presence implies that WWE service details requested for RequestOption&#x3D;Shop or  RequestOption&#x3D;Shoptimeintransit  RequestOption&#x3D;Shop or  RequestOption&#x3D;Shoptimeintransit
   * @return wwEShipmentIndicator
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Presence/Absence Indicator. Any value inside is ignored. WWEShipmentIndicator is an indicator and presence implies that WWE service details requested for RequestOption=Shop or  RequestOption=Shoptimeintransit  RequestOption=Shop or  RequestOption=Shoptimeintransit")
  @JsonProperty(JSON_PROPERTY_WW_E_SHIPMENT_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWwEShipmentIndicator() {
    return wwEShipmentIndicator;
  }


  @JsonProperty(JSON_PROPERTY_WW_E_SHIPMENT_INDICATOR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setWwEShipmentIndicator(String wwEShipmentIndicator) {
    this.wwEShipmentIndicator = wwEShipmentIndicator;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateRequestShipment rateRequestShipment = (RateRequestShipment) o;
    return Objects.equals(this.originRecordTransactionTimestamp, rateRequestShipment.originRecordTransactionTimestamp) &&
        Objects.equals(this.shipper, rateRequestShipment.shipper) &&
        Objects.equals(this.shipTo, rateRequestShipment.shipTo) &&
        Objects.equals(this.shipFrom, rateRequestShipment.shipFrom) &&
        Objects.equals(this.alternateDeliveryAddress, rateRequestShipment.alternateDeliveryAddress) &&
        Objects.equals(this.shipmentIndicationType, rateRequestShipment.shipmentIndicationType) &&
        Objects.equals(this.paymentDetails, rateRequestShipment.paymentDetails) &&
        Objects.equals(this.frSPaymentInformation, rateRequestShipment.frSPaymentInformation) &&
        Objects.equals(this.freightShipmentInformation, rateRequestShipment.freightShipmentInformation) &&
        Objects.equals(this.goodsNotInFreeCirculationIndicator, rateRequestShipment.goodsNotInFreeCirculationIndicator) &&
        Objects.equals(this.service, rateRequestShipment.service) &&
        Objects.equals(this.numOfPieces, rateRequestShipment.numOfPieces) &&
        Objects.equals(this.shipmentTotalWeight, rateRequestShipment.shipmentTotalWeight) &&
        Objects.equals(this.documentsOnlyIndicator, rateRequestShipment.documentsOnlyIndicator) &&
        Objects.equals(this._package, rateRequestShipment._package) &&
        Objects.equals(this.shipmentServiceOptions, rateRequestShipment.shipmentServiceOptions) &&
        Objects.equals(this.shipmentRatingOptions, rateRequestShipment.shipmentRatingOptions) &&
        Objects.equals(this.invoiceLineTotal, rateRequestShipment.invoiceLineTotal) &&
        Objects.equals(this.ratingMethodRequestedIndicator, rateRequestShipment.ratingMethodRequestedIndicator) &&
        Objects.equals(this.taxInformationIndicator, rateRequestShipment.taxInformationIndicator) &&
        Objects.equals(this.promotionalDiscountInformation, rateRequestShipment.promotionalDiscountInformation) &&
        Objects.equals(this.deliveryTimeInformation, rateRequestShipment.deliveryTimeInformation) &&
        Objects.equals(this.masterCartonIndicator, rateRequestShipment.masterCartonIndicator) &&
        Objects.equals(this.wwEShipmentIndicator, rateRequestShipment.wwEShipmentIndicator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(originRecordTransactionTimestamp, shipper, shipTo, shipFrom, alternateDeliveryAddress, shipmentIndicationType, paymentDetails, frSPaymentInformation, freightShipmentInformation, goodsNotInFreeCirculationIndicator, service, numOfPieces, shipmentTotalWeight, documentsOnlyIndicator, _package, shipmentServiceOptions, shipmentRatingOptions, invoiceLineTotal, ratingMethodRequestedIndicator, taxInformationIndicator, promotionalDiscountInformation, deliveryTimeInformation, masterCartonIndicator, wwEShipmentIndicator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateRequestShipment {\n");
    sb.append("    originRecordTransactionTimestamp: ").append(toIndentedString(originRecordTransactionTimestamp)).append("\n");
    sb.append("    shipper: ").append(toIndentedString(shipper)).append("\n");
    sb.append("    shipTo: ").append(toIndentedString(shipTo)).append("\n");
    sb.append("    shipFrom: ").append(toIndentedString(shipFrom)).append("\n");
    sb.append("    alternateDeliveryAddress: ").append(toIndentedString(alternateDeliveryAddress)).append("\n");
    sb.append("    shipmentIndicationType: ").append(toIndentedString(shipmentIndicationType)).append("\n");
    sb.append("    paymentDetails: ").append(toIndentedString(paymentDetails)).append("\n");
    sb.append("    frSPaymentInformation: ").append(toIndentedString(frSPaymentInformation)).append("\n");
    sb.append("    freightShipmentInformation: ").append(toIndentedString(freightShipmentInformation)).append("\n");
    sb.append("    goodsNotInFreeCirculationIndicator: ").append(toIndentedString(goodsNotInFreeCirculationIndicator)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    numOfPieces: ").append(toIndentedString(numOfPieces)).append("\n");
    sb.append("    shipmentTotalWeight: ").append(toIndentedString(shipmentTotalWeight)).append("\n");
    sb.append("    documentsOnlyIndicator: ").append(toIndentedString(documentsOnlyIndicator)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    shipmentServiceOptions: ").append(toIndentedString(shipmentServiceOptions)).append("\n");
    sb.append("    shipmentRatingOptions: ").append(toIndentedString(shipmentRatingOptions)).append("\n");
    sb.append("    invoiceLineTotal: ").append(toIndentedString(invoiceLineTotal)).append("\n");
    sb.append("    ratingMethodRequestedIndicator: ").append(toIndentedString(ratingMethodRequestedIndicator)).append("\n");
    sb.append("    taxInformationIndicator: ").append(toIndentedString(taxInformationIndicator)).append("\n");
    sb.append("    promotionalDiscountInformation: ").append(toIndentedString(promotionalDiscountInformation)).append("\n");
    sb.append("    deliveryTimeInformation: ").append(toIndentedString(deliveryTimeInformation)).append("\n");
    sb.append("    masterCartonIndicator: ").append(toIndentedString(masterCartonIndicator)).append("\n");
    sb.append("    wwEShipmentIndicator: ").append(toIndentedString(wwEShipmentIndicator)).append("\n");
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
