package br.com.prog3.aula7;

public class DepositoThread extends Thread{
    private ContaBancaria conta;
    private Double quantia;
    private static final int REPETICOES = 10;
    private static final int ESPERA = 10;

    public DepositoThread(ContaBancaria conta, Double quantia) {
        this.conta = conta;
        this.quantia = quantia;
    }
    public void run(){
        try{
            for (int i = 1; i<= REPETICOES && !isInterrupted();i++){
                conta.deposito(quantia);
                sleep(ESPERA);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
