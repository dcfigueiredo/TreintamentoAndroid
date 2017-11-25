package com.example.danielfigueiredo.rest.services;

import com.example.danielfigueiredo.rest.responses.MovieSearchByNameResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by daniel.figueiredo on 25/11/2017.
 */

public interface MovieService {

    @GET("?apiKey=e005b383")
    Call<MovieSearchByNameResponse> searchMovies(@Query("s") String title);
}
