package com.anali.sistema.model;

public class Bicicleta {
    private String id;
    private String modelo;
    private String localizacao;
    private boolean disponivel;

    public Bicicleta(String id, String modelo, String localizacao) {
        this.id = id;
        this.modelo = modelo;
        this.localizacao = localizacao;
        this.disponivel = true;
    }

    public String getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
