package com.example.models;

public class Moto extends Veiculo {

    private String tipoguidao;

    public Moto(String marca, String modelo, Integer ano, String tipoguidao) {
        super(marca, modelo, ano);
        this.tipoguidao = tipoguidao;
    }

    public String getTipoguidao() {
        return tipoguidao;
    }

    public void setTipoguidao(String tipoguidao) {
        this.tipoguidao = tipoguidao;
    }

    public String exibirDetalhe() {
        return "Marca : " + getMarca() + "\nModelo :" + getModelo()
                + "Ano : " + getAno() + "Numero de Portas : "
                + getTipoguidao();
    }
}
