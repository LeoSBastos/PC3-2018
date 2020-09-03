package br.com.prog3.trabalho3.ex2;

public class InnerTeste {
    public static void main(String[] args) {
        /*ClasseExterna ce = new ClasseExterna();
        ce.mostrarInnerClass();*/

        /*MostraNumero mn = new MostraNumero();
        MostraNumero.MostraNumeroInterno mni = mn.new MostraNumeroInterno();
        System.out.println(mni.getNumero());*/

        /*ClasseAtividade3 ca3 = new ClasseAtividade3();
        ca3.metodoComInnerClass();*/

        /*Transporte transporte = new Transporte() {
            @Override
            public Double calcularFrete() {
                return 0.0;
            }
        };
        System.out.println("Valor do frete: "+transporte.calcularFrete());*/

        /*ClasseConcreta1 cc1 = new ClasseConcreta1();
        cc1.exibirMensagem(new Mensagem() {
            @Override
            public String retornarMensagem() {
                return "Teste";
            }
        });*/

        ClasseAtividade6.ClasseAninhada ca = new ClasseAtividade6.ClasseAninhada();
        ca.metodo1();
    }
}
