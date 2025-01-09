package com.anali.sistema.view;

import java.util.ArrayList;

import com.anali.sistema.model.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        Gerente g = new Gerente("Pedro", "Financeiro", 7500, "Sênior");
        funcionarios.add(g);
        Tecnico t = new Tecnico("Heloísa", "Administrativo", 3500, 8974, "Comércio Exterior");
        funcionarios.add(t);
        Administrativo a = new Administrativo("Amanda", "T.I", 4800, 2319, true);
        funcionarios.add(a);

        for (Funcionario f: funcionarios) {
            System.out.println(f.toString());
        }       
    }
}