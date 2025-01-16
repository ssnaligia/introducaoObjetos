package com.anali.sistema.view;

import com.anali.sistema.model.*;

public class Main {
    public static void main(String[] args) {
        Estudante aluno1 = new Estudante("Carla", "AQ2098765", 1300);
        Estudante aluno2 = new Estudante("Fabrício", "AQ2132995", 950);
        Estudante aluno3 = new Estudante("Naiara", "AQ4387531", 2100);

        Professor professor1 = new Professor("Roberto", "AQ9876", 4500);
        Professor professor2 = new Professor("Ana", "AQ2154", 7500);
        Professor professor3 = new Professor("Paulo", "AQ5987", 3950);
       
        System.out.println(aluno1.getProntuario() + ": " + aluno1.getNome() + " | Auxílio: " + aluno1.calcularAuxilio());
        System.out.println(aluno2.getProntuario() + ": " + aluno2.getNome() + " | Auxílio: " + aluno2.calcularAuxilio());
        System.out.println(aluno3.getProntuario() + ": " + aluno3.getNome() + " | Auxílio: " + aluno3.calcularAuxilio());

        System.out.println("\n");
        System.out.println(professor1.getProntuario() + ": " + professor1.getNome() + " | Auxílio: " + professor1.calcularAuxilio());
        System.out.println(professor2.getProntuario() + ": " + professor2.getNome() + " | Auxílio: " + professor2.calcularAuxilio());
        System.out.println(professor3.getProntuario() + ": " + professor3.getNome() + " | Auxílio: " + professor3.calcularAuxilio());

    }
}
