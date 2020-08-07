package com.github.dkrut.api.models.google_places;

import com.github.dkrut.api.utils.NetworkCore;
import io.restassured.http.Method;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;

import static com.github.dkrut.constants.Constants.Endpoint.GOOGLE_PlACE_ENDPOINT_SEARCH;
import static com.github.dkrut.constants.Constants.Path.GOOGLE_PlACE_PATH;
import static com.github.dkrut.constants.Constants.ServerName.GOOGLE_PlACES_SERVER;

public class GooglePlacesModel extends NetworkCore {
    @Setter
    @Getter
    @Builder
    public static class RequestModel{
        private String key;
        private String input;
        private String inputType;
    }

    public GooglePlacesModel search(RequestModel model, Method method, int statusCode){
        HashMap requestParams = new HashMap();
        requestParams.put("key", model.getKey());
        requestParams.put("input", model.getInput());
        requestParams.put("inputType", model.getInputType());
        requestSpecBuilder.setBaseUri(GOOGLE_PlACES_SERVER + GOOGLE_PlACE_PATH + GOOGLE_PlACE_ENDPOINT_SEARCH)
                .addQueryParams(requestParams);
        sendRequestAndGetResponse(Method.GET, 200);
        return this;
    }
}
