package br.com.prog3.aula12;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class DadoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;
	private String nome;
	private String departamento;
	private Integer idade;
	private Double salario;
	private Empregado empregado;
	private ArrayList<Empregado> empregados = new ArrayList<Empregado>(Arrays.asList(
			new Empregado("Ana Clara", "Marketing", 20, 2000.00), new Empregado("Carolina", "Marketing", 18, 3000.00),
			new Empregado("Adriana", "Vendas", 35, 2500.00), new Empregado("Mirian", "Marketing", 22, 2500.00),
			new Empregado("Deise", "SAC", 36, 1500.00)));

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Empregado getEmpregado() {
		return empregado;
	}

	public void setEmpregado(Empregado empregado) {
		this.empregado = empregado;
	}

	public ArrayList<Empregado> getEmpregados() {
		return empregados;
	}

	public String addEmpregado() {
		this.empregado = new Empregado(nome, departamento, idade, salario);
		empregados.add(empregado);
		return null;
	}

	public String deleteEmpregado() {
		empregados.remove(empregado);
		return null;
	}

	public String editEmpregado() {
		empregado.setPodeEditar(true);
		return null;
	}

	public String saveEmpregados() {
		for (Empregado empregado : empregados) {
		empregado.setPodeEditar(false);
		}
		return null;
	}
}
