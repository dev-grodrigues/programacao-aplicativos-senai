package com.senai.funcionarios.model;

public abstract class Funcionario {
	
	private String nome;
	private Double salarioBase;
	
 	
	public Funcionario(String nome, Double salarioBase) {
		super();
		this.nome = nome;
		this.salarioBase = salarioBase;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public abstract Double calcularSalario();

	
	public String exibirDados() {
		return "Nome:"+nome+"\nSalario:"+salarioBase;
	}
	
}
