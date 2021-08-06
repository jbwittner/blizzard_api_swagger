/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.1.0
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
import fr.jbwittner.blizzardswagger.wowretailapi.model.IndexDTO;
import fr.jbwittner.blizzardswagger.wowretailapi.model.NameDTO;
import fr.jbwittner.blizzardswagger.wowretailapi.model.RealmTypeDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Data of realm
 */
@ApiModel(description = "Data of realm")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-06T22:01:26.900029+02:00[Europe/Paris]")
public class RealmDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_REGION = "region";
  @SerializedName(SERIALIZED_NAME_REGION)
  private IndexDTO region;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameDTO name;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private NameDTO category;

  public static final String SERIALIZED_NAME_LOCALE = "locale";
  @SerializedName(SERIALIZED_NAME_LOCALE)
  private String locale;

  public static final String SERIALIZED_NAME_TIMEZONE = "timezone";
  @SerializedName(SERIALIZED_NAME_TIMEZONE)
  private String timezone;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private RealmTypeDTO type;

  public static final String SERIALIZED_NAME_IS_TOURNAMENT = "is_tournament";
  @SerializedName(SERIALIZED_NAME_IS_TOURNAMENT)
  private Boolean isTournament;

  public static final String SERIALIZED_NAME_SLUG = "slug";
  @SerializedName(SERIALIZED_NAME_SLUG)
  private String slug;


  public RealmDTO id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Id of the realm
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Id of the realm")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public RealmDTO region(IndexDTO region) {
    
    this.region = region;
    return this;
  }

   /**
   * Get region
   * @return region
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IndexDTO getRegion() {
    return region;
  }


  public void setRegion(IndexDTO region) {
    this.region = region;
  }


  public RealmDTO name(NameDTO name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NameDTO getName() {
    return name;
  }


  public void setName(NameDTO name) {
    this.name = name;
  }


  public RealmDTO category(NameDTO category) {
    
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public NameDTO getCategory() {
    return category;
  }


  public void setCategory(NameDTO category) {
    this.category = category;
  }


  public RealmDTO locale(String locale) {
    
    this.locale = locale;
    return this;
  }

   /**
   * Locale of the realm
   * @return locale
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Locale of the realm")

  public String getLocale() {
    return locale;
  }


  public void setLocale(String locale) {
    this.locale = locale;
  }


  public RealmDTO timezone(String timezone) {
    
    this.timezone = timezone;
    return this;
  }

   /**
   * Timezone of the realm
   * @return timezone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Timezone of the realm")

  public String getTimezone() {
    return timezone;
  }


  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }


  public RealmDTO type(RealmTypeDTO type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public RealmTypeDTO getType() {
    return type;
  }


  public void setType(RealmTypeDTO type) {
    this.type = type;
  }


  public RealmDTO isTournament(Boolean isTournament) {
    
    this.isTournament = isTournament;
    return this;
  }

   /**
   * Is true if the realm is a tournament realm
   * @return isTournament
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Is true if the realm is a tournament realm")

  public Boolean getIsTournament() {
    return isTournament;
  }


  public void setIsTournament(Boolean isTournament) {
    this.isTournament = isTournament;
  }


  public RealmDTO slug(String slug) {
    
    this.slug = slug;
    return this;
  }

   /**
   * Slug of the realm
   * @return slug
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Slug of the realm")

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
    RealmDTO realmDTO = (RealmDTO) o;
    return Objects.equals(this.id, realmDTO.id) &&
        Objects.equals(this.region, realmDTO.region) &&
        Objects.equals(this.name, realmDTO.name) &&
        Objects.equals(this.category, realmDTO.category) &&
        Objects.equals(this.locale, realmDTO.locale) &&
        Objects.equals(this.timezone, realmDTO.timezone) &&
        Objects.equals(this.type, realmDTO.type) &&
        Objects.equals(this.isTournament, realmDTO.isTournament) &&
        Objects.equals(this.slug, realmDTO.slug);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, region, name, category, locale, timezone, type, isTournament, slug);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RealmDTO {\n");
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

