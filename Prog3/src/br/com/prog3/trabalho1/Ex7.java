package br.com.prog3.trabalho1;

import java.util.HashSet;

public class Ex7 {
    public static void main(String[] args) {
        HashSet<String> lista = new HashSet<>();
        lista.add("String 1");
        lista.add("String 1");
        lista.add("String 2");
        lista.add("String 2");
        lista.add("String 3");
        lista.add("String 3");
        for (String s: lista) {
            System.out.println(s);
        }
    }
}


