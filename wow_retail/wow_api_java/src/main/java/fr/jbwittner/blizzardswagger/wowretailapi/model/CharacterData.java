/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.5.2
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
import fr.jbwittner.blizzardswagger.wowretailapi.model.CovenantProgressData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.GuildCharacterIndexData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.IndexData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.RealmIndexData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.TitleData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.TypeData;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Character data
 */
@ApiModel(description = "Character data")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-22T22:50:08.194478+02:00[Europe/Paris]")
public class CharacterData {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private TypeData gender;

  public static final String SERIALIZED_NAME_FACTION = "faction";
  @SerializedName(SERIALIZED_NAME_FACTION)
  private TypeData faction;

  public static final String SERIALIZED_NAME_RACE = "race";
  @SerializedName(SERIALIZED_NAME_RACE)
  private IndexData race;

  public static final String SERIALIZED_NAME_CHARACTER_CLASS = "character_class";
  @SerializedName(SERIALIZED_NAME_CHARACTER_CLASS)
  private IndexData characterClass;

  public static final String SERIALIZED_NAME_ACTIVE_SPEC = "active_spec";
  @SerializedName(SERIALIZED_NAME_ACTIVE_SPEC)
  private IndexData activeSpec;

  public static final String SERIALIZED_NAME_REALM = "realm";
  @SerializedName(SERIALIZED_NAME_REALM)
  private RealmIndexData realm;

  public static final String SERIALIZED_NAME_GUILD = "guild";
  @SerializedName(SERIALIZED_NAME_GUILD)
  private GuildCharacterIndexData guild;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public static final String SERIALIZED_NAME_EXPERIENCE = "experience";
  @SerializedName(SERIALIZED_NAME_EXPERIENCE)
  private Integer experience;

  public static final String SERIALIZED_NAME_ACHIEVEMENT_POINTS = "achievement_points";
  @SerializedName(SERIALIZED_NAME_ACHIEVEMENT_POINTS)
  private Integer achievementPoints;

