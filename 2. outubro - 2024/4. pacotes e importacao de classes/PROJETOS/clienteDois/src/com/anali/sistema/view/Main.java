package com.anali.sistema.view;

import com.anali.sistema.model.*;
import com.anali.sistema.util.Validador;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Av. Um dois três", 123, "APTO 43", 1480, "Araraquara", "SP");
        Cliente cliente = new Cliente("Ana", 19, endereco);
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade: " + cliente.getIdade());
        System.out.println("Endereço: " + endereco.getLogradouro() + ", " + endereco.getNumero());
        boolean resultado = Validador.validar(cliente);
        if(resultado == true) {
            System.out.println("Maior de Idade");
        } else {
            System.out.println("Menor de Idade");
        }
        
    }
}
