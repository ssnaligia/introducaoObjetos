package view;

import model.CadastrarCliente;

public class TestCadastrarCliente {
    public static void main(String[] args) {
        CadastrarCliente cliente1 = new CadastrarCliente("Flora", "florinhadivuda@gmail.com", 21);
        CadastrarCliente cliente2 = new CadastrarCliente("Celine", "celinefofa@gmail.com", 19);

        System.out.println("\n| Clientes Cadastrados |");
        System.out.println("\nNome: " + cliente1.getNome() + " | Idade: " + cliente2.getIdade());
        System.out.println("\nNome: " + cliente2.getNome() + " | Idade: " + cliente2.getIdade() + " | Email: " + cliente2.getEmail());
    }
}
