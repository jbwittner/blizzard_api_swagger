# RealmApi

All URIs are relative to *https://eu.api.blizzard.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRealmBySlug**](RealmApi.md#getRealmBySlug) | **GET** /data/wow/realm/{realmSlug} | 
[**getRealmIndex**](RealmApi.md#getRealmIndex) | **GET** /data/wow/realm/index | 


<a name="getRealmBySlug"></a>
# **getRealmBySlug**
> RealmData getRealmBySlug(namespace, region, realmSlug, locale)



Returns a single realm by slug or ID.

### Example
```java
// Import classes:
import fr.jbwittner.blizzardswagger.wowretailapi.ApiClient;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.Configuration;
import fr.jbwittner.blizzardswagger.wowretailapi.auth.*;
import fr.jbwittner.blizzardswagger.wowretailapi.models.*;
import fr.jbwittner.blizzardswagger.wowretailapi.api.RealmApi;

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

    RealmApi apiInstance = new RealmApi(defaultClient);
    String namespace = "dynamic-eu"; // String | The namespace to use to locate this document.
    String region = "eu"; // String | The region of the data to retrieve.
    String realmSlug = "realmSlug_example"; // String | The slug of the realm.
    String locale = "en_US"; // String | The locale to reflect in localized data. (If you don't send a value, the API sends you all localized data)
    try {
      RealmData result = apiInstance.getRealmBySlug(namespace, region, realmSlug, locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealmApi#getRealmBySlug");
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

[**RealmData**](RealmData.md)

### Authorization

[oAuthAuthorizationCodeAPAC](../README.md#oAuthAuthorizationCodeAPAC), [oAuthAuthorizationCodeCN](../README.md#oAuthAuthorizationCodeCN), [oAuthAuthorizationCodeEU](../README.md#oAuthAuthorizationCodeEU), [oAuthAuthorizationCodeUS](../README.md#oAuthAuthorizationCodeUS)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

<a name="getRealmIndex"></a>
# **getRealmIndex**
> ArrayRealmsIndexData getRealmIndex(namespace, region, locale)



Returns an index of realms.

### Example
```java
// Import classes:
import fr.jbwittner.blizzardswagger.wowretailapi.ApiClient;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.Configuration;
import fr.jbwittner.blizzardswagger.wowretailapi.auth.*;
import fr.jbwittner.blizzardswagger.wowretailapi.models.*;
import fr.jbwittner.blizzardswagger.wowretailapi.api.RealmApi;

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

    RealmApi apiInstance = new RealmApi(defaultClient);
    String namespace = "dynamic-eu"; // String | The namespace to use to locate this document.
    String region = "eu"; // String | The region of the data to retrieve.
    String locale = "en_US"; // String | The locale to reflect in localized data. (If you don't send a value, the API sends you all localized data)
    try {
      ArrayRealmsIndexData result = apiInstance.getRealmIndex(namespace, region, locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RealmApi#getRealmIndex");
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

[**ArrayRealmsIndexData**](ArrayRealmsIndexData.md)

### Authorization

[oAuthAuthorizationCodeAPAC](../README.md#oAuthAuthorizationCodeAPAC), [oAuthAuthorizationCodeCN](../README.md#oAuthAuthorizationCodeCN), [oAuthAuthorizationCodeEU](../README.md#oAuthAuthorizationCodeEU), [oAuthAuthorizationCodeUS](../README.md#oAuthAuthorizationCodeUS)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

