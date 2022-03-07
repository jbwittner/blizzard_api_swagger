export * from './accountProfileApi';
import { AccountProfileApi } from './accountProfileApi';
export * from './characterMediaApi';
import { CharacterMediaApi } from './characterMediaApi';
export * from './characterProfileApi';
import { CharacterProfileApi } from './characterProfileApi';
export * from './covenantApi';
import { CovenantApi } from './covenantApi';
export * from './playableClassApi';
import { PlayableClassApi } from './playableClassApi';
export * from './playableRaceApi';
import { PlayableRaceApi } from './playableRaceApi';
export * from './playableSpecializationApi';
import { PlayableSpecializationApi } from './playableSpecializationApi';
export * from './realmApi';
import { RealmApi } from './realmApi';
import * as http from 'http';

export class HttpError extends Error {
    constructor (public response: http.IncomingMessage, public body: any, public statusCode?: number) {
        super('HTTP request failed');
        this.name = 'HttpError';
    }
}

export { RequestFile } from '../model/models';

export const APIS = [AccountProfileApi, CharacterMediaApi, CharacterProfileApi, CovenantApi, PlayableClassApi, PlayableRaceApi, PlayableSpecializationApi, RealmApi];
