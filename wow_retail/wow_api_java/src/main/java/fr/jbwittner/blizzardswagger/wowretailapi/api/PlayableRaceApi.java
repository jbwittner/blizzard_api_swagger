/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.7.0
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


import fr.jbwittner.blizzardswagger.wowretailapi.model.ArrayRacesIndexData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.PlayableRaceData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayableRaceApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public PlayableRaceApi() {
        this(Configuration.getDefaultApiClient());
    }

    public PlayableRaceApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for getPlayableRaceById
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param raceId The ID of the playable race. (required)
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
    public okhttp3.Call getPlayableRaceByIdCall(String namespace, String region, Integer raceId, String locale, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/wow/playable-race/{raceId}"
            .replaceAll("\\{" + "raceId" + "\\}", localVarApiClient.escapeString(raceId.toString()));

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuthAuthorizationCode" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPlayableRaceByIdValidateBeforeCall(String namespace, String region, Integer raceId, String locale, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getPlayableRaceById(Async)");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new ApiException("Missing the required parameter 'region' when calling getPlayableRaceById(Async)");
        }
        
        // verify the required parameter 'raceId' is set
        if (raceId == null) {
            throw new ApiException("Missing the required parameter 'raceId' when calling getPlayableRaceById(Async)");
        }
        

        okhttp3.Call localVarCall = getPlayableRaceByIdCall(namespace, region, raceId, locale, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns a playable race by ID.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param raceId The ID of the playable race. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return PlayableRaceData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public PlayableRaceData getPlayableRaceById(String namespace, String region, Integer raceId, String locale) throws ApiException {
        ApiResponse<PlayableRaceData> localVarResp = getPlayableRaceByIdWithHttpInfo(namespace, region, raceId, locale);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns a playable race by ID.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param raceId The ID of the playable race. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return ApiResponse&lt;PlayableRaceData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<PlayableRaceData> getPlayableRaceByIdWithHttpInfo(String namespace, String region, Integer raceId, String locale) throws ApiException {
        okhttp3.Call localVarCall = getPlayableRaceByIdValidateBeforeCall(namespace, region, raceId, locale, null);
        Type localVarReturnType = new TypeToken<PlayableRaceData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a playable race by ID.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param raceId The ID of the playable race. (required)
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
    public okhttp3.Call getPlayableRaceByIdAsync(String namespace, String region, Integer raceId, String locale, final ApiCallback<PlayableRaceData> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlayableRaceByIdValidateBeforeCall(namespace, region, raceId, locale, _callback);
        Type localVarReturnType = new TypeToken<PlayableRaceData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getPlayableRaceIndex
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
    public okhttp3.Call getPlayableRaceIndexCall(String namespace, String region, String locale, final ApiCallback _callback) throws ApiException {
        String basePath = null;

        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/wow/playable-race/index";

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
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "oAuthAuthorizationCode" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getPlayableRaceIndexValidateBeforeCall(String namespace, String region, String locale, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getPlayableRaceIndex(Async)");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new ApiException("Missing the required parameter 'region' when calling getPlayableRaceIndex(Async)");
        }
        

        okhttp3.Call localVarCall = getPlayableRaceIndexCall(namespace, region, locale, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns an index of playable races.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return ArrayRacesIndexData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ArrayRacesIndexData getPlayableRaceIndex(String namespace, String region, String locale) throws ApiException {
        ApiResponse<ArrayRacesIndexData> localVarResp = getPlayableRaceIndexWithHttpInfo(namespace, region, locale);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns an index of playable races.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return ApiResponse&lt;ArrayRacesIndexData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ArrayRacesIndexData> getPlayableRaceIndexWithHttpInfo(String namespace, String region, String locale) throws ApiException {
        okhttp3.Call localVarCall = getPlayableRaceIndexValidateBeforeCall(namespace, region, locale, null);
        Type localVarReturnType = new TypeToken<ArrayRacesIndexData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns an index of playable races.
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
    public okhttp3.Call getPlayableRaceIndexAsync(String namespace, String region, String locale, final ApiCallback<ArrayRacesIndexData> _callback) throws ApiException {

        okhttp3.Call localVarCall = getPlayableRaceIndexValidateBeforeCall(namespace, region, locale, _callback);
        Type localVarReturnType = new TypeToken<ArrayRacesIndexData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
