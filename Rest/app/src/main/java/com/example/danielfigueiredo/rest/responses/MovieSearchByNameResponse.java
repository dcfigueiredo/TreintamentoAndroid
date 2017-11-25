package com.example.danielfigueiredo.rest.responses;

import com.example.danielfigueiredo.rest.model.MovieModel;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by daniel.figueiredo on 25/11/2017.
 */

public class MovieSearchByNameResponse {

    @SerializedName("totalResults")
    private String totalResults;

    @SerializedName("Response")
    private String response;

    @SerializedName("Search")
    private ArrayList<MovieModel> search;

    public String getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(String totalResults) {
        this.totalResults = totalResults;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public ArrayList<MovieModel> getSearch() {
        return search;
    }

    public void setSearch(ArrayList<MovieModel> search) {
        this.search = search;
    }
}
