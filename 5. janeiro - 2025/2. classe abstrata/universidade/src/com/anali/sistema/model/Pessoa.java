package com.anali.sistema.model;

public abstract class Pessoa {
    private String nome;
    private String prontuario;
    private double renda;

    public Pessoa(String nome, String prontuario, double renda) {
        this.nome = nome;
        this.prontuario = prontuario;
        this.renda = renda;
    }

    public abstract double calcularAuxilio();

    public String getNome() {
        return nome;
    }

    public String getProntuario() {
        return prontuario;
    }

    public double getRenda() {
        return renda;
    }
}
