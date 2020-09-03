package br.com.prog3.aula12;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class NavegacaoController implements Serializable {
	private static final long serialVersionUID = 1L;
	@ManagedProperty(value = "#{param.pageId}")
	private String pageId;

	public String moverParaPage1() {
		return "page1";
	}

	public String moverParaPage2() {
		return "page2";
	}

	public String moverParaHomePage() {
		return "home";
	}

	public String processarPage1() {
		return "page";
	}

	public String processarPage2() {
		return "page";
	}

	public String mostrarPage() {
		if (pageId == null) {
			return "home";
		}
		if (pageId.equals("1")) {
			return "page1";
		} else if (pageId.equals("2")) {
			return "page2";
		} else {
			return "home";
		}
	}

	public String getPageId() {
		return pageId;
	}

	public void setPageId(String pageId) {
		this.pageId = pageId;
	}
}
