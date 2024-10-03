/* Escreva um programa que leia uma determinada temperatura em graus Fahrenheit (F), calcule e
mostre a conversão para graus Celsius (C). A fórmula de conversão é: C = (F – 32). */

import java.util.Scanner;

class Celsius {
    public static void main(String[] args) {
        double temperaturaF;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe uma temperatura em Fahrenheit (°F): ");
        temperaturaF = entrada.nextDouble();

        double Celsius = temperaturaF - 32;

        System.out.println("Fahrenheit convertido em Celsius: " + Celsius + "°C");

        entrada.close();
    }
}