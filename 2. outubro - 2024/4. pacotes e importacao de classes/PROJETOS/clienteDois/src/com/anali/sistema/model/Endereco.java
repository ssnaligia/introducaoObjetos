package com.anali.sistema.model;

public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private int cep;
    private String cidade;
    private String estado;

    public Endereco(String logradouro, int numero, String complemento, int cep, String cidade, String estado) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public int getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    
}
