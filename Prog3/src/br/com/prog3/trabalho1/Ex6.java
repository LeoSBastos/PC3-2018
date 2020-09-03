package br.com.prog3.trabalho1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Ex6 {
    public static void main(String[] args) {
        int i = 0;
        Object[] opcoes = {"Sim", "Não"};
        ArrayList<Servico> lista = new ArrayList<>();
        while (i==0){
            Servico s = new Servico(10.0);
            s.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo:")));
            s.setQtdeHora(Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de horas:")));
            s.setDescricao(JOptionPane.showInputDialog("Digite a descricao:"));
            lista.add(s);
            i = JOptionPane.showOptionDialog(null,"Deseja Continuar Inserindo?","Confirmacao",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,null,opcoes,opcoes[0]);
        }

        Collections.sort(lista);

        for(Servico s : lista){
            System.out.println(s.getCodigo()+"\n"+s.getQtdeHora()+"\n"+s.getPrecoHora()+"\n"+s.getDescricao());
        }
    }
}
