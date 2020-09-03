package br.com.prog3.aula2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Atividade2 {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        TreeSet<Integer> ts = new TreeSet<>();
        for(int i=1; i<21; i++){
            hs.add(i);
            lhs.add(i);
            ts.add(i);
        }
        for(Integer i : hs){
            System.out.println(i);
        }
        for(Integer i : lhs){
            System.out.println(i);
        }
        for(Integer i : ts){
            System.out.println(i);
        }
    }
}
