# PlayableRaceApi

All URIs are relative to *https://eu.api.blizzard.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPlayableRaceById**](PlayableRaceApi.md#getPlayableRaceById) | **GET** /data/wow/playable-race/{raceId} | 
[**getPlayableRaceIndex**](PlayableRaceApi.md#getPlayableRaceIndex) | **GET** /data/wow/playable-race/index | 


<a name="getPlayableRaceById"></a>
# **getPlayableRaceById**
> PlayableRaceData getPlayableRaceById(namespace, region, raceId, locale)



Returns a playable race by ID.

### Example
```java
// Import classes:
import fr.jbwittner.blizzardswagger.wowretailapi.ApiClient;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.Configuration;
import fr.jbwittner.blizzardswagger.wowretailapi.auth.*;
import fr.jbwittner.blizzardswagger.wowretailapi.models.*;
import fr.jbwittner.blizzardswagger.wowretailapi.api.PlayableRaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.blizzard.com");
    
    // Configure OAuth2 access token for authorization: oAuthAuthorizationCodeAPAC
    OAuth oAuthAuthorizationCodeAPAC = (OAuth) defaultClient.getAuthentication("oAuthAuthorizationCodeAPAC");
    oAuthAuthorizationCodeAPAC.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oAuthAuthorizationCodeCN
    OAuth oAuthAuthorizationCodeCN = (OAuth) defaultClient.getAuthentication("oAuthAuthorizationCodeCN");
    oAuthAuthorizationCodeCN.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oAuthAuthorizationCodeEU
    OAuth oAuthAuthorizationCodeEU = (OAuth) defaultClient.getAuthentication("oAuthAuthorizationCodeEU");
    oAuthAuthorizationCodeEU.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oAuthAuthorizationCodeUS
    OAuth oAuthAuthorizationCodeUS = (OAuth) defaultClient.getAuthentication("oAuthAuthorizationCodeUS");
    oAuthAuthorizationCodeUS.setAccessToken("YOUR ACCESS TOKEN");

    PlayableRaceApi apiInstance = new PlayableRaceApi(defaultClient);
    String namespace = "static-eu"; // String | The namespace to use to locate this document.
    String region = "eu"; // String | The region of the data to retrieve.
    Integer raceId = 56; // Integer | The ID of the playable race.
    String locale = "en_US"; // String | The locale to reflect in localized data. (If you don't send a value, the API sends you all localized data)
    try {
      PlayableRaceData result = apiInstance.getPlayableRaceById(namespace, region, raceId, locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayableRaceApi#getPlayableRaceById");
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
 **raceId** | **Integer**| The ID of the playable race. |
 **locale** | **String**| The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) | [optional] [enum: en_US, es_MX, pt_BR, de_DE, en_GB, es_ES, fr_FR, it_IT, ru_RU, ko_KR, zh_TW, zh_CN]

### Return type

[**PlayableRaceData**](PlayableRaceData.md)

### Authorization

[oAuthAuthorizationCodeAPAC](../README.md#oAuthAuthorizationCodeAPAC), [oAuthAuthorizationCodeCN](../README.md#oAuthAuthorizationCodeCN), [oAuthAuthorizationCodeEU](../README.md#oAuthAuthorizationCodeEU), [oAuthAuthorizationCodeUS](../README.md#oAuthAuthorizationCodeUS)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="getPlayableRaceIndex"></a>
# **getPlayableRaceIndex**
> ArrayRacesIndexData getPlayableRaceIndex(namespace, region, locale)



Returns an index of playable races.

### Example
```java
// Import classes:
import fr.jbwittner.blizzardswagger.wowretailapi.ApiClient;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.Configuration;
import fr.jbwittner.blizzardswagger.wowretailapi.auth.*;
import fr.jbwittner.blizzardswagger.wowretailapi.models.*;
import fr.jbwittner.blizzardswagger.wowretailapi.api.PlayableRaceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://eu.api.blizzard.com");
    
    // Configure OAuth2 access token for authorization: oAuthAuthorizationCodeAPAC
    OAuth oAuthAuthorizationCodeAPAC = (OAuth) defaultClient.getAuthentication("oAuthAuthorizationCodeAPAC");
    oAuthAuthorizationCodeAPAC.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oAuthAuthorizationCodeCN
    OAuth oAuthAuthorizationCodeCN = (OAuth) defaultClient.getAuthentication("oAuthAuthorizationCodeCN");
    oAuthAuthorizationCodeCN.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oAuthAuthorizationCodeEU
    OAuth oAuthAuthorizationCodeEU = (OAuth) defaultClient.getAuthentication("oAuthAuthorizationCodeEU");
    oAuthAuthorizationCodeEU.setAccessToken("YOUR ACCESS TOKEN");

    // Configure OAuth2 access token for authorization: oAuthAuthorizationCodeUS
    OAuth oAuthAuthorizationCodeUS = (OAuth) defaultClient.getAuthentication("oAuthAuthorizationCodeUS");
    oAuthAuthorizationCodeUS.setAccessToken("YOUR ACCESS TOKEN");

    PlayableRaceApi apiInstance = new PlayableRaceApi(defaultClient);
    String namespace = "static-eu"; // String | The namespace to use to locate this document.
    String region = "eu"; // String | The region of the data to retrieve.
    String locale = "en_US"; // String | The locale to reflect in localized data. (If you don't send a value, the API sends you all localized data)
    try {
      ArrayRacesIndexData result = apiInstance.getPlayableRaceIndex(namespace, region, locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PlayableRaceApi#getPlayableRaceIndex");
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

[**ArrayRacesIndexData**](ArrayRacesIndexData.md)

### Authorization

[oAuthAuthorizationCodeAPAC](../README.md#oAuthAuthorizationCodeAPAC), [oAuthAuthorizationCodeCN](../README.md#oAuthAuthorizationCodeCN), [oAuthAuthorizationCodeEU](../README.md#oAuthAuthorizationCodeEU), [oAuthAuthorizationCodeUS](../README.md#oAuthAuthorizationCodeUS)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

