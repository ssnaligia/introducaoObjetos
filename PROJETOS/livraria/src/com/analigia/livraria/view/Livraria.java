package com.analigia.livraria.view;

import com.analigia.livraria.model.Livro;

public class Livraria {
    public static void main(String[] args) {
        /*Livro livro1 = new Livro();
        livro1.setTitulo("Os sete maridos de Evelyn Hugo");
        livro1.setAutor("Taylor Jenkins Reid");
        livro1.setPreco(42.90);

        Livro livro2 = new Livro();
        livro2.setTitulo("A Outra Sra. Parrish");
        livro2.setAutor("Liv Constantine");
        livro2.setPreco(45.50);

        Livro livro3 = new Livro();
        livro3.setTitulo("Verity");
        livro3.setAutor("Colleen Hoover");
        livro3.setPreco(44.30)
        */

        Livro livro1 = new Livro("Os sete maridos de Evelyn Hugo", "Taylor Jenkins Reid", 42.90);
        Livro livro2 = new Livro("A Outra Sra. Parrish", "Liv Constantine", 45.50);
        Livro livro3 = new Livro("Verity", "Colleen Hoover", 44.30);

        System.out.println("\n| OBRAS |\n");
        System.out.println("Título: " + livro1.getTitulo() + "\nAutor: " + livro1.getAutor() + "\nPreço: R$ " + livro1.getPreco() + "\n");
        System.out.println("Título: " + livro2.getTitulo() + "\nAutor: " + livro2.getAutor() + "\nPreço: R$ " + livro2.getPreco() + "\n");
        System.out.println("Título: " + livro3.getTitulo() + "\nAutor: " + livro3.getAutor() + "\nPreço: R$ " + livro3.getPreco() + "\n");
    }
}
