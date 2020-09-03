package br.com.prog3.aula12;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class InjetaMensagem {
	@ManagedProperty(value = "#{mensagem}")
	private Mensagem mensagemBean;
	private String mensagem;

	public InjetaMensagem() {
		System.out.println("Injeção de mensagem iniciada");
	}
	
	public String getMensagem() {
		if (mensagemBean != null) {
			mensagem = mensagemBean.getMensagem();
		}
		return mensagem;
	}

	public void setMensagemBean(Mensagem mensagemBean) {
		this.mensagemBean = mensagemBean;
	}
}
