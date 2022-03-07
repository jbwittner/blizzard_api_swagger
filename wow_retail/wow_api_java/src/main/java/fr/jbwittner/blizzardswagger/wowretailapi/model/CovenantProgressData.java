/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.6.0
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
import fr.jbwittner.blizzardswagger.wowretailapi.model.IndexData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Covenant progress data
 */
@ApiModel(description = "Covenant progress data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CovenantProgressData {
  public static final String SERIALIZED_NAME_CHOSEN_COVENANT = "chosen_covenant";
  @SerializedName(SERIALIZED_NAME_CHOSEN_COVENANT)
  private IndexData chosenCovenant;

  public static final String SERIALIZED_NAME_RENOWN_LEVEL = "renown_level";
  @SerializedName(SERIALIZED_NAME_RENOWN_LEVEL)
  private Integer renownLevel;

  public CovenantProgressData() { 
  }

  public CovenantProgressData chosenCovenant(IndexData chosenCovenant) {
    
    this.chosenCovenant = chosenCovenant;
    return this;
  }

   /**
   * Get chosenCovenant
   * @return chosenCovenant
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public IndexData getChosenCovenant() {
    return chosenCovenant;
  }


  public void setChosenCovenant(IndexData chosenCovenant) {
    this.chosenCovenant = chosenCovenant;
  }


  public CovenantProgressData renownLevel(Integer renownLevel) {
    
    this.renownLevel = renownLevel;
    return this;
  }

   /**
   * Get renownLevel
   * @return renownLevel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getRenownLevel() {
    return renownLevel;
  }


  public void setRenownLevel(Integer renownLevel) {
    this.renownLevel = renownLevel;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CovenantProgressData covenantProgressData = (CovenantProgressData) o;
    return Objects.equals(this.chosenCovenant, covenantProgressData.chosenCovenant) &&
        Objects.equals(this.renownLevel, covenantProgressData.renownLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chosenCovenant, renownLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CovenantProgressData {\n");
    sb.append("    chosenCovenant: ").append(toIndentedString(chosenCovenant)).append("\n");
    sb.append("    renownLevel: ").append(toIndentedString(renownLevel)).append("\n");
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

