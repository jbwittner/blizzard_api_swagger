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


import { IndexData } from './index-data';
import { TypeData } from './type-data';

/**
 * Data of realm
 * @export
 * @interface RealmData
 */
export interface RealmData {
    /**
     * Id of the realm
     * @type {number}
     * @memberof RealmData
     */
    'id': number;
    /**
     * 
     * @type {IndexData}
     * @memberof RealmData
     */
    'region': IndexData;
    /**
     * 
     * @type {object}
     * @memberof RealmData
     */
    'name': object;
    /**
     * 
     * @type {object}
     * @memberof RealmData
     */
    'category': object;
    /**
     * Locale of the realm
     * @type {string}
     * @memberof RealmData
     */
    'locale': string;
    /**
     * Timezone of the realm
     * @type {string}
     * @memberof RealmData
     */
    'timezone': string;
    /**
     * 
     * @type {TypeData}
     * @memberof RealmData
     */
    'type': TypeData;
    /**
     * Is true if the realm is a tournament realm
     * @type {boolean}
     * @memberof RealmData
     */
    'is_tournament': boolean;
    /**
     * Slug of the realm
     * @type {string}
     * @memberof RealmData
     */
    'slug': string;
}

