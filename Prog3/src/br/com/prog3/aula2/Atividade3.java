package br.com.prog3.aula2;

import java.util.*;

public class Atividade3 {
    public static void run(List<Integer> lst){
        long tempoInicial = Calendar.getInstance().getTimeInMillis();
        for(Integer i : lst){
            System.out.println(i);
        }
        long tempoFinal = Calendar.getInstance().getTimeInMillis();
        System.out.println("\n");
        System.out.println("Tempo para corrrer: " + (tempoFinal - tempoInicial));
    }
    public static void insert(List<Integer> lst){
        long tempoInicial = Calendar.getInstance().getTimeInMillis();
        lst.add(10);
        long tempoFinal = Calendar.getInstance().getTimeInMillis();
        System.out.println("\n");
        System.out.println("Tempo para inserir: " + (tempoFinal - tempoInicial));
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Vector<Integer> ve = new Vector<>();
        LinkedList<Integer> ll = new LinkedList<>();

        for(int i = 0;i<25000;i++){
            al.add(i);
            ve.add(i);
            ll.add(i);
        }

        run(al);
        run(ve);
        run(ll);

        insert(al);
        insert(ve);
        insert(ll);




    }
}