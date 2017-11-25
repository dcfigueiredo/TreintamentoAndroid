package com.example.danielfigueiredo.rest.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by daniel.figueiredo on 25/11/2017.
 */

public class MovieModel {

    @SerializedName("Title")
    private String title;

    @SerializedName("Year")
    private String year;

    @SerializedName("imdbID")
    private String imbdID;

    @SerializedName("Type")
    private String type;

    @SerializedName("Poster")
    private String poster;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getImbdID() {
        return imbdID;
    }

    public void setImbdID(String imbdID) {
        this.imbdID = imbdID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
