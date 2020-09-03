package br.com.prog3.aula5;

import java.util.List;

public class Atividade5 {
    public Double valorServico(Servicos s, Integer qd){
        return qd*s.getValor();
    }
    public Double valorLista(List<Servicos> list,List<Integer> qd){
        Double total = 0.0;
        for (int i = 0;i<list.size();i++){
            total+=valorServico(list.get(i),qd.get(i));
        }
        return total;
    }
}
