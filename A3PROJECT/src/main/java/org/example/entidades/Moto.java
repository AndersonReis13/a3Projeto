package org.example.entidades;

public class Moto extends Veiculo {

    private Integer cilindradas;
    private String tipoDePartida;

    public Moto(String marca, String modelo, Integer ano, Integer cilindradas, String tipoDePartida) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
        this.tipoDePartida = tipoDePartida;
    }


    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getTipoDePartida() {
        return tipoDePartida;
    }

    public void setTipoDePartida(String tipoDePartida) {
        this.tipoDePartida = tipoDePartida;
    }

    @Override
    public String toString() {
        return  "Marca " + getMarca() + " Modelo: " + getModelo()
                + " ano: " + getAno() + " Cilindradas: " + cilindradas
                + "tipo de Partida: " + tipoDePartida;
    }
}
