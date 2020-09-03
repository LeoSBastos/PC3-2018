package br.com.prog3.trabalho1;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        for(int i = 0; i<200; i++){
            lista.add("nome"+(i+1));
        }
    }
}
