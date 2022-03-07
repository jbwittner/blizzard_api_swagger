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

/**
* Asset of media
*/
export class AssetData {
    /**
    * Type of media
    */
    'key': AssetData.KeyEnum;
    /**
    * Uri of the media
    */
    'value': string;
    /**
    * File id
    */
    'fileDataId': number;

    static discriminator: string | undefined = undefined;

    static attributeTypeMap: Array<{name: string, baseName: string, type: string}> = [
        {
            "name": "key",
            "baseName": "key",
            "type": "AssetData.KeyEnum"
        },
        {
            "name": "value",
            "baseName": "value",
            "type": "string"
        },
        {
            "name": "fileDataId",
            "baseName": "file_data_id",
            "type": "number"
        }    ];

    static getAttributeTypeMap() {
        return AssetData.attributeTypeMap;
    }
}

export namespace AssetData {
    export enum KeyEnum {
        Avatar = <any> 'avatar',
        Inset = <any> 'inset',
        Main = <any> 'main',
        MainRaw = <any> 'main-raw',
        Icon = <any> 'icon'
    }
}