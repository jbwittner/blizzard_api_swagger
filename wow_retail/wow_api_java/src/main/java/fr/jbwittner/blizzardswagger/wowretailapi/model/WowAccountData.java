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
import fr.jbwittner.blizzardswagger.wowretailapi.model.CharacterIndexData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Data of wow accounnt
 */
@ApiModel(description = "Data of wow accounnt")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-11T00:02:08.408565+02:00[Europe/Paris]")
public class WowAccountData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_CHARACTERS = "characters";
  @SerializedName(SERIALIZED_NAME_CHARACTERS)
  private List<CharacterIndexData> characters = new ArrayList<CharacterIndexData>();


  public WowAccountData id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the accounnt
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Id of the accounnt")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public WowAccountData characters(List<CharacterIndexData> characters) {
    
    this.characters = characters;
    return this;
  }

  public WowAccountData addCharactersItem(CharacterIndexData charactersItem) {
    this.characters.add(charactersItem);
    return this;
  }

   /**
   * Get characters
   * @return characters
  **/
  @ApiModelProperty(required = true, value = "")

  public List<CharacterIndexData> getCharacters() {
    return characters;
  }


  public void setCharacters(List<CharacterIndexData> characters) {
    this.characters = characters;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WowAccountData wowAccountData = (WowAccountData) o;
    return Objects.equals(this.id, wowAccountData.id) &&
        Objects.equals(this.characters, wowAccountData.characters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, characters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WowAccountData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
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

