package br.com.prog3.trabalho3.ex1;

public class Produto {
    Integer estoque=0;

    public Integer getEstoque() {
        return estoque;
    }

    public synchronized void compra(Integer quantia){
        System.out.print("Comprando "+ quantia);
        Integer novoEstoque = estoque + quantia;
        System.out.println(", novo estoque é "+novoEstoque);
        estoque = novoEstoque;
        notifyAll();
    }

    public synchronized void venda(Integer quantia) throws InterruptedException{
        while (estoque<quantia){
            wait();
        }
        System.out.print("Vendendo "+ quantia);
        Integer novoEstoque = estoque - quantia;
        System.out.println(", novo estoque é "+novoEstoque);
        estoque = novoEstoque;
        notifyAll();
    }
}
