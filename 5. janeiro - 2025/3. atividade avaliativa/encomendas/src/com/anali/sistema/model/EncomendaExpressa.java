package com.anali.sistema.model;

public class EncomendaExpressa extends Encomenda {
    private static final double taxaExpressa = 1.5; //50% a mais
    private double custoBase;

    public EncomendaExpressa(String dataPostagem, int prazoEntrega, double custoBase) {
        super(dataPostagem, prazoEntrega);
        this.custoBase = custoBase;
    }

    @Override
    public double calcularCustoEntrega() {
        return custoBase * taxaExpressa;
    }
}