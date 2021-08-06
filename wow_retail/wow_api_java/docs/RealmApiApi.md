# RealmApiApi

All URIs are relative to *https://eu.api.blizzard.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRealm**](RealmApiApi.md#getRealm) | **GET** /data/wow/realm/{realmSlug} | 
[**getRealmIndex**](RealmApiApi.md#getRealmIndex) | **GET** /data/wow/realm/index | 


<a name="getRealm"></a>
# **getRealm**
> RealmDTO getRealm(namespace, region, realmSlug, locale)



Returns a single realm by slug or ID.

### Example
```java
// Import classes:
import fr.jbwittner.blizzardswagger.wowretailapi.ApiClient;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.Configuration;
import fr.jbwittner.blizzardswagger.wowretailapi.auth.*;
import fr.jbwittner.blizzardswagger.wowretailapi.models.*;
import fr.jbwittner.blizzardswagger.wowretailapi.api.RealmApiApi;

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

    RealmApiApi apiInstance = new RealmApiApi(defaultClient);
    String namespace = "dynamic-eu"; // String | The namespace to use to locate this document.
    String region = "eu"; // String | The region of the data to retrieve.
    String realmSlug = "realmSlug_example"; // String | The slug of the realm.
    String locale = "en_US"; // String | The locale to reflect in localized data. (If you don't send a value, the API sends you all localized data)
    try {
      RealmDTO result = apiInstance.getRealm(namespace, region, realmSlug, locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealmApiApi#getRealm");
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
 **namespace** | **String**| The namespace to use to locate this document. | [enum: dynamic-eu, dynamic-us, dynamic-kr, dynamic-tw, dynamic-cn]
 **region** | **String**| The region of the data to retrieve. | [enum: eu, us, kr, tw, cn]
 **realmSlug** | **String**| The slug of the realm. |
 **locale** | **String**| The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) | [optional] [enum: en_US, es_MX, pt_BR, de_DE, en_GB, es_ES, fr_FR, it_IT, ru_RU, ko_KR, zh_TW, zh_CN]

### Return type

[**RealmDTO**](RealmDTO.md)

### Authorization

[oAuthSampleAPAC](../README.md#oAuthSampleAPAC), [oAuthSampleCN](../README.md#oAuthSampleCN), [oAuthSampleEU](../README.md#oAuthSampleEU), [oAuthSampleUS](../README.md#oAuthSampleUS)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="getRealmIndex"></a>
# **getRealmIndex**
> ArrayRealmsIndexDTO getRealmIndex(namespace, region, locale)



Returns an index of realms.

### Example
```java
// Import classes:
import fr.jbwittner.blizzardswagger.wowretailapi.ApiClient;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.Configuration;
import fr.jbwittner.blizzardswagger.wowretailapi.auth.*;
import fr.jbwittner.blizzardswagger.wowretailapi.models.*;
import fr.jbwittner.blizzardswagger.wowretailapi.api.RealmApiApi;

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

    RealmApiApi apiInstance = new RealmApiApi(defaultClient);
    String namespace = "dynamic-eu"; // String | The namespace to use to locate this document.
    String region = "eu"; // String | The region of the data to retrieve.
    String locale = "en_US"; // String | The locale to reflect in localized data. (If you don't send a value, the API sends you all localized data)
    try {
      ArrayRealmsIndexDTO result = apiInstance.getRealmIndex(namespace, region, locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealmApiApi#getRealmIndex");
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
 **namespace** | **String**| The namespace to use to locate this document. | [enum: dynamic-eu, dynamic-us, dynamic-kr, dynamic-tw, dynamic-cn]
 **region** | **String**| The region of the data to retrieve. | [enum: eu, us, kr, tw, cn]
 **locale** | **String**| The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) | [optional] [enum: en_US, es_MX, pt_BR, de_DE, en_GB, es_ES, fr_FR, it_IT, ru_RU, ko_KR, zh_TW, zh_CN]

### Return type

[**ArrayRealmsIndexDTO**](ArrayRealmsIndexDTO.md)

### Authorization

[oAuthSampleAPAC](../README.md#oAuthSampleAPAC), [oAuthSampleCN](../README.md#oAuthSampleCN), [oAuthSampleEU](../README.md#oAuthSampleEU), [oAuthSampleUS](../README.md#oAuthSampleUS)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

