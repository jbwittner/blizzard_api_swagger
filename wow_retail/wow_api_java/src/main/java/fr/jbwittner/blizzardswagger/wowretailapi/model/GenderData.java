/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.1
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
import fr.jbwittner.blizzardswagger.wowretailapi.model.NameData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Gender data
 */
@ApiModel(description = "Gender data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-09T14:40:18.750348+02:00[Europe/Paris]")
public class GenderData {
  public static final String SERIALIZED_NAME_MALE = "male";
  @SerializedName(SERIALIZED_NAME_MALE)
  private NameData male;

  public static final String SERIALIZED_NAME_FEMALE = "female";
  @SerializedName(SERIALIZED_NAME_FEMALE)
  private NameData female;


  public GenderData male(NameData male) {
    
    this.male = male;
    return this;
  }

   /**
   * Get male
   * @return male
  **/
  @ApiModelProperty(required = true, value = "")

  public NameData getMale() {
    return male;
  }


  public void setMale(NameData male) {
    this.male = male;
  }


  public GenderData female(NameData female) {
    
    this.female = female;
    return this;
  }

   /**
   * Get female
   * @return female
  **/
  @ApiModelProperty(required = true, value = "")

  public NameData getFemale() {
    return female;
  }


  public void setFemale(NameData female) {
    this.female = female;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenderData genderData = (GenderData) o;
    return Objects.equals(this.male, genderData.male) &&
        Objects.equals(this.female, genderData.female);
  }

  @Override
  public int hashCode() {
    return Objects.hash(male, female);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenderData {\n");
    sb.append("    male: ").append(toIndentedString(male)).append("\n");
    sb.append("    female: ").append(toIndentedString(female)).append("\n");
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

