package com.example.danielfigueiredo.trooperapp.Model.Tropper;

import java.io.Serializable;

/**
 * Created by daniel.figueiredo on 18/11/2017.
 */

public class Trooper implements Serializable {

    private int idTropper;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String desc;

    private String imgUrl;

    private Affiliation affiliation;


    public Trooper(int idTrooper, String name, String desc, String imgUrl, Affiliation affiliation) {
        this.idTropper = idTrooper;
        this.name = name;
        this.desc = desc;
        this.imgUrl = imgUrl;
        this.affiliation = affiliation;
    }

    public int getIdTropper() {
        return idTropper;
    }

    public void setIdTropper(int idTropper) {
        this.idTropper = idTropper;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Affiliation getAffiliation() {
        return affiliation;
    }

    public void setAffiliation(Affiliation affiliation) {
        this.affiliation = affiliation;
    }
}
