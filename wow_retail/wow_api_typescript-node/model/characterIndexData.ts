/**
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

import { RequestFile } from './models';
import { IndexData } from './indexData';
import { RealmIndexData } from './realmIndexData';
import { TypeData } from './typeData';

/**
* Index of character
*/
export class CharacterIndexData {
    'name': string;
    'id': number;
    'realm': RealmIndexData;
    'playableClass': IndexData;
    'playableRace': IndexData;
    'gender': TypeData;
    'faction': TypeData;
    'level': number;

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
            "name": "realm",
            "baseName": "realm",
            "type": "RealmIndexData"
        },
        {
            "name": "playableClass",
            "baseName": "playable_class",
            "type": "IndexData"
        },
        {
            "name": "playableRace",
            "baseName": "playable_race",
            "type": "IndexData"
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
            "name": "level",
            "baseName": "level",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return CharacterIndexData.attributeTypeMap;
    }
}

