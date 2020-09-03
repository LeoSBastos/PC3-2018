package br.com.prog3.trabalho1;

import java.time.LocalDate;
import java.util.*;

public class Ex14 {
    public static void main(String[] args) {
        Set<Aluno> set = new HashSet<>();
        Map<String,Aluno> mapa = new HashMap<>();
        for (int i=0;i<20000;i++){
            Aluno a = new Aluno();
            a.setDataNascimento(LocalDate.now());
            a.setNome("Aluno "+ (i+1));
            a.setRg(String.valueOf(i+1));
            set.add(a);
            mapa.put(a.getRg(),a);
        }
        String s = "1567";
        /*Iterator<Aluno> it = set.iterator();
        while(it.hasNext()){
            Aluno a = it.next();
            if (s.equals(a.getRg())){
                System.out.println(a.getNome());
            }
        }*/
        Aluno a = mapa.get(s);
        System.out.println(a.getNome());
    }
}
