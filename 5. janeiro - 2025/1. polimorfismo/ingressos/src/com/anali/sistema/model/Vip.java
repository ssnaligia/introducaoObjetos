package com.anali.sistema.model;

public class Vip extends Ingresso {
    private double valorAdicional;

    public Vip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorAdicional() {
        return valorAdicional;
    }

    @Override
    public String imprimeValor() {
        return "- INGRESSO VIP - \nValor do Ingresso: R$" + getValor() + " - Adicional VIP: R$" + valorAdicional + "| Total: R$" + (getValor() + valorAdicional);
    }
}
