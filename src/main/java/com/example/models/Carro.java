package com.example.models;

public class Carro extends Veiculo {
    private int nportas;

    public Carro(String marca, String modelo, Integer ano, Integer nportas) {
        super(marca, modelo, ano);
        this.nportas = nportas;
    }

    public int getNportas() {
        return nportas;
    }

    public void setNportas(int nportas) {
        this.nportas = nportas;
    }

    public String exibirDetalhe() {

                return super.exibirDetalhe()
                + "\nQntd de Portas :"+ this.nportas;
    }

}
