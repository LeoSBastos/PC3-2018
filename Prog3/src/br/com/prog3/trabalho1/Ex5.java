package br.com.prog3.trabalho1;

import java.util.ArrayList;
import java.util.Collections;

public class Ex5 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("String 1");
        lista.add("String 1");
        lista.add("String 2");
        lista.add("String 2");
        lista.add("String 3");
        lista.add("String 3");
        Collections.sort(lista);
        for (String s: lista) {
            System.out.println(s);
        }
    }
}
