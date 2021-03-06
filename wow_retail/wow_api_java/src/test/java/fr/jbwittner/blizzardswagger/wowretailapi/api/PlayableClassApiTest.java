/*
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


package fr.jbwittner.blizzardswagger.wowretailapi.api;

import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.model.ArrayClassesIndexData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.PlayableClassData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.PlayableClassRaceMediaData;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlayableClassApi
 */
@Ignore
public class PlayableClassApiTest {

    private final PlayableClassApi api = new PlayableClassApi();

    
    /**
     * 
     *
     * Returns a playable class by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlayableClassByIdTest() throws ApiException {
        String namespace = null;
        String region = null;
        Integer classId = null;
        String locale = null;
                PlayableClassData response = api.getPlayableClassById(namespace, region, classId, locale);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns an index of playable classes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlayableClassIndexTest() throws ApiException {
        String namespace = null;
        String region = null;
        String locale = null;
                ArrayClassesIndexData response = api.getPlayableClassIndex(namespace, region, locale);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns media for a playable class by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPlayableClassMediaByIdTest() throws ApiException {
        String namespace = null;
        String region = null;
        Integer classId = null;
        String locale = null;
                PlayableClassRaceMediaData response = api.getPlayableClassMediaById(namespace, region, classId, locale);
        // TODO: test validations
    }
    
}
