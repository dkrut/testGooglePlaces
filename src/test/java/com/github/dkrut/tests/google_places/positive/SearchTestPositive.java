package com.github.dkrut.tests.google_places.positive;

import com.github.dkrut.api.models.google_places.GooglePlacesModel;
import com.github.dkrut.base.BaseTest;
import io.restassured.http.Method;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static com.github.dkrut.constants.Constants.API_TOKEN;

public class SearchTestPositive extends BaseTest {

    public static Object[][] searchText() {
        return new Object[][]{
            {API_TOKEN, "moscow", "textquery"}
        };
    }

    @ParameterizedTest
    @MethodSource("searchText")
    public void searchPlaceWithText(String key, String input, String inputtype){
        GooglePlacesModel.RequestModel requestModel = GooglePlacesModel.RequestModel.builder()
                .key(key)
                .input(input)
                .inputtype(inputtype)
                .build();
        apiManager.getGooglePlacesModel().search(requestModel, Method.GET, 200);
    }
}