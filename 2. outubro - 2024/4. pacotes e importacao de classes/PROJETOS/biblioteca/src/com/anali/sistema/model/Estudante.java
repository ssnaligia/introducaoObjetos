package com.anali.sistema.model;

public class Estudante {
    private String nome;
    private Livro livro;

    public Estudante(String nome, Livro livro) {
        this.nome = nome;
        this.livro = livro;
    }

    public String getNome() {
        return nome;
    }

    public Livro getLivro() {
        return livro;
    }
}
