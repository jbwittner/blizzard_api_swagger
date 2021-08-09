/*
 * Swagger BLIZZARD Api
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 0.2.0
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


import fr.jbwittner.blizzardswagger.wowretailapi.model.ArrayAssetData;
import fr.jbwittner.blizzardswagger.wowretailapi.model.ArrayCovenantIndexData;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CovenantApi {
    private ApiClient localVarApiClient;

    public CovenantApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CovenantApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for getCovenantIndex
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
    public okhttp3.Call getCovenantIndexCall(String namespace, String region, String locale, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/wow/covenant/index";

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

        String[] localVarAuthNames = new String[] { "oAuthSampleAPAC", "oAuthSampleCN", "oAuthSampleEU", "oAuthSampleUS" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCovenantIndexValidateBeforeCall(String namespace, String region, String locale, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getCovenantIndex(Async)");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new ApiException("Missing the required parameter 'region' when calling getCovenantIndex(Async)");
        }
        

        okhttp3.Call localVarCall = getCovenantIndexCall(namespace, region, locale, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns an index of covenants.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return ArrayCovenantIndexData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ArrayCovenantIndexData getCovenantIndex(String namespace, String region, String locale) throws ApiException {
        ApiResponse<ArrayCovenantIndexData> localVarResp = getCovenantIndexWithHttpInfo(namespace, region, locale);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns an index of covenants.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return ApiResponse&lt;ArrayCovenantIndexData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ArrayCovenantIndexData> getCovenantIndexWithHttpInfo(String namespace, String region, String locale) throws ApiException {
        okhttp3.Call localVarCall = getCovenantIndexValidateBeforeCall(namespace, region, locale, null);
        Type localVarReturnType = new TypeToken<ArrayCovenantIndexData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns an index of covenants.
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
    public okhttp3.Call getCovenantIndexAsync(String namespace, String region, String locale, final ApiCallback<ArrayCovenantIndexData> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCovenantIndexValidateBeforeCall(namespace, region, locale, _callback);
        Type localVarReturnType = new TypeToken<ArrayCovenantIndexData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getCovenantMediaById
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param covenantId The ID of the covenant. (required)
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
    public okhttp3.Call getCovenantMediaByIdCall(String namespace, String region, Integer covenantId, String locale, final ApiCallback _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/data/wow/media/covenant/{covenantId}"
            .replaceAll("\\{" + "covenantId" + "\\}", localVarApiClient.escapeString(covenantId.toString()));

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

        String[] localVarAuthNames = new String[] { "oAuthSampleAPAC", "oAuthSampleCN", "oAuthSampleEU", "oAuthSampleUS" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getCovenantMediaByIdValidateBeforeCall(String namespace, String region, Integer covenantId, String locale, final ApiCallback _callback) throws ApiException {
        
        // verify the required parameter 'namespace' is set
        if (namespace == null) {
            throw new ApiException("Missing the required parameter 'namespace' when calling getCovenantMediaById(Async)");
        }
        
        // verify the required parameter 'region' is set
        if (region == null) {
            throw new ApiException("Missing the required parameter 'region' when calling getCovenantMediaById(Async)");
        }
        
        // verify the required parameter 'covenantId' is set
        if (covenantId == null) {
            throw new ApiException("Missing the required parameter 'covenantId' when calling getCovenantMediaById(Async)");
        }
        

        okhttp3.Call localVarCall = getCovenantMediaByIdCall(namespace, region, covenantId, locale, _callback);
        return localVarCall;

    }

    /**
     * 
     * Returns media for a covenant by ID.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param covenantId The ID of the covenant. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return ArrayAssetData
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ArrayAssetData getCovenantMediaById(String namespace, String region, Integer covenantId, String locale) throws ApiException {
        ApiResponse<ArrayAssetData> localVarResp = getCovenantMediaByIdWithHttpInfo(namespace, region, covenantId, locale);
        return localVarResp.getData();
    }

    /**
     * 
     * Returns media for a covenant by ID.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param covenantId The ID of the covenant. (required)
     * @param locale The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) (optional)
     * @return ApiResponse&lt;ArrayAssetData&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> successful operation </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ArrayAssetData> getCovenantMediaByIdWithHttpInfo(String namespace, String region, Integer covenantId, String locale) throws ApiException {
        okhttp3.Call localVarCall = getCovenantMediaByIdValidateBeforeCall(namespace, region, covenantId, locale, null);
        Type localVarReturnType = new TypeToken<ArrayAssetData>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns media for a covenant by ID.
     * @param namespace The namespace to use to locate this document. (required)
     * @param region The region of the data to retrieve. (required)
     * @param covenantId The ID of the covenant. (required)
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
    public okhttp3.Call getCovenantMediaByIdAsync(String namespace, String region, Integer covenantId, String locale, final ApiCallback<ArrayAssetData> _callback) throws ApiException {

        okhttp3.Call localVarCall = getCovenantMediaByIdValidateBeforeCall(namespace, region, covenantId, locale, _callback);
        Type localVarReturnType = new TypeToken<ArrayAssetData>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}