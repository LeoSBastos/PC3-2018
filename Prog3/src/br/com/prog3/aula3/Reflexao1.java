package br.com.prog3.aula3;

public class Reflexao1 {
    public static void main(String[] args) {
        Integer i = new Integer(6);
        Class c = i.getClass();
        System.out.println(c);
        String s = new String();
        c = s.getClass();
        System.out.println(c);
        Carro ca = new Carro();
        c = ca.getClass();
        System.out.println(c);
    }
}
