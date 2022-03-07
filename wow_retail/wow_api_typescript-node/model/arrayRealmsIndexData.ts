/**
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.5.6
 * Contact: jeanbaptiste.wittner@outlook.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { RequestFile } from './models';
import { RealmIndexData } from './realmIndexData';

/**
* Array of classes index
*/
export class ArrayRealmsIndexData {
    'realms': Array<RealmIndexData>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "realms",
            "baseName": "realms",
            "type": "Array<RealmIndexData>"
        }    ];

    static getAttributeTypeMap() {
        return ArrayRealmsIndexData.attributeTypeMap;
    }
}

