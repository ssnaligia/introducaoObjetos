/*Faça um programa que leia o preço de um produto, calcule e mostre, de acordo com as tabelas
a seguir, o novo preço e a classificação.
Tabela de Aumentos:
    Até R$ 50,00: aumento de 10%
    De R$ 50,00 até R$ 100,00: aumento de 20%
    Acima de R$ 100,00: aumento de 30%

Tabela de Classificação de Preços:
    Até R$ 80,00: classificação "Barato"
    De R$ 80,00 até R$ 120,00: classificação "Normal"
    De R$ 120,00 até R$ 200,00: classificação "Caro"
    Acima de R$ 200,00: classificação "Muito Caro"
*/

import java.util.Scanner;

class NovoPreco {
    public static void main(String[] args) {
        double precoProd, novoPreco;
        String classificacao;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do produto X: ");
        precoProd = entrada.nextDouble();

        if(precoProd <=50) {
            novoPreco = precoProd * 1.1;
        } else if(precoProd <=100) {
            novoPreco = precoProd * 1.2;
        } else {
            novoPreco = precoProd * 1.3;        
        }

        if(novoPreco <80) {
            classificacao = "Barato";
        } else if(novoPreco < 120) {
            classificacao = "Normal";
        } else if(novoPreco < 200) {
            classificacao = "Caro";
        } else {
            classificacao = "Muito Caro";
        }
        
        System.out.printf("Novo Preço: R$%.2f | Classificação: %s\n", novoPreco, classificacao);
    }
}