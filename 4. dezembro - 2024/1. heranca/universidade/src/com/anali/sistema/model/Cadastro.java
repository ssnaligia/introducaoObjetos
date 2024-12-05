package com.anali.sistema.model;

public class Cadastro {
    private String nome;
    private String cpf;

    public Cadastro(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String setNome(String nome) {
        this.nome = nome;
    }

    public String setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirCad() {
        System.out.println("\n| Nome: " + nome + "\n | CPF: " + cpf);
    }
}
