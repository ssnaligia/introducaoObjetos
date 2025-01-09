package com.anali.sistema.model;

public class Tecnico extends Assistente {
    private String especializacao;

    public Tecnico(String nome, String setor, double salario, int codIdentificador, String especializacao) {
        super(nome, setor, salario, codIdentificador);
        this.especializacao = especializacao;
    }

    public String getEspecializacao() {
        return especializacao;
    }

    public double calcularBonus() {
        return getSalario() * 0.15;
    }

    @Override
    public String toString() {
        return "Cód. Identificador: " + getCodIdentificador() + " - Técnico: " + getNome() + " - Setor: " + getSetor() + " - Salário: R$" + getSalario() + " | Bônus: R$" + calcularBonus() + " - Total: R$" + (getSalario() + calcularBonus()) + " - Especialização: " + especializacao;
    }
}
