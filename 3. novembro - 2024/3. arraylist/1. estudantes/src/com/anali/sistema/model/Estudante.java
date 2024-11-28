package com.anali.sistema.model;

public class Estudante {
    private String nome;
    private int idade;
    private String prontuario;

    public Estudante(String nome, int idade, String prontuario) {
        this.nome = nome;
        this.idade = idade;
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getProntuario() {
        return prontuario;
    }

    public String setNome(String nome) {
        this.nome = nome;
    }

    public int setIdade(int idade) {
        this.idade = idade;
    }

    public String setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
}
