package com.example.Berita_Indonesia.Kel13.API;

import com.example.Berita_Indonesia.Kel13.Entity.ResponseNews;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiService {

    @GET("/v2/top-headlines")
    Call<ResponseNews> getListNews(@Query("country") String country, @Query("category") String category, @Query("apiKey") String apiKey);

    @GET("/v2/top-headlines")
    Call<ResponseNews> getListAllNews(@Query("country") String country, @Query("apiKey") String apiKey);
}
