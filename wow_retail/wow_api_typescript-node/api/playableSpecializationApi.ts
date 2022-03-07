/**
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.5.6
 * Contact: jeanbaptiste.wittner@outlook.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


import localVarRequest from 'request';
import http from 'http';

/* tslint:disable:no-unused-locals */
import { ArraySpecializationsIndexData } from '../model/arraySpecializationsIndexData';
import { PlayableClassRaceMediaData } from '../model/playableClassRaceMediaData';
import { PlayableSpecializationData } from '../model/playableSpecializationData';

import { ObjectSerializer, Authentication, VoidAuth, Interceptor } from '../model/models';
import { HttpBasicAuth, HttpBearerAuth, ApiKeyAuth, OAuth } from '../model/models';

import { HttpError, RequestFile } from './apis';

let defaultBasePath = 'https://eu.api.blizzard.com';

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================

export enum PlayableSpecializationApiApiKeys {
}

export class PlayableSpecializationApi {
    protected _basePath = defaultBasePath;
    protected _defaultHeaders : any = {};
    protected _useQuerystring : boolean = false;

    protected authentications = {
        'default': <Authentication>new VoidAuth(),
        'oAuthAuthorizationCode': new OAuth(),
    }

    protected interceptors: Interceptor[] = [];

    constructor(basePath?: string);
    constructor(basePathOrUsername: string, password?: string, basePath?: string) {
        if (password) {
            if (basePath) {
                this.basePath = basePath;
            }
        } else {
            if (basePathOrUsername) {
                this.basePath = basePathOrUsername
            }
        }
    }

    set useQuerystring(value: boolean) {
        this._useQuerystring = value;
    }

    set basePath(basePath: string) {
        this._basePath = basePath;
    }

    set defaultHeaders(defaultHeaders: any) {
        this._defaultHeaders = defaultHeaders;
    }

    get defaultHeaders() {
        return this._defaultHeaders;
    }

    get basePath() {
        return this._basePath;
    }

    public setDefaultAuthentication(auth: Authentication) {
        this.authentications.default = auth;
    }

    public setApiKey(key: PlayableSpecializationApiApiKeys, value: string) {
        (this.authentications as any)[PlayableSpecializationApiApiKeys[key]].apiKey = value;
    }

    set accessToken(token: string) {
        this.authentications.oAuthAuthorizationCode.accessToken = token;
    }

    public addInterceptor(interceptor: Interceptor) {
        this.interceptors.push(interceptor);
    }

