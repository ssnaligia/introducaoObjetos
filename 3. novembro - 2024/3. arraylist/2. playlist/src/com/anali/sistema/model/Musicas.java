package com.anali.sistema.model;

public class Musicas {
    private String nome;
    private String cantor;

    public Musicas(String nome, String cantor) {
        this.nome = nome;
        this.cantor = cantor;
    }

    public String getNome() {
        return nome;
    }

    public String getCantor() {
        return cantor;
    }

    public String setNome(String nome) {
        this.nome = nome;
    }

    public String setCantor(String cantor) {
        this.cantor = cantor;
    }
}
