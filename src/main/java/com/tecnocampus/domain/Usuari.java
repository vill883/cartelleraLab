package com.tecnocampus.domain;

/**
 * Created by vil883 on 10/10/2016.
 */
public class Usuari {

    private String DNI;
    private String titol;
    private String cognom;
    private int telefon;
    private String idUsuari;
    private String password;

    public Usuari(String DNI, String titol, String cognom, int telefon, String idUsuari, String password) {
        this.DNI = DNI;
        this.titol = titol;
        this.cognom = cognom;
        this.telefon = telefon;
        this.idUsuari = idUsuari;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Usuari{" +
                "DNI='" + DNI + '\'' +
                ", titol='" + titol + '\'' +
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
}
