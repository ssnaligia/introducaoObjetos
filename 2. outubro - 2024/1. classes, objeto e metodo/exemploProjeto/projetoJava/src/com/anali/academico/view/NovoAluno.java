package com.anali.academico.view;

import com.anali.academico.model.Aluno;

public class NovoAluno {
    public static void main(String[] args) {
        int idade;
        Aluno a1 = new Aluno(); //cria um objeto com um molde da class Aluno - reserva um lugar na memória com todos os métodos
        a1.setNome("Ana Ligia");
        a1.setIdade(19);

        Aluno a2 = new Aluno();
        a2.setNome("Vitor");
        idade = -19;

        if(idade > 0) {
            a2.setIdade(idade);
        }
        System.out.println("Nome do Aluno: " + a1.getNome() + "| Idade: " + a1.getIdade());
        System.out.println("Nome do Aluno: " + a2.getNome() + "| Idade: " + a2.getIdade());

    }
}