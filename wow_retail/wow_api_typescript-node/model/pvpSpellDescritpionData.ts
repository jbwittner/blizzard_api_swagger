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
import { NameData } from './nameData';

/**
* Description of the pvp spell
*/
export class PvpSpellDescritpionData {
    'description'?: NameData;
    'castTime'?: NameData;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "description",
            "baseName": "description",
            "type": "NameData"
        },
        {
            "name": "castTime",
            "baseName": "cast_time",
            "type": "NameData"
        }    ];

    static getAttributeTypeMap() {
        return PvpSpellDescritpionData.attributeTypeMap;
    }
}

