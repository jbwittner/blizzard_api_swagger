/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.0
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
import fr.jbwittner.blizzardswagger.wowretailapi.model.PvpSpellDescritpionData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.TalentData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PVP Talent tiers data
 */
@ApiModel(description = "PVP Talent tiers data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-09T13:36:41.331638+02:00[Europe/Paris]")
public class PvpTalentTiersData {
  public static final String SERIALIZED_NAME_TALENT = "talent";
  @SerializedName(SERIALIZED_NAME_TALENT)
  private TalentData talent;

  public static final String SERIALIZED_NAME_SPELL_TOOLTIP = "spell_tooltip";
  @SerializedName(SERIALIZED_NAME_SPELL_TOOLTIP)
  private PvpSpellDescritpionData spellTooltip;


  public PvpTalentTiersData talent(TalentData talent) {
    
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


  public PvpTalentTiersData spellTooltip(PvpSpellDescritpionData spellTooltip) {
    
    this.spellTooltip = spellTooltip;
    return this;
  }

   /**
   * Get spellTooltip
   * @return spellTooltip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PvpSpellDescritpionData getSpellTooltip() {
    return spellTooltip;
  }


  public void setSpellTooltip(PvpSpellDescritpionData spellTooltip) {
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
    PvpTalentTiersData pvpTalentTiersData = (PvpTalentTiersData) o;
    return Objects.equals(this.talent, pvpTalentTiersData.talent) &&
        Objects.equals(this.spellTooltip, pvpTalentTiersData.spellTooltip);
  }

  @Override
  public int hashCode() {
    return Objects.hash(talent, spellTooltip);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PvpTalentTiersData {\n");
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
