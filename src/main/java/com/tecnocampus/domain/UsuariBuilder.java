package com.tecnocampus.domain;

/**
 * Created by vil883 on 10/10/2016.
 */
public class UsuariBuilder {

    private String DNI;
    private String titol;
    private String cognom;
    private int telefon;
    private String idUsuari;
    private String password;

    public String getDNI() {
        return DNI;
    }


    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public int getTelefon() {
        return telefon;
    }

    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }

    public String getIdUsuari() {
        return idUsuari;
    }

    public void setIdUsuari(String idUsuari) {
        this.idUsuari = idUsuari;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Usuari createUsuari() {
        return new Usuari(DNI, titol, cognom, telefon, idUsuari, password );
    }
}
