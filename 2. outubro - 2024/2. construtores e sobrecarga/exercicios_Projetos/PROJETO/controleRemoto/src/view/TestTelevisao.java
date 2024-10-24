package view;

import model.Ligar;

public class TestTelevisao {

    public static void main(String[] args) {
        Ligar televisao1 = new Ligar(1, "Record Tv", 20);
        Ligar televisao2 = new Ligar(1, "Globo", 26);
        Ligar televisao3 = new Ligar(1, "Tv Cultura", 32);

        System.out.println("\n | SISTEMA DE TV |");
        System.out.println("\nEstado: " + televisao1.getEstado());
        System.out.println("\nEstado: " + televisao2.getEstado() + " | Canal: " + televisao2.getCanal());
        System.out.println("\nEstado: " + televisao3.getEstado() + " | Canal: " + televisao3.getCanal() + " | Volume: " + televisao3.getVolume());
    }
}
