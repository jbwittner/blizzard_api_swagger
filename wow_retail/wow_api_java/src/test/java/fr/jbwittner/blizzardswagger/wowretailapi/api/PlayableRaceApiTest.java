/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.5.3
 * Contact: jeanbaptiste.wittner@outlook.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.jbwittner.blizzardswagger.wowretailapi.api;

import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.model.ArrayRacesIndexData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.PlayableRaceData;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlayableRaceApi
 */
@Ignore
public class PlayableRaceApiTest {

    private final PlayableRaceApi api = new PlayableRaceApi();

    
    /**
     * 
     *
     * Returns a playable race by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlayableRaceByIdTest() throws ApiException {
        String namespace = null;
        String region = null;
        Integer raceId = null;
        String locale = null;
        PlayableRaceData response = api.getPlayableRaceById(namespace, region, raceId, locale);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns an index of playable races.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlayableRaceIndexTest() throws ApiException {
        String namespace = null;
        String region = null;
        String locale = null;
        ArrayRacesIndexData response = api.getPlayableRaceIndex(namespace, region, locale);

        // TODO: test validations
    }
    
}
