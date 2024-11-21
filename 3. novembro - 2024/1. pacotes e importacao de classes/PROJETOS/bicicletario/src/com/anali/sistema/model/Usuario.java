package com.anali.sistema.model;

public class Usuario {
    private String nome;
    private String cpf;
    private String email;
    private String fone;
    private Bicicleta bicicletaReservada;
    private boolean statusReserva;
    private double saldoCreditos;

    public Usuario(String nome, String cpf, String email, String fone, double saldoCreditos) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.fone = fone;
        this.bicicletaReservada = null; 
        this.statusReserva = false;
        this.saldoCreditos = saldoCreditos; 
    }

    public boolean reservarBicicleta(Bicicleta bicicleta) {
        if (statusReserva) {
            System.out.println(nome + " já possui uma bicicleta reservada.");
            return false;
        }

        if (!bicicleta.isDisponivel()) {
            System.out.println("A bicicleta " + bicicleta.getId() + " não está disponível.");
            return false;
        }

        if (saldoCreditos < 10.0) {
            System.out.println(nome + " não tem créditos suficientes para reservar uma bicicleta.");
            return false;
        }

        this.bicicletaReservada = bicicleta;
        this.statusReserva = true;
        bicicleta.setDisponivel(false);
        saldoCreditos -= 10.0;
        System.out.println(nome + " reservou a bicicleta " + bicicleta.getId() + ".");
        return true;
    }

    public void devolverBicicleta(double creditosAdicionais) {
        if (!statusReserva || bicicletaReservada == null) {
            System.out.println(nome + " não tem bicicleta para devolver.");
            return;
        }

        System.out.println(nome + " devolveu a bicicleta " + bicicletaReservada.getId() + ".");
        bicicletaReservada.setDisponivel(true);
        bicicletaReservada = null;
        statusReserva = false;

        if (creditosAdicionais > 0) {
            saldoCreditos += creditosAdicionais;
            System.out.println("Foram adicionados " + creditosAdicionais + " créditos ao saldo de " + nome + ".");
        }
    }

    public void adicionarCreditos(double valor) {
        this.saldoCreditos += valor;
        System.out.println(nome + " adicionou " + valor + " créditos. Saldo atual: " + saldoCreditos);
    }
}
