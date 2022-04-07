/* tslint:disable */
/* eslint-disable */
/**
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.8.0
 * Contact: jeanbaptiste.wittner@outlook.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { CharacterIndexData } from './character-index-data';

/**
 * Data of wow accounnt
 * @export
 * @interface WowAccountData
 */
export interface WowAccountData {
    /**
     * Id of the accounnt
     * @type {number}
     * @memberof WowAccountData
     */
    'id': number;
    /**
     * 
     * @type {Array<CharacterIndexData>}
     * @memberof WowAccountData
     */
    'characters': Array<CharacterIndexData>;
}

