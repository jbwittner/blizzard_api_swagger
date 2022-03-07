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
import { AssetData } from './assetData';

/**
* Playable class/race media data
*/
export class PlayableClassRaceMediaData {
    /**
    * Id of the class
    */
    'id': number;
    'assets': Array<AssetData>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "id",
            "baseName": "id",
            "type": "number"
        },
        {
            "name": "assets",
            "baseName": "assets",
            "type": "Array<AssetData>"
        }    ];

    static getAttributeTypeMap() {
        return PlayableClassRaceMediaData.attributeTypeMap;
    }
}

