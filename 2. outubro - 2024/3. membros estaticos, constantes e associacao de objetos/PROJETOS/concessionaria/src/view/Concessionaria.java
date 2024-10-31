package view;

import model.Pessoa;
import model.Carro;

public class Concessionaria {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa("Ana Ligia");
        
        Carro carro1 = new Carro("Volvo", 2023);
        Carro carro2 = new Carro("Civic", 2020);
        
        pessoa1.adicionarCarro(carro1);
        pessoa1.adicionarCarro(carro2);
        
        System.out.println("\n" + pessoa1.getNome());
        System.out.println("| Carros |");
        for (Carro carro : pessoa1.getCarros()) {
            if (carro != null) {
                System.out.println("- " + carro.getModelo() + " (" + carro.getAno() + ")");
            }
        }
    }
}
