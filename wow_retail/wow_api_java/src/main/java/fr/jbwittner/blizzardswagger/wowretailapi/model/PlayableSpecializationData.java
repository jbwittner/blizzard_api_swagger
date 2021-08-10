/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.4.0
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
import fr.jbwittner.blizzardswagger.wowretailapi.model.PveTalentTiersData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.PvpTalentTiersData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.TypeData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Playable specilization data
 */
@ApiModel(description = "Playable specilization data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-10T23:19:46.170201+02:00[Europe/Paris]")
public class PlayableSpecializationData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PLAYABLE_CLASS = "playable_class";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_CLASS)
  private IndexData playableClass;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameData name;

  public static final String SERIALIZED_NAME_GENDER_DESCRIPTION = "gender_description";
  @SerializedName(SERIALIZED_NAME_GENDER_DESCRIPTION)
  private GenderData genderDescription;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private TypeData role;

  public static final String SERIALIZED_NAME_TALENT_TIERS = "talent_tiers";
  @SerializedName(SERIALIZED_NAME_TALENT_TIERS)
  private List<PveTalentTiersData> talentTiers = null;

  public static final String SERIALIZED_NAME_PVP_TALENTS = "pvp_talents";
  @SerializedName(SERIALIZED_NAME_PVP_TALENTS)
  private List<PvpTalentTiersData> pvpTalents = null;


  public PlayableSpecializationData id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the specilization
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the specilization")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public PlayableSpecializationData playableClass(IndexData playableClass) {
    
    this.playableClass = playableClass;
    return this;
  }

   /**
   * Get playableClass
   * @return playableClass
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndexData getPlayableClass() {
    return playableClass;
  }


  public void setPlayableClass(IndexData playableClass) {
    this.playableClass = playableClass;
  }


  public PlayableSpecializationData name(NameData name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NameData getName() {
    return name;
  }


  public void setName(NameData name) {
    this.name = name;
  }


  public PlayableSpecializationData genderDescription(GenderData genderDescription) {
    
    this.genderDescription = genderDescription;
    return this;
  }

   /**
   * Get genderDescription
   * @return genderDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GenderData getGenderDescription() {
    return genderDescription;
  }


  public void setGenderDescription(GenderData genderDescription) {
    this.genderDescription = genderDescription;
  }


  public PlayableSpecializationData role(TypeData role) {
    
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TypeData getRole() {
    return role;
  }


  public void setRole(TypeData role) {
    this.role = role;
  }


  public PlayableSpecializationData talentTiers(List<PveTalentTiersData> talentTiers) {
    
    this.talentTiers = talentTiers;
    return this;
  }

  public PlayableSpecializationData addTalentTiersItem(PveTalentTiersData talentTiersItem) {
    if (this.talentTiers == null) {
      this.talentTiers = new ArrayList<PveTalentTiersData>();
    }
    this.talentTiers.add(talentTiersItem);
    return this;
  }

   /**
   * Get talentTiers
   * @return talentTiers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PveTalentTiersData> getTalentTiers() {
    return talentTiers;
  }


  public void setTalentTiers(List<PveTalentTiersData> talentTiers) {
    this.talentTiers = talentTiers;
  }


  public PlayableSpecializationData pvpTalents(List<PvpTalentTiersData> pvpTalents) {
    
    this.pvpTalents = pvpTalents;
    return this;
  }

  public PlayableSpecializationData addPvpTalentsItem(PvpTalentTiersData pvpTalentsItem) {
    if (this.pvpTalents == null) {
      this.pvpTalents = new ArrayList<PvpTalentTiersData>();
    }
    this.pvpTalents.add(pvpTalentsItem);
    return this;
  }

   /**
   * Get pvpTalents
   * @return pvpTalents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<PvpTalentTiersData> getPvpTalents() {
    return pvpTalents;
  }


  public void setPvpTalents(List<PvpTalentTiersData> pvpTalents) {
    this.pvpTalents = pvpTalents;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayableSpecializationData playableSpecializationData = (PlayableSpecializationData) o;
    return Objects.equals(this.id, playableSpecializationData.id) &&
        Objects.equals(this.playableClass, playableSpecializationData.playableClass) &&
        Objects.equals(this.name, playableSpecializationData.name) &&
        Objects.equals(this.genderDescription, playableSpecializationData.genderDescription) &&
        Objects.equals(this.role, playableSpecializationData.role) &&
        Objects.equals(this.talentTiers, playableSpecializationData.talentTiers) &&
        Objects.equals(this.pvpTalents, playableSpecializationData.pvpTalents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, playableClass, name, genderDescription, role, talentTiers, pvpTalents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayableSpecializationData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    playableClass: ").append(toIndentedString(playableClass)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    genderDescription: ").append(toIndentedString(genderDescription)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    talentTiers: ").append(toIndentedString(talentTiers)).append("\n");
    sb.append("    pvpTalents: ").append(toIndentedString(pvpTalents)).append("\n");
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

