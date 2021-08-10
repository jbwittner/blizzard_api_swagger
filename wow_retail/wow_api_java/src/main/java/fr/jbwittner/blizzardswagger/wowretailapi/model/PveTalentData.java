/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.4.1
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
import fr.jbwittner.blizzardswagger.wowretailapi.model.PveSpellDescritpionData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.TalentData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PVE Talent data
 */
@ApiModel(description = "PVE Talent data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-11T00:02:08.408565+02:00[Europe/Paris]")
public class PveTalentData {
  public static final String SERIALIZED_NAME_COLUMN_INDEX = "column_index";
  @SerializedName(SERIALIZED_NAME_COLUMN_INDEX)
  private Integer columnIndex;

  public static final String SERIALIZED_NAME_TALENT = "talent";
  @SerializedName(SERIALIZED_NAME_TALENT)
  private TalentData talent;

  public static final String SERIALIZED_NAME_SPELL_TOOLTIP = "spell_tooltip";
  @SerializedName(SERIALIZED_NAME_SPELL_TOOLTIP)
  private PveSpellDescritpionData spellTooltip;


  public PveTalentData columnIndex(Integer columnIndex) {
    
    this.columnIndex = columnIndex;
    return this;
  }

   /**
   * Id of the talent
   * @return columnIndex
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the talent")

  public Integer getColumnIndex() {
    return columnIndex;
  }


  public void setColumnIndex(Integer columnIndex) {
    this.columnIndex = columnIndex;
  }


  public PveTalentData talent(TalentData talent) {
    
    this.talent = talent;
    return this;
  }

   /**
   * Get talent
   * @return talent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TalentData getTalent() {
    return talent;
  }


  public void setTalent(TalentData talent) {
    this.talent = talent;
  }


  public PveTalentData spellTooltip(PveSpellDescritpionData spellTooltip) {
    
    this.spellTooltip = spellTooltip;
    return this;
  }

   /**
   * Get spellTooltip
   * @return spellTooltip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PveSpellDescritpionData getSpellTooltip() {
    return spellTooltip;
  }


  public void setSpellTooltip(PveSpellDescritpionData spellTooltip) {
    this.spellTooltip = spellTooltip;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PveTalentData pveTalentData = (PveTalentData) o;
    return Objects.equals(this.columnIndex, pveTalentData.columnIndex) &&
        Objects.equals(this.talent, pveTalentData.talent) &&
        Objects.equals(this.spellTooltip, pveTalentData.spellTooltip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnIndex, talent, spellTooltip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PveTalentData {\n");
    sb.append("    columnIndex: ").append(toIndentedString(columnIndex)).append("\n");
    sb.append("    talent: ").append(toIndentedString(talent)).append("\n");
    sb.append("    spellTooltip: ").append(toIndentedString(spellTooltip)).append("\n");
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

