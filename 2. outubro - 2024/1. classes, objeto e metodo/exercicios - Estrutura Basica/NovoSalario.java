/*Elabore um programa que leia o salário de um funcionário, calcule e mostre o novo salário e o
aumento baseando-se na tabela a seguir:
Até R$ 1500 - 20%
Acima de R$ 1500 - 10% */

import java.util.Scanner;

class NovoSalario {
    public static void main(String[] args) {
        double salario;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o salário: ");
        salario = entrada.nextDouble();

        if(salario <= 1500) {
            double novoSalario = salario * 1.2;
            System.out.printf("\nNovo Salário: R$%.2f", novoSalario);
        } else {
            double novoSalario = salario * 1.1;
            System.out.printf("\nNovo Salário: R$%.2f", novoSalario);
        }

        entrada.close();
    }
}