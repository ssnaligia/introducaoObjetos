package com.anali.sistema.view;

import com.anali.sistema.model.*;

public class Main {
    public static void main(String[] args) {
        Login login = new Login("Ana", "Ligia", "Silva");
        Senha senha = new Senha(login);
        System.out.println(senha.getSenha());
    }
}
