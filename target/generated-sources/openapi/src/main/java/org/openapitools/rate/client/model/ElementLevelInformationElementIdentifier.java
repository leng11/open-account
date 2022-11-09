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
 * Contains more information about the type of element. Returned if Level is &#39;P&#39; or &#39;C&#39;.
 */
@ApiModel(description = "Contains more information about the type of element. Returned if Level is 'P' or 'C'.")
@JsonPropertyOrder({
  ElementLevelInformationElementIdentifier.JSON_PROPERTY_CODE,
  ElementLevelInformationElementIdentifier.JSON_PROPERTY_VALUE
})
@JsonTypeName("ElementLevelInformation_ElementIdentifier")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-11-07T14:45:06.047821600-05:00[America/New_York]")
public class ElementLevelInformationElementIdentifier {
  public static final String JSON_PROPERTY_CODE = "Code";
  private String code;

  public static final String JSON_PROPERTY_VALUE = "Value";
  private String value;

  public ElementLevelInformationElementIdentifier() {
  }

  public ElementLevelInformationElementIdentifier code(String code) {
    
    this.code = code;
    return this;
  }

   /**
   * Represents the type of element. Possible values are &#39;P&#39; and &#39;C&#39;.
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the type of element. Possible values are 'P' and 'C'.")
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


  public ElementLevelInformationElementIdentifier value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * Represents the value of element.
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Represents the value of element.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ElementLevelInformationElementIdentifier elementLevelInformationElementIdentifier = (ElementLevelInformationElementIdentifier) o;
    return Objects.equals(this.code, elementLevelInformationElementIdentifier.code) &&
        Objects.equals(this.value, elementLevelInformationElementIdentifier.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ElementLevelInformationElementIdentifier {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
