package com.anali.sistema.model;

public class Conteudo {
    private String titulo;
    private int duracao;

    public Conteudo(String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public String setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void exibirInfo() {
        System.out.println("\nTítulo: " + titulo + " | Duração: " + duracao + " min");
    }
}
