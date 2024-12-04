package com.anali.sistema.view;

import com.anali.sistema.model.*;

public class Main {
    public static void main(String[] args) {
        Filme f1 = new Filme("O ódio que você semeia", 132, "George Tillman, Jr", 23000000);
        Serie s1 = new Serie("Raio Negro", 2436, 4, 16);
        Filme f2 = new Filme("Ainda Estou Aqui", 137, "Walter Salles", 8000000);
        Serie s2 = new Serie("O mentalista", 6493, 7, 23);
        f1.exibirInfo();
        s1.exibirInfo();
        f2.exibirInfo();
        s2.exibirInfo();
    }
}
