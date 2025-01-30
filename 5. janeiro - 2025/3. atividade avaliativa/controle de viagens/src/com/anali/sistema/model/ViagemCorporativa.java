package com.anali.sistema.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class ViagemCorporativa implements Remarcavel {
    private String destino;
    private String dataIda;
    private String dataVolta;
    protected DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public ViagemCorporativa(String destino, String dataIda, String dataVolta) {
        this.destino = destino;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
    }

    public abstract void detalhesViagem();

    public String getDestino() {
        return destino;
    }

    public String getDataIda() {
        return dataIda;
    }

    public String getDataVolta() {
        return dataVolta;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setDataIda(String dataIda) {
        this.dataIda = dataIda;
    }

    public void setDataVolta(String dataVolta) {
        this.dataVolta = dataVolta;
    }
}

