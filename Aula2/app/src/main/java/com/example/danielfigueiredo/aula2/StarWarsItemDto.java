package com.example.danielfigueiredo.aula2;

/**
 * Created by daniel.figueiredo on 18/11/2017.
 */

public class StarWarsItemDto {

    private String nome;
    private int imageId;

    public StarWarsItemDto(String nome, int image){
        this.imageId = image;
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public int getImageId() {
        return this.imageId;
    }
}
