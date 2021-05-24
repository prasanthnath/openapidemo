# AnimalControllerApi

All URIs are relative to *http://localhost:8080*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAnimalsByType**](AnimalControllerApi.md#getAnimalsByType) | **GET** /animals/ | 



## getAnimalsByType

> List&lt;OneOfCatFishFrog&gt; getAnimalsByType(animalType)



### Example

```java
// Import classes:
import com.xyz.openapi.thinclient.invoker.ApiClient;
import com.xyz.openapi.thinclient.invoker.ApiException;
import com.xyz.openapi.thinclient.invoker.Configuration;
import com.xyz.openapi.thinclient.invoker.models.*;
import com.xyz.openapi.thinclient.api.AnimalControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        AnimalControllerApi apiInstance = new AnimalControllerApi(defaultClient);
        String animalType = "animalType_example"; // String | 
        try {
            List<OneOfCatFishFrog> result = apiInstance.getAnimalsByType(animalType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnimalControllerApi#getAnimalsByType");
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
 **animalType** | **String**|  | [optional]

### Return type

[**List&lt;OneOfCatFishFrog&gt;**](OneOfCatFishFrog.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: */*


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

