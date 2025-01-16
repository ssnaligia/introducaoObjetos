package com.anali.sistema.model;

public class Estudante extends Pessoa {
    public Estudante (String nome, String prontuario, double renda) {
        super(nome, prontuario, renda);
    }

    @Override
    public double calcularAuxilio() {
        if(super.getRenda() <= 1000) {
            return super.getRenda() * 0.3;
        } else if((super.getRenda() > 1000) && (super.getRenda() <= 2000)) {
            return super.getRenda() * 0.15;
        } else if(super.getRenda() > 2000){
            return super.getRenda() * 0.1;
        } else {
            return super.getRenda();
        }
    }
}