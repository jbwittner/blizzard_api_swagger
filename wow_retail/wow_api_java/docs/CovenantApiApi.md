# CovenantApiApi

All URIs are relative to *https://eu.api.blizzard.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCovenantIndex**](CovenantApiApi.md#getCovenantIndex) | **GET** /data/wow/covenant/index | 
[**getCovenantMediaById**](CovenantApiApi.md#getCovenantMediaById) | **GET** /data/wow/media/covenant/{covenantId} | 


<a name="getCovenantIndex"></a>
# **getCovenantIndex**
> ArrayCovenantIndexDTO getCovenantIndex(namespace, region, locale)



Returns an index of covenants.

### Example
```java
// Import classes:
import fr.jbwittner.blizzardswagger.wowretailapi.ApiClient;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.Configuration;
import fr.jbwittner.blizzardswagger.wowretailapi.auth.*;
import fr.jbwittner.blizzardswagger.wowretailapi.models.*;
import fr.jbwittner.blizzardswagger.wowretailapi.api.CovenantApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.blizzard.com");
    
    // Configure OAuth2 access token for authorization: oAuthSampleAPAC
    OAuth oAuthSampleAPAC = (OAuth) defaultClient.getAuthentication("oAuthSampleAPAC");
    oAuthSampleAPAC.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oAuthSampleCN
    OAuth oAuthSampleCN = (OAuth) defaultClient.getAuthentication("oAuthSampleCN");
    oAuthSampleCN.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oAuthSampleEU
    OAuth oAuthSampleEU = (OAuth) defaultClient.getAuthentication("oAuthSampleEU");
    oAuthSampleEU.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oAuthSampleUS
    OAuth oAuthSampleUS = (OAuth) defaultClient.getAuthentication("oAuthSampleUS");
    oAuthSampleUS.setAccessToken("YOUR ACCESS TOKEN");

    CovenantApiApi apiInstance = new CovenantApiApi(defaultClient);
    String namespace = "static-eu"; // String | The namespace to use to locate this document.
    String region = "eu"; // String | The region of the data to retrieve.
    String locale = "en_US"; // String | The locale to reflect in localized data. (If you don't send a value, the API sends you all localized data)
    try {
      ArrayCovenantIndexDTO result = apiInstance.getCovenantIndex(namespace, region, locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CovenantApiApi#getCovenantIndex");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| The namespace to use to locate this document. | [enum: static-eu, static-us, static-kr, static-tw, static-cn]
 **region** | **String**| The region of the data to retrieve. | [enum: eu, us, kr, tw, cn]
 **locale** | **String**| The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) | [optional] [enum: en_US, es_MX, pt_BR, de_DE, en_GB, es_ES, fr_FR, it_IT, ru_RU, ko_KR, zh_TW, zh_CN]

### Return type

[**ArrayCovenantIndexDTO**](ArrayCovenantIndexDTO.md)

### Authorization

[oAuthSampleAPAC](../README.md#oAuthSampleAPAC), [oAuthSampleCN](../README.md#oAuthSampleCN), [oAuthSampleEU](../README.md#oAuthSampleEU), [oAuthSampleUS](../README.md#oAuthSampleUS)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="getCovenantMediaById"></a>
# **getCovenantMediaById**
> ArrayAssetDTO getCovenantMediaById(namespace, region, covenantId, locale)



Returns media for a covenant by ID.

### Example
```java
// Import classes:
import fr.jbwittner.blizzardswagger.wowretailapi.ApiClient;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.Configuration;
import fr.jbwittner.blizzardswagger.wowretailapi.auth.*;
import fr.jbwittner.blizzardswagger.wowretailapi.models.*;
import fr.jbwittner.blizzardswagger.wowretailapi.api.CovenantApiApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.blizzard.com");
    
    // Configure OAuth2 access token for authorization: oAuthSampleAPAC
    OAuth oAuthSampleAPAC = (OAuth) defaultClient.getAuthentication("oAuthSampleAPAC");
    oAuthSampleAPAC.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oAuthSampleCN
    OAuth oAuthSampleCN = (OAuth) defaultClient.getAuthentication("oAuthSampleCN");
    oAuthSampleCN.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oAuthSampleEU
    OAuth oAuthSampleEU = (OAuth) defaultClient.getAuthentication("oAuthSampleEU");
    oAuthSampleEU.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oAuthSampleUS
    OAuth oAuthSampleUS = (OAuth) defaultClient.getAuthentication("oAuthSampleUS");
    oAuthSampleUS.setAccessToken("YOUR ACCESS TOKEN");

    CovenantApiApi apiInstance = new CovenantApiApi(defaultClient);
    String namespace = "static-eu"; // String | The namespace to use to locate this document.
    String region = "eu"; // String | The region of the data to retrieve.
    Integer covenantId = 56; // Integer | The ID of the covenant.
    String locale = "en_US"; // String | The locale to reflect in localized data. (If you don't send a value, the API sends you all localized data)
    try {
      ArrayAssetDTO result = apiInstance.getCovenantMediaById(namespace, region, covenantId, locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CovenantApiApi#getCovenantMediaById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **namespace** | **String**| The namespace to use to locate this document. | [enum: static-eu, static-us, static-kr, static-tw, static-cn]
 **region** | **String**| The region of the data to retrieve. | [enum: eu, us, kr, tw, cn]
 **covenantId** | **Integer**| The ID of the covenant. |
 **locale** | **String**| The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) | [optional] [enum: en_US, es_MX, pt_BR, de_DE, en_GB, es_ES, fr_FR, it_IT, ru_RU, ko_KR, zh_TW, zh_CN]

### Return type

[**ArrayAssetDTO**](ArrayAssetDTO.md)

### Authorization

[oAuthSampleAPAC](../README.md#oAuthSampleAPAC), [oAuthSampleCN](../README.md#oAuthSampleCN), [oAuthSampleEU](../README.md#oAuthSampleEU), [oAuthSampleUS](../README.md#oAuthSampleUS)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