    /**
     * Returns a playable specialization by ID.
     * @param namespace The namespace to use to locate this document.
     * @param region The region of the data to retrieve.
     * @param specId The ID of the playable specialization.
     * @param locale The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     */
    public async getPlayableSpecializationById (namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', specId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.IncomingMessage; body: PlayableSpecializationData;  }> {
        const localVarPath = this.basePath + '/data/wow/playable-specialization/{specId}'
            .replace('{' + 'specId' + '}', encodeURIComponent(String(specId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this._defaultHeaders);
        const produces = ['application/json'];
        // give precedence to 'application/json'
        if (produces.indexOf('application/json') >= 0) {
            localVarHeaderParams.Accept = 'application/json';
        } else {
            localVarHeaderParams.Accept = produces.join(',');
        }
        let localVarFormParams: any = {};

        // verify required parameter 'namespace' is not null or undefined
        if (namespace === null || namespace === undefined) {
            throw new Error('Required parameter namespace was null or undefined when calling getPlayableSpecializationById.');
        }

        // verify required parameter 'region' is not null or undefined
        if (region === null || region === undefined) {
            throw new Error('Required parameter region was null or undefined when calling getPlayableSpecializationById.');
        }

        // verify required parameter 'specId' is not null or undefined
        if (specId === null || specId === undefined) {
            throw new Error('Required parameter specId was null or undefined when calling getPlayableSpecializationById.');
        }

        if (namespace !== undefined) {
            localVarQueryParameters['namespace'] = ObjectSerializer.serialize(namespace, "'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'");
        }

        if (region !== undefined) {
            localVarQueryParameters['region'] = ObjectSerializer.serialize(region, "'eu' | 'us' | 'kr' | 'tw' | 'cn'");
        }

        if (locale !== undefined) {
            localVarQueryParameters['locale'] = ObjectSerializer.serialize(locale, "'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        let authenticationPromise = Promise.resolve();
        if (this.authentications.oAuthAuthorizationCode.accessToken) {
            authenticationPromise = authenticationPromise.then(() => this.authentications.oAuthAuthorizationCode.applyToRequest(localVarRequestOptions));
        }
        authenticationPromise = authenticationPromise.then(() => this.authentications.default.applyToRequest(localVarRequestOptions));

        let interceptorPromise = authenticationPromise;
        for (const interceptor of this.interceptors) {
            interceptorPromise = interceptorPromise.then(() => interceptor(localVarRequestOptions));
        }

        return interceptorPromise.then(() => {
            if (Object.keys(localVarFormParams).length) {
                if (localVarUseFormData) {
                    (<any>localVarRequestOptions).formData = localVarFormParams;
                } else {
                    localVarRequestOptions.form = localVarFormParams;
                }
            }
            return new Promise<{ response: http.IncomingMessage; body: PlayableSpecializationData;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            body = ObjectSerializer.deserialize(body, "PlayableSpecializationData");
                            resolve({ response: response, body: body });
                        } else {
                            reject(new HttpError(response, body, response.statusCode));
                        }
                    }
                });
            });
        });
    }
    /**
     * Returns an index of playable specializations.
     * @param namespace The namespace to use to locate this document.
     * @param region The region of the data to retrieve.
     * @param locale The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     */
    public async getPlayableSpecializationIndex (namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.IncomingMessage; body: ArraySpecializationsIndexData;  }> {
        const localVarPath = this.basePath + '/data/wow/playable-specialization/index';
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this._defaultHeaders);
        const produces = ['application/json'];
        // give precedence to 'application/json'
        if (produces.indexOf('application/json') >= 0) {
            localVarHeaderParams.Accept = 'application/json';
        } else {
            localVarHeaderParams.Accept = produces.join(',');
        }
        let localVarFormParams: any = {};

        // verify required parameter 'namespace' is not null or undefined
        if (namespace === null || namespace === undefined) {
            throw new Error('Required parameter namespace was null or undefined when calling getPlayableSpecializationIndex.');
        }

        // verify required parameter 'region' is not null or undefined
        if (region === null || region === undefined) {
            throw new Error('Required parameter region was null or undefined when calling getPlayableSpecializationIndex.');
        }

        if (namespace !== undefined) {
            localVarQueryParameters['namespace'] = ObjectSerializer.serialize(namespace, "'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'");
        }

        if (region !== undefined) {
            localVarQueryParameters['region'] = ObjectSerializer.serialize(region, "'eu' | 'us' | 'kr' | 'tw' | 'cn'");
        }

        if (locale !== undefined) {
            localVarQueryParameters['locale'] = ObjectSerializer.serialize(locale, "'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        let authenticationPromise = Promise.resolve();
        if (this.authentications.oAuthAuthorizationCode.accessToken) {
            authenticationPromise = authenticationPromise.then(() => this.authentications.oAuthAuthorizationCode.applyToRequest(localVarRequestOptions));
        }
        authenticationPromise = authenticationPromise.then(() => this.authentications.default.applyToRequest(localVarRequestOptions));

        let interceptorPromise = authenticationPromise;
        for (const interceptor of this.interceptors) {
            interceptorPromise = interceptorPromise.then(() => interceptor(localVarRequestOptions));
        }

        return interceptorPromise.then(() => {
            if (Object.keys(localVarFormParams).length) {
                if (localVarUseFormData) {
                    (<any>localVarRequestOptions).formData = localVarFormParams;
                } else {
                    localVarRequestOptions.form = localVarFormParams;
                }
            }
            return new Promise<{ response: http.IncomingMessage; body: ArraySpecializationsIndexData;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            body = ObjectSerializer.deserialize(body, "ArraySpecializationsIndexData");
                            resolve({ response: response, body: body });
                        } else {
                            reject(new HttpError(response, body, response.statusCode));
                        }
                    }
                });
            });
        });
    }
    /**
     * Returns media for a playable specialization by ID.
     * @param namespace The namespace to use to locate this document.
     * @param region The region of the data to retrieve.
     * @param specId The ID of the playable specialization.
     * @param locale The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     */
    public async getPlayableSpecializationMediaById (namespace: 'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', specId: number, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.IncomingMessage; body: PlayableClassRaceMediaData;  }> {
        const localVarPath = this.basePath + '/data/wow/media/playable-specialization/{specId}'
            .replace('{' + 'specId' + '}', encodeURIComponent(String(specId)));
        let localVarQueryParameters: any = {};
        let localVarHeaderParams: any = (<any>Object).assign({}, this._defaultHeaders);
        const produces = ['application/json'];
        // give precedence to 'application/json'
        if (produces.indexOf('application/json') >= 0) {
            localVarHeaderParams.Accept = 'application/json';
        } else {
            localVarHeaderParams.Accept = produces.join(',');
        }
        let localVarFormParams: any = {};

        // verify required parameter 'namespace' is not null or undefined
        if (namespace === null || namespace === undefined) {
            throw new Error('Required parameter namespace was null or undefined when calling getPlayableSpecializationMediaById.');
        }

        // verify required parameter 'region' is not null or undefined
        if (region === null || region === undefined) {
            throw new Error('Required parameter region was null or undefined when calling getPlayableSpecializationMediaById.');
        }

        // verify required parameter 'specId' is not null or undefined
        if (specId === null || specId === undefined) {
            throw new Error('Required parameter specId was null or undefined when calling getPlayableSpecializationMediaById.');
        }

        if (namespace !== undefined) {
            localVarQueryParameters['namespace'] = ObjectSerializer.serialize(namespace, "'static-eu' | 'static-us' | 'static-kr' | 'static-tw' | 'static-cn'");
        }

        if (region !== undefined) {
            localVarQueryParameters['region'] = ObjectSerializer.serialize(region, "'eu' | 'us' | 'kr' | 'tw' | 'cn'");
        }

        if (locale !== undefined) {
            localVarQueryParameters['locale'] = ObjectSerializer.serialize(locale, "'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN'");
        }

        (<any>Object).assign(localVarHeaderParams, options.headers);

        let localVarUseFormData = false;

        let localVarRequestOptions: localVarRequest.Options = {
            method: 'GET',
            qs: localVarQueryParameters,
            headers: localVarHeaderParams,
            uri: localVarPath,
            useQuerystring: this._useQuerystring,
            json: true,
        };

        let authenticationPromise = Promise.resolve();
        if (this.authentications.oAuthAuthorizationCode.accessToken) {
            authenticationPromise = authenticationPromise.then(() => this.authentications.oAuthAuthorizationCode.applyToRequest(localVarRequestOptions));
        }
        authenticationPromise = authenticationPromise.then(() => this.authentications.default.applyToRequest(localVarRequestOptions));

        let interceptorPromise = authenticationPromise;
        for (const interceptor of this.interceptors) {
            interceptorPromise = interceptorPromise.then(() => interceptor(localVarRequestOptions));
        }

        return interceptorPromise.then(() => {
            if (Object.keys(localVarFormParams).length) {
                if (localVarUseFormData) {
                    (<any>localVarRequestOptions).formData = localVarFormParams;
                } else {
                    localVarRequestOptions.form = localVarFormParams;
                }
            }
            return new Promise<{ response: http.IncomingMessage; body: PlayableClassRaceMediaData;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            body = ObjectSerializer.deserialize(body, "PlayableClassRaceMediaData");
                            resolve({ response: response, body: body });
                        } else {
                            reject(new HttpError(response, body, response.statusCode));
                        }
                    }
                });
            });
        });
    }
}
