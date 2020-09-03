package br.com.prog3.aula12;

public class Empregado {
	private String nome;
	private String departamento;
	private Integer idade;
	private Double salario;
	private Boolean podeEditar;
	public Empregado(String nome, String departamento, Integer idade, Double salario) {
		this.nome = nome;
		this.departamento = departamento;
		this.idade = idade;
		this.salario = salario;
		this.podeEditar = false;
	}
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
	public Boolean getPodeEditar() {
		return podeEditar;
	}
	public void setPodeEditar(Boolean podeEditar) {
		this.podeEditar = podeEditar;
	}


}
