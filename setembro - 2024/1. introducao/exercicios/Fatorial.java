/* Crie um programa que calcule o fatorial de um número fornecido pelo usuário */

import java.util.Scanner;

class Fatorial {
    public static void main(String[] args) {
        int numero, fatorial = 1; 
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Informe um número: ");
        numero = entrada.nextInt();

        if (numero < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } else {
            for (int contador = 1; contador <= numero; contador++) {
                fatorial *= contador; 
            }

            System.out.printf("Fatorial de %d: %d\n", numero, fatorial);
        }
        entrada.close();
    }
}
