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

/**
* Array of classes index
*/
export class ArrayClassesIndexData {
    'classes': Array<IndexData>;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "classes",
            "baseName": "classes",
            "type": "Array<IndexData>"
        }    ];

    static getAttributeTypeMap() {
        return ArrayClassesIndexData.attributeTypeMap;
    }
}
