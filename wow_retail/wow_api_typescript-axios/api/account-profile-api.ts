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


import globalAxios, { AxiosPromise, AxiosInstance, AxiosRequestConfig } from 'axios';
import { Configuration } from '../configuration';
// Some imports not used depending on template conditions
// @ts-ignore
import { DUMMY_BASE_URL, assertParamExists, setApiKeyToObject, setBasicAuthToObject, setBearerAuthToObject, setOAuthToObject, setSearchParams, serializeDataIfNeeded, toPathString, createRequestFunction } from '../common';
// @ts-ignore
import { BASE_PATH, COLLECTION_FORMATS, RequestArgs, BaseAPI, RequiredError } from '../base';
// @ts-ignore
import { ProfileAccountData } from '../model';
/**
 * AccountProfileApi - axios parameter creator
 * @export
 */
export const AccountProfileApiAxiosParamCreator = function (configuration?: Configuration) {
    return {
        /**
         * Account Profile Summary
         * @param {'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getUserProfile: async (namespace: 'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options: AxiosRequestConfig = {}): Promise<RequestArgs> => {
            // verify required parameter 'namespace' is not null or undefined
            assertParamExists('getUserProfile', 'namespace', namespace)
            // verify required parameter 'region' is not null or undefined
            assertParamExists('getUserProfile', 'region', region)
            const localVarPath = `/profile/user/wow`;
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
 * AccountProfileApi - functional programming interface
 * @export
 */
export const AccountProfileApiFp = function(configuration?: Configuration) {
    const localVarAxiosParamCreator = AccountProfileApiAxiosParamCreator(configuration)
    return {
        /**
         * Account Profile Summary
         * @param {'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        async getUserProfile(namespace: 'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig): Promise<(axios?: AxiosInstance, basePath?: string) => AxiosPromise<ProfileAccountData>> {
            const localVarAxiosArgs = await localVarAxiosParamCreator.getUserProfile(namespace, region, locale, options);
            return createRequestFunction(localVarAxiosArgs, globalAxios, BASE_PATH, configuration);
        },
    }
};

/**
 * AccountProfileApi - factory interface
 * @export
 */
export const AccountProfileApiFactory = function (configuration?: Configuration, basePath?: string, axios?: AxiosInstance) {
    const localVarFp = AccountProfileApiFp(configuration)
    return {
        /**
         * Account Profile Summary
         * @param {'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn'} namespace The namespace to use to locate this document.
         * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
         * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
         * @param {*} [options] Override http request option.
         * @throws {RequiredError}
         */
        getUserProfile(namespace: 'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: any): AxiosPromise<ProfileAccountData> {
            return localVarFp.getUserProfile(namespace, region, locale, options).then((request) => request(axios, basePath));
        },
    };
};

/**
 * AccountProfileApi - interface
 * @export
 * @interface AccountProfileApi
 */
export interface AccountProfileApiInterface {
    /**
     * Account Profile Summary
     * @param {'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn'} namespace The namespace to use to locate this document.
     * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
     * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AccountProfileApiInterface
     */
    getUserProfile(namespace: 'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig): AxiosPromise<ProfileAccountData>;

}

/**
 * AccountProfileApi - object-oriented interface
 * @export
 * @class AccountProfileApi
 * @extends {BaseAPI}
 */
export class AccountProfileApi extends BaseAPI implements AccountProfileApiInterface {
    /**
     * Account Profile Summary
     * @param {'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn'} namespace The namespace to use to locate this document.
     * @param {'eu' | 'us' | 'kr' | 'tw' | 'cn'} region The region of the data to retrieve.
     * @param {'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'} [locale] The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     * @param {*} [options] Override http request option.
     * @throws {RequiredError}
     * @memberof AccountProfileApi
     */
    public getUserProfile(namespace: 'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options?: AxiosRequestConfig) {
        return AccountProfileApiFp(this.configuration).getUserProfile(namespace, region, locale, options).then((request) => request(this.axios, this.basePath));
    }
}
