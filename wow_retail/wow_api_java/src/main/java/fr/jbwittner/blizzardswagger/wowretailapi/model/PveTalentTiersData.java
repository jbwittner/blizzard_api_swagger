/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.7.0
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
import fr.jbwittner.blizzardswagger.wowretailapi.model.PveTalentData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * PVE Talent tiers data
 */
@ApiModel(description = "PVE Talent tiers data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PveTalentTiersData {
  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public static final String SERIALIZED_NAME_TALENTS = "talents";
  @SerializedName(SERIALIZED_NAME_TALENTS)
  private List<PveTalentData> talents = null;

  public static final String SERIALIZED_NAME_TIER_INDEX = "tier_index";
  @SerializedName(SERIALIZED_NAME_TIER_INDEX)
  private Integer tierIndex;

  public PveTalentTiersData() { 
  }

  public PveTalentTiersData level(Integer level) {
    
    this.level = level;
    return this;
  }

   /**
   * Level where the talents are obtained
   * @return level
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Level where the talents are obtained")

  public Integer getLevel() {
    return level;
  }


  public void setLevel(Integer level) {
    this.level = level;
  }


  public PveTalentTiersData talents(List<PveTalentData> talents) {
    
    this.talents = talents;
    return this;
  }

  public PveTalentTiersData addTalentsItem(PveTalentData talentsItem) {
    if (this.talents == null) {
      this.talents = new ArrayList<>();
    }
    this.talents.add(talentsItem);
    return this;
  }

   /**
   * Get talents
   * @return talents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PveTalentData> getTalents() {
    return talents;
  }


  public void setTalents(List<PveTalentData> talents) {
    this.talents = talents;
  }


  public PveTalentTiersData tierIndex(Integer tierIndex) {
    
    this.tierIndex = tierIndex;
    return this;
  }

   /**
   * Id of the talent
   * @return tierIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the talent")

  public Integer getTierIndex() {
    return tierIndex;
  }


  public void setTierIndex(Integer tierIndex) {
    this.tierIndex = tierIndex;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PveTalentTiersData pveTalentTiersData = (PveTalentTiersData) o;
    return Objects.equals(this.level, pveTalentTiersData.level) &&
        Objects.equals(this.talents, pveTalentTiersData.talents) &&
        Objects.equals(this.tierIndex, pveTalentTiersData.tierIndex);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, talents, tierIndex);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PveTalentTiersData {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    talents: ").append(toIndentedString(talents)).append("\n");
    sb.append("    tierIndex: ").append(toIndentedString(tierIndex)).append("\n");
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

