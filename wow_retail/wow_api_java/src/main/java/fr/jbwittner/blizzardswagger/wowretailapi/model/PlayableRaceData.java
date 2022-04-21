/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.8.1
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
import fr.jbwittner.blizzardswagger.wowretailapi.model.TypeData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Playable race data
 */
@ApiModel(description = "Playable race data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlayableRaceData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private Object name;

  public static final String SERIALIZED_NAME_GENDER_NAME = "gender_name";
  @SerializedName(SERIALIZED_NAME_GENDER_NAME)
  private GenderData genderName;

  public static final String SERIALIZED_NAME_FACTION = "faction";
  @SerializedName(SERIALIZED_NAME_FACTION)
  private TypeData faction;

  public static final String SERIALIZED_NAME_IS_SELECTABLE = "is_selectable";
  @SerializedName(SERIALIZED_NAME_IS_SELECTABLE)
  private Boolean isSelectable;

  public static final String SERIALIZED_NAME_IS_ALLIED_RACE = "is_allied_race";
  @SerializedName(SERIALIZED_NAME_IS_ALLIED_RACE)
  private Boolean isAlliedRace;

  public PlayableRaceData() { 
  }

  public PlayableRaceData id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the race
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Id of the race")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public PlayableRaceData name(Object name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Object getName() {
    return name;
  }


  public void setName(Object name) {
    this.name = name;
  }


  public PlayableRaceData genderName(GenderData genderName) {
    
    this.genderName = genderName;
    return this;
  }

   /**
   * Get genderName
   * @return genderName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public GenderData getGenderName() {
    return genderName;
  }


  public void setGenderName(GenderData genderName) {
    this.genderName = genderName;
  }


  public PlayableRaceData faction(TypeData faction) {
    
    this.faction = faction;
    return this;
  }

   /**
   * Get faction
   * @return faction
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public TypeData getFaction() {
    return faction;
  }


  public void setFaction(TypeData faction) {
    this.faction = faction;
  }


  public PlayableRaceData isSelectable(Boolean isSelectable) {
    
    this.isSelectable = isSelectable;
    return this;
  }

   /**
   * Get isSelectable
   * @return isSelectable
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsSelectable() {
    return isSelectable;
  }


  public void setIsSelectable(Boolean isSelectable) {
    this.isSelectable = isSelectable;
  }


  public PlayableRaceData isAlliedRace(Boolean isAlliedRace) {
    
    this.isAlliedRace = isAlliedRace;
    return this;
  }

   /**
   * Get isAlliedRace
   * @return isAlliedRace
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getIsAlliedRace() {
    return isAlliedRace;
  }


  public void setIsAlliedRace(Boolean isAlliedRace) {
    this.isAlliedRace = isAlliedRace;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayableRaceData playableRaceData = (PlayableRaceData) o;
    return Objects.equals(this.id, playableRaceData.id) &&
        Objects.equals(this.name, playableRaceData.name) &&
        Objects.equals(this.genderName, playableRaceData.genderName) &&
        Objects.equals(this.faction, playableRaceData.faction) &&
        Objects.equals(this.isSelectable, playableRaceData.isSelectable) &&
        Objects.equals(this.isAlliedRace, playableRaceData.isAlliedRace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, genderName, faction, isSelectable, isAlliedRace);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayableRaceData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    genderName: ").append(toIndentedString(genderName)).append("\n");
    sb.append("    faction: ").append(toIndentedString(faction)).append("\n");
    sb.append("    isSelectable: ").append(toIndentedString(isSelectable)).append("\n");
    sb.append("    isAlliedRace: ").append(toIndentedString(isAlliedRace)).append("\n");
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

