package com.example.Berita_Indonesia.Kel13.API;

public class Server {
    public static final String URL_API = "https://newsapi.org/";

    public static ApiService getApiService(){
        return RetrofitApi.getClient(URL_API).create(ApiService.class);
    }
}
