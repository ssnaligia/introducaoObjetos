package com.anali.sistema.model;

import com.anali.sistema.model.*;

public class Professor extends Cadastro {
    private String departamento;
    private int ano;
    
    public Professor(String nome, String cpf, String departamento, int ano) {
        super(nome, cpf);
        this.departamento = departamento;
        this.ano = ano;
    }

    public String getDepartamento() {
        return departamento;
    }

    public int getAno() {
        return ano;
    }

    public String setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double setAno(String ano) {
        this.ano = ano;
    }

    public void exibirCad() {
        System.out.println("\n | Nome: " + getNome() + "\n | CPF: " + getCpf() + "\n | Departamento: " + departamento + "\n | Ano de Contratação: " + ano);
    }   
}
