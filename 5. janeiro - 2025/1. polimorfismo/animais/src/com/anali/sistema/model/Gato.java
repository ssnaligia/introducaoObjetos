package com.anali.sistema.model;

public class Gato extends Animal {
    private boolean brincando; 

    public Gato(String nome, double peso, String habitat, boolean brincando) {
        super(nome, peso, habitat);
        this.brincando = brincando;
    }

    @Override
    public String alimentacao() {
        return "Implementar maneira como um gato se alimenta.";
    }
    
}
