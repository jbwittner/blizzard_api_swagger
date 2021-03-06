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
import { PveSpellDescritpionData } from './pve-spell-descritpion-data';

/**
 * PVE Talent data
 * @export
 * @interface PveTalentData
 */
export interface PveTalentData {
    /**
     * Id of the talent
     * @type {number}
     * @memberof PveTalentData
     */
    'column_index': number;
    /**
     * 
     * @type {IndexData}
     * @memberof PveTalentData
     */
    'talent': IndexData;
    /**
     * 
     * @type {PveSpellDescritpionData}
     * @memberof PveTalentData
     */
    'spell_tooltip': PveSpellDescritpionData;
}

