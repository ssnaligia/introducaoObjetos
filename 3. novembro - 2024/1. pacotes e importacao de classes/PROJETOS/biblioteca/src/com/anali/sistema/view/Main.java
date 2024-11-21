package com.anali.sistema.view;

import com.anali.sistema.model.*;

public class Main {
    public static void main(String[] args) {
        // Criando livros
        Livro l1 = new Livro("Java para Iniciantes", "Herbert Schildt");
        Livro l2 = new Livro("Use a Cabeça Java", "Kathy Sierra");

        Estudante e1 = new Estudante("Daniel");
        Estudante e2 = new Estudante("Sofia");

        e1.emprestarLivro(l1); 
        e2.emprestarLivro(l1); 

        e1.devolverLivro(); 
        e2.emprestarLivro(l1); 

        e2.emprestarLivro(l2);
    }
}
