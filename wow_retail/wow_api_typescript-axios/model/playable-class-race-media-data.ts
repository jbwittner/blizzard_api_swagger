/* tslint:disable */
/* eslint-disable */
/**
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


import { AssetData } from './asset-data';

/**
 * Playable class/race media data
 * @export
 * @interface PlayableClassRaceMediaData
 */
export interface PlayableClassRaceMediaData {
    /**
     * Id of the class
     * @type {number}
     * @memberof PlayableClassRaceMediaData
     */
    'id': number;
    /**
     * 
     * @type {Array<AssetData>}
     * @memberof PlayableClassRaceMediaData
     */
    'assets': Array<AssetData>;
}

