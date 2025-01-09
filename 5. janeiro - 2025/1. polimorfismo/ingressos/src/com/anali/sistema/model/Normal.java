package com.anali.sistema.model;

public class Normal extends Ingresso {
    public Normal(double valor) {
        super(valor);
    }

    @Override
    public String imprimeValor() {
        return "- INGRESSO NORMAL - \nValor do Ingresso: R$" + getValor();
    }
}
