package br.com.prog3.aula7;

public class ContaBancaria {
    Double saldo = 0.0;

    public Double getSaldo() {
        return saldo;
    }

    public synchronized void deposito(Double quantia){
        System.out.print("Depositando " + quantia);
        Double novoSaldo = saldo + quantia;
        System.out.println(", novo saldo é "+novoSaldo);
        saldo = novoSaldo;
        notifyAll();
    }

    public synchronized void saque(Double quantia) throws InterruptedException{
        while(saldo < quantia){
            wait();
        }
        System.out.print("Sacando " + quantia);
        Double novoSaldo = saldo - quantia;
        System.out.println(", novo saldo é "+novoSaldo);
        saldo = novoSaldo;
        notifyAll();
    }
}