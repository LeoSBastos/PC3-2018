package br.com.prog3.aula2;

import br.com.prog3.aula1.Apartamento;

import java.util.PriorityQueue;

public class Atividade8 {
    public static void main(String[] args) {
        PriorityQueue<Apartamento> que = new PriorityQueue<>();
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

        que.add(a1);
        que.offer(a2);
        que.add(a3);

        for (Apartamento a : que) {
            System.out.println(a.getCodigo());
        }
        que.remove();
        que.poll();

        que.element();
        que.peek();
    }
}
