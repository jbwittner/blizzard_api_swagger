/* tslint:disable */
/* eslint-disable */
/**
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.7.0
 * Contact: jeanbaptiste.wittner@outlook.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import { GenderData } from './gender-data';
import { IndexData } from './index-data';
import { NameData } from './name-data';
import { PveTalentTiersData } from './pve-talent-tiers-data';
import { PvpTalentTiersData } from './pvp-talent-tiers-data';
import { TypeData } from './type-data';

/**
 * Playable specilization data
 * @export
 * @interface PlayableSpecializationData
 */
export interface PlayableSpecializationData {
    /**
     * Id of the specilization
     * @type {number}
     * @memberof PlayableSpecializationData
     */
    'id'?: number;
    /**
     * 
     * @type {IndexData}
     * @memberof PlayableSpecializationData
     */
    'playable_class'?: IndexData;
    /**
     * 
     * @type {NameData}
     * @memberof PlayableSpecializationData
     */
    'name'?: NameData;
    /**
     * 
     * @type {GenderData}
     * @memberof PlayableSpecializationData
     */
    'gender_description'?: GenderData;
    /**
     * 
     * @type {TypeData}
     * @memberof PlayableSpecializationData
     */
    'role'?: TypeData;
    /**
     * 
     * @type {Array<PveTalentTiersData>}
     * @memberof PlayableSpecializationData
     */
    'talent_tiers'?: Array<PveTalentTiersData>;
    /**
     * 
     * @type {Array<PvpTalentTiersData>}
     * @memberof PlayableSpecializationData
     */
    'pvp_talents'?: Array<PvpTalentTiersData>;
}
