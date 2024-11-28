package com.anali.sistema.view;

import com.anali.sistema.model.Musicas;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Musicas musica1 = new Musicas("Você", "Tim Maia");
        Musicas musica2 = new Musicas("BB", "Tim Bernardes");
        Musicas musica3 = new Musicas("Ouro de Tolo", "Raul Seixas");
        Musicas musica4 = new Musicas("Quando Bate Aquela Saudade", "Rubel");
        Musicas musica5 = new Musicas("Quero Ser Feliz Também", "Natiruts");

        ArrayList<Musicas> playlist = new ArrayList<>();
        playlist.add(musica1);
        playlist.add(musica2);
        playlist.add(musica3);
        playlist.add(musica4);
        playlist.add(musica5);

        System.out.println("\n| PLAYLIST |\n");
        for (Musicas musica : playlist) {
            System.out.println(musica.getNome() + " - " + musica.getCantor());
        }
        System.out.println("Total de músicas: " + playlist.size());

        System.out.println("\nA música '" + playlist.get(3).getNome() + "' foi removida dos favoritos!");
        playlist.remove(3);

        System.out.println("\n| PLAYLIST ATUALIZADA |\n");
        for (Musicas musica : playlist) {
            System.out.println(musica.getNome() + " - " + musica.getCantor());
        }
        System.out.println("Total de músicas: " + playlist.size());

        System.out.println("\nTocando a música '" + playlist.get(2).getNome() + "'...");

        System.out.println("\nUAU! A música '" + playlist.get(1).getNome() + "' está em seu TOP 3 MAIS OUVIDAS na posição " + playlist.indexOf(musica2) + "! Você ouviu 15 vezes no mês de novembro.\n");

    }
}
