package com.anali.sistema.view;

import com.anali.sistema.model.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana", 19);
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
    }
}
