 package br.com.prog3.trabalho1;

public class Servico implements Comparable<Servico> {
    private Integer codigo;
    private String descricao;
    private Double precoHora;
    private Integer qtdeHora;

    public Servico(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecoHora() {
        return precoHora;
    }

    public void setPrecoHora(Double precoHora) {
        this.precoHora = precoHora;
    }

    public Integer getQtdeHora() {
        return qtdeHora;
    }

    public void setQtdeHora(Integer qtdeHora) {
        this.qtdeHora = qtdeHora;
    }

    public Double valor(){
        return (this.qtdeHora * this.precoHora);
    }

    @Override
    public int compareTo(Servico serv) {
        return this.descricao.compareTo(serv.getDescricao());
    }
}
