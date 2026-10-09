package br.senai.poo.atividade.model;

import br.senai.poo.atividade.enums.CategoriaProdutoEnum;

public abstract class Produto {
	private String nome;
	private Integer codigo;
	private double preco;
	CategoriaProdutoEnum categoria;

	public abstract String exibirInformacoes();

	public Produto(String nome, Integer codigo, double preco, CategoriaProdutoEnum categoria) {
		this.nome = nome;
		setCodigo(codigo);
		setPreco(preco);
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		if (codigo < 0 || codigo == null) {
			throw new IllegalArgumentException("Erro: Codigo Invalido!");
		} else {
			this.codigo = codigo;
		}
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco > 0) {
			this.preco = preco;
		} else {
			throw new IllegalArgumentException("Erro: Preço Invalido!");
		}
	}

	public CategoriaProdutoEnum getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaProdutoEnum categoria) {
		this.categoria = categoria;
	}

}
