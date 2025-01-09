package com.anali.sistema.model;

public class Funcionario {
    private String nome;
    private String setor;
    private double salario;

    public Funcionario(String nome, String setor, double salario) {
        this.nome = nome;
        this.setor = setor;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public String getSetor() {
        return setor;
    }

    public double getSalario() {
        return salario;
    }

    public double setSalario(double Salario) {
        return salario;
    }

    public double calcularComissao() {
        return salario * 0.10;
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + " - Setor: " + setor + " - Salário: R$" + salario;
    }
}
