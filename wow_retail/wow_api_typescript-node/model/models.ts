import localVarRequest from 'request';

export * from './arrayAssetData';
export * from './arrayClassesIndexData';
export * from './arrayCovenantIndexData';
export * from './arrayRacesIndexData';
export * from './arrayRealmsIndexData';
export * from './arraySpecializationsIndexData';
export * from './assetData';
export * from './characterData';
export * from './characterIndexData';
export * from './characterMediaData';
export * from './characterMediaIndex';
export * from './covenantProgressData';
export * from './genderData';
export * from './guildCharacterIndexData';
export * from './indexData';
export * from './nameData';
export * from './playableClassData';
export * from './playableClassRaceMediaData';
export * from './playableRaceData';
export * from './playableSpecializationData';
export * from './profileAccountData';
export * from './pveSpellDescritpionData';
export * from './pveTalentData';
export * from './pveTalentTiersData';
export * from './pvpSpellDescritpionData';
export * from './pvpTalentTiersData';
export * from './realmData';
export * from './realmIndexData';
export * from './talentData';
export * from './titleData';
export * from './typeData';
export * from './wowAccountData';

import * as fs from 'fs';

export interface RequestDetailedFile {
    value: Buffer;
    options?: {
        filename?: string;
        contentType?: string;
    }
}

export type RequestFile = string | Buffer | fs.ReadStream | RequestDetailedFile;


import { ArrayAssetData } from './arrayAssetData';
import { ArrayClassesIndexData } from './arrayClassesIndexData';
import { ArrayCovenantIndexData } from './arrayCovenantIndexData';
import { ArrayRacesIndexData } from './arrayRacesIndexData';
import { ArrayRealmsIndexData } from './arrayRealmsIndexData';
import { ArraySpecializationsIndexData } from './arraySpecializationsIndexData';
import { AssetData } from './assetData';
import { CharacterData } from './characterData';
import { CharacterIndexData } from './characterIndexData';
import { CharacterMediaData } from './characterMediaData';
import { CharacterMediaIndex } from './characterMediaIndex';
import { CovenantProgressData } from './covenantProgressData';
import { GenderData } from './genderData';
import { GuildCharacterIndexData } from './guildCharacterIndexData';
import { IndexData } from './indexData';
import { NameData } from './nameData';
import { PlayableClassData } from './playableClassData';
import { PlayableClassRaceMediaData } from './playableClassRaceMediaData';
import { PlayableRaceData } from './playableRaceData';
import { PlayableSpecializationData } from './playableSpecializationData';
import { ProfileAccountData } from './profileAccountData';
import { PveSpellDescritpionData } from './pveSpellDescritpionData';
import { PveTalentData } from './pveTalentData';
import { PveTalentTiersData } from './pveTalentTiersData';
import { PvpSpellDescritpionData } from './pvpSpellDescritpionData';
import { PvpTalentTiersData } from './pvpTalentTiersData';
import { RealmData } from './realmData';
import { RealmIndexData } from './realmIndexData';
import { TalentData } from './talentData';
import { TitleData } from './titleData';
import { TypeData } from './typeData';
import { WowAccountData } from './wowAccountData';

/* tslint:disable:no-unused-variable */
let primitives = [
                    "string",
                    "boolean",
                    "double",
                    "integer",
                    "long",
                    "float",
                    "number",
                    "any"
                 ];

let enumsMap: {[index: string]: any} = {
        "AssetData.KeyEnum": AssetData.KeyEnum,
}

let typeMap: {[index: string]: any} = {
    "ArrayAssetData": ArrayAssetData,
    "ArrayClassesIndexData": ArrayClassesIndexData,
    "ArrayCovenantIndexData": ArrayCovenantIndexData,
    "ArrayRacesIndexData": ArrayRacesIndexData,
    "ArrayRealmsIndexData": ArrayRealmsIndexData,
    "ArraySpecializationsIndexData": ArraySpecializationsIndexData,
    "AssetData": AssetData,
    "CharacterData": CharacterData,
    "CharacterIndexData": CharacterIndexData,
    "CharacterMediaData": CharacterMediaData,
    "CharacterMediaIndex": CharacterMediaIndex,
    "CovenantProgressData": CovenantProgressData,
    "GenderData": GenderData,
    "GuildCharacterIndexData": GuildCharacterIndexData,
    "IndexData": IndexData,
    "NameData": NameData,
    "PlayableClassData": PlayableClassData,
    "PlayableClassRaceMediaData": PlayableClassRaceMediaData,
    "PlayableRaceData": PlayableRaceData,
    "PlayableSpecializationData": PlayableSpecializationData,
    "ProfileAccountData": ProfileAccountData,
    "PveSpellDescritpionData": PveSpellDescritpionData,
    "PveTalentData": PveTalentData,
    "PveTalentTiersData": PveTalentTiersData,
    "PvpSpellDescritpionData": PvpSpellDescritpionData,
    "PvpTalentTiersData": PvpTalentTiersData,
    "RealmData": RealmData,
    "RealmIndexData": RealmIndexData,
    "TalentData": TalentData,
    "TitleData": TitleData,
    "TypeData": TypeData,
    "WowAccountData": WowAccountData,
}

