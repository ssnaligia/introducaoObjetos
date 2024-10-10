/*Escreva um programa que leia o código de um produto e verifique sua validade de acordo com
a tabela abaixo. Caso a opção seja válida (ou seja, exibida na tabela), o valor do produto deve
ser impresso. Caso contrário, uma mensagem informando que o produto não está cadastrado
deve ser exibida.
Código Produto Valor
1 café R$ 5,00
2 cappucino R$ 9,50
3 chocolate R$ 10,20 */

import java.util.Scanner;

class BuscaProduto {
    public static void main(String[] args) {
        int codigo;
        
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o código do produto: ");
        codigo = entrada.nextInt();
        
        switch (codigo) {
            case 1: 
                System.out.println("Produto: Café | Valor: R$ 5,00");
                break;
            case 2: 
                System.out.println("Produto: Cappuccino | Valor: R$ 9,50");
                break;
            case 3: 
                System.out.println("Produto: Chocolate | Valor: R$ 10,20");
                break;
            default: 
                System.out.println("Produto não cadastrado.");
        }
        
        entrada.close();
    }
}
