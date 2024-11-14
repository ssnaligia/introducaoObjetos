package com.anali.sistema.model;

public class Login {
    private String nomeUm;
    private String nomeDois;
    private String nomeTres;

    public Login(String nomeUm, String nomeDois, String nomeTres) {
        this.nomeUm = nomeUm;
        this.nomeDois = nomeDois;
        this.nomeTres = nomeTres;
    }

    public String getNomeUm() {
        return nomeUm;
    }

    public String getNomeDois() {
        return nomeDois;
    }

    public String getNomeTres() {
        return nomeTres;
    }
}