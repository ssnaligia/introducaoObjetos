package com.anali.sistema.model;

public class Produtos {
    private String nome;
    private String categoria;
    private double preco;

    public Produtos(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getPreco() {
        return preco;
    }

    public String setNome(String nome) {
        this.nome = nome;
    }

    public String setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String setPreco(String preco) {
        this.preco = preco;
    }
}
