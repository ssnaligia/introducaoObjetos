package com.anali.sistema.view;

import com.anali.sistema.model.*;

public class Main {
    public static void main(String[] args) {
        Encomenda encomenda1 = new EncomendaExpressa("01/02/2025", 2, 50.00);
        Encomenda encomenda2 = new EncomendaConvencional("01/02/2025", 7, 50.00);
        Encomenda encomenda3 = new EncomendaConvencional("27/01/2025", 14, 150.00);

        System.out.println("\n====================================");
        System.out.println("|      DETALHES DAS ENCOMENDAS     |");
        System.out.println("====================================");
        encomenda1.detalhesEncomenda();
        System.out.println("------------------------------------");
        encomenda2.detalhesEncomenda();
        System.out.println("------------------------------------");
        encomenda3.detalhesEncomenda();

        System.out.println("\n[STATUS DAS ENCOMENDAS]");
        System.out.print("Encomenda 1: ");
        encomenda1.verificarStatusEntrega();
        System.out.print("Encomenda 2: ");
        encomenda2.verificarStatusEntrega();
        System.out.print("Encomenda 3: ");
        encomenda3.verificarStatusEntrega();
    }
}