package br.com.prog3.aula5;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Main5 {

    //Funcao para a criacao e impressao da tabela
    public static void imprimir(List<Servicos> serv, List<Integer> qd){
        //Para configuracao da string no caso da moeda brasileira
        Locale l = new Locale("pt","BR");
        NumberFormat nf = NumberFormat.getCurrencyInstance(l);

        Atividade5 at5 = new Atividade5();

        //Criando o iterador para criacao da tabela e insercao dos itens
        int it = serv.size()+1;
        //Criando a tabela para impressao
        final Object[][] tableRow = new String[it][];
        //Adicionando o header da tabela
        tableRow[0] = new String[] {"Tipo", "Descrição", "Valor unitário", "Quantidade", "Valor total"};

        //Adicionando cada linha da tabela
        for(int i = 0; i<it-1; i++) {
            tableRow[i + 1] = new String[]{serv.get(i).toString(), serv.get(i).getDescricao(), nf.format(serv.get(i).getValor()), String.valueOf(qd.get(i)), nf.format(at5.valorServico(serv.get(i), qd.get(i)))};
        }

        //Formatando e imprimindo cada linha
        for (final Object[] row : tableRow) {
            System.out.format("%10s %30s %15s %13s %13s\n", row);
        }

        //Calculando o total
        Double total = at5.valorLista(serv,qd);
        System.out.println("Total dos serviços---------------------------------------------------------: "+nf.format(total));
    }

    public static void main(String[] args) {
        List<Servicos> serv = new ArrayList<>();
        List<Integer> qd = new ArrayList<>();
        List<Double> totais = new ArrayList<>();

        //Pegando os valores do Enum
        Servicos[] possibleValues = Servicos.class.getEnumConstants();

        //Transformando em String para o ComboBox
        String[] possibilities = new String[possibleValues.length];
        for(int i = 0; i<possibleValues.length; i++){
            possibilities[i] = possibleValues[i].name();
        }

        //butoes sim ou nao para a confirmação do while
        String[] opcoes = {"Sim", "Nao"};

        //Iterator para o while
        Integer it = 0;

        //While para Receber o input das listas
        while(it == 0){

            //Adicionando a lista de servicos um objeto com cast para Servicos e esse objeto sendo retornado do InputDialog com escolhas
            serv.add((Servicos)JOptionPane.showInputDialog(null,"Escolha o Servico: ","Escolha o servico",JOptionPane.PLAIN_MESSAGE,null, possibleValues,possibleValues[0]));


            qd.add(Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade do Servico:")));

            //Option Dialog para continuacao do while
            it = JOptionPane.showOptionDialog(null,"Deseja Continuar Inserindo?","Confirmacao",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes,opcoes[0]);
        }

        imprimir(serv,qd);
    }
}
