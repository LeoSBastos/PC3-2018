package br.com.prog3.aula5;

public enum Uf {
    AC("Acre"), AL("Alagoas"), AP("Amapá"),
    AM("Amazonas"), BA("Bahia"), CE("Ceará"),
    DF("Distrito Federal"), ES("Espírito Santo"), GO("Goiás"),
    MA("Maranhão"), MT("Mato Grosso"), MS("Mato Grosso do Sul"),
    MG("Minas Gerais"), PA("Pará"), PB("Paraíba"),
    PR("Paraná"), PE("Pernambuco"), PI("Piauí"),
    RR("Roraima"), RO("Rondônia"), RJ("Rio de Janeiro"),
    RN("Rio Grande do Norte"), RS("Rio Grande do Sul"), SC("Santa Catarina"),
    SP("São Paulo"), SE("Sergipe"), TO("Tocantins");
    private String descricao;

    Uf(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
