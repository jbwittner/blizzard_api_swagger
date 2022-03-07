/**
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.6.0
 * Contact: jeanbaptiste.wittner@outlook.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';
import { CovenantProgressData } from './covenantProgressData';
import { GuildCharacterIndexData } from './guildCharacterIndexData';
import { IndexData } from './indexData';
import { RealmIndexData } from './realmIndexData';
import { TitleData } from './titleData';
import { TypeData } from './typeData';

/**
* Character data
*/
export class CharacterData {
    'name': string;
    'id': number;
    'gender': TypeData;
    'faction': TypeData;
    'race': IndexData;
    'characterClass': IndexData;
    'activeSpec': IndexData;
    'realm': RealmIndexData;
    'guild': GuildCharacterIndexData;
    'level': number;
    'experience': number;
    'achievementPoints': number;
    'lastLoginTimestamp': number;
    'averageItemLevel': number;
    'equippedItemLevel': number;
    'activeTitle': TitleData;
    'covenantProgress': CovenantProgressData;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "name",
            "baseName": "name",
            "type": "string"
        },
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "gender",
            "baseName": "gender",
            "type": "TypeData"
        },
        {
            "name": "faction",
            "baseName": "faction",
            "type": "TypeData"
        },
        {
            "name": "race",
            "baseName": "race",
            "type": "IndexData"
        },
        {
            "name": "characterClass",
            "baseName": "character_class",
            "type": "IndexData"
        },
        {
            "name": "activeSpec",
            "baseName": "active_spec",
            "type": "IndexData"
        },
        {
            "name": "realm",
            "baseName": "realm",
            "type": "RealmIndexData"
        },
        {
            "name": "guild",
            "baseName": "guild",
            "type": "GuildCharacterIndexData"
        },
        {
            "name": "level",
            "baseName": "level",
            "type": "number"
        },
        {
            "name": "experience",
            "baseName": "experience",
            "type": "number"
        },
        {
            "name": "achievementPoints",
            "baseName": "achievement_points",
            "type": "number"
        },
        {
            "name": "lastLoginTimestamp",
            "baseName": "last_login_timestamp",
            "type": "number"
        },
        {
            "name": "averageItemLevel",
            "baseName": "average_item_level",
            "type": "number"
        },
        {
            "name": "equippedItemLevel",
            "baseName": "equipped_item_level",
            "type": "number"
        },
        {
            "name": "activeTitle",
            "baseName": "active_title",
            "type": "TitleData"
        },
        {
            "name": "covenantProgress",
            "baseName": "covenant_progress",
            "type": "CovenantProgressData"
        }    ];

    static getAttributeTypeMap() {
        return CharacterData.attributeTypeMap;
    }
}

