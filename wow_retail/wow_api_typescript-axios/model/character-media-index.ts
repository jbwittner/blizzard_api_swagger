/* tslint:disable */
/* eslint-disable */
/**
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.7.1
 * Contact: jeanbaptiste.wittner@outlook.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { RealmIndexData } from './realm-index-data';

/**
 * Character media data
 * @export
 * @interface CharacterMediaIndex
 */
export interface CharacterMediaIndex {
    /**
     * 
     * @type {string}
     * @memberof CharacterMediaIndex
     */
    'name': string;
    /**
     * 
     * @type {number}
     * @memberof CharacterMediaIndex
     */
    'id': number;
    /**
     * 
     * @type {RealmIndexData}
     * @memberof CharacterMediaIndex
     */
    'realm': RealmIndexData;
}

