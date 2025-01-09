package com.anali.sistema.model;

public class Animal {
    private String nome;
    private double peso;
    private String habitat;

    public Animal(String nome, double peso, String habitat) {
        this.nome = nome;
        this.peso = peso;
        this.habitat = habitat;
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public String getHabitat() {
        return habitat;
    }

    public String alimentacao() {
        return "Animal se alimentando.";
    }

}
