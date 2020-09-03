package br.com.prog3.trabalho1;

import java.util.*;

public class Ex10 {
    public static void main(String[] args) {
        Integer[] ar = {100, 20, 200, 30, 80, 40, 100, 200};
        List<Integer> lista = new ArrayList<>(Arrays.asList(ar));
        Double s = 0.0;
        Iterator<Integer> it = lista.iterator();
        while (it.hasNext()) {
            s+=it.next();
        }
        Double media = s / lista.size();
        System.out.println(media);
    }
}