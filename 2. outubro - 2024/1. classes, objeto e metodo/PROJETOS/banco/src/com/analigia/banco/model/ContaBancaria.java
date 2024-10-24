package com.analigia.banco.model;

public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("\nValor Depositado: R$ " + valor);
        } else {
            System.out.println("\nO valor é menor ou igual a 0.");
        }
    }

    public void sacar(double valor) {
        if((valor <= saldo) && (valor > 0)) {
            this.saldo -= valor;
            System.out.println("\nValor Sacado: R$ " + valor);
        } else if(valor > saldo) {
            System.out.println("\nO valor é maior que o saldo da conta");
        } else {
            System.out.println("\nO valor é menor ou igual a 0.");
        }
    }

}
