package br.com.prog3.aula1;

import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Condominio {
    public static void main(String[] args) {
        Set<Apartamento> set = new HashSet<>();
        /*Apartamento a1 = new Apartamento();
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
        a3.setCodigo(12);

        set.add(a1);
        set.add(a2);
        set.add(a3);

        System.out.println(set.size());

        System.out.println(a1.equals(a3));
        */


        long tempoInicial = Calendar.getInstance().getTimeInMillis();

        for (int i = 0; i < 10000; i++) {
            Apartamento a = new Apartamento();
            a.setCodigo(i);
            a.setNumeroComodo(i);
            a.setArea((double) i);
            set.add(a);
        }

        long tempoFinal = Calendar.getInstance().getTimeInMillis();
        System.out.println("Tempo para inserir: " + (tempoFinal - tempoInicial));

        tempoInicial = Calendar.getInstance().getTimeInMillis();

        for (Apartamento a : set) {
            if (a.hashCode() == 5000) {
                set.remove(a);
            }
        }
        tempoFinal = Calendar.getInstance().getTimeInMillis();
        System.out.println("Tempo para inserir: "+(tempoFinal-tempoInicial));
    }
}
