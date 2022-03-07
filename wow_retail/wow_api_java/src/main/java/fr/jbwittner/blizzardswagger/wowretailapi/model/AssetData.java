/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.5.3
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.net.URI;

/**
 * Asset of media
 */
@ApiModel(description = "Asset of media")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AssetData {
  /**
   * Type of media
   */
  @JsonAdapter(KeyEnum.Adapter.class)
  public enum KeyEnum {
    AVATAR("avatar"),
    
    INSET("inset"),
    
    MAIN("main"),
    
    MAIN_RAW("main-raw"),
    
    ICON("icon");

    private String value;

    KeyEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static KeyEnum fromValue(String value) {
      for (KeyEnum b : KeyEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<KeyEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final KeyEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public KeyEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return KeyEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private KeyEnum key;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private URI value;

  public static final String SERIALIZED_NAME_FILE_DATA_ID = "file_data_id";
  @SerializedName(SERIALIZED_NAME_FILE_DATA_ID)
  private Integer fileDataId;

  public AssetData() { 
  }

  public AssetData key(KeyEnum key) {
    
    this.key = key;
    return this;
  }

   /**
   * Type of media
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Type of media")

  public KeyEnum getKey() {
    return key;
  }


  public void setKey(KeyEnum key) {
    this.key = key;
  }


  public AssetData value(URI value) {
    
    this.value = value;
    return this;
  }

   /**
   * Uri of the media
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Uri of the media")

  public URI getValue() {
    return value;
  }


  public void setValue(URI value) {
    this.value = value;
  }


  public AssetData fileDataId(Integer fileDataId) {
    
    this.fileDataId = fileDataId;
    return this;
  }

   /**
   * File id
   * @return fileDataId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "File id")

  public Integer getFileDataId() {
    return fileDataId;
  }


  public void setFileDataId(Integer fileDataId) {
    this.fileDataId = fileDataId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssetData assetData = (AssetData) o;
    return Objects.equals(this.key, assetData.key) &&
        Objects.equals(this.value, assetData.value) &&
        Objects.equals(this.fileDataId, assetData.fileDataId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, value, fileDataId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssetData {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    fileDataId: ").append(toIndentedString(fileDataId)).append("\n");
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

