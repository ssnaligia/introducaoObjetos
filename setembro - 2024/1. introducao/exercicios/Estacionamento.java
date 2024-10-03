/* Crie um programa que gerencie um estacionamento rotativo de carros. O programa deve
armazenar a descrição do carro, a placa, o horário de entrada e o horário de saída (despreze os
minutos). O estacionamento cobra X reais pela primeira hora de permanência com o automóvel
e X/3 pelas demais horas. Além disso, é fornecido um desconto para o pagamento de acordo com
a tabela abaixo: 

Até R$ 20 (inclusive) - 5% desconto
Entre R$ 20 e R$ 50 (inclusive) - 10% desconto
Acima de R$ 50 - 20% desconto

O programa deve exibir um relatório contendo as seguintes informações:
a) Tipo do carro. b) Placa. c) Hora da Entrada d) Hora da Saída e) Valor Pago.
*/

import java.util.Scanner;

class Estacionamento {
    public static void main(String[] args) {
        String tipo, placa;
        int horaEntrada, horaSaida;
        double valorPago, valorHora, valorDemaisHoras, valorFinal;
        Scanner entrada = new Scanner(System.in);

        valorHora = 5;
        valorDemaisHoras = valorHora / 3; 

        System.out.print("Informe o tipo do carro: ");
        tipo = entrada.nextLine();
        System.out.print("Informe a placa: ");
        placa = entrada.nextLine();
        System.out.print("Informe a hora de entrada: ");
        horaEntrada = entrada.nextInt();
        System.out.print("Informe a hora de saída: ");
        horaSaida = entrada.nextInt();

        int totalHoras = horaSaida - horaEntrada;

        if (totalHoras <= 0) {
            System.out.println("Hora de saída deve ser maior que a hora de entrada.");
            entrada.close();
            return;
        }

        valorPago = valorHora; 
        if (totalHoras > 1) {
            valorPago += (totalHoras - 1) * valorDemaisHoras;
        }

        if (valorPago <= 20) {
            valorFinal = valorPago - (valorPago * 0.05);
        } else if (valorPago > 20 && valorPago <= 50) {
            valorFinal = valorPago - (valorPago * 0.10);
        } else {
            valorFinal = valorPago - (valorPago * 0.20);
        }

        System.out.printf("\n\n--- INFORMAÇÕES ---\n");
        System.out.printf("Tipo do Carro: %s\n", tipo);
        System.out.printf("Placa: %s\n", placa);
        System.out.printf("Hora de Entrada: %dh\n", horaEntrada);
        System.out.printf("Hora de Saída: %dh\n", horaSaida);
        System.out.printf("Valor Pago: R$%.2f\n", valorFinal);

        entrada.close();
    }
}
