package com.anali.sistema.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ViagemInternacional extends ViagemCorporativa {
    private String passaporte;
    private double taxaRemarcacao = 75;

    public ViagemInternacional(String passaporte, String destino, String dataIda, String dataVolta) {
        super(destino, dataIda, dataVolta);
        this.passaporte = passaporte;
    }

    public String getPassaporte() {
        return passaporte;
    }

    public double getTaxaRemarcacao() {
        return taxaRemarcacao;
    }

    @Override
    public void remarcarViagem(String destinoNovo, String dataIdaNova, String dataVoltaNova) {
        LocalDate dataOriginal = LocalDate.parse(getDataIda(), formatar);
        LocalDate dataHoje = LocalDate.parse("2025-02-01");
        LocalDate limiteData = dataOriginal.minusDays(7);

        System.out.println("\n| DADOS DA REMARCAÇÃO |\n");
        System.out.println(" Destino Atual: " + getDestino() + " -> Novo Destino: " + destinoNovo);
        System.out.println(" Data de Ida Atual: " + getDataIda() + " -> Nova Data de Ida: " + dataIdaNova);
        System.out.println(" Data de Volta Atual: " + getDataVolta() + " -> Nova Data de Volta: " + dataVoltaNova);

        if(dataHoje.isBefore(limiteData) || dataHoje.isEqual(limiteData)) {
            setDataIda(dataIdaNova);
            setDataVolta(dataVoltaNova);
            setDestino(destinoNovo);
            double reais = taxaRemarcacao * 5.86;
            System.out.println("\nRemarcamos sua viagem, mas será cobrada uma taxa de $" + taxaRemarcacao + " dólares (R$" + String.format("%.2f", reais) + " reais)!");
        } else {
            System.out.println("\nOps, não foi possível remarcar sua viagem! :( Você teve até 7 dias antes da data de ida para remarcar!");
        }
    }

    @Override
    public void detalhesViagem() {
        System.out.println("\nDestino: " + super.getDestino());
        System.out.println("Data Ida: " + super.getDataIda() + " | Data Volta: " + super.getDataVolta());
        System.out.println("Passaporte: " + getPassaporte());
    }
}