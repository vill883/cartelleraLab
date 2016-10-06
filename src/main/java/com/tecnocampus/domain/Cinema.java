package com.tecnocampus.domain;

/**
 * Created by vil883 on 06/10/2016.
 */
public class Cinema {

    private String id;
    private String nom;
    private String direccio;
    private String telefon;

    public Cinema(String id, String nom, String direccio, String telefon) {
        this.id = id;
        this.nom = nom;
        this.direccio = direccio;
        this.telefon = telefon;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
