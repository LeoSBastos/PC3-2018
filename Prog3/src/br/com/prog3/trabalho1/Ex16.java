package br.com.prog3.trabalho1;

import java.util.HashSet;
import java.util.Set;

public class Ex16 {
    public static void main(String[] args) {
        Set<ContaCorrente> set = new HashSet<>();
        for(int i = 0;i<5;i++) {
            ContaCorrente cc = new ContaCorrente();
            cc.setAgencia((i+1));
            cc.setNumero((i+1));
            cc.setCpf(String.valueOf(i+1));
            cc.setNome("Usuario "+(i+1));
            cc.setSaldo(10.0);
            set.add(cc);
        }
        for(ContaCorrente cc : set){
            System.out.println(cc.getAgencia()+"\n"+cc.getNumero()+"\n"+cc.getNome()+"\n"+cc.getCpf()+"\n"+cc.getSaldo()+"\n");
        }
    }
}
