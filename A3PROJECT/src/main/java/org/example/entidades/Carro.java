package org.example.entidades;

public class Carro extends Veiculo{

    private Integer id;
    private Integer numeroDePortas;
    private String tipoDeCombustivel;

    public Carro(String marca, String modelo, Integer ano, Integer numeroDePortas, String tipoDeCombustivel, Integer id) {
        super(marca, modelo, ano);
        this.id = id;
        this.numeroDePortas = numeroDePortas;
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(Integer numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public String getTipoDeCombustivel() {
        return tipoDeCombustivel;
    }

    public void setTipoDeCombustivel(String tipoDeCombustivel) {
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    @Override
    public String getDescription(){
        return "id: " + id + "Marca " + getMarca() + " Modelo: " + getModelo()
                + " ano: " + getAno() + " Numero de portaas: " + numeroDePortas
                + "tipo de combustivel: " + tipoDeCombustivel;
    }


}
