/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.5.1
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
import fr.jbwittner.blizzardswagger.wowretailapi.model.ArrayAssetData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.CharacterMediaIndex;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Character media data
 */
@ApiModel(description = "Character media data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-22T22:07:13.231088+02:00[Europe/Paris]")
public class CharacterMediaData {
  public static final String SERIALIZED_NAME_CHARACTER = "character";
  @SerializedName(SERIALIZED_NAME_CHARACTER)
  private CharacterMediaIndex character;

  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private ArrayAssetData assets;


  public CharacterMediaData character(CharacterMediaIndex character) {
    
    this.character = character;
    return this;
  }

   /**
   * Get character
   * @return character
  **/
  @ApiModelProperty(required = true, value = "")

  public CharacterMediaIndex getCharacter() {
    return character;
  }


  public void setCharacter(CharacterMediaIndex character) {
    this.character = character;
  }


  public CharacterMediaData assets(ArrayAssetData assets) {
    
    this.assets = assets;
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @ApiModelProperty(required = true, value = "")

  public ArrayAssetData getAssets() {
    return assets;
  }


  public void setAssets(ArrayAssetData assets) {
    this.assets = assets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterMediaData characterMediaData = (CharacterMediaData) o;
    return Objects.equals(this.character, characterMediaData.character) &&
        Objects.equals(this.assets, characterMediaData.assets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(character, assets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterMediaData {\n");
    sb.append("    character: ").append(toIndentedString(character)).append("\n");
    sb.append("    assets: ").append(toIndentedString(assets)).append("\n");
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

