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
import { RealmIndexData } from './realmIndexData';
import { TypeData } from './typeData';

/**
* Index of guild character
*/
export class GuildCharacterIndexData {
    'name': string;
    'id': number;
    'realm': RealmIndexData;
    'faction': TypeData;

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
            "name": "faction",
            "baseName": "faction",
            "type": "TypeData"
        }    ];

    static getAttributeTypeMap() {
        return GuildCharacterIndexData.attributeTypeMap;
    }
}

