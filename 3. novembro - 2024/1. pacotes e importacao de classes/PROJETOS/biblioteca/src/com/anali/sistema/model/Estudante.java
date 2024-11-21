package com.anali.sistema.model;

public class Estudante {
    private String nome;
    private Livro livroEmprestado;

    public Estudante(String nome) {
        this.nome = nome;
        this.livroEmprestado = null;
    }

    public String getNome() {
        return nome;
    }

    public Livro getLivroEmprestado() {
        return livroEmprestado;
    }

    public boolean emprestarLivro(Livro livro) {
        if (this.livroEmprestado != null) {
            System.out.println(nome + " já possui um livro emprestado: " + livroEmprestado.getTitulo());
            return false;
        }

        if (livro.isEmprestado()) {
            System.out.println("O livro \"" + livro.getTitulo() + "\" já está emprestado.");
            return false;
        }

        this.livroEmprestado = livro;
        livro.setEmprestado(true);
        System.out.println(nome + " emprestou o livro \"" + livro.getTitulo() + "\".");
        return true;
    }

    public void devolverLivro() {
        if (this.livroEmprestado == null) {
            System.out.println(nome + " não tem nenhum livro para devolver.");
            return;
        }

        System.out.println(nome + " devolveu o livro \"" + livroEmprestado.getTitulo() + "\".");
        livroEmprestado.setEmprestado(false);
        this.livroEmprestado = null;
    }
}
