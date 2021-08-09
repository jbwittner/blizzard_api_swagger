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
import fr.jbwittner.blizzardswagger.wowretailapi.model.IndexData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Array of covenant index
 */
@ApiModel(description = "Array of covenant index")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-09T13:36:41.331638+02:00[Europe/Paris]")
public class ArrayCovenantIndexData {
  public static final String SERIALIZED_NAME_CLASSES = "classes";
  @SerializedName(SERIALIZED_NAME_CLASSES)
  private List<IndexData> classes = null;


  public ArrayCovenantIndexData classes(List<IndexData> classes) {
    
    this.classes = classes;
    return this;
  }

  public ArrayCovenantIndexData addClassesItem(IndexData classesItem) {
    if (this.classes == null) {
      this.classes = new ArrayList<IndexData>();
    }
    this.classes.add(classesItem);
    return this;
  }

   /**
   * Get classes
   * @return classes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IndexData> getClasses() {
    return classes;
  }


  public void setClasses(List<IndexData> classes) {
    this.classes = classes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArrayCovenantIndexData arrayCovenantIndexData = (ArrayCovenantIndexData) o;
    return Objects.equals(this.classes, arrayCovenantIndexData.classes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArrayCovenantIndexData {\n");
    sb.append("    classes: ").append(toIndentedString(classes)).append("\n");
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
