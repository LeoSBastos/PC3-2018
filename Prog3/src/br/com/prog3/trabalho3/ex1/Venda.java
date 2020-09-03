package br.com.prog3.trabalho3.ex1;

public class Venda extends Thread{
    private Produto produto;
    private Integer quantia;
    private static final int REPETICOES = 10;
    private static final int ESPERA = 10;

    public Venda(Produto produto, Integer quantia) {
        this.produto = produto;
        this.quantia = quantia;
    }

    public void run(){
        try {
            for(int i = 1; i<= REPETICOES && !isInterrupted(); i++){
                produto.venda(quantia);
                sleep(ESPERA);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
