package br.com.prog3.trabalho3.ex1;

public class ProdutoTeste {
    public static void main(String[] args) {
        Produto produto = new Produto();
        Compra t0 = new Compra(produto, 5);
        Venda t1 = new Venda(produto, 6);
        Compra t2 = new Compra(produto, 7);
        Venda t3 = new Venda(produto, 8);

        t0.start();
        t1.start();
        t2.start();
        t3.start();
    }
}