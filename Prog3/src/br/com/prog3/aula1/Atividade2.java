package br.com.prog3.aula1;

import java.util.*;

public class Atividade2 {
    public static void main(String[] args) {
        String[] cursos = {"Ciência da Computação", "Licenciatura em Física", "Licenciatura em Química", "Eletromecânica", "Ciência da Computação"};
        Set<String> listaCursos = new HashSet<>(Arrays.asList(cursos));
        System.out.println(listaCursos.size());
        Iterator<String> it1 = listaCursos.iterator();
        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        for(String s : listaCursos){
            System.out.println(s);
        }
        listaCursos.remove("Eletromecânica");
        for(String s : listaCursos){
            System.out.println(s);
        }
        System.out.println(listaCursos.contains("Licenciatura em Física"));
        System.out.println(listaCursos.contains("Eletromecânica"));
        listaCursos.clear();
        System.out.println(listaCursos.size());
        System.out.println("\n");
        Set<String> listaLinkedCursos = new LinkedHashSet<>(Arrays.asList(cursos));
        System.out.println(listaLinkedCursos.size());
        Iterator<String> it2 = listaLinkedCursos.iterator();
        while (it2.hasNext()){
            System.out.println(it2.next());
        }
        for(String s : listaLinkedCursos){
            System.out.println(s);
        }
        listaLinkedCursos.remove("Eletromecânica");
        for(String s : listaLinkedCursos){
            System.out.println(s);
        }
        System.out.println(listaLinkedCursos.contains("Licenciatura em Física"));
        System.out.println(listaLinkedCursos.contains("Eletromecânica"));
        listaLinkedCursos.clear();
        System.out.println(listaLinkedCursos.size());
    }
}
