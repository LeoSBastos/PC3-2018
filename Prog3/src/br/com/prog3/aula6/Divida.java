package br.com.prog3.aula6;

/**
 * @author Leo Bastos
 * **/
public class Divida {
    /**
     * @serial Número gerado automaticamente
     * **/
    private Integer id;
    private Double valor;

    /**
     * @return double - retorno um valor do tipo double
     * **/
    public double calcularDesconto(double taxa){
        return valor*taxa/100;
    }
    public double calcularValorLiquido(double taxa){
        return valor - calcularDesconto(taxa);
    }
}
