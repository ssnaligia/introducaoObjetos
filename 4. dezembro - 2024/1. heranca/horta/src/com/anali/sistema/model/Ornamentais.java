package com.anali.sistema.model;

import com.anali.sistema.model.*;

public class Ornamentais extends Planta {
    private String cor;
    private String exigLuz;
    
    public Ornamentais(String nomeCientifico, double altura, String cor, String exigLuz) {
        super(nomeCientifico, altura);
        this.cor = cor;
        this.exigLuz = exigLuz;
    }

    public String getCor() {
        return cor;
    }

    public String getExigLuz() {
        return exigLuz;
    }

    public void exibirInfos() {
        System.out.println("\n | Nome Científico: " + getnomeCientifico() + "\n | Altura: " + getAltura() + "\n | Cor: " + cor + "\n | Exigência de Luz: " + exigLuz);
    }   
}
