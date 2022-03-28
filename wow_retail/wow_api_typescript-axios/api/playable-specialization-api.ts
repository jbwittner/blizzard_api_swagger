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


import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { ArraySpecializationsIndexData } from '../model';
// @ts-ignore
import { PlayableClassRaceMediaData } from '../model';
// @ts-ignore
import { PlayableSpecializationData } from '../model';
/**
 * PlayableSpecializationApi - axios parameter creator
 * @export
 */
export const PlayableSpecializationApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Returns a playable specialization by ID.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {number} specId The ID of the playable specialization.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPlayableSpecializationById: async (namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', specId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'namespace' is not null or undefined
            assertParamExists('getPlayableSpecializationById', 'namespace', namespace)
            // verify required parameter 'region' is not null or undefined
            assertParamExists('getPlayableSpecializationById', 'region', region)
            // verify required parameter 'specId' is not null or undefined
            assertParamExists('getPlayableSpecializationById', 'specId', specId)
            const localVarPath = `/data/wow/playable-specialization/{specId}`
                .replace(`{${"specId"}}`, encodeURIComponent(String(specId)));
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
         * Returns an index of playable specializations.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPlayableSpecializationIndex: async (namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'namespace' is not null or undefined
            assertParamExists('getPlayableSpecializationIndex', 'namespace', namespace)
            // verify required parameter 'region' is not null or undefined
            assertParamExists('getPlayableSpecializationIndex', 'region', region)
            const localVarPath = `/data/wow/playable-specialization/index`;
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
         * Returns media for a playable specialization by ID.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {number} specId The ID of the playable specialization.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPlayableSpecializationMediaById: async (namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', specId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'namespace' is not null or undefined
            assertParamExists('getPlayableSpecializationMediaById', 'namespace', namespace)
            // verify required parameter 'region' is not null or undefined
            assertParamExists('getPlayableSpecializationMediaById', 'region', region)
            // verify required parameter 'specId' is not null or undefined
            assertParamExists('getPlayableSpecializationMediaById', 'specId', specId)
            const localVarPath = `/data/wow/media/playable-specialization/{specId}`
                .replace(`{${"specId"}}`, encodeURIComponent(String(specId)));
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
 * PlayableSpecializationApi - functional programming interface
 * @export
 */
export const PlayableSpecializationApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = PlayableSpecializationApiAxiosParamCreator(configuration)
    return {
        /**
         * Returns a playable specialization by ID.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {number} specId The ID of the playable specialization.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getPlayableSpecializationById(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', specId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<PlayableSpecializationData>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getPlayableSpecializationById(namespace, region, specId, locale, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Returns an index of playable specializations.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getPlayableSpecializationIndex(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<ArraySpecializationsIndexData>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getPlayableSpecializationIndex(namespace, region, locale, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
        /**
         * Returns media for a playable specialization by ID.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {number} specId The ID of the playable specialization.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getPlayableSpecializationMediaById(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', specId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<PlayableClassRaceMediaData>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getPlayableSpecializationMediaById(namespace, region, specId, locale, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * PlayableSpecializationApi - factory interface
 * @export
 */
export const PlayableSpecializationApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = PlayableSpecializationApiFp(configuration)
    return {
        /**
         * Returns a playable specialization by ID.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {number} specId The ID of the playable specialization.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPlayableSpecializationById(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', specId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: any): AxiosPromise<PlayableSpecializationData> {
            return localVarFp.getPlayableSpecializationById(namespace, region, specId, locale, options).then((request) => request(axios, basePath));
        },
        /**
         * Returns an index of playable specializations.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPlayableSpecializationIndex(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: any): AxiosPromise<ArraySpecializationsIndexData> {
            return localVarFp.getPlayableSpecializationIndex(namespace, region, locale, options).then((request) => request(axios, basePath));
        },
        /**
         * Returns media for a playable specialization by ID.
         * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {number} specId The ID of the playable specialization.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getPlayableSpecializationMediaById(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', specId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: any): AxiosPromise<PlayableClassRaceMediaData> {
            return localVarFp.getPlayableSpecializationMediaById(namespace, region, specId, locale, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * PlayableSpecializationApi - interface
 * @export
 * @interface PlayableSpecializationApi
 */
export interface PlayableSpecializationApiInterface {
    /**
     * Returns a playable specialization by ID.
     * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
     * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
     * @param {number} specId The ID of the playable specialization.
     * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PlayableSpecializationApiInterface
     */
    getPlayableSpecializationById(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', specId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig): AxiosPromise<PlayableSpecializationData>;

    /**
     * Returns an index of playable specializations.
     * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
     * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
     * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PlayableSpecializationApiInterface
     */
    getPlayableSpecializationIndex(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig): AxiosPromise<ArraySpecializationsIndexData>;

    /**
     * Returns media for a playable specialization by ID.
     * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
     * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
     * @param {number} specId The ID of the playable specialization.
     * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PlayableSpecializationApiInterface
     */
    getPlayableSpecializationMediaById(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', specId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig): AxiosPromise<PlayableClassRaceMediaData>;

}

/**
 * PlayableSpecializationApi - object-oriented interface
 * @export
 * @class PlayableSpecializationApi
 * @extends {BaseAPI}
 */
export class PlayableSpecializationApi extends BaseAPI implements PlayableSpecializationApiInterface {
    /**
     * Returns a playable specialization by ID.
     * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
     * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
     * @param {number} specId The ID of the playable specialization.
     * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PlayableSpecializationApi
     */
    public getPlayableSpecializationById(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', specId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig) {
        return PlayableSpecializationApiFp(this.configuration).getPlayableSpecializationById(namespace, region, specId, locale, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Returns an index of playable specializations.
     * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
     * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
     * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PlayableSpecializationApi
     */
    public getPlayableSpecializationIndex(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig) {
        return PlayableSpecializationApiFp(this.configuration).getPlayableSpecializationIndex(namespace, region, locale, options).then((request) => request(this.axios, this.basePath));
    }

    /**
     * Returns media for a playable specialization by ID.
     * @param {'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'} namespace The namespace to use to locate this document.
     * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
     * @param {number} specId The ID of the playable specialization.
     * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof PlayableSpecializationApi
     */
    public getPlayableSpecializationMediaById(namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', specId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig) {
        return PlayableSpecializationApiFp(this.configuration).getPlayableSpecializationMediaById(namespace, region, specId, locale, options).then((request) => request(this.axios, this.basePath));
    }
}