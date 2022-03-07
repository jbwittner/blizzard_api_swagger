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
import fr.jbwittner.blizzardswagger.wowretailapi.model.CharacterMediaData;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CharacterMediaApi
 */
@Ignore
public class CharacterMediaApiTest {

    private final CharacterMediaApi api = new CharacterMediaApi();

    
    /**
     * 
     *
     * Returns a summary of the media assets available for a character (such as an avatar render).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCharacterMediaTest() throws ApiException {
        String namespace = null;
        String region = null;
        String realmSlug = null;
        String characterName = null;
        String locale = null;
                CharacterMediaData response = api.getCharacterMedia(namespace, region, realmSlug, characterName, locale);
        // TODO: test validations
    }
    
}
