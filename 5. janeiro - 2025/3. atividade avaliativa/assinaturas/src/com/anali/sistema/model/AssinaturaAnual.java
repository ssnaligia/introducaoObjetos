package com.anali.sistema.model;

public class AssinaturaAnual extends Assinatura {
    private static final double desconto = 0.15;  
    private static final double multaCancelamento = 0.3;
    private boolean foiCancelada;

    public AssinaturaAnual(String nomeAssinante, String descricaoProduto, String dataInicio, double valorMensal) {
        super(nomeAssinante, descricaoProduto, dataInicio, 12, valorMensal);
        this.foiCancelada = false;
    }

    @Override
    public double calcularTotalPago() {
        long anos = calcularAnosDesdeInicio();
        double totalPago = (anos * (valorMensal * 12)) * (1 - desconto);

        if (foiCancelada) {
            totalPago += (valorMensal * 12) * multaCancelamento;
        }
        return totalPago;
    }

    @Override
    public void renovarAssinatura() {
        System.out.println("Assinatura anual renovada automaticamente!");
    }

    @Override
    public void cancelarAssinatura() {
        double multa = (valorMensal * 12) * multaCancelamento;
        System.out.println("Assinatura anual cancelada! Multa aplicada: R$" + String.format("%.2f", multa));
        foiCancelada = true;
    }

    @Override
    public void detalhesAssinatura() {
        System.out.println("Assinante: " + nomeAssinante);
        System.out.println("Produto: " + descricaoProduto);
        System.out.println("Data de Início: " + dataInicio.format(formatar));
        System.out.println("Valor Anual (com desconto): R$" + String.format("%.2f", (valorMensal * 12) * (1 - desconto)));
    }
}