  public static final String SERIALIZED_NAME_LAST_LOGIN_TIMESTAMP = "last_login_timestamp";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN_TIMESTAMP)
  private Long lastLoginTimestamp;

  public static final String SERIALIZED_NAME_AVERAGE_ITEM_LEVEL = "average_item_level";
  @SerializedName(SERIALIZED_NAME_AVERAGE_ITEM_LEVEL)
  private Integer averageItemLevel;

  public static final String SERIALIZED_NAME_EQUIPPED_ITEM_LEVEL = "equipped_item_level";
  @SerializedName(SERIALIZED_NAME_EQUIPPED_ITEM_LEVEL)
  private Integer equippedItemLevel;

  public static final String SERIALIZED_NAME_ACTIVE_TITLE = "active_title";
  @SerializedName(SERIALIZED_NAME_ACTIVE_TITLE)
  private TitleData activeTitle;

  public static final String SERIALIZED_NAME_COVENANT_PROGRESS = "covenant_progress";
  @SerializedName(SERIALIZED_NAME_COVENANT_PROGRESS)
  private CovenantProgressData covenantProgress;


  public CharacterData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public CharacterData id(Integer id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getId() {
    return id;
  }


  public void setId(Integer id) {
    this.id = id;
  }


  public CharacterData gender(TypeData gender) {
    
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @ApiModelProperty(required = true, value = "")

  public TypeData getGender() {
    return gender;
  }


  public void setGender(TypeData gender) {
    this.gender = gender;
  }


  public CharacterData faction(TypeData faction) {
    
    this.faction = faction;
    return this;
  }

   /**
   * Get faction
   * @return faction
  **/
  @ApiModelProperty(required = true, value = "")

  public TypeData getFaction() {
    return faction;
  }


  public void setFaction(TypeData faction) {
    this.faction = faction;
  }


  public CharacterData race(IndexData race) {
    
    this.race = race;
    return this;
  }

   /**
   * Get race
   * @return race
  **/
  @ApiModelProperty(required = true, value = "")

  public IndexData getRace() {
    return race;
  }


  public void setRace(IndexData race) {
    this.race = race;
  }


  public CharacterData characterClass(IndexData characterClass) {
    
    this.characterClass = characterClass;
    return this;
  }

   /**
   * Get characterClass
   * @return characterClass
  **/
  @ApiModelProperty(required = true, value = "")

  public IndexData getCharacterClass() {
    return characterClass;
  }


  public void setCharacterClass(IndexData characterClass) {
    this.characterClass = characterClass;
  }


  public CharacterData activeSpec(IndexData activeSpec) {
    
    this.activeSpec = activeSpec;
    return this;
  }

   /**
   * Get activeSpec
   * @return activeSpec
  **/
  @ApiModelProperty(required = true, value = "")

  public IndexData getActiveSpec() {
    return activeSpec;
  }


  public void setActiveSpec(IndexData activeSpec) {
    this.activeSpec = activeSpec;
  }


  public CharacterData realm(RealmIndexData realm) {
    
    this.realm = realm;
    return this;
  }

   /**
   * Get realm
   * @return realm
  **/
  @ApiModelProperty(required = true, value = "")

  public RealmIndexData getRealm() {
    return realm;
  }


  public void setRealm(RealmIndexData realm) {
    this.realm = realm;
  }


  public CharacterData guild(GuildCharacterIndexData guild) {
    
    this.guild = guild;
    return this;
  }

   /**
   * Get guild
   * @return guild
  **/
  @ApiModelProperty(required = true, value = "")

  public GuildCharacterIndexData getGuild() {
    return guild;
  }


  public void setGuild(GuildCharacterIndexData guild) {
    this.guild = guild;
  }


  public CharacterData level(Integer level) {
    
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getLevel() {
    return level;
  }


  public void setLevel(Integer level) {
    this.level = level;
  }


  public CharacterData experience(Integer experience) {
    
    this.experience = experience;
    return this;
  }

   /**
   * Get experience
   * @return experience
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getExperience() {
    return experience;
  }


  public void setExperience(Integer experience) {
    this.experience = experience;
  }


  public CharacterData achievementPoints(Integer achievementPoints) {
    
    this.achievementPoints = achievementPoints;
    return this;
  }

   /**
   * Get achievementPoints
   * @return achievementPoints
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getAchievementPoints() {
    return achievementPoints;
  }


  public void setAchievementPoints(Integer achievementPoints) {
    this.achievementPoints = achievementPoints;
  }


  public CharacterData lastLoginTimestamp(Long lastLoginTimestamp) {
    
    this.lastLoginTimestamp = lastLoginTimestamp;
    return this;
  }

   /**
   * Get lastLoginTimestamp
   * @return lastLoginTimestamp
  **/
  @ApiModelProperty(required = true, value = "")

  public Long getLastLoginTimestamp() {
    return lastLoginTimestamp;
  }


  public void setLastLoginTimestamp(Long lastLoginTimestamp) {
    this.lastLoginTimestamp = lastLoginTimestamp;
  }


  public CharacterData averageItemLevel(Integer averageItemLevel) {
    
    this.averageItemLevel = averageItemLevel;
    return this;
  }

   /**
   * Get averageItemLevel
   * @return averageItemLevel
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getAverageItemLevel() {
    return averageItemLevel;
  }


  public void setAverageItemLevel(Integer averageItemLevel) {
    this.averageItemLevel = averageItemLevel;
  }


  public CharacterData equippedItemLevel(Integer equippedItemLevel) {
    
    this.equippedItemLevel = equippedItemLevel;
    return this;
  }

   /**
   * Get equippedItemLevel
   * @return equippedItemLevel
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getEquippedItemLevel() {
    return equippedItemLevel;
  }


  public void setEquippedItemLevel(Integer equippedItemLevel) {
    this.equippedItemLevel = equippedItemLevel;
  }


  public CharacterData activeTitle(TitleData activeTitle) {
    
    this.activeTitle = activeTitle;
    return this;
  }

   /**
   * Get activeTitle
   * @return activeTitle
  **/
  @ApiModelProperty(required = true, value = "")

  public TitleData getActiveTitle() {
    return activeTitle;
  }


  public void setActiveTitle(TitleData activeTitle) {
    this.activeTitle = activeTitle;
  }


  public CharacterData covenantProgress(CovenantProgressData covenantProgress) {
    
    this.covenantProgress = covenantProgress;
    return this;
  }

   /**
   * Get covenantProgress
   * @return covenantProgress
  **/
  @ApiModelProperty(required = true, value = "")

  public CovenantProgressData getCovenantProgress() {
    return covenantProgress;
  }


  public void setCovenantProgress(CovenantProgressData covenantProgress) {
    this.covenantProgress = covenantProgress;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CharacterData characterData = (CharacterData) o;
    return Objects.equals(this.name, characterData.name) &&
        Objects.equals(this.id, characterData.id) &&
        Objects.equals(this.gender, characterData.gender) &&
        Objects.equals(this.faction, characterData.faction) &&
        Objects.equals(this.race, characterData.race) &&
        Objects.equals(this.characterClass, characterData.characterClass) &&
        Objects.equals(this.activeSpec, characterData.activeSpec) &&
        Objects.equals(this.realm, characterData.realm) &&
        Objects.equals(this.guild, characterData.guild) &&
        Objects.equals(this.level, characterData.level) &&
        Objects.equals(this.experience, characterData.experience) &&
        Objects.equals(this.achievementPoints, characterData.achievementPoints) &&
        Objects.equals(this.lastLoginTimestamp, characterData.lastLoginTimestamp) &&
        Objects.equals(this.averageItemLevel, characterData.averageItemLevel) &&
        Objects.equals(this.equippedItemLevel, characterData.equippedItemLevel) &&
        Objects.equals(this.activeTitle, characterData.activeTitle) &&
        Objects.equals(this.covenantProgress, characterData.covenantProgress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, id, gender, faction, race, characterClass, activeSpec, realm, guild, level, experience, achievementPoints, lastLoginTimestamp, averageItemLevel, equippedItemLevel, activeTitle, covenantProgress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterData {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    faction: ").append(toIndentedString(faction)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    characterClass: ").append(toIndentedString(characterClass)).append("\n");
    sb.append("    activeSpec: ").append(toIndentedString(activeSpec)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    guild: ").append(toIndentedString(guild)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    achievementPoints: ").append(toIndentedString(achievementPoints)).append("\n");
    sb.append("    lastLoginTimestamp: ").append(toIndentedString(lastLoginTimestamp)).append("\n");
    sb.append("    averageItemLevel: ").append(toIndentedString(averageItemLevel)).append("\n");
    sb.append("    equippedItemLevel: ").append(toIndentedString(equippedItemLevel)).append("\n");
    sb.append("    activeTitle: ").append(toIndentedString(activeTitle)).append("\n");
    sb.append("    covenantProgress: ").append(toIndentedString(covenantProgress)).append("\n");
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

