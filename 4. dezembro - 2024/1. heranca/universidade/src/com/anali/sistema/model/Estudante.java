package com.anali.sistema.model;

import com.anali.sistema.model.*;

public class Estudante extends Cadastro {
    private String prontuario;
    private String curso;
    
    public Estudante(String nome, String cpf, String prontuario, String curso) {
        super(nome, cpf);
        this.prontuario = prontuario;
        this.curso = curso;
    }

    public String getProntuario() {
        return prontuario;
    }

    public String getCurso() {
        return curso;
    }

    public void exibirCad() {
        System.out.println("\n | Nome: " + getNome() + "\n | CPF: " + getCpf() + "\n | Prontuário: " + prontuario + "\n | Curso: " + curso);
    }   
}
