package com.anali.sistema.view;

import com.anali.sistema.model.Livro;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O investidor de bom senso", "John Bogle", 2020);
        Livro livro2 = new Livro("Tudo é Rio", "Carla Madeira", 2014);
        Livro livro3 = new Livro("Em Agosto nos Vemos", "Gabriel García Márquez", 2024);

        ArrayList<Livro> livros = new ArrayList<>();
        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        System.out.println("\nTotal de Livros: " + livros.size());

        System.out.println("\n | LIVROS |\n");
        for(Livro livro : livros) {
            System.out.println(livro);
        }
    }
}
