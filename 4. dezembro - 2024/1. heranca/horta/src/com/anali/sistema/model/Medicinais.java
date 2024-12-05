package com.anali.sistema.model;

import com.anali.sistema.model.*;

public class Medicinais extends Planta {
    private String formasUso;
    private String propriedades;
    
    public Medicinais(String nomeCientifico, double altura, String formasUso, String propriedades) {
        super(nomeCientifico, altura);
        this.formasUso = formasUso;
        this.propriedades = propriedades;
    }

    public String getFormasUso() {
        return formasUso;
    }

    public String getPropriedades() {
        return propriedades;
    }

    public void exibirInfos() {
        System.out.println("\n | Nome Científico: " + getnomeCientifico() + "\n | Altura: " + getAltura() + "\n | Formas de Uso: " + formasUso + "\n | Propriedades: " + propriedades);
    }   
}
