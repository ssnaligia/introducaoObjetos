package com.anali.sistema.view;

import com.anali.sistema.model.*;

public class Main {
    public static void main(String[] args) {
        ViagemCorporativa viagem1 = new ViagemNacional("57750988890", "Cabo Frio - RJ", "03/02/2025", "22/02/2025");
        ViagemCorporativa viagem2 = new ViagemNacional("123456733", "Salvador - BA", "06/02/2025", "16/02/2025");

        System.out.println("\n====================================");
        System.out.println("|  RESERVAS DE VIAGENS NACIONAIS   |");
        System.out.println("====================================");
        viagem1.detalhesViagem();
        System.out.println("------------------------------------");
        viagem2.detalhesViagem();

        System.out.println("\n[REMARCAÇÃO DE VIAGENS NACIONAIS]");
        viagem1.remarcarViagem("Niterói", "10/02/2025", "17/02/2025");
        System.out.println("------------------------------------");
        viagem2.remarcarViagem("Feira de Santana", "04/02/2025", "28/02/2025");
        System.out.println("------------------------------------");

        System.out.println("\n====================================");
        System.out.println("|    RESERVAS ATUALIZADAS NACIONAIS |");
        System.out.println("====================================");
        viagem1.detalhesViagem();
        System.out.println("------------------------------------");
        viagem2.detalhesViagem();

        System.out.println("\n====================================");
        System.out.println("====================================");

        ViagemCorporativa v3 = new ViagemInternacional("998472AAF", "Londres - UK", "04/02/2025", "07/02/2025");
        ViagemCorporativa v4 = new ViagemInternacional("151206BBT", "Ilha Holbox", "10/02/2025", "20/02/2025");

        System.out.println("\n====================================");
        System.out.println("| RESERVAS DE VIAGENS INTERNACIONAIS |");
        System.out.println("====================================");
        v3.detalhesViagem();
        System.out.println("------------------------------------");
        v4.detalhesViagem();

        System.out.println("\n[REMARCAÇÃO DE VIAGENS INTERNACIONAIS]");
        v3.remarcarViagem("Paris", "03/02/2025", "16/02/2025");
        System.out.println("------------------------------------");
        v4.remarcarViagem("Madrid", "08/02/2025", "22/02/2025");
        System.out.println("------------------------------------");

        System.out.println("\n====================================");
        System.out.println("|  RESERVAS ATUALIZADAS INTERNACIONAIS |");
        System.out.println("====================================");
        v3.detalhesViagem();
        System.out.println("------------------------------------");
        v4.detalhesViagem();
    }
}
