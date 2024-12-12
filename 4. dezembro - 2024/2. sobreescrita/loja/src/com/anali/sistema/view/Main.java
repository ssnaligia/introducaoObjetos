package com.anali.sistema.view;

import com.anali.sistema.model.*;

public class Main {
    public static void main(String[] args) {
        ItemPedido produto1 = new ItemPedido("Garrafa Térmica", 5, 49.90);
        ItemPedido produto2 = new ItemPedido("Mouse", 9, 69.90);
        ItemPedido produto3 = new ItemPedido("Pen Drive", 3, 35.70);

        Pedido pedido1 = new Pedido(1, produto2);   

        System.out.println(pedido1);
    }
}
