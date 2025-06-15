package org.example.entidades;

public class Moto extends Veiculo {

    private Integer id;
    private Integer cilindradas;
    private String tipoDePartida;

    public Moto( Integer id, String marca, String modelo, Integer ano, Integer cilindradas, String tipoDePartida) {
        super(marca, modelo, ano);
        this.id = id;
        this.cilindradas = cilindradas;
        this.tipoDePartida = tipoDePartida;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
    public String getDescription(){
        return  "id: " + id + "Marca " + getMarca() + " Modelo: " + getModelo()
                + " ano: " + getAno() + " Cilindradas: " + cilindradas
                + "tipo de Partida: " + tipoDePartida;
    }
}
