package br.com.prog3.aula12;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Saudacao {
	private String mensagem;
	public Saudacao() {
		this.mensagem = "Ola, Programador JSF, o Douglas e burro!!";
	}
	public String getMensagem() {
		return mensagem;
	}
	
}
