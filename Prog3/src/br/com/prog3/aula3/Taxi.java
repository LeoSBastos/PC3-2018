package br.com.prog3.aula3;

public class Taxi extends Carro {
    private String areaAtuacao;
    private String tipo;
    private String companhia;
    private static final Double PERCENTUALTAXI = 0.025;

    public Taxi(){}

    public Taxi(String placa, Double valor, String companhia) {
        super(placa, valor);
        this.companhia = companhia;
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }

    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    //@Override
    public Double calcularIpva(double valor) {
        return valor*PERCENTUALTAXI;
    }
}
