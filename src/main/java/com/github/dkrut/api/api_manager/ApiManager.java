package com.github.dkrut.api.api_manager;

import com.github.dkrut.api.models.google_places.GooglePlacesModel;
import lombok.Getter;
import lombok.Setter;

public class ApiManager {
    @Setter
    @Getter
    GooglePlacesModel googlePlacesModel = new GooglePlacesModel();
}
