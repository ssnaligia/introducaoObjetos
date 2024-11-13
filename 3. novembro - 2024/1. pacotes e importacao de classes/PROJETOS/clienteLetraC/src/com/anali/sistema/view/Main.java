package com.anali.sistema.view;

import com.anali.sistema.model.Cliente;
import com.anali.sistema.util.Validador;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Ana", 19);
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        boolean resultado = Validador.validar(cliente);
        if(resultado == true) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
        
    }
}
