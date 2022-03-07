/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.5.6
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
import fr.jbwittner.blizzardswagger.wowretailapi.model.RealmIndexData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.TypeData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Index of guild character
 */
@ApiModel(description = "Index of guild character")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GuildCharacterIndexData {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_REALM = "realm";
  @SerializedName(SERIALIZED_NAME_REALM)
  private RealmIndexData realm;

  public static final String SERIALIZED_NAME_FACTION = "faction";
  @SerializedName(SERIALIZED_NAME_FACTION)
  private TypeData faction;

  public GuildCharacterIndexData() { 
  }

  public GuildCharacterIndexData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public GuildCharacterIndexData id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public GuildCharacterIndexData realm(RealmIndexData realm) {
    
    this.realm = realm;
    return this;
  }

   /**
   * Get realm
   * @return realm
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public RealmIndexData getRealm() {
    return realm;
  }


  public void setRealm(RealmIndexData realm) {
    this.realm = realm;
  }


  public GuildCharacterIndexData faction(TypeData faction) {
    
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuildCharacterIndexData guildCharacterIndexData = (GuildCharacterIndexData) o;
    return Objects.equals(this.name, guildCharacterIndexData.name) &&
        Objects.equals(this.id, guildCharacterIndexData.id) &&
        Objects.equals(this.realm, guildCharacterIndexData.realm) &&
        Objects.equals(this.faction, guildCharacterIndexData.faction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, realm, faction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuildCharacterIndexData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    faction: ").append(toIndentedString(faction)).append("\n");
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

