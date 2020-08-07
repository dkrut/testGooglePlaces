package com.github.dkrut.constants;

import com.github.dkrut.api.utils.UtilsMethod;

public class Constants {
    public static class ServerName {
        public static String GOOGLE_PlACES_SERVER = "https://maps.googleapis.com/";
    }

    public static class Path {
        public static String GOOGLE_PlACE_PATH = "maps/api/place/";
    }

    public static class Endpoint {
        public static String GOOGLE_PlACE_ENDPOINT_SEARCH = "findplacefromtext/json";
    }

    public static final String API_TOKEN = UtilsMethod.getValue("TOKEN");
}