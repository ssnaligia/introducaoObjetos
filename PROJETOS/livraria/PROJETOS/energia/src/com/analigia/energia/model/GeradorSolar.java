package com.analigia.energia.model;

public class GeradorSolar {
    private double potenciaMaxima;
    private double energiaGerada;

    public GeradorSolar(double potenciaM, double energiaG) {
        this.potenciaMaxima = potenciaM;
        this.energiaGerada = energiaG;
    }

    public double getPotenciaMaxima() {
        return potenciaMaxima;
    }

    public double getEnergiaGerada() {
        if(energiaGerada > 10) {
            System.out.println("-- Superavit Energético");
        } else {
            System.out.println("-- Déficit Energético");
        }
        return energiaGerada;
    }
}
