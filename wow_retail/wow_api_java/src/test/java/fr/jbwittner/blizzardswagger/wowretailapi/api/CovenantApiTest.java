/*
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


package fr.jbwittner.blizzardswagger.wowretailapi.api;

import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.model.ArrayAssetData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.ArrayCovenantIndexData;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for CovenantApi
 */
@Ignore
public class CovenantApiTest {

    private final CovenantApi api = new CovenantApi();

    
    /**
     * 
     *
     * Returns an index of covenants.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCovenantIndexTest() throws ApiException {
        String namespace = null;
        String region = null;
        String locale = null;
                ArrayCovenantIndexData response = api.getCovenantIndex(namespace, region, locale);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns media for a covenant by ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCovenantMediaByIdTest() throws ApiException {
        String namespace = null;
        String region = null;
        Integer covenantId = null;
        String locale = null;
                ArrayAssetData response = api.getCovenantMediaById(namespace, region, covenantId, locale);
        // TODO: test validations
    }
    
}
