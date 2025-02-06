package com.anali.sistema.view;

import com.anali.sistema.model.*;

public class Main {
    public static void main(String[] args) {
        AssinaturaMensal assinatura1 = new AssinaturaMensal("Ana Ligia", "Netflix", "01/12/2024", 39.90);
        AssinaturaAnual assinatura2 = new AssinaturaAnual("Lucas", "Spotify", "01/12/2024", 19.90);
        AssinaturaAnual assinatura3 = new AssinaturaAnual("Sofia", "Amazon Prime", "10/11/2023", 22.90);

        System.out.println("\n====================================");
        System.out.println("|       ASSINATURAS ATIVAS        |");
        System.out.println("====================================");
        assinatura1.detalhesAssinatura();
        System.out.println("------------------------------------");
        assinatura2.detalhesAssinatura();
        System.out.println("------------------------------------");
        assinatura3.detalhesAssinatura();

        System.out.println("\n[RENOVAÇÃO E CANCELAMENTO]");
        assinatura1.renovarAssinatura();
        assinatura2.cancelarAssinatura();
        assinatura3.cancelarAssinatura();

        System.out.println("\n[VALOR TOTAL PAGO]");
        System.out.println("Total Pago por " + assinatura1.getNomeAssinante() + 
                           ": R$" + String.format("%.2f", assinatura1.calcularTotalPago()));
        System.out.println("Total Pago por " + assinatura2.getNomeAssinante() + 
                           ": R$" + String.format("%.2f", assinatura2.calcularTotalPago()));
        System.out.println("Total Pago por " + assinatura3.getNomeAssinante() + 
                           ": R$" + String.format("%.2f", assinatura3.calcularTotalPago()));
    }
}
