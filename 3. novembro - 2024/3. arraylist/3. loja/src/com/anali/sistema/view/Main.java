package com.anali.sistema.view;

import com.anali.sistema.model.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Valéria", "12345", "Av. Espanha, 3");
        Cliente cliente2 = new Cliente("Daphine", "56789", "Rua Itapevi, 43");
        Cliente cliente3 = new Cliente("Ester", "85410", "Rua Cascavel, 976");

        Produtos produto1 = new Produtos("Iphone 15", "Eletrônicos", "5.690");
        Produtos produto2 = new Produtos("Ludo", "Jogos", "35");
        Produtos produto3 = new Produtos("Carregador C", "Eletrônicos", "200");
        Produtos produto4 = new Produtos("Jogo de Panelas Tramontina", "Cozinha", "565.70");
    }
}
