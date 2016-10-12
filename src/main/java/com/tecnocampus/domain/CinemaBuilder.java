package com.tecnocampus.domain;

/**
 * Created by vil883 on 06/10/2016.
 */
public class CinemaBuilder {

    private String id;
    private String nom;
    private String direccio;
    private String telefon;

    public CinemaBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public CinemaBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public CinemaBuilder setDireccio(String direccio) {
        this.direccio = direccio;
        return this;
    }

    public CinemaBuilder setTelefon(String telefon) {
        this.telefon = telefon;
        return this;
    }

    public Cinema CreateCinema() {
        return new Cinema(id,nom,direccio,telefon);
    }
}
