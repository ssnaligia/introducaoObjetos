package com.anali.sistema.util;

import com.anali.sistema.model.Cliente;

public class Validador {
    public static boolean validar(Cliente cliente) {
        int idade = cliente.getIdade();
        if(idade > 18) {
            return true;
        } else {
            return false;
        }
    }
}
