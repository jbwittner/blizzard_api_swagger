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


import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { ArrayRacesIndexData } from '../model';
// @ts-ignore
import { PlayableRaceData } from '../model';
/**
 * PlayableRaceApi - axios parameter creator
 * @export
 */
export const PlayableRaceApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Returns a playable race by ID.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {number} raceId The ID of the playable race.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPlayableRaceById: async (namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', raceId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'namespace' is not null or undefined
            assertParamExists('getPlayableRaceById', 'namespace', namespace)
            // verify required parameter 'region' is not null or undefined
            assertParamExists('getPlayableRaceById', 'region', region)
            // verify required parameter 'raceId' is not null or undefined
            assertParamExists('getPlayableRaceById', 'raceId', raceId)
            const localVarPath = `/data/wow/playable-race/{raceId}`
                .replace(`{${"raceId"}}`, encodeURIComponent(String(raceId)));
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
        /**
         * Returns an index of playable races.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPlayableRaceIndex: async (namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'namespace' is not null or undefined
            assertParamExists('getPlayableRaceIndex', 'namespace', namespace)
            // verify required parameter 'region' is not null or undefined
            assertParamExists('getPlayableRaceIndex', 'region', region)
            const localVarPath = `/data/wow/playable-race/index`;
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
 * PlayableRaceApi - functional programming interface
 * @export
 */
export const PlayableRaceApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = PlayableRaceApiAxiosParamCreator(configuration)
    return {
        /**
         * Returns a playable race by ID.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {number} raceId The ID of the playable race.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getPlayableRaceById(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', raceId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<PlayableRaceData>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getPlayableRaceById(namespace, region, raceId, locale, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Returns an index of playable races.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getPlayableRaceIndex(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<ArrayRacesIndexData>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getPlayableRaceIndex(namespace, region, locale, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * PlayableRaceApi - factory interface
 * @export
 */
export const PlayableRaceApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = PlayableRaceApiFp(configuration)
    return {
        /**
         * Returns a playable race by ID.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {number} raceId The ID of the playable race.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPlayableRaceById(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', raceId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: any): AxiosPromise<PlayableRaceData> {
            return localVarFp.getPlayableRaceById(namespace, region, raceId, locale, options).then((request) => request(axios, basePath));
        },
        /**
         * Returns an index of playable races.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPlayableRaceIndex(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: any): AxiosPromise<ArrayRacesIndexData> {
            return localVarFp.getPlayableRaceIndex(namespace, region, locale, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * PlayableRaceApi - interface
 * @export
 * @interface PlayableRaceApi
 */
export interface PlayableRaceApiInterface {
    /**
     * Returns a playable race by ID.
     * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
     * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
     * @param {number} raceId The ID of the playable race.
     * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PlayableRaceApiInterface
     */
    getPlayableRaceById(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', raceId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig): AxiosPromise<PlayableRaceData>;

    /**
     * Returns an index of playable races.
     * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
     * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
     * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PlayableRaceApiInterface
     */
    getPlayableRaceIndex(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig): AxiosPromise<ArrayRacesIndexData>;

}

/**
 * PlayableRaceApi - object-oriented interface
 * @export
 * @class PlayableRaceApi
 * @extends {BaseAPI}
 */
export class PlayableRaceApi extends BaseAPI implements PlayableRaceApiInterface {
    /**
     * Returns a playable race by ID.
     * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
     * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
     * @param {number} raceId The ID of the playable race.
     * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PlayableRaceApi
     */
    public getPlayableRaceById(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', raceId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig) {
        return PlayableRaceApiFp(this.configuration).getPlayableRaceById(namespace, region, raceId, locale, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Returns an index of playable races.
     * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
     * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
     * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PlayableRaceApi
     */
    public getPlayableRaceIndex(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig) {
        return PlayableRaceApiFp(this.configuration).getPlayableRaceIndex(namespace, region, locale, options).then((request) => request(this.axios, this.basePath));
    }
}
