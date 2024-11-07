package com.anali.sistema.model;

public class Livro {
    private String titulo;
    private String autor;
    private boolean emprestado = false;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
