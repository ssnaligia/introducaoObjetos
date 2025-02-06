package com.anali.sistema.model;

public class AssinaturaMensal extends Assinatura {
    public AssinaturaMensal(String nomeAssinante, String descricaoProduto, String dataInicio, double valorMensal) {
        super(nomeAssinante, descricaoProduto, dataInicio, 1, valorMensal);
    }

    @Override
    public double calcularTotalPago() {
        long meses = calcularMesesDesdeInicio();
        return meses * valorMensal;
    }

    @Override
    public void renovarAssinatura() {
        System.out.println("Assinatura mensal renovada automaticamente!");
    }

    @Override
    public void cancelarAssinatura() {
        System.out.println("Assinatura mensal cancelada sem multa!");
    }

    @Override
    public void detalhesAssinatura() {
        System.out.println("Assinante: " + nomeAssinante);
        System.out.println("Produto: " + descricaoProduto);
        System.out.println("Data de Início: " + dataInicio.format(formatar));
        System.out.println("Valor Mensal: R$" + String.format("%.2f", valorMensal));
    }
}
