package br.com.prog3.aula2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main1 {
    public static void addImprima(){
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        for(int i=1; i<21; i++){
            hs.add(i);
            lhs.add(i);
        }
        for(Integer i : hs){
            System.out.println(i);
        }
        for(Integer i : lhs){
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Set<Atividade1> set = new HashSet<>();
        Atividade1 a1 = new Atividade1();
        Atividade1 a2 = new Atividade1();
        a1.setCodigo(1);
        a1.setDescricao("oi");
        a2.setCodigo(2);
        a2.setDescricao("la");
        set.add(a1);
        set.add(a2);
        Iterator<Atividade1> it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next().getCodigo());
        }
        for(Atividade1 a : set){
            System.out.println(a.getCodigo());
        }
        System.out.println("\n");
        addImprima();
    }

}
