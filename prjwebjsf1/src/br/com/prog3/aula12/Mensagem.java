package br.com.prog3.aula12;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Mensagem {
	private String mensagem;

	public Mensagem() {
		this.mensagem = "Mensagem da propriedade mensagem da classe Mensagem";
	}

	public String getMensagem() {
		return mensagem;
	}

}
