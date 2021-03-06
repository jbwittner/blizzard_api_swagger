/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.8.1
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

/**
 * Different translations
 */
@ApiModel(description = "Different translations")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NameObjectData {
  public static final String SERIALIZED_NAME_EN_U_S = "en_US";
  @SerializedName(SERIALIZED_NAME_EN_U_S)
  private String enUS;

  public static final String SERIALIZED_NAME_ES_M_X = "es_MX";
  @SerializedName(SERIALIZED_NAME_ES_M_X)
  private String esMX;

  public static final String SERIALIZED_NAME_PT_B_R = "pt_BR";
  @SerializedName(SERIALIZED_NAME_PT_B_R)
  private String ptBR;

  public static final String SERIALIZED_NAME_DE_D_E = "de_DE";
  @SerializedName(SERIALIZED_NAME_DE_D_E)
  private String deDE;

  public static final String SERIALIZED_NAME_EN_G_B = "en_GB";
  @SerializedName(SERIALIZED_NAME_EN_G_B)
  private String enGB;

  public static final String SERIALIZED_NAME_ES_E_S = "es_ES";
  @SerializedName(SERIALIZED_NAME_ES_E_S)
  private String esES;

  public static final String SERIALIZED_NAME_FR_F_R = "fr_FR";
  @SerializedName(SERIALIZED_NAME_FR_F_R)
  private String frFR;

  public static final String SERIALIZED_NAME_IT_I_T = "it_IT";
  @SerializedName(SERIALIZED_NAME_IT_I_T)
  private String itIT;

  public static final String SERIALIZED_NAME_RU_R_U = "ru_RU";
  @SerializedName(SERIALIZED_NAME_RU_R_U)
  private String ruRU;

  public static final String SERIALIZED_NAME_KO_K_R = "ko_KR";
  @SerializedName(SERIALIZED_NAME_KO_K_R)
  private String koKR;

  public static final String SERIALIZED_NAME_ZH_T_W = "zh_TW";
  @SerializedName(SERIALIZED_NAME_ZH_T_W)
  private String zhTW;

  public static final String SERIALIZED_NAME_ZH_C_N = "zh_CN";
  @SerializedName(SERIALIZED_NAME_ZH_C_N)
  private String zhCN;

  public NameObjectData() { 
  }

  public NameObjectData enUS(String enUS) {
    
    this.enUS = enUS;
    return this;
  }

   /**
   * The locale of English (U.S.)
   * @return enUS
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The locale of English (U.S.)")

  public String getEnUS() {
    return enUS;
  }


  public void setEnUS(String enUS) {
    this.enUS = enUS;
  }


  public NameObjectData esMX(String esMX) {
    
    this.esMX = esMX;
    return this;
  }

   /**
   * The locale of mexican Spanish (Mexican)
   * @return esMX
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The locale of mexican Spanish (Mexican)")

  public String getEsMX() {
    return esMX;
  }


  public void setEsMX(String esMX) {
    this.esMX = esMX;
  }


  public NameObjectData ptBR(String ptBR) {
    
    this.ptBR = ptBR;
    return this;
  }

   /**
   * The locale of Portuguese (Brazilian)
   * @return ptBR
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The locale of Portuguese (Brazilian)")

  public String getPtBR() {
    return ptBR;
  }


  public void setPtBR(String ptBR) {
    this.ptBR = ptBR;
  }


  public NameObjectData deDE(String deDE) {
    
    this.deDE = deDE;
    return this;
  }

   /**
   * The locale of German
   * @return deDE
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The locale of German")

  public String getDeDE() {
    return deDE;
  }


  public void setDeDE(String deDE) {
    this.deDE = deDE;
  }


  public NameObjectData enGB(String enGB) {
    
    this.enGB = enGB;
    return this;
  }

   /**
   * The locale of English (U.K.)
   * @return enGB
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The locale of English (U.K.)")

  public String getEnGB() {
    return enGB;
  }


  public void setEnGB(String enGB) {
    this.enGB = enGB;
  }


  public NameObjectData esES(String esES) {
    
    this.esES = esES;
    return this;
  }

   /**
   * The locale of Spanish (Modern)
   * @return esES
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The locale of Spanish (Modern)")

  public String getEsES() {
    return esES;
  }


  public void setEsES(String esES) {
    this.esES = esES;
  }


  public NameObjectData frFR(String frFR) {
    
    this.frFR = frFR;
    return this;
  }

   /**
   * The locale of French
   * @return frFR
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The locale of French")

  public String getFrFR() {
    return frFR;
  }


  public void setFrFR(String frFR) {
    this.frFR = frFR;
  }


  public NameObjectData itIT(String itIT) {
    
    this.itIT = itIT;
    return this;
  }

   /**
   * The locale of Italian
   * @return itIT
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The locale of Italian")

  public String getItIT() {
    return itIT;
  }


  public void setItIT(String itIT) {
    this.itIT = itIT;
  }


  public NameObjectData ruRU(String ruRU) {
    
    this.ruRU = ruRU;
    return this;
  }

   /**
   * The locale of Russian
   * @return ruRU
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The locale of Russian")

  public String getRuRU() {
    return ruRU;
  }


  public void setRuRU(String ruRU) {
    this.ruRU = ruRU;
  }


  public NameObjectData koKR(String koKR) {
    
    this.koKR = koKR;
    return this;
  }

   /**
   * The locale of Korean
   * @return koKR
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The locale of Korean")

  public String getKoKR() {
    return koKR;
  }


  public void setKoKR(String koKR) {
    this.koKR = koKR;
  }


  public NameObjectData zhTW(String zhTW) {
    
    this.zhTW = zhTW;
    return this;
  }

   /**
   * The locale of Chinese (Taiwan/Traditional)
   * @return zhTW
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The locale of Chinese (Taiwan/Traditional)")

  public String getZhTW() {
    return zhTW;
  }


  public void setZhTW(String zhTW) {
    this.zhTW = zhTW;
  }


  public NameObjectData zhCN(String zhCN) {
    
    this.zhCN = zhCN;
    return this;
  }

   /**
   * The locale of Chinese (Simplified)
   * @return zhCN
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The locale of Chinese (Simplified)")

  public String getZhCN() {
    return zhCN;
  }


  public void setZhCN(String zhCN) {
    this.zhCN = zhCN;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameObjectData nameObjectData = (NameObjectData) o;
    return Objects.equals(this.enUS, nameObjectData.enUS) &&
        Objects.equals(this.esMX, nameObjectData.esMX) &&
        Objects.equals(this.ptBR, nameObjectData.ptBR) &&
        Objects.equals(this.deDE, nameObjectData.deDE) &&
        Objects.equals(this.enGB, nameObjectData.enGB) &&
        Objects.equals(this.esES, nameObjectData.esES) &&
        Objects.equals(this.frFR, nameObjectData.frFR) &&
        Objects.equals(this.itIT, nameObjectData.itIT) &&
        Objects.equals(this.ruRU, nameObjectData.ruRU) &&
        Objects.equals(this.koKR, nameObjectData.koKR) &&
        Objects.equals(this.zhTW, nameObjectData.zhTW) &&
        Objects.equals(this.zhCN, nameObjectData.zhCN);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enUS, esMX, ptBR, deDE, enGB, esES, frFR, itIT, ruRU, koKR, zhTW, zhCN);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameObjectData {\n");
    sb.append("    enUS: ").append(toIndentedString(enUS)).append("\n");
    sb.append("    esMX: ").append(toIndentedString(esMX)).append("\n");
    sb.append("    ptBR: ").append(toIndentedString(ptBR)).append("\n");
    sb.append("    deDE: ").append(toIndentedString(deDE)).append("\n");
    sb.append("    enGB: ").append(toIndentedString(enGB)).append("\n");
    sb.append("    esES: ").append(toIndentedString(esES)).append("\n");
    sb.append("    frFR: ").append(toIndentedString(frFR)).append("\n");
    sb.append("    itIT: ").append(toIndentedString(itIT)).append("\n");
    sb.append("    ruRU: ").append(toIndentedString(ruRU)).append("\n");
    sb.append("    koKR: ").append(toIndentedString(koKR)).append("\n");
    sb.append("    zhTW: ").append(toIndentedString(zhTW)).append("\n");
    sb.append("    zhCN: ").append(toIndentedString(zhCN)).append("\n");
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

