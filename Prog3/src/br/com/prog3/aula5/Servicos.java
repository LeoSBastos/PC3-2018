package br.com.prog3.aula5;

public enum Servicos {
    CC("Carga de Cartucho", 30.0),
    CI("Conserto de Impressora", 70.0),
    CG("Configuração de Computadores", 50.0),
    CA("Cabeamento de Redes", 100.0),
    FO("Formatacao do Sistema", 20.0);
    private String descricao;
    private Double valor;

    Servicos(String descricao, Double valor) {
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Double getValor() {
        return valor;
    }
}
