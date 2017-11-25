package com.example.danielfigueiredo.rest.services;

import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by daniel.figueiredo on 25/11/2017.
 */

public class NetworkService {

    private static NetworkService networkService;
    private MovieService movieService;

    private NetworkService() {
        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://www.omdbapi.com/")
            .addConverterFactory(GsonConverterFactory.create(new GsonBuilder().setLenient().create()))
            .build();

        movieService = retrofit.create(MovieService.class);
    }

    public static NetworkService getInstace() {
        if (networkService == null) {
            networkService = new NetworkService();
        }
        return networkService;
    }

    public MovieService getMovieService() {
        return movieService;
    }
}
