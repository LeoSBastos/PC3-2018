package br.com.prog3.aula3;

import java.util.Objects;

public class Carro {
    private String placa;
    private Integer anoFabricacao;
    private Integer anoModelo;
    private String marca;
    private String modelo;
    private String cor;
    private Double valor;
    public static final Double PERCENTUAL = 0.035;

    public Carro() {
    }

    public Carro(String placa) {
        this.placa = placa;
    }

    public Carro(String placa, Double valor) {
        this.placa = placa;
        this.valor = valor;
    }

    public Double calcularIpva(){
        return valor*PERCENTUAL;
    }
}
