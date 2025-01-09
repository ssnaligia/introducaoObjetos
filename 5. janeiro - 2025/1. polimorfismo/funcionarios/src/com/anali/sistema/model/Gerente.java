package com.anali.sistema.model;

public class Gerente extends Funcionario {
    private String nivelGerencial;

    public Gerente(String nome, String setor, double salario, String nivelGerencial) {
        super(nome, setor, salario);
        this.nivelGerencial = nivelGerencial;
    }

    public String getNivelGerencial() {
        return nivelGerencial;
    }

    @Override
    public String toString() {
        return "Gerente: " + getNome() + " - Setor: " + getSetor() + " - Salário: R$" + getSalario() + " - Nível Gerencial: " + nivelGerencial;
    }
}
