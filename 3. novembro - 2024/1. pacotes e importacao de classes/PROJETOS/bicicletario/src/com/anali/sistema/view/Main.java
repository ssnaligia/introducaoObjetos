package com.anali.sistema.view;

import com.anali.sistema.model.Bicicleta;
import com.anali.sistema.model.Usuario;

public class Main {
    public static void main(String[] args) {
        Bicicleta b1 = new Bicicleta("001", "Mountain Bike", "Estação Central");
        Bicicleta b2 = new Bicicleta("002", "Speed Bike", "Estação Sul");

        Usuario u1 = new Usuario("Leandro", "12345678900", "leandro@email.com", "999999999", 15.0);
        Usuario u2 = new Usuario("Beatriz", "98765432100", "bea@email.com", "888888888", 5.0);

        u1.reservarBicicleta(b1);

        u2.reservarBicicleta(b1);

        u1.devolverBicicleta(5.0);

        u2.reservarBicicleta(b1);

        u2.devolverBicicleta(0);

        u2.adicionarCreditos(10.0);
        u2.reservarBicicleta(b2);
    }
}
