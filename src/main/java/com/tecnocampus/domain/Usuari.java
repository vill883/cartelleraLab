package com.tecnocampus.domain;

/**
 * Created by vil883 on 10/10/2016.
 */
public class Usuari {

    private String DNI;
    private String nom;
    private String cognom;
    private String telefon;
    private String idUsuari;
    private String password;

    public Usuari(String DNI, String titol, String cognom, String telefon, String idUsuari, String password) {
        this.DNI = DNI;
        this.nom = titol;
        this.cognom = cognom;
        this.telefon = telefon;
        this.idUsuari = idUsuari;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuari{" +
                "DNI='" + DNI + '\'' +
                ", nom='" + nom + '\'' +
                ", cognom='" + cognom + '\'' +
                ", telefon=" + telefon +
                ", idUsuari='" + idUsuari + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNom() {
        return nom;
    }

    public void setTitol(String titol) {
        this.nom = titol;
    }

    public String getCognom() {
        return cognom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
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
}
