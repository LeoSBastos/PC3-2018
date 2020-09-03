package br.com.prog3.trabalho1;

import java.util.HashMap;

public class Ex8 {
    public static void main(String[] args) {
        HashMap<Integer,String> m = new HashMap<>();
        for(int i = 1; i < 4; i++){
            String s = "String "+i;
            m.put(i,s);
            m.put(i,s);
        }
        for(int i = 1; i < 4; i++){
            System.out.println(m.get(i));
        }
    }
}
