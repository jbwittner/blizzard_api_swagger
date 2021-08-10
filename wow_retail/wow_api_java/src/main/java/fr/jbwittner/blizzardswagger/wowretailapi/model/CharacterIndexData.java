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
import fr.jbwittner.blizzardswagger.wowretailapi.model.IndexData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.RealmIndexData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.TypeData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Index of character
 */
@ApiModel(description = "Index of character")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-11T00:02:08.408565+02:00[Europe/Paris]")
public class CharacterIndexData {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_REALM = "realm";
  @SerializedName(SERIALIZED_NAME_REALM)
  private RealmIndexData realm;

  public static final String SERIALIZED_NAME_PLAYABLE_CLASS = "playable_class";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_CLASS)
  private IndexData playableClass;

  public static final String SERIALIZED_NAME_PLAYABLE_RACE = "playable_race";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_RACE)
  private IndexData playableRace;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private TypeData gender;

  public static final String SERIALIZED_NAME_FACTION = "faction";
  @SerializedName(SERIALIZED_NAME_FACTION)
  private TypeData faction;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;


  public CharacterIndexData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CharacterIndexData id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CharacterIndexData realm(RealmIndexData realm) {
    
    this.realm = realm;
    return this;
  }

   /**
   * Get realm
   * @return realm
  **/
  @ApiModelProperty(required = true, value = "")

  public RealmIndexData getRealm() {
    return realm;
  }


  public void setRealm(RealmIndexData realm) {
    this.realm = realm;
  }


  public CharacterIndexData playableClass(IndexData playableClass) {
    
    this.playableClass = playableClass;
    return this;
  }

   /**
   * Get playableClass
   * @return playableClass
  **/
  @ApiModelProperty(required = true, value = "")

  public IndexData getPlayableClass() {
    return playableClass;
  }


  public void setPlayableClass(IndexData playableClass) {
    this.playableClass = playableClass;
  }


  public CharacterIndexData playableRace(IndexData playableRace) {
    
    this.playableRace = playableRace;
    return this;
  }

   /**
   * Get playableRace
   * @return playableRace
  **/
  @ApiModelProperty(required = true, value = "")

  public IndexData getPlayableRace() {
    return playableRace;
  }


  public void setPlayableRace(IndexData playableRace) {
    this.playableRace = playableRace;
  }


  public CharacterIndexData gender(TypeData gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(required = true, value = "")

  public TypeData getGender() {
    return gender;
  }


  public void setGender(TypeData gender) {
    this.gender = gender;
  }


  public CharacterIndexData faction(TypeData faction) {
    
    this.faction = faction;
    return this;
  }

   /**
   * Get faction
   * @return faction
  **/
  @ApiModelProperty(required = true, value = "")

  public TypeData getFaction() {
    return faction;
  }


  public void setFaction(TypeData faction) {
    this.faction = faction;
  }


  public CharacterIndexData level(Integer level) {
    
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getLevel() {
    return level;
  }


  public void setLevel(Integer level) {
    this.level = level;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterIndexData characterIndexData = (CharacterIndexData) o;
    return Objects.equals(this.name, characterIndexData.name) &&
        Objects.equals(this.id, characterIndexData.id) &&
        Objects.equals(this.realm, characterIndexData.realm) &&
        Objects.equals(this.playableClass, characterIndexData.playableClass) &&
        Objects.equals(this.playableRace, characterIndexData.playableRace) &&
        Objects.equals(this.gender, characterIndexData.gender) &&
        Objects.equals(this.faction, characterIndexData.faction) &&
        Objects.equals(this.level, characterIndexData.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, realm, playableClass, playableRace, gender, faction, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterIndexData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    playableClass: ").append(toIndentedString(playableClass)).append("\n");
    sb.append("    playableRace: ").append(toIndentedString(playableRace)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    faction: ").append(toIndentedString(faction)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

