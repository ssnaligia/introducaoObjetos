package com.anali.sistema.model;

public class CamaroteInferior extends Ingresso {
    private String localizacaoMesa;

    public CamaroteInferior(double valor, String localizacaoMesa) {
        super(valor);
        this.localizacaoMesa = localizacaoMesa;
    }

    public String getLocalizacaoMesa() {
        return localizacaoMesa;
    }

    @Override
    public String imprimeValor() {
        return "- INGRESSO CAMAROTE INFERIOR - \nLocalização Mesa: " + localizacaoMesa + "\nValor do Ingresso: R$" + getValor();
    }
}
