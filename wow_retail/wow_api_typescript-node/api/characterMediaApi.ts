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
import { CharacterMediaData } from '../model/characterMediaData';

import { ObjectSerializer, Authentication, VoidAuth, Interceptor } from '../model/models';
import { HttpBasicAuth, HttpBearerAuth, ApiKeyAuth, OAuth } from '../model/models';

import { HttpError, RequestFile } from './apis';

let defaultBasePath = 'https://eu.api.blizzard.com';

// ===============================================
// This file is autogenerated - Please do not edit
// ===============================================

export enum CharacterMediaApiApiKeys {
}

export class CharacterMediaApi {
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

    public setApiKey(key: CharacterMediaApiApiKeys, value: string) {
        (this.authentications as any)[CharacterMediaApiApiKeys[key]].apiKey = value;
    }

    set accessToken(token: string) {
        this.authentications.oAuthAuthorizationCode.accessToken = token;
    }

    public addInterceptor(interceptor: Interceptor) {
        this.interceptors.push(interceptor);
    }

    /**
     * Returns a summary of the media assets available for a character (such as an avatar render).
     * @param namespace The namespace to use to locate this document.
     * @param region The region of the data to retrieve.
     * @param realmSlug The slug of the realm.
     * @param characterName The lowercase name of the character.
     * @param locale The locale to reflect in localized data. (If you don\&#39;t send a value, the API sends you all localized data)
     */
    public async getCharacterMedia (namespace: 'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn', region: 'eu' | 'us' | 'kr' | 'tw' | 'cn', realmSlug: string, characterName: string, locale?: 'en_US' | 'es_MX' | 'pt_BR' | 'de_DE' | 'en_GB' | 'es_ES' | 'fr_FR' | 'it_IT' | 'ru_RU' | 'ko_KR' | 'zh_TW' | 'zh_CN', options: {headers: {[name: string]: string}} = {headers: {}}) : Promise<{ response: http.IncomingMessage; body: CharacterMediaData;  }> {
        const localVarPath = this.basePath + '/profile/wow/character/{realmSlug}/{characterName}/character-media'
            .replace('{' + 'realmSlug' + '}', encodeURIComponent(String(realmSlug)))
            .replace('{' + 'characterName' + '}', encodeURIComponent(String(characterName)));
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
            throw new Error('Required parameter namespace was null or undefined when calling getCharacterMedia.');
        }

        // verify required parameter 'region' is not null or undefined
        if (region === null || region === undefined) {
            throw new Error('Required parameter region was null or undefined when calling getCharacterMedia.');
        }

        // verify required parameter 'realmSlug' is not null or undefined
        if (realmSlug === null || realmSlug === undefined) {
            throw new Error('Required parameter realmSlug was null or undefined when calling getCharacterMedia.');
        }

        // verify required parameter 'characterName' is not null or undefined
        if (characterName === null || characterName === undefined) {
            throw new Error('Required parameter characterName was null or undefined when calling getCharacterMedia.');
        }

        if (namespace !== undefined) {
            localVarQueryParameters['namespace'] = ObjectSerializer.serialize(namespace, "'profile-eu' | 'profile-us' | 'profile-kr' | 'profile-tw' | 'profile-cn'");
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
            return new Promise<{ response: http.IncomingMessage; body: CharacterMediaData;  }>((resolve, reject) => {
                localVarRequest(localVarRequestOptions, (error, response, body) => {
                    if (error) {
                        reject(error);
                    } else {
                        if (response.statusCode && response.statusCode >= 200 && response.statusCode <= 299) {
                            body = ObjectSerializer.deserialize(body, "CharacterMediaData");
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
