package com.example.milogin;

public class Usuario {
    private String nomusu;
    private String clave;

    public Usuario(String nomusu, String clave) {
        this.nomusu = nomusu;
        this.clave = clave;
    }

    public String getNomusu() {
        return nomusu;
    }

    public void setNomusu(String nomusu) {
        this.nomusu = nomusu;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
