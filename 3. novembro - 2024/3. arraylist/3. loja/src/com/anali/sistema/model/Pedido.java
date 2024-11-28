package com.anali.sistema.model;

import java.util.ArrayList;

public class Pedido {
    private int id;
    private Cliente cliente;
    private ArrayList<Produtos> produtos;
    private double precoTotal;
    private String dataEntrega;

    public Pedido(int id, Cliente cliente, ArrayList<Produtos> produtos) {
        this.id = id;
        this.cliente = cliente;
        this.produtos = produtos;
    }

    public String getId() {
        return id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Produtos> getProdutos() {
        return produtos;
    }
}
