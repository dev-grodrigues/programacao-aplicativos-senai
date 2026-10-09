package br.senai.poo.atividade.model;

import br.senai.poo.atividade.enums.CategoriaProdutoEnum;

public class Eletronico extends Produto {

	CategoriaProdutoEnum categoria;
	private static Integer proximoId = 1;
	private Integer id;

	public Eletronico(String nome, Integer codigo, double preco, CategoriaProdutoEnum categoria) {
		super(nome, codigo, preco, categoria);
		this.categoria = categoria;
		this.id = proximoId++;
	}

	@Override
	public String exibirInformacoes() {
		return "Eletronico:" + getNome() + "\nCodigo:" + getCodigo() + "\nPreço:" + getPreco() + "\nCategoria:"
				+ getCategoria()+"\n==========\n";
	}
	
	public String exibirInformacoes(boolean detalhado) {
		if(detalhado) {
			return "Eletronico:" + getNome() + "\nCodigo:" + getCodigo() + "\nPreço:" + getPreco() + "\nCategoria:"
					+ getCategoria();
		}else {
			return "Eletronico:"+ getNome();
		}
	}

	public CategoriaProdutoEnum getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProdutoEnum categoria) {
		this.categoria = categoria;
	}

	public static Integer getProximoId() {
		return proximoId;
	}

	public Integer getId() {
		return id;
	}

}
