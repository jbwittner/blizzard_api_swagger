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
import fr.jbwittner.blizzardswagger.wowretailapi.model.RealmIndexData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Array of classes index
 */
@ApiModel(description = "Array of classes index")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-09T13:36:41.331638+02:00[Europe/Paris]")
public class ArrayRealmsIndexData {
  public static final String SERIALIZED_NAME_REALMS = "realms";
  @SerializedName(SERIALIZED_NAME_REALMS)
  private List<RealmIndexData> realms = new ArrayList<RealmIndexData>();


  public ArrayRealmsIndexData realms(List<RealmIndexData> realms) {
    
    this.realms = realms;
    return this;
  }

  public ArrayRealmsIndexData addRealmsItem(RealmIndexData realmsItem) {
    this.realms.add(realmsItem);
    return this;
  }

   /**
   * Get realms
   * @return realms
  **/
  @ApiModelProperty(required = true, value = "")

  public List<RealmIndexData> getRealms() {
    return realms;
  }


  public void setRealms(List<RealmIndexData> realms) {
    this.realms = realms;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayRealmsIndexData arrayRealmsIndexData = (ArrayRealmsIndexData) o;
    return Objects.equals(this.realms, arrayRealmsIndexData.realms);
  }

  @Override
  public int hashCode() {
    return Objects.hash(realms);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayRealmsIndexData {\n");
    sb.append("    realms: ").append(toIndentedString(realms)).append("\n");
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
