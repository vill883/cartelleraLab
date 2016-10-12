package com.tecnocampus.domain;

/**
 * Created by vil883 on 10/10/2016.
 */
public class UsuariBuilder {

    private String DNI;
    private String nom;
    private String cognom;
    private int telefon;
    private String idUsuari;
    private String password;




    public UsuariBuilder setDNI(String DNI) {
        this.DNI = DNI;
        return this;
    }



    public UsuariBuilder setNom(String nom) {
        this.nom = nom;
        return this;
    }

    public UsuariBuilder setCognom(String cognom) {
        this.cognom = cognom;
        return this;
    }


    public UsuariBuilder setTelefon(int telefon) {
        this.telefon = telefon;
        return this;
    }



    public UsuariBuilder setIdUsuari(String idUsuari) {
        this.idUsuari = idUsuari;
        return this;
    }




    public UsuariBuilder setPassword(String password) {
        this.password = password;
        return this;
    }

    public Usuari createUsuari() {
        return new Usuari(DNI, nom, cognom, telefon, idUsuari, password );
    }
}
