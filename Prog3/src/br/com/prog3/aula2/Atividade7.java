package br.com.prog3.aula2;

import br.com.prog3.aula1.Apartamento;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class Atividade7 {
    public static void main(String[] args) {
        Queue<Apartamento> que = new Queue<Apartamento>() {
            @Override
            public boolean add(Apartamento apartamento) {
                return false;
            }

            @Override
            public boolean offer(Apartamento apartamento) {
                return false;
            }

            @Override
            public Apartamento remove() {
                return null;
            }

            @Override
            public Apartamento poll() {
                return null;
            }

            @Override
            public Apartamento element() {
                return null;
            }

            @Override
            public Apartamento peek() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Apartamento> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Apartamento> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };

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