export class ObjectSerializer {
    public static findCorrectType(data: any, expectedType: string) {
        if (data == undefined) {
            return expectedType;
        } else if (primitives.indexOf(expectedType.toLowerCase()) !== -1) {
            return expectedType;
        } else if (expectedType === "Date") {
            return expectedType;
        } else {
            if (enumsMap[expectedType]) {
                return expectedType;
            }

            if (!typeMap[expectedType]) {
                return expectedType; // w/e we don't know the type
            }

            // Check the discriminator
            let discriminatorProperty = typeMap[expectedType].discriminator;
            if (discriminatorProperty == null) {
                return expectedType; // the type does not have a discriminator. use it.
            } else {
                if (data[discriminatorProperty]) {
                    var discriminatorType = data[discriminatorProperty];
                    if(typeMap[discriminatorType]){
                        return discriminatorType; // use the type given in the discriminator
                    } else {
                        return expectedType; // discriminator did not map to a type
                    }
                } else {
                    return expectedType; // discriminator was not present (or an empty string)
                }
            }
        }
    }

    public static serialize(data: any, type: string) {
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.serialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return data.toISOString();
        } else {
            if (enumsMap[type]) {
                return data;
            }
            if (!typeMap[type]) { // in case we dont know the type
                return data;
            }

            // Get the actual type of this object
            type = this.findCorrectType(data, type);

            // get the map for the correct type.
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            let instance: {[index: string]: any} = {};
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.baseName] = ObjectSerializer.serialize(data[attributeType.name], attributeType.type);
            }
            return instance;
        }
    }

    public static deserialize(data: any, type: string) {
        // polymorphism may change the actual type.
        type = ObjectSerializer.findCorrectType(data, type);
        if (data == undefined) {
            return data;
        } else if (primitives.indexOf(type.toLowerCase()) !== -1) {
            return data;
        } else if (type.lastIndexOf("Array<", 0) === 0) { // string.startsWith pre es6
            let subType: string = type.replace("Array<", ""); // Array<Type> => Type>
            subType = subType.substring(0, subType.length - 1); // Type> => Type
            let transformedData: any[] = [];
            for (let index = 0; index < data.length; index++) {
                let datum = data[index];
                transformedData.push(ObjectSerializer.deserialize(datum, subType));
            }
            return transformedData;
        } else if (type === "Date") {
            return new Date(data);
        } else {
            if (enumsMap[type]) {// is Enum
                return data;
            }

            if (!typeMap[type]) { // dont know the type
                return data;
            }
            let instance = new typeMap[type]();
            let attributeTypes = typeMap[type].getAttributeTypeMap();
            for (let index = 0; index < attributeTypes.length; index++) {
                let attributeType = attributeTypes[index];
                instance[attributeType.name] = ObjectSerializer.deserialize(data[attributeType.baseName], attributeType.type);
            }
            return instance;
        }
    }
}

export interface Authentication {
    /**
    * Apply authentication settings to header and query params.
    */
    applyToRequest(requestOptions: localVarRequest.Options): Promise<void> | void;
}

export class HttpBasicAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        requestOptions.auth = {
            username: this.username, password: this.password
        }
    }
}

export class HttpBearerAuth implements Authentication {
    public accessToken: string | (() => string) = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            const accessToken = typeof this.accessToken === 'function'
                            ? this.accessToken()
                            : this.accessToken;
            requestOptions.headers["Authorization"] = "Bearer " + accessToken;
        }
    }
}

export class ApiKeyAuth implements Authentication {
    public apiKey: string = '';

    constructor(private location: string, private paramName: string) {
    }

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (this.location == "query") {
            (<any>requestOptions.qs)[this.paramName] = this.apiKey;
        } else if (this.location == "header" && requestOptions && requestOptions.headers) {
            requestOptions.headers[this.paramName] = this.apiKey;
        } else if (this.location == 'cookie' && requestOptions && requestOptions.headers) {
            if (requestOptions.headers['Cookie']) {
                requestOptions.headers['Cookie'] += '; ' + this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
            else {
                requestOptions.headers['Cookie'] = this.paramName + '=' + encodeURIComponent(this.apiKey);
            }
        }
    }
}

export class OAuth implements Authentication {
    public accessToken: string = '';

    applyToRequest(requestOptions: localVarRequest.Options): void {
        if (requestOptions && requestOptions.headers) {
            requestOptions.headers["Authorization"] = "Bearer " + this.accessToken;
        }
    }
}

export class VoidAuth implements Authentication {
    public username: string = '';
    public password: string = '';

    applyToRequest(_: localVarRequest.Options): void {
        // Do nothing
    }
}

export type Interceptor = (requestOptions: localVarRequest.Options) => (Promise<void> | void);
