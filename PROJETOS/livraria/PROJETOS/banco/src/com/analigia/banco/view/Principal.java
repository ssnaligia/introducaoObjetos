package com.analigia.banco.view;

import com.analigia.banco.model.ContaBancaria;

public class Principal {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("1234-5", 100);
        System.out.println("Número da Conta: " + conta1.getNumeroConta());
        System.out.println("Saldo: R$ " + conta1.getSaldo());
        conta1.depositar(70);
        System.out.println("Saldo após Depósito: R$ " + conta1.getSaldo());
        conta1.sacar(55);
        System.out.println("Saldo após Saque: R$ " + conta1.getSaldo());
    }
}
