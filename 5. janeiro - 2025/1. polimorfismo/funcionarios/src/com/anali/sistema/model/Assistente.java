package com.anali.sistema.model;

public class Assistente extends Funcionario {
    private int codIdentificador;

    public Assistente(String nome, String setor, double salario, int codIdentificador) {
        super(nome, setor, salario);
        this.codIdentificador = codIdentificador;
    }

    public int getCodIdentificador() {
        return codIdentificador;
    }

    @Override
    public String toString() {
        return "Cód. Identificador: " + codIdentificador + "- Assistente: " + getNome() + " - Setor: " + getSetor() + " - Salário: R$" + getSalario();
    }
}
