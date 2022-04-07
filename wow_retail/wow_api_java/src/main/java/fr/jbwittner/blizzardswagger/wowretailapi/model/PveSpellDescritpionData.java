/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.8.0
 * Contact: jeanbaptiste.wittner@outlook.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.jbwittner.blizzardswagger.wowretailapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Description of the pve spell
 */
@ApiModel(description = "Description of the pve spell")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PveSpellDescritpionData {
  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private Object description;

  public static final String SERIALIZED_NAME_CAST_TIME = "cast_time";
  @SerializedName(SERIALIZED_NAME_CAST_TIME)
  private Object castTime;

  public static final String SERIALIZED_NAME_COLUMN_INDEX = "column_index";
  @SerializedName(SERIALIZED_NAME_COLUMN_INDEX)
  private Integer columnIndex;

  public PveSpellDescritpionData() { 
  }

  public PveSpellDescritpionData description(Object description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getDescription() {
    return description;
  }


  public void setDescription(Object description) {
    this.description = description;
  }


  public PveSpellDescritpionData castTime(Object castTime) {
    
    this.castTime = castTime;
    return this;
  }

   /**
   * Get castTime
   * @return castTime
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getCastTime() {
    return castTime;
  }


  public void setCastTime(Object castTime) {
    this.castTime = castTime;
  }


  public PveSpellDescritpionData columnIndex(Integer columnIndex) {
    
    this.columnIndex = columnIndex;
    return this;
  }

   /**
   * Index of the spell
   * @return columnIndex
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Index of the spell")

  public Integer getColumnIndex() {
    return columnIndex;
  }


  public void setColumnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PveSpellDescritpionData pveSpellDescritpionData = (PveSpellDescritpionData) o;
    return Objects.equals(this.description, pveSpellDescritpionData.description) &&
        Objects.equals(this.castTime, pveSpellDescritpionData.castTime) &&
        Objects.equals(this.columnIndex, pveSpellDescritpionData.columnIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, castTime, columnIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PveSpellDescritpionData {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    castTime: ").append(toIndentedString(castTime)).append("\n");
    sb.append("    columnIndex: ").append(toIndentedString(columnIndex)).append("\n");
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

