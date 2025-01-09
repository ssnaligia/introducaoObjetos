package com.anali.sistema.model;

public class Ingresso {
    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public double setValor(double valor) {
        return valor;
    }

    public String imprimeValor() {
        return "Valor do Ingresso: R$" + valor;
    }
}
