package br.com.prog3.aula2;


import br.com.prog3.aula1.Apartamento;

import java.util.Map;
import java.util.TreeMap;

public class Atividade6 {
    public static void main(String[] args) {
        Map<Integer, Apartamento> tm = new TreeMap<>();

        Apartamento a1 = new Apartamento();
        Apartamento a2 = new Apartamento();
        Apartamento a3 = new Apartamento();

        a1.setArea(10.0);
        a1.setNumeroComodo(2);
        a1.setCodigo(12);

        a2.setArea(10.0);
        a2.setNumeroComodo(2);
        a2.setCodigo(11);

        a3.setArea(10.0);
        a3.setNumeroComodo(2);
        a3.setCodigo(13);

        tm.put(a1.getCodigo(), a1);
        tm.put(a2.getCodigo(), a2);
        tm.put(a3.getCodigo(), a3);

        for (Map.Entry<Integer, Apartamento> e : tm.entrySet()) {
            System.out.println(e.getValue().getCodigo());
        }
    }
}