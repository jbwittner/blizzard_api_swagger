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


import { PveTalentData } from './pve-talent-data';

/**
 * PVE Talent tiers data
 * @export
 * @interface PveTalentTiersData
 */
export interface PveTalentTiersData {
    /**
     * Level where the talents are obtained
     * @type {number}
     * @memberof PveTalentTiersData
     */
    'level': number;
    /**
     * 
     * @type {Array<PveTalentData>}
     * @memberof PveTalentTiersData
     */
    'talents': Array<PveTalentData>;
    /**
     * Id of the talent
     * @type {number}
     * @memberof PveTalentTiersData
     */
    'tier_index': number;
}

