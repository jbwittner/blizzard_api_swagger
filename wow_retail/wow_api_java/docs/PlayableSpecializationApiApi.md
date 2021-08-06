# PlayableSpecializationApiApi

All URIs are relative to *https://eu.api.blizzard.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlayableSpecializationById**](PlayableSpecializationApiApi.md#getPlayableSpecializationById) | **GET** /data/wow/playable-specialization/{specId} | 
[**getPlayableSpecializationIndex**](PlayableSpecializationApiApi.md#getPlayableSpecializationIndex) | **GET** /data/wow/playable-specialization/index | 
[**getPlayableSpecializationMediaById**](PlayableSpecializationApiApi.md#getPlayableSpecializationMediaById) | **GET** /data/wow/media/playable-specialization/{specId} | 


<a name="getPlayableSpecializationById"></a>
# **getPlayableSpecializationById**
> PlayableRaceDTO getPlayableSpecializationById(namespace, region, specId, locale)



Returns a playable specialization by ID.

### Example
```java
// Import classes:
import fr.jbwittner.blizzardswagger.wowretailapi.ApiClient;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.Configuration;
import fr.jbwittner.blizzardswagger.wowretailapi.auth.*;
import fr.jbwittner.blizzardswagger.wowretailapi.models.*;
import fr.jbwittner.blizzardswagger.wowretailapi.api.PlayableSpecializationApiApi;

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

    PlayableSpecializationApiApi apiInstance = new PlayableSpecializationApiApi(defaultClient);
    String namespace = "static-eu"; // String | The namespace to use to locate this document.
    String region = "eu"; // String | The region of the data to retrieve.
    Integer specId = 56; // Integer | The ID of the playable specialization.
    String locale = "en_US"; // String | The locale to reflect in localized data. (If you don't send a value, the API sends you all localized data)
    try {
      PlayableRaceDTO result = apiInstance.getPlayableSpecializationById(namespace, region, specId, locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayableSpecializationApiApi#getPlayableSpecializationById");
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
 **specId** | **Integer**| The ID of the playable specialization. |
 **locale** | **String**| The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) | [optional] [enum: en_US, es_MX, pt_BR, de_DE, en_GB, es_ES, fr_FR, it_IT, ru_RU, ko_KR, zh_TW, zh_CN]

### Return type

[**PlayableRaceDTO**](PlayableRaceDTO.md)

### Authorization

[oAuthSampleAPAC](../README.md#oAuthSampleAPAC), [oAuthSampleCN](../README.md#oAuthSampleCN), [oAuthSampleEU](../README.md#oAuthSampleEU), [oAuthSampleUS](../README.md#oAuthSampleUS)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="getPlayableSpecializationIndex"></a>
# **getPlayableSpecializationIndex**
> ArraySpecializationsIndexDTO getPlayableSpecializationIndex(namespace, region, locale)



Returns an index of playable specializations.

### Example
```java
// Import classes:
import fr.jbwittner.blizzardswagger.wowretailapi.ApiClient;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.Configuration;
import fr.jbwittner.blizzardswagger.wowretailapi.auth.*;
import fr.jbwittner.blizzardswagger.wowretailapi.models.*;
import fr.jbwittner.blizzardswagger.wowretailapi.api.PlayableSpecializationApiApi;

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

    PlayableSpecializationApiApi apiInstance = new PlayableSpecializationApiApi(defaultClient);
    String namespace = "static-eu"; // String | The namespace to use to locate this document.
    String region = "eu"; // String | The region of the data to retrieve.
    String locale = "en_US"; // String | The locale to reflect in localized data. (If you don't send a value, the API sends you all localized data)
    try {
      ArraySpecializationsIndexDTO result = apiInstance.getPlayableSpecializationIndex(namespace, region, locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayableSpecializationApiApi#getPlayableSpecializationIndex");
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

[**ArraySpecializationsIndexDTO**](ArraySpecializationsIndexDTO.md)

### Authorization

[oAuthSampleAPAC](../README.md#oAuthSampleAPAC), [oAuthSampleCN](../README.md#oAuthSampleCN), [oAuthSampleEU](../README.md#oAuthSampleEU), [oAuthSampleUS](../README.md#oAuthSampleUS)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="getPlayableSpecializationMediaById"></a>
# **getPlayableSpecializationMediaById**
> PlayableClassRaceMediaDTO getPlayableSpecializationMediaById(namespace, region, specId, locale)



Returns media for a playable specialization by ID.

### Example
```java
// Import classes:
import fr.jbwittner.blizzardswagger.wowretailapi.ApiClient;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.Configuration;
import fr.jbwittner.blizzardswagger.wowretailapi.auth.*;
import fr.jbwittner.blizzardswagger.wowretailapi.models.*;
import fr.jbwittner.blizzardswagger.wowretailapi.api.PlayableSpecializationApiApi;

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

    PlayableSpecializationApiApi apiInstance = new PlayableSpecializationApiApi(defaultClient);
    String namespace = "static-eu"; // String | The namespace to use to locate this document.
    String region = "eu"; // String | The region of the data to retrieve.
    Integer specId = 56; // Integer | The ID of the playable specialization.
    String locale = "en_US"; // String | The locale to reflect in localized data. (If you don't send a value, the API sends you all localized data)
    try {
      PlayableClassRaceMediaDTO result = apiInstance.getPlayableSpecializationMediaById(namespace, region, specId, locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayableSpecializationApiApi#getPlayableSpecializationMediaById");
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
 **specId** | **Integer**| The ID of the playable specialization. |
 **locale** | **String**| The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) | [optional] [enum: en_US, es_MX, pt_BR, de_DE, en_GB, es_ES, fr_FR, it_IT, ru_RU, ko_KR, zh_TW, zh_CN]

### Return type

[**PlayableClassRaceMediaDTO**](PlayableClassRaceMediaDTO.md)

### Authorization

[oAuthSampleAPAC](../README.md#oAuthSampleAPAC), [oAuthSampleCN](../README.md#oAuthSampleCN), [oAuthSampleEU](../README.md#oAuthSampleEU), [oAuthSampleUS](../README.md#oAuthSampleUS)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

