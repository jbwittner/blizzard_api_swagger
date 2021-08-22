/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.5.0
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
import fr.jbwittner.blizzardswagger.wowretailapi.model.NameData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.TypeData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Data of realm
 */
@ApiModel(description = "Data of realm")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-22T18:57:03.260882+02:00[Europe/Paris]")
public class RealmData {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private IndexData region;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameData name;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private NameData category;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeData type;

  public static final String SERIALIZED_NAME_IS_TOURNAMENT = "is_tournament";
  @SerializedName(SERIALIZED_NAME_IS_TOURNAMENT)
  private Boolean isTournament;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;


  public RealmData id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the realm
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Id of the realm")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public RealmData region(IndexData region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @ApiModelProperty(required = true, value = "")

  public IndexData getRegion() {
    return region;
  }


  public void setRegion(IndexData region) {
    this.region = region;
  }


  public RealmData name(NameData name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public NameData getName() {
    return name;
  }


  public void setName(NameData name) {
    this.name = name;
  }


  public RealmData category(NameData category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @ApiModelProperty(required = true, value = "")

  public NameData getCategory() {
    return category;
  }


  public void setCategory(NameData category) {
    this.category = category;
  }


  public RealmData locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Locale of the realm
   * @return locale
  **/
  @ApiModelProperty(required = true, value = "Locale of the realm")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public RealmData timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone of the realm
   * @return timezone
  **/
  @ApiModelProperty(required = true, value = "Timezone of the realm")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public RealmData type(TypeData type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")

  public TypeData getType() {
    return type;
  }


  public void setType(TypeData type) {
    this.type = type;
  }


  public RealmData isTournament(Boolean isTournament) {
    
    this.isTournament = isTournament;
    return this;
  }

   /**
   * Is true if the realm is a tournament realm
   * @return isTournament
  **/
  @ApiModelProperty(required = true, value = "Is true if the realm is a tournament realm")

  public Boolean getIsTournament() {
    return isTournament;
  }


  public void setIsTournament(Boolean isTournament) {
    this.isTournament = isTournament;
  }


  public RealmData slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Slug of the realm
   * @return slug
  **/
  @ApiModelProperty(required = true, value = "Slug of the realm")

  public String getSlug() {
    return slug;
  }


  public void setSlug(String slug) {
    this.slug = slug;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RealmData realmData = (RealmData) o;
    return Objects.equals(this.id, realmData.id) &&
        Objects.equals(this.region, realmData.region) &&
        Objects.equals(this.name, realmData.name) &&
        Objects.equals(this.category, realmData.category) &&
        Objects.equals(this.locale, realmData.locale) &&
        Objects.equals(this.timezone, realmData.timezone) &&
        Objects.equals(this.type, realmData.type) &&
        Objects.equals(this.isTournament, realmData.isTournament) &&
        Objects.equals(this.slug, realmData.slug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, region, name, category, locale, timezone, type, isTournament, slug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealmData {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isTournament: ").append(toIndentedString(isTournament)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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

