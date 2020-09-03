package br.com.prog3.aula7;

import javax.swing.*;
import java.awt.*;

public class Contador extends JFrame {
    JLabel l1;

    public Contador(String titulo) {
        JFrame j = new JFrame(titulo);
        j.setDefaultCloseOperation(j.EXIT_ON_CLOSE);
        l1 = new JLabel("Inicia contador");
        j.add(l1);
        j.setSize(300,200);
        j.setVisible(true);
    }

    private void iniciaContador() {
        try {
            for(int i = 10; i > 0; i--){
                l1.setText(i+"");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        l1.setText(Thread.currentThread().toString());
    }

    public static void main(String[] args) {
        Contador t = new Contador("Contador");
        t.iniciaContador();
    }
}