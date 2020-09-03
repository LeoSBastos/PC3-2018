package br.com.prog3.trabalho1;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Ex18 {
    public static void main(String[] args) {
        Map<String,Aluno> mapa = new HashMap<>();
        for (int i=0;i<10;i++){
            Aluno a = new Aluno();
            a.setDataNascimento(LocalDate.now());
            a.setNome("Aluno "+ (i+1));
            a.setRg(String.valueOf(i+1));
            mapa.put(a.getRg(),a);
            mapa.put(a.getRg(),a);
        }
        for(Map.Entry<String, Aluno> a : mapa.entrySet()){
            System.out.println(a.getValue().getNome());
        }
    }
}
