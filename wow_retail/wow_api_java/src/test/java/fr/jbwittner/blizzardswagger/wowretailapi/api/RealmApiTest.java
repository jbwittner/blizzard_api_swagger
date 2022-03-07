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
import fr.jbwittner.blizzardswagger.wowretailapi.model.ArrayRealmsIndexData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.RealmData;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RealmApi
 */
@Ignore
public class RealmApiTest {

    private final RealmApi api = new RealmApi();

    
    /**
     * 
     *
     * Returns a single realm by slug or ID.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRealmBySlugTest() throws ApiException {
        String namespace = null;
        String region = null;
        String realmSlug = null;
        String locale = null;
                RealmData response = api.getRealmBySlug(namespace, region, realmSlug, locale);
        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns an index of realms.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getRealmIndexTest() throws ApiException {
        String namespace = null;
        String region = null;
        String locale = null;
                ArrayRealmsIndexData response = api.getRealmIndex(namespace, region, locale);
        // TODO: test validations
    }
    
}
