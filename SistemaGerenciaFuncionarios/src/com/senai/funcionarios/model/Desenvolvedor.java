package com.senai.funcionarios.model;

public class Desenvolvedor extends Funcionario{

	public Desenvolvedor(String nome, Double salarioBase) {
		super(nome, salarioBase);

	}

	@Override
	public Double calcularSalario() {
	
		return getSalarioBase() * 0.1;
	}
	@Override
	public String exibirDados() {
		return "Nome:"+getNome()+"\nSalario:"+getSalarioBase();
	}
	
}
