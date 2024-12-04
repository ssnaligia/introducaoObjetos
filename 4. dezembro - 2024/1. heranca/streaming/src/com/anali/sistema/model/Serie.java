package com.anali.sistema.model;

import com.anali.sistema.model.*;

public class Serie extends Conteudo {
    private int temporadas;
    private int episodiosPorTemporada;
    
    public Serie(String titulo, int duracao, int temporadas, int episodiosPorTemporada) {
        super(titulo, duracao);
        this.temporadas = temporadas;
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public void exibirInfo() {
        System.out.println("\nTítulo: " + getTitulo() + " | Duração: " + getDuracao() +  " min" + " | Temporadas: " + temporadas + " | Episódios por Temporadas: " + episodiosPorTemporada);
    }
}
