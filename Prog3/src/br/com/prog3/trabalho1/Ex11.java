package br.com.prog3.trabalho1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ex11{
    public static void main(String[] args) {
        Integer[] ar = {100, 20, 200, 30, 80, 40, 100, 200};
        Set<Integer> set = new HashSet<>(Arrays.asList(ar));
        Double s = 0.0;
        for (Integer i : set) {
            s+=i;
        }
        Double media = s / set.size();
        System.out.println(media);
    }
}
