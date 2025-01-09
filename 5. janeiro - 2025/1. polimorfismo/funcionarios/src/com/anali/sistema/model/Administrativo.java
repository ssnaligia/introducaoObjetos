package com.anali.sistema.model;

public class Administrativo extends Assistente {
    private boolean turnoNoturno;

    public Administrativo(String nome, String setor, double salario, int codIdentificador, boolean turnoNoturno) {
        super(nome, setor, salario, codIdentificador);
        this.turnoNoturno = turnoNoturno;
    }

    public boolean getTurnoNoturno() {
        return turnoNoturno;
    }

    public double calcularAdicionalNoturno() {
        if (turnoNoturno == true) {
            return getSalario() * 0.20; 
        }
        return 0;
    }

    @Override
    public String toString() {
        return "Cód. Identificador: " + getCodIdentificador() + " - Administrativo: " + getNome() + " - Setor: " + getSetor() + " - Salário: R$" + getSalario() + " | Bônus: R$" + calcularAdicionalNoturno() + " - Total: R$" + (getSalario() + calcularAdicionalNoturno()) +  " - Turno: " + (turnoNoturno ? "Noturno" : "Matutino");
    }
}
