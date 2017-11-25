package com.example.danielfigueiredo.rest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.danielfigueiredo.rest.responses.MovieSearchByNameResponse;
import com.example.danielfigueiredo.rest.services.MovieService;
import com.example.danielfigueiredo.rest.services.NetworkService;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity implements Callback<MovieSearchByNameResponse> {

    private MovieService movieService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setUpRetrofit();
    }

    private void setUpRetrofit() {
        movieService = NetworkService.getInstace().getMovieService();
        movieService.searchMovies("it").enqueue(this);
    }

    @Override
    public void onResponse(Call<MovieSearchByNameResponse> call, Response<MovieSearchByNameResponse> response) {
        Log.d("bom", response.body().toString());
    }

    @Override
    public void onFailure(Call<MovieSearchByNameResponse> call, Throwable t) {
        Log.i("Treta", t.getMessage());
    }
}