package com.anali.sistema.model;

public class EncomendaConvencional extends Encomenda {
    private static final double descontoConvencional = 0.8; //20%
    private double custoBase;

    public EncomendaConvencional(String dataPostagem, int prazoEntrega, double custoBase) {
        super(dataPostagem, prazoEntrega);
        this.custoBase = custoBase;
    }

    @Override
    public double calcularCustoEntrega() {
        return custoBase * descontoConvencional;
    }
}
