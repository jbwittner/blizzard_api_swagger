/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.5.3
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
import fr.jbwittner.blizzardswagger.wowretailapi.model.GenderData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.IndexData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.NameData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Playable class data
 */
@ApiModel(description = "Playable class data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-22T23:11:12.419220+02:00[Europe/Paris]")
public class PlayableClassData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameData name;

  public static final String SERIALIZED_NAME_GENDER_NAME = "gender_name";
  @SerializedName(SERIALIZED_NAME_GENDER_NAME)
  private GenderData genderName;

  public static final String SERIALIZED_NAME_POWER_TYPE = "power_type";
  @SerializedName(SERIALIZED_NAME_POWER_TYPE)
  private IndexData powerType;

  public static final String SERIALIZED_NAME_SPECIALIZATIONS = "specializations";
  @SerializedName(SERIALIZED_NAME_SPECIALIZATIONS)
  private List<IndexData> specializations = new ArrayList<IndexData>();


  public PlayableClassData id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the class
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Id of the class")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public PlayableClassData name(NameData name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public NameData getName() {
    return name;
  }


  public void setName(NameData name) {
    this.name = name;
  }


  public PlayableClassData genderName(GenderData genderName) {
    
    this.genderName = genderName;
    return this;
  }

   /**
   * Get genderName
   * @return genderName
  **/
  @ApiModelProperty(required = true, value = "")

  public GenderData getGenderName() {
    return genderName;
  }


  public void setGenderName(GenderData genderName) {
    this.genderName = genderName;
  }


  public PlayableClassData powerType(IndexData powerType) {
    
    this.powerType = powerType;
    return this;
  }

   /**
   * Get powerType
   * @return powerType
  **/
  @ApiModelProperty(required = true, value = "")

  public IndexData getPowerType() {
    return powerType;
  }


  public void setPowerType(IndexData powerType) {
    this.powerType = powerType;
  }


  public PlayableClassData specializations(List<IndexData> specializations) {
    
    this.specializations = specializations;
    return this;
  }

  public PlayableClassData addSpecializationsItem(IndexData specializationsItem) {
    this.specializations.add(specializationsItem);
    return this;
  }

   /**
   * Get specializations
   * @return specializations
  **/
  @ApiModelProperty(required = true, value = "")

  public List<IndexData> getSpecializations() {
    return specializations;
  }


  public void setSpecializations(List<IndexData> specializations) {
    this.specializations = specializations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayableClassData playableClassData = (PlayableClassData) o;
    return Objects.equals(this.id, playableClassData.id) &&
        Objects.equals(this.name, playableClassData.name) &&
        Objects.equals(this.genderName, playableClassData.genderName) &&
        Objects.equals(this.powerType, playableClassData.powerType) &&
        Objects.equals(this.specializations, playableClassData.specializations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, genderName, powerType, specializations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayableClassData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    genderName: ").append(toIndentedString(genderName)).append("\n");
    sb.append("    powerType: ").append(toIndentedString(powerType)).append("\n");
    sb.append("    specializations: ").append(toIndentedString(specializations)).append("\n");
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

