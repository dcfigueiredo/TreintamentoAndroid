package com.example.danielfigueiredo.trooperapp.Model.Tropper;

/**
 * Created by daniel.figueiredo on 18/11/2017.
 */

public enum Affiliation {
    GALACTIC_REPUBLIC(0),
    GALACTIC_EMPIRE(1),
    FIRST_ORDER(2);

    private int value;

    Affiliation(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }
}
