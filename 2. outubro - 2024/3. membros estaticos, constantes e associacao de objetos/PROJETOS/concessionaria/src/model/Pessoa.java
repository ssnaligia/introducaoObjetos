package model;

import model.Carro;

public class Pessoa {
    private String nome;
    private Carro[] carros; 
    private int contador;
    private final int capacidade = 5;

    public Pessoa(String nome) {
        this.nome = nome;
        this.carros = new Carro[capacidade]; 
    }

    public void adicionarCarro(Carro carro) {
        if (contador < carros.length) { 
            carros[contador] = carro; 
            contador++; 
        } else {
            System.out.println("Limite de carros atingido!");
        }
    }

    public String getNome() {
        return nome; 
    }

    public Carro[] getCarros() {
        return carros; 
    }

    public int getNumeroDeCarros() {
        return contador; 
    }
}
