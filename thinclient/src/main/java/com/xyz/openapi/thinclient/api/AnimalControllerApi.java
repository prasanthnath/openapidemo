package com.xyz.openapi.thinclient.api;

import com.xyz.openapi.thinclient.invoker.ApiClient;
import com.xyz.openapi.thinclient.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;

import java.util.Collections;
import java.util.List;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-05-24T19:20:33.823042600+05:30[Asia/Calcutta]")
@Component("com.xyz.openapi.thinclient.api.AnimalControllerApi")
public class AnimalControllerApi {
    private ApiClient apiClient;

    public AnimalControllerApi() {
        this(new ApiClient());
    }

    @Autowired
    public AnimalControllerApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param animalType  (optional)
     * @return List&lt;Animal&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Animal> getAnimalsByType(String animalType) throws RestClientException {
        return getAnimalsByTypeWithHttpInfo(animalType).getBody();
    }

    /**
     * 
     * 
     * <p><b>200</b> - OK
     * @param animalType  (optional)
     * @return ResponseEntity&lt;List&lt;Animal&gt;&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public ResponseEntity<List<Animal>> getAnimalsByTypeWithHttpInfo(String animalType) throws RestClientException {
        Object postBody = null;
        
        String path = apiClient.expandPath("/animals/", Collections.<String, Object>emptyMap());

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "animalType", animalType));

        final String[] localVarAccepts = { 
            "*/*"
         };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] contentTypes = {  };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Animal>> returnType = new ParameterizedTypeReference<List<Animal>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, contentType, authNames, returnType);
    }
}
