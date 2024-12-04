package com.anali.sistema.model;

import com.anali.sistema.model.*;

public class Filme extends Conteudo {
    private String diretor;
    private double orcamento;
    
    public Filme(String titulo, int duracao, String diretor, double orcamento) {
        super(titulo, duracao);
        this.diretor = diretor;
        this.orcamento = orcamento;
    }

    public String getDiretor() {
        return diretor;
    }

    public double getOrcamento() {
        return orcamento;
    }

    public String setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public double setOrcamento(double orcamento) {
        this.orcamento = orcamento;
    }

    public void exibirInfo() {
        System.out.println("\nTítulo: " + getTitulo() + " | Duração: " + getDuracao() + " min" + " | Diretor: " + diretor + " | Orçamento: " + orcamento);
    }
}
