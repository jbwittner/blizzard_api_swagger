/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.7.1
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
import fr.jbwittner.blizzardswagger.wowretailapi.model.AssetData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.CharacterMediaIndex;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Character media data
 */
@ApiModel(description = "Character media data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CharacterMediaData {
  public static final String SERIALIZED_NAME_CHARACTER = "character";
  @SerializedName(SERIALIZED_NAME_CHARACTER)
  private CharacterMediaIndex character;

  public static final String SERIALIZED_NAME_AVATAR_URL = "avatar_url";
  @SerializedName(SERIALIZED_NAME_AVATAR_URL)
  private String avatarUrl;

  public static final String SERIALIZED_NAME_BUST_URL = "bust_url";
  @SerializedName(SERIALIZED_NAME_BUST_URL)
  private String bustUrl;

  public static final String SERIALIZED_NAME_RENDER_URL = "render_url";
  @SerializedName(SERIALIZED_NAME_RENDER_URL)
  private String renderUrl;

  public static final String SERIALIZED_NAME_ASSETS = "assets";
  @SerializedName(SERIALIZED_NAME_ASSETS)
  private List<AssetData> assets = null;

  public CharacterMediaData() { 
  }

  public CharacterMediaData character(CharacterMediaIndex character) {
    
    this.character = character;
    return this;
  }

   /**
   * Get character
   * @return character
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public CharacterMediaIndex getCharacter() {
    return character;
  }


  public void setCharacter(CharacterMediaIndex character) {
    this.character = character;
  }


  public CharacterMediaData avatarUrl(String avatarUrl) {
    
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * Get avatarUrl
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAvatarUrl() {
    return avatarUrl;
  }


  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }


  public CharacterMediaData bustUrl(String bustUrl) {
    
    this.bustUrl = bustUrl;
    return this;
  }

   /**
   * Get bustUrl
   * @return bustUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getBustUrl() {
    return bustUrl;
  }


  public void setBustUrl(String bustUrl) {
    this.bustUrl = bustUrl;
  }


  public CharacterMediaData renderUrl(String renderUrl) {
    
    this.renderUrl = renderUrl;
    return this;
  }

   /**
   * Get renderUrl
   * @return renderUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRenderUrl() {
    return renderUrl;
  }


  public void setRenderUrl(String renderUrl) {
    this.renderUrl = renderUrl;
  }


  public CharacterMediaData assets(List<AssetData> assets) {
    
    this.assets = assets;
    return this;
  }

  public CharacterMediaData addAssetsItem(AssetData assetsItem) {
    if (this.assets == null) {
      this.assets = new ArrayList<>();
    }
    this.assets.add(assetsItem);
    return this;
  }

   /**
   * Get assets
   * @return assets
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<AssetData> getAssets() {
    return assets;
  }


  public void setAssets(List<AssetData> assets) {
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
        Objects.equals(this.avatarUrl, characterMediaData.avatarUrl) &&
        Objects.equals(this.bustUrl, characterMediaData.bustUrl) &&
        Objects.equals(this.renderUrl, characterMediaData.renderUrl) &&
        Objects.equals(this.assets, characterMediaData.assets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(character, avatarUrl, bustUrl, renderUrl, assets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterMediaData {\n");
    sb.append("    character: ").append(toIndentedString(character)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    bustUrl: ").append(toIndentedString(bustUrl)).append("\n");
    sb.append("    renderUrl: ").append(toIndentedString(renderUrl)).append("\n");
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

