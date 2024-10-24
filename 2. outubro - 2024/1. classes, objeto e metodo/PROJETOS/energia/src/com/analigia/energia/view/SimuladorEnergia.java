package com.analigia.energia.view;

import com.analigia.energia.model.GeradorSolar;

public class SimuladorEnergia {
    public static void main(String[] args) {
        GeradorSolar gerador1 = new GeradorSolar(900, 5);
        GeradorSolar gerador2 = new GeradorSolar(500, 15);

        System.out.println("\n| GERADOR 1 |\n");
        System.out.println("Potência Máxima: " + gerador1.getPotenciaMaxima() + " kW \nEnergia Gerada: " + gerador1.getEnergiaGerada() + "\n");

        System.out.println("\n| GERADOR 2 |\n");
        System.out.println("Potência Máxima: " + gerador2.getPotenciaMaxima() + " kWh \nEnergia Gerada: " + gerador2.getEnergiaGerada() + "\n");
    }
}
