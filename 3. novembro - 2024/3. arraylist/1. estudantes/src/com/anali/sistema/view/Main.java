package com.anali.sistema.view;

import com.anali.sistema.model.Estudante;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante("Cirilo", 7, "AQ19283");
        Estudante aluno2 = new Estudante("Maísa", 7, "AQ98765");
        Estudante aluno3 = new Estudante("Maria Joaquina", 8, "AQ12345");

        ArrayList<Estudante> estudantes = new ArrayList<>();
        estudantes.add(aluno1);
        estudantes.add(aluno2);
        estudantes.add(aluno3);

        System.out.println("\nTotal de estudantes: " + estudantes.size());

        System.out.println("\n| LISTA |\n");
        for (Estudante estudante : estudantes) {
            System.out.println(estudante.getNome());
        }
    }
}
