package com.anali.sistema.model;

public class Ingresso {
    private String evento;
    private double preco;
    private boolean disponivel;

    public Ingresso(String evento, double preco) {
        this.evento = evento;
        this.preco = preco;
        this.disponivel = true; 
    }

    public String getEvento() {
        return evento;
    }

    public double getPreco() {
        return preco;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
