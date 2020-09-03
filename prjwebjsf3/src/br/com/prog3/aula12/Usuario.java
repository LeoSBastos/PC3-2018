package br.com.prog3.aula12;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Usuario implements Serializable{
	private static final long serialVersionUID = 1L;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getBoasVindas() {
		return "Bem-vindo "+this.nome;
	}
}
