package com.anali.sistema.model;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;

    public Cliente(String nome, String cpf, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String setNome(String nome) {
        this.nome = nome;
    }

    public String setEndereco(String endereco) {
        this.endereco = endereco;
    }
}