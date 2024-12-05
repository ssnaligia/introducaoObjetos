package com.anali.sistema.view;

import com.anali.sistema.model.*;

public class Main {
    public static void main(String[] args) {
        Estudante al1 = new Estudante("Vitor Souza Santos", "123456", "AQ3026200", "Engenharia Mecânica");
        Professor p1 = new Professor("Edilson Candido", "9876543", "Coordenadoria", 2010);
        Estudante al2 = new Estudante("Ana Ligia da Silva", "821393", "AQ3029212", "Sistemas para Internet");
        Professor p2 = new Professor("Eduardo Leal", "321456", "Técnico", 2019);
        al1.exibirCad();
        al2.exibirCad();
        p2.exibirCad();
        p1.exibirCad();
    }
}
