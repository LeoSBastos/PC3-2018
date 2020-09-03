package br.com.prog3.aula14.controller;

import java.util.List;

import br.com.prog3.aula14.model.Multa;
import br.com.prog3.aula14.model.Veiculo;

public class Teste {

	public static void main(String[] args) {
		Veiculo v = new Veiculo();
		v.setPlaca("JIB4560");
		MultaController mc = new MultaController();
		List<Multa> lista = mc.buscarPeloVeiculo(v);
		if (lista != null) {
			for (Multa mu : lista) {
				System.out.println("Placa: " + mu.getVeiculo().getPlaca());
				System.out.println("Descrição: " + mu.getDescricao());
			}
		}
	}

}
