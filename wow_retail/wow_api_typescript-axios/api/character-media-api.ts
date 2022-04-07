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


import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { CharacterMediaData } from '../model';
/**
 * CharacterMediaApi - axios parameter creator
 * @export
 */
export const CharacterMediaApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Returns a summary of the media assets available for a character (such as an avatar render).
         * @param {'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {string} realmSlug The slug of the realm.
         * @param {string} characterName The lowercase name of the character.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCharacterMedia: async (namespace: 'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', realmSlug: string, characterName: string, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'namespace' is not null or undefined
            assertParamExists('getCharacterMedia', 'namespace', namespace)
            // verify required parameter 'region' is not null or undefined
            assertParamExists('getCharacterMedia', 'region', region)
            // verify required parameter 'realmSlug' is not null or undefined
            assertParamExists('getCharacterMedia', 'realmSlug', realmSlug)
            // verify required parameter 'characterName' is not null or undefined
            assertParamExists('getCharacterMedia', 'characterName', characterName)
            const localVarPath = `/profile/wow/character/{realmSlug}/{characterName}/character-media`
                .replace(`{${"realmSlug"}}`, encodeURIComponent(String(realmSlug)))
                .replace(`{${"characterName"}}`, encodeURIComponent(String(characterName)));
            // use dummy base URL string because the URL constructor only accepts absolute URLs.
            const localVarUrlObj = new URL(localVarPath, DUMMY_BASE_URL);
            let baseOptions;
            if (configuration) {
                baseOptions = configuration.baseOptions;
            }

            const localVarRequestOptions = { method: 'GET', ...baseOptions, ...options};
            const localVarHeaderParameter = {} as any;
            const localVarQueryParameter = {} as any;

            // authentication oAuthAuthorizationCode required
            // oauth required
            await setOAuthToObject(localVarHeaderParameter, "oAuthAuthorizationCode", ["wow.profile"], configuration)

            if (namespace !== undefined) {
                localVarQueryParameter['namespace'] = namespace;
            }

            if (region !== undefined) {
                localVarQueryParameter['region'] = region;
            }

            if (locale !== undefined) {
                localVarQueryParameter['locale'] = locale;
            }


    
            setSearchParams(localVarUrlObj, localVarQueryParameter);
            let headersFromBaseOptions = baseOptions && baseOptions.headers ? baseOptions.headers : {};
            localVarRequestOptions.headers = {...localVarHeaderParameter, ...headersFromBaseOptions, ...options.headers};

            return {
                url: toPathString(localVarUrlObj),
                options: localVarRequestOptions,
            };
        },
    }
};

/**
 * CharacterMediaApi - functional programming interface
 * @export
 */
export const CharacterMediaApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = CharacterMediaApiAxiosParamCreator(configuration)
    return {
        /**
         * Returns a summary of the media assets available for a character (such as an avatar render).
         * @param {'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {string} realmSlug The slug of the realm.
         * @param {string} characterName The lowercase name of the character.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getCharacterMedia(namespace: 'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', realmSlug: string, characterName: string, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<CharacterMediaData>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getCharacterMedia(namespace, region, realmSlug, characterName, locale, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * CharacterMediaApi - factory interface
 * @export
 */
export const CharacterMediaApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = CharacterMediaApiFp(configuration)
    return {
        /**
         * Returns a summary of the media assets available for a character (such as an avatar render).
         * @param {'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {string} realmSlug The slug of the realm.
         * @param {string} characterName The lowercase name of the character.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getCharacterMedia(namespace: 'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', realmSlug: string, characterName: string, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: any): AxiosPromise<CharacterMediaData> {
            return localVarFp.getCharacterMedia(namespace, region, realmSlug, characterName, locale, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * CharacterMediaApi - interface
 * @export
 * @interface CharacterMediaApi
 */
export interface CharacterMediaApiInterface {
    /**
     * Returns a summary of the media assets available for a character (such as an avatar render).
     * @param {'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn'} namespace The namespace to use to locate this document.
     * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
     * @param {string} realmSlug The slug of the realm.
     * @param {string} characterName The lowercase name of the character.
     * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof CharacterMediaApiInterface
     */
    getCharacterMedia(namespace: 'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', realmSlug: string, characterName: string, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig): AxiosPromise<CharacterMediaData>;

}

/**
 * CharacterMediaApi - object-oriented interface
 * @export
 * @class CharacterMediaApi
 * @extends {BaseAPI}
 */
export class CharacterMediaApi extends BaseAPI implements CharacterMediaApiInterface {
    /**
     * Returns a summary of the media assets available for a character (such as an avatar render).
     * @param {'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn'} namespace The namespace to use to locate this document.
     * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
     * @param {string} realmSlug The slug of the realm.
     * @param {string} characterName The lowercase name of the character.
     * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof CharacterMediaApi
     */
    public getCharacterMedia(namespace: 'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', realmSlug: string, characterName: string, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig) {
        return CharacterMediaApiFp(this.configuration).getCharacterMedia(namespace, region, realmSlug, characterName, locale, options).then((request) => request(this.axios, this.basePath));
    }
}
