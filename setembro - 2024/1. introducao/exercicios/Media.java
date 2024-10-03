/* Escreva um programa que efetue a leitura de duas notas, calcule e mostre a média ponderada
dessas notas. A primeira nota tem peso 1 e a segunda nota tem peso 2. */

class Media {
    public static void main(String[] args) {
        double notaUm = 7.8;
        double notaDois = 9.5;
        double mediaP = (((notaUm * 1) + (notaDois * 2)) / (1+2));

        System.out.printf("Média Ponderada: %.2f\n", mediaP);
    }
}
