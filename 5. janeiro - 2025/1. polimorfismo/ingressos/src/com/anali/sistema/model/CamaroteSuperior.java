package com.anali.sistema.model;

public class CamaroteSuperior extends Ingresso {
    private double valorAdicional;

    public CamaroteSuperior(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    @Override
    public String imprimeValor() {
        return "- INGRESSO CAMAROTE SUPERIOR - \nValor do Ingresso: R$" + getValor() + " - Adicional CAMAROTE SUPERIOR: R$" + valorAdicional + "| Total: R$" + (getValor() + valorAdicional);
    }
}
