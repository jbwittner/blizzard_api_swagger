# CharacterMediaApi

All URIs are relative to *https://eu.api.blizzard.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCharacterMedia**](CharacterMediaApi.md#getCharacterMedia) | **GET** /profile/wow/character/{realmSlug}/{characterName}/character-media | 


<a name="getCharacterMedia"></a>
# **getCharacterMedia**
> CharacterMediaData getCharacterMedia(namespace, region, realmSlug, characterName, locale)



Returns a summary of the media assets available for a character (such as an avatar render).

### Example
```java
// Import classes:
import fr.jbwittner.blizzardswagger.wowretailapi.ApiClient;
import fr.jbwittner.blizzardswagger.wowretailapi.ApiException;
import fr.jbwittner.blizzardswagger.wowretailapi.Configuration;
import fr.jbwittner.blizzardswagger.wowretailapi.auth.*;
import fr.jbwittner.blizzardswagger.wowretailapi.models.*;
import fr.jbwittner.blizzardswagger.wowretailapi.api.CharacterMediaApi;

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

    CharacterMediaApi apiInstance = new CharacterMediaApi(defaultClient);
    String namespace = "profile-eu"; // String | The namespace to use to locate this document.
    String region = "eu"; // String | The region of the data to retrieve.
    String realmSlug = "realmSlug_example"; // String | The slug of the realm.
    String characterName = "characterName_example"; // String | The lowercase name of the character.
    String locale = "en_US"; // String | The locale to reflect in localized data. (If you don't send a value, the API sends you all localized data)
    try {
      CharacterMediaData result = apiInstance.getCharacterMedia(namespace, region, realmSlug, characterName, locale);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CharacterMediaApi#getCharacterMedia");
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
 **namespace** | **String**| The namespace to use to locate this document. | [enum: profile-eu, profile-us, profile-kr, profile-tw, profile-cn]
 **region** | **String**| The region of the data to retrieve. | [enum: eu, us, kr, tw, cn]
 **realmSlug** | **String**| The slug of the realm. |
 **characterName** | **String**| The lowercase name of the character. |
 **locale** | **String**| The locale to reflect in localized data. (If you don&#39;t send a value, the API sends you all localized data) | [optional] [enum: en_US, es_MX, pt_BR, de_DE, en_GB, es_ES, fr_FR, it_IT, ru_RU, ko_KR, zh_TW, zh_CN]

### Return type

[**CharacterMediaData**](CharacterMediaData.md)

### Authorization

[oAuthAuthorizationCodeAPAC](../README.md#oAuthAuthorizationCodeAPAC), [oAuthAuthorizationCodeCN](../README.md#oAuthAuthorizationCodeCN), [oAuthAuthorizationCodeEU](../README.md#oAuthAuthorizationCodeEU), [oAuthAuthorizationCodeUS](../README.md#oAuthAuthorizationCodeUS)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful operation |  -  |

