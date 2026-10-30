package com.senai.funcionarios.model;

import com.senai.funcionarios.model.service.IAutenticavel;

public class Gerente extends Funcionario implements IAutenticavel{
	private String senha;
	
	
	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public Gerente(String nome, Double salarioBase, String senha) {
		super(nome, salarioBase);
		this.senha = senha;
	}

	
	@Override
	public Double calcularSalario() {
		return getSalarioBase() * 0.2;
	}

	@Override
	public Boolean autenticar(String senha) {
			if(senha.equals(getSenha())) {
				return true;
			}
			return false;
	}
	@Override
	public String exibirDados() {
		return "Nome:"+getNome()+"\nSalario:"+getSalarioBase();
	}
	
}
