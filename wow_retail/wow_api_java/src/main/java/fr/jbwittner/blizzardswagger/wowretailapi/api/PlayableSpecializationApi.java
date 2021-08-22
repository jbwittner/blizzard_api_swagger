/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.5.0
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


import fr.jbwittner.blizzardswagger.wowretailapi.model.ArraySpecializationsIndexData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.PlayableClassRaceMediaData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.PlayableSpecializationData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayableSpecializationApi {
    private ApiClient localVarApiClient;

    public PlayableSpecializationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PlayableSpecializationApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getPlayableSpecializationById
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param specId The ID of the playable specialization. (required)
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
    public okhttp3.Call getPlayableSpecializationByIdCall(String namespace, String region, Integer specId, String locale, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/wow/playable-specialization/{specId}"
            .replaceAll("\\{" + "specId" + "\\}", localVarApiClient.escapeString(specId.toString()));

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
    private okhttp3.Call getPlayableSpecializationByIdValidateBeforeCall(String namespace, String region, Integer specId, String locale, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getPlayableSpecializationById(Async)");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new ApiException("Missing the required parameter 'region' when calling getPlayableSpecializationById(Async)");
        }
        
        // verify the required parameter 'specId' is set
        if (specId == null) {
            throw new ApiException("Missing the required parameter 'specId' when calling getPlayableSpecializationById(Async)");
        }
        

        okhttp3.Call localVarCall = getPlayableSpecializationByIdCall(namespace, region, specId, locale, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a playable specialization by ID.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param specId The ID of the playable specialization. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return PlayableSpecializationData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public PlayableSpecializationData getPlayableSpecializationById(String namespace, String region, Integer specId, String locale) throws ApiException {
        ApiResponse<PlayableSpecializationData> localVarResp = getPlayableSpecializationByIdWithHttpInfo(namespace, region, specId, locale);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a playable specialization by ID.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param specId The ID of the playable specialization. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return ApiResponse&lt;PlayableSpecializationData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PlayableSpecializationData> getPlayableSpecializationByIdWithHttpInfo(String namespace, String region, Integer specId, String locale) throws ApiException {
        okhttp3.Call localVarCall = getPlayableSpecializationByIdValidateBeforeCall(namespace, region, specId, locale, null);
        Type localVarReturnType = new TypeToken<PlayableSpecializationData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a playable specialization by ID.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param specId The ID of the playable specialization. (required)
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
    public okhttp3.Call getPlayableSpecializationByIdAsync(String namespace, String region, Integer specId, String locale, final ApiCallback<PlayableSpecializationData> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlayableSpecializationByIdValidateBeforeCall(namespace, region, specId, locale, _callback);
        Type localVarReturnType = new TypeToken<PlayableSpecializationData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPlayableSpecializationIndex
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
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
    public okhttp3.Call getPlayableSpecializationIndexCall(String namespace, String region, String locale, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/wow/playable-specialization/index";

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
    private okhttp3.Call getPlayableSpecializationIndexValidateBeforeCall(String namespace, String region, String locale, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getPlayableSpecializationIndex(Async)");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new ApiException("Missing the required parameter 'region' when calling getPlayableSpecializationIndex(Async)");
        }
        

        okhttp3.Call localVarCall = getPlayableSpecializationIndexCall(namespace, region, locale, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns an index of playable specializations.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return ArraySpecializationsIndexData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ArraySpecializationsIndexData getPlayableSpecializationIndex(String namespace, String region, String locale) throws ApiException {
        ApiResponse<ArraySpecializationsIndexData> localVarResp = getPlayableSpecializationIndexWithHttpInfo(namespace, region, locale);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns an index of playable specializations.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return ApiResponse&lt;ArraySpecializationsIndexData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ArraySpecializationsIndexData> getPlayableSpecializationIndexWithHttpInfo(String namespace, String region, String locale) throws ApiException {
        okhttp3.Call localVarCall = getPlayableSpecializationIndexValidateBeforeCall(namespace, region, locale, null);
        Type localVarReturnType = new TypeToken<ArraySpecializationsIndexData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns an index of playable specializations.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
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
    public okhttp3.Call getPlayableSpecializationIndexAsync(String namespace, String region, String locale, final ApiCallback<ArraySpecializationsIndexData> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlayableSpecializationIndexValidateBeforeCall(namespace, region, locale, _callback);
        Type localVarReturnType = new TypeToken<ArraySpecializationsIndexData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPlayableSpecializationMediaById
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param specId The ID of the playable specialization. (required)
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
    public okhttp3.Call getPlayableSpecializationMediaByIdCall(String namespace, String region, Integer specId, String locale, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/wow/media/playable-specialization/{specId}"
            .replaceAll("\\{" + "specId" + "\\}", localVarApiClient.escapeString(specId.toString()));

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
    private okhttp3.Call getPlayableSpecializationMediaByIdValidateBeforeCall(String namespace, String region, Integer specId, String locale, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getPlayableSpecializationMediaById(Async)");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new ApiException("Missing the required parameter 'region' when calling getPlayableSpecializationMediaById(Async)");
        }
        
        // verify the required parameter 'specId' is set
        if (specId == null) {
            throw new ApiException("Missing the required parameter 'specId' when calling getPlayableSpecializationMediaById(Async)");
        }
        

        okhttp3.Call localVarCall = getPlayableSpecializationMediaByIdCall(namespace, region, specId, locale, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns media for a playable specialization by ID.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param specId The ID of the playable specialization. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return PlayableClassRaceMediaData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public PlayableClassRaceMediaData getPlayableSpecializationMediaById(String namespace, String region, Integer specId, String locale) throws ApiException {
        ApiResponse<PlayableClassRaceMediaData> localVarResp = getPlayableSpecializationMediaByIdWithHttpInfo(namespace, region, specId, locale);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns media for a playable specialization by ID.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param specId The ID of the playable specialization. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return ApiResponse&lt;PlayableClassRaceMediaData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PlayableClassRaceMediaData> getPlayableSpecializationMediaByIdWithHttpInfo(String namespace, String region, Integer specId, String locale) throws ApiException {
        okhttp3.Call localVarCall = getPlayableSpecializationMediaByIdValidateBeforeCall(namespace, region, specId, locale, null);
        Type localVarReturnType = new TypeToken<PlayableClassRaceMediaData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns media for a playable specialization by ID.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param specId The ID of the playable specialization. (required)
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
    public okhttp3.Call getPlayableSpecializationMediaByIdAsync(String namespace, String region, Integer specId, String locale, final ApiCallback<PlayableClassRaceMediaData> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlayableSpecializationMediaByIdValidateBeforeCall(namespace, region, specId, locale, _callback);
        Type localVarReturnType = new TypeToken<PlayableClassRaceMediaData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
