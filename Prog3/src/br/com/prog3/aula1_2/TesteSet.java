package br.com.prog3.aula1_2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TesteSet {
    public static void main(String[] args) {
        UsandoSet us = new UsandoSet();
        HashSet<String> lista1 = us.listarHashSet();
        LinkedHashSet<String> lista2 = us.listarLinked();
        TreeSet<String> lista3 = us.listarTreeSet();
        Set<String> lista4 = us.listar();
        Set<Aluno> lista5 = us.listarAlunos();
        for(String s : lista3){
            System.out.println(s);
        }
    }
}
