/*Desenvolva um programa que leia duas notas, calcule a média aritmética e mostre se o aluno
foi aprovado ou não. A média para aprovação é 6. */

import java.util.Scanner;

class MediaAritmetica {
    public static void main(String[] args) {
        double notaUm, notaDois, media;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite a nota 1: ");
        notaUm = entrada.nextDouble();

        System.out.print("Digite a nota 2: ");
        notaDois = entrada.nextDouble();

        media = (notaUm + notaDois) / 2;

        if(media >= 6) {
            System.out.printf("\nAprovado! Média: %.2f\n", media);
        } else {
            System.out.printf("\nReprovado! Média: %.2f\n", media);
        }

        entrada.close();
    }
}