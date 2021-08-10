/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.4.1
 * Contact: jeanbaptiste.wittner@outlook.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package fr.jbwittner.blizzardswagger.wowretailapi.api;

import fr.jbwittner.blizzardswagger.wowretailapi.ApiCallback;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiClient;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiResponse;
import fr.jbwittner.blizzardswagger.wowretailapi.Configuration;
import fr.jbwittner.blizzardswagger.wowretailapi.Pair;
import fr.jbwittner.blizzardswagger.wowretailapi.ProgressRequestBody;
import fr.jbwittner.blizzardswagger.wowretailapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import fr.jbwittner.blizzardswagger.wowretailapi.model.CharacterData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CharacterProfileApi {
    private ApiClient localVarApiClient;

    public CharacterProfileApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CharacterProfileApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getCharacter
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param realmSlug The slug of the realm. (required)
     * @param characterName The lowercase name of the character. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCharacterCall(String namespace, String region, String realmSlug, String characterName, String locale, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/profile/wow/character/{realmSlug}/{characterName}"
            .replaceAll("\\{" + "realmSlug" + "\\}", localVarApiClient.escapeString(realmSlug.toString()))
            .replaceAll("\\{" + "characterName" + "\\}", localVarApiClient.escapeString(characterName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (namespace != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("namespace", namespace));
        }

        if (region != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("region", region));
        }

        if (locale != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("locale", locale));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "oAuthAuthorizationCodeAPAC", "oAuthAuthorizationCodeCN", "oAuthAuthorizationCodeEU", "oAuthAuthorizationCodeUS" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCharacterValidateBeforeCall(String namespace, String region, String realmSlug, String characterName, String locale, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getCharacter(Async)");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new ApiException("Missing the required parameter 'region' when calling getCharacter(Async)");
        }
        
        // verify the required parameter 'realmSlug' is set
        if (realmSlug == null) {
            throw new ApiException("Missing the required parameter 'realmSlug' when calling getCharacter(Async)");
        }
        
        // verify the required parameter 'characterName' is set
        if (characterName == null) {
            throw new ApiException("Missing the required parameter 'characterName' when calling getCharacter(Async)");
        }
        

        okhttp3.Call localVarCall = getCharacterCall(namespace, region, realmSlug, characterName, locale, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a profile summary for a character.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param realmSlug The slug of the realm. (required)
     * @param characterName The lowercase name of the character. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return CharacterData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public CharacterData getCharacter(String namespace, String region, String realmSlug, String characterName, String locale) throws ApiException {
        ApiResponse<CharacterData> localVarResp = getCharacterWithHttpInfo(namespace, region, realmSlug, characterName, locale);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a profile summary for a character.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param realmSlug The slug of the realm. (required)
     * @param characterName The lowercase name of the character. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return ApiResponse&lt;CharacterData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CharacterData> getCharacterWithHttpInfo(String namespace, String region, String realmSlug, String characterName, String locale) throws ApiException {
        okhttp3.Call localVarCall = getCharacterValidateBeforeCall(namespace, region, realmSlug, characterName, locale, null);
        Type localVarReturnType = new TypeToken<CharacterData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a profile summary for a character.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param realmSlug The slug of the realm. (required)
     * @param characterName The lowercase name of the character. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getCharacterAsync(String namespace, String region, String realmSlug, String characterName, String locale, final ApiCallback<CharacterData> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCharacterValidateBeforeCall(namespace, region, realmSlug, characterName, locale, _callback);
        Type localVarReturnType = new TypeToken<CharacterData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
