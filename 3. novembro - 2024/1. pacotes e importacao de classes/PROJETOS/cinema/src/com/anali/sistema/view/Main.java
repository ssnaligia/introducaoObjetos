package com.anali.sistema.view;

import com.anali.sistema.model.*;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso1 = new Ingresso("Show do Natiruts", 150.00);
        Ingresso ingresso2 = new Ingresso("Show do Bruno Mars", 200.00);

        Cliente cliente1 = new Cliente("Gabriel", "12345678900", 300.00);
        Cliente cliente2 = new Cliente("Ana", "98765432100", 100.00);

        cliente1.comprarIngresso(ingresso1);

        cliente2.comprarIngresso(ingresso1);

        cliente2.comprarIngresso(ingresso2);

        cliente2.adicionarSaldo(150.00);
        cliente2.comprarIngresso(ingresso2);
    }
}
