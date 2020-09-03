package br.com.prog3.aula2;

import br.com.prog3.aula1.Apartamento;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Atividade4 {
    public static void main(String[] args) {
        Map<Integer, Apartamento> ht = new Hashtable<>();
        Map<Integer, Apartamento> hm = new HashMap<>();

        Apartamento ap1 = new Apartamento();
        Apartamento ap2 = new Apartamento();
        Apartamento ap3 = new Apartamento();

        ap1.setCodigo(123);
        ap1.setArea(45.6);
        ap1.setNumeroComodo(2);

        ap2.setCodigo(111);
        ap2.setArea(45.0);
        ap2.setNumeroComodo(1);

        ap3.setCodigo(254);
        ap3.setArea(50.6);
        ap3.setNumeroComodo(3);

        hm.put(ap1.getCodigo(),ap1);
        hm.put(ap2.getCodigo(),ap2);
        hm.put(ap3.getCodigo(),ap3);

        for(Map.Entry<Integer, Apartamento> a : hm.entrySet()){
            System.out.println(a.getValue().getCodigo());
        }
    }
}
