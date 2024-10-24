/* Escreva um programa que será armazenado dentro de um controle remoto de uma Tv. O
programa deve conter o método “ligar()”. Esse método pode ser utilizado em três situações: na
primeira, a Tv somente será ligada; na segunda, a Tv será ligada e sintonizada em um canal
informado pelo usuário; já na terceira, a Tv será ligada, o canal sintonizado e também o volume
será ajustado de acordo com a preferência do usuário. */

package model;

public class Ligar {
    private int ligado;
    private String estado;
    private String canal;
    private int volume;

    public Ligar() {
        this.estado = "";
    }

    public Ligar(int ligado) {
        this.ligado = ligado;
        setLigado(ligado);
    }

    public Ligar(int ligado, String canal) {
        this.ligado = ligado;
        setLigado(ligado);
        this.canal = canal;
    }

    public Ligar(int ligado, String canal, int volume) {
        this.ligado = ligado;
        setLigado(ligado);
        this.canal = canal;
        this.volume = volume;
    }

    public int getLigado() {
        return ligado;
    }

    public int getVolume() {
        return volume;
    }

    public String getCanal() {
        return canal;
    }

    public String getEstado() {
        return estado;
    }

    public void setLigado(int ligado) {
        if(ligado == 1) {
            this.estado = "Ligado";
        } else{
            this.estado = "Desligado";
        }
    }

    public void setVolume(int volume) {
        volume = volume;
    }

    public void setCanal(String canal) {
        canal = canal;
    }
}
