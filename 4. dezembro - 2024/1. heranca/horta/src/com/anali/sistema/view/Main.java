package com.anali.sistema.view;

import com.anali.sistema.model.*;

public class Main {
    public static void main(String[] args) {
        Medicinais plantaM1 = new Medicinais("Aloe Vera", 0.6, "Chá, gel tópico, suco", "Cicatrizante, anti-inflamatória, hidratante");
        Medicinais plantaM2 = new Medicinais("Camomila", 0.3, "Infusão, óleo essencial, compressa", "Calmante, digestiva, anti-inflamatória");
        Ornamentais p1 = new Ornamentais("Rosa", 1.5, "Vermelha", "Pleno sol");
        Ornamentais p2 = new Ornamentais("Orquídea", 0.8, "Branca e roxa", "Sombra parcial");

        plantaM1.exibirInfos();
        plantaM2.exibirInfos();
        p1.exibirInfos();
        p2.exibirInfos();
    }
}
