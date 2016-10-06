package com.tecnocampus.domain;

/**
 * Created by vil883 on 06/10/2016.
 */
public class CinemaBuilder {

    private String id;
    private String nom;
    private String direccio;
    private String telefon;

    public CinemaBuilder() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public Cinema CreateCinema() {
        return new Cinema(id,nom,direccio,telefon);
    }
}
