package com.anali.sistema.model;

public class Professor extends Pessoa {
    public Professor (String nome, String prontuario, double renda) {
        super(nome, prontuario, renda);
    }

    @Override
    public double calcularAuxilio() {
        if(super.getRenda() <= 4000) {
            return super.getRenda() * 0.1;
        } else if((super.getRenda() > 4000) && (super.getRenda() <= 5000)) {
            return super.getRenda() * 0.05;
        } else if(super.getRenda() > 5000){
            return super.getRenda() * 0.025;
        } else {
            return super.getRenda();
        }
    }
}
