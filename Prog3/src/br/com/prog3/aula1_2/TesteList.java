package br.com.prog3.aula1_2;

import java.util.*;

public class TesteList {
    public static void main(String[] args) {
        UsandoList ul = new UsandoList();
        LinkedList<String> lista1 = ul.listaLinked();
        ArrayList<String> lista2 = ul.listaArray();
        Vector<String> lista3 = ul.listaVector();
        List<String> lista4 = ul.listaList();
        Collections.sort(lista1);

        for (String s : lista1) {
            System.out.println(s);
        }

        /*List<Aluno> lista5 = ul.listarAlunos();

        for(String s : lista1){
            System.out.println(s);
        }
        for(Aluno a : lista5){
            System.out.println(a.getMatricula());
            System.out.println(a.getNome());
        }
        Iterator<Aluno> it = lista5.iterator();
        while (it.hasNext()){
            System.out.println(it.next());*/
    }
}
