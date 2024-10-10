package com.anali.academico.model;

public class Aluno {
    public String nome;
    public int idade;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if(idade > 0) {
            this.idade = idade;
        } else {
            System.out.println("A idade não pode ser negativa!");
        }
    }

}
