package com.anali.sistema.model;

public class Cliente {
    private String nome;
    private String cpf;
    private double saldo;

    public Cliente(String nome, String cpf, double saldo) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public boolean comprarIngresso(Ingresso ingresso) {
        if (!ingresso.isDisponivel()) {
            System.out.println("O ingresso para o evento " + ingresso.getEvento() + " não está disponível.");
            return false;
        }

        if (saldo < ingresso.getPreco()) {
            System.out.println(nome + " não tem saldo suficiente para comprar o ingresso.");
            return false;
        }

        saldo -= ingresso.getPreco();
        ingresso.setDisponivel(false);
        System.out.println(nome + " comprou o ingresso para o evento " + ingresso.getEvento() + ".");
        return true;
    }

    public void adicionarSaldo(double valor) {
        saldo += valor;
        System.out.println(nome + " adicionou " + valor + " ao saldo. Saldo atual: " + saldo);
    }

    public double getSaldo() {
        return saldo;
    }
}
