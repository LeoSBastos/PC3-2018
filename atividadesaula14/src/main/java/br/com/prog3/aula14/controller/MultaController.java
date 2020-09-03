package br.com.prog3.aula14.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.prog3.aula14.model.Multa;
import br.com.prog3.aula14.model.Veiculo;
import br.com.prog3.aula14.persistence.MultaDaoImp;

@ManagedBean
public class MultaController {
	MultaDaoImp md = new MultaDaoImp();

	public void incluir(Multa multa) {
		md.incluir(multa);
	}

	public void alterar(Multa multa) {
		md.alterar(multa);
	}

	public void excluir(Multa multa) {
		md.excluir(multa);
	}

	public List<Multa> listarTodos() {
		return md.listarTodos();
	}

	public Multa buscarPeloCodigo(int codigo) {
		return md.buscarPeloCodigo(codigo);
	}

	public List<Multa> buscarPeloVeiculo(Veiculo veiculo) {
		return md.buscarPeloVeiculo(veiculo);
	}
}