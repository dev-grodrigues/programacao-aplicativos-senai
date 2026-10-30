package com.senai.funcionarios.model.service;

import java.util.ArrayList;

import com.senai.funcionarios.*;
import com.senai.funcionarios.model.Funcionario;

public class Empresa {
	private String nome;
	private ArrayList<Funcionario> list;
	
	public Empresa(String nome) {
		super();
		this.nome = nome;
		this.list = new ArrayList<>();
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Funcionario> getList() {
		return list;
	}

	
	public boolean adicionarFuncionario(Funcionario f) {
		if(list == null) {
			throw new IllegalArgumentException("Lista não foi criada!");
		}
		list.add(f);
		return true;
	}
	
	public String exibirFuncionarios() {
	
	}
	
}
