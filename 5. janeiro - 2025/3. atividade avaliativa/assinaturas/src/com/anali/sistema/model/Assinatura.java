package com.anali.sistema.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Assinatura implements Renovavel {
    protected String nomeAssinante;
    protected String descricaoProduto;
    protected LocalDate dataInicio;
    protected int frequenciaCobranca;
    protected double valorMensal;
    protected DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Assinatura(String nomeAssinante, String descricaoProduto, String dataInicio, int frequenciaCobranca, double valorMensal) {
        this.nomeAssinante = nomeAssinante;
        this.descricaoProduto = descricaoProduto;
        this.dataInicio = LocalDate.parse(dataInicio, formatar);
        this.frequenciaCobranca = frequenciaCobranca;
        this.valorMensal = valorMensal;
    }

    protected long calcularMesesDesdeInicio() {
        LocalDate hoje = LocalDate.now();
        int anos = hoje.getYear() - dataInicio.getYear();
        int meses = hoje.getMonthValue() - dataInicio.getMonthValue();
        return anos * 12L + meses;
    }

    protected long calcularAnosDesdeInicio() {
        LocalDate hoje = LocalDate.now();
        return hoje.getYear() - dataInicio.getYear();
    }

    public String getNomeAssinante() {
        return nomeAssinante;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }
    
    public int getFrequenciaCobranca() {
        return frequenciaCobranca;
    }

    public double getValorMensal() {
        return valorMensal;
    }

    public abstract double calcularTotalPago();
    public abstract void detalhesAssinatura();
}