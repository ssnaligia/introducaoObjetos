package com.anali.sistema.model;

public class Pedido {
    private int numeroPedido;
    private ItemPedido item;

    public Pedido(int numeroPedido, ItemPedido item) {
        this.numeroPedido = numeroPedido;
        this.item = item;
    }

    @Override
    public String toString() {
        return "Pedido " + numeroPedido + " | Item: " + item.getNomeProduto() + " - Quantidade: " + item.getQuantidade() + " - Preço: R$" + item.getPrecoUnitario();
    }
}
