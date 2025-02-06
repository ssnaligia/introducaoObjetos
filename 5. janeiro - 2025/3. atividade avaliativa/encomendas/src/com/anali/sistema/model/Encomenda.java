package com.anali.sistema.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Encomenda implements Rastreavel {
    protected LocalDate dataPostagem;
    protected int prazoEntrega; 
    protected static final DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Encomenda(String dataPostagem, int prazoEntrega) {
        this.dataPostagem = LocalDate.parse(dataPostagem, formatar);
        this.prazoEntrega = prazoEntrega;
    }

    public abstract double calcularCustoEntrega();

    public LocalDate calcularDataEntrega() {
        return dataPostagem.plusDays(prazoEntrega);
    }

    public void detalhesEncomenda() {
        System.out.println("\nData de Postagem: " + dataPostagem.format(formatar));
        System.out.println("Prazo de Entrega: " + prazoEntrega + " dias");
        System.out.println("Data Prevista para Entrega: " + calcularDataEntrega().format(formatar));
        System.out.println("Custo da Entrega: R$" + String.format("%.2f", calcularCustoEntrega()));
    }

    @Override
    public void verificarStatusEntrega() {
        LocalDate hoje = LocalDate.now();
        LocalDate dataEntrega = calcularDataEntrega();

        if (hoje.isBefore(dataEntrega)) {
            System.out.println("Status: Em trânsito. Entrega prevista para " + dataEntrega.format(formatar));
        } else if (hoje.isEqual(dataEntrega)) {
            System.out.println("Status: Encomenda entregue hoje!");
        } else {
            System.out.println("Status: Encomenda já foi entregue.");
        }
    }
}
