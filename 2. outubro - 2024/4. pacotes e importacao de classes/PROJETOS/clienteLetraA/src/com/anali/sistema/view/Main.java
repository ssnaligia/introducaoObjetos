package com.anali.sistema.view;

import com.anali.sistema.model.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("João", 30);
        System.out.println("Nome: " + cliente.nome);
        System.out.println("Idade: " + cliente.idade);
    }
}
