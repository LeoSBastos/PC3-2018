package br.com.prog3.trabalho1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex9 {
    public static void main(String[] args) {
        Integer[] ar = {100, 20, 200, 30, 80, 40, 100, 200};
        List<Integer> lista = new ArrayList<>(Arrays.asList(ar));
        Double s = 0.0;
        for (Integer i : lista) {
            s+=i;
        }
        Double media = s / lista.size();
        System.out.println(media);
    }
}