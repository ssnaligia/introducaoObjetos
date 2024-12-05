package com.anali.sistema.model;

public class Planta {
    private String nomeCientifico;
    private double altura;

    public Planta(String nomeCientifico, double altura) {
        this.nomeCientifico = nomeCientifico;
        this.altura = altura;
    }

    public String getnomeCientifico() {
        return nomeCientifico;
    }

    public double getAltura() {
        return altura;
    }

    public String setNomeCientifico(String nomeCientifico) {
        this.nomeCientifico = nomeCientifico;
    }

    public double setAltura(double altura) {
        this.altura = altura;
    }

    public void exibirInfos() {
        System.out.println("\n Nome Científico: " + nomeCientifico + "\n | Altura: " + altura);
    }
}
