package br.com.prog3.aula14.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.prog3.aula14.model.Veiculo;
import br.com.prog3.aula14.persistence.VeiculoDaoImp;

@ManagedBean
public class VeiculoController {
	VeiculoDaoImp vd = new VeiculoDaoImp();
	public void incluir(Veiculo veiculo) {
		this.vd.incluir(veiculo);
	}

	public void alterar(Veiculo veiculo) {
		this.vd.alterar(veiculo);
	}
	public void excluir(Veiculo veiculo) {
		this.vd.excluir(veiculo);
	}
	public List<Veiculo> listarTodos(){
		return this.vd.listarTodos();
	}
	public Veiculo buscarPelaPlaca(String placa){
		return this.vd.buscarPelaPlaca(placa);
	}
}
