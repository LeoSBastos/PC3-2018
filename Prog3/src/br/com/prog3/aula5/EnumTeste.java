package br.com.prog3.aula5;

public class EnumTeste {
    public static void main(String[] args) {
        /*System.out.println(TipoPessoa.PESSOA_JURIDICA);
        TipoPessoa tp1 = TipoPessoa.PESSOA_FISICA;
        TipoPessoa tp2 = TipoPessoa.PESSOA_JURIDICA;
        System.out.println(tp1);
        System.out.println(tp1.name());
        System.out.println(tp1.toString());

        System.out.println(EstadoCivil.CASADO.getValor());
        System.out.println(EstadoCivil.CASADO);
        System.out.println(EstadoCivil.SOLTEIRO.getValor());
        System.out.println(EstadoCivil.SOLTEIRO);
        System.out.println(EstadoCivil.VIUVO.getValor());
        System.out.println(EstadoCivil.VIUVO);
        System.out.println(EstadoCivil.DIVORCIADO.getValor());
        System.out.println(EstadoCivil.DIVORCIADO);
        System.out.println(EstadoCivil.OUTRO.getValor());
        System.out.println(EstadoCivil.OUTRO);

        System.out.println(Uf.DF);
        System.out.println(Uf.DF.getDescricao());*/

        System.out.println(Imposto.calcularImposto(115000.0, Taxa.ITBI));
        System.out.println(Imposto.calcularImposto(115000.0, Taxa.IPTU));
        System.out.println(Imposto.calcularImposto(115000.0, Taxa.IPVA));
        System.out.println(Imposto.calcularImposto(115000.0, Taxa.ISSQN));
    }
}