package br.senai.poo.atividade.service;

import java.util.ArrayList;
import java.util.List;

import br.senai.poo.atividade.enums.CategoriaProdutoEnum;
import br.senai.poo.atividade.model.Eletronico;
import br.senai.poo.atividade.model.Produto;

public class Loja {
	ArrayList<Eletronico> products;
	
	public Loja() {
		this.products = new ArrayList<Eletronico>();
	}

	public boolean adicionarProduto(Eletronico novoProduto) {
		if (products == null) {
			throw new IllegalArgumentException("Erro: Não foi possivel adicionar produto, lista não existe!");
		} else {
			products.add(novoProduto);
			System.out.println("Produto:"+novoProduto.getNome()+" Adicionado!");
			return true;
		}
	}
	
	
	public ArrayList<Eletronico> listarProdutos() {
		if (products.isEmpty() || products == null) {
			throw new IllegalArgumentException("Erro: Não foi possivel listar produtos, lista vazia!");
		} 
		return products;
	}
	public String buscaPorNome(String nome) {
		if(products.isEmpty() || products == null) {
			throw new IllegalArgumentException("Erro: Não foi possivel buscar produto, lista vazia!");
		}
		StringBuilder sb = new StringBuilder();
		for (Produto produto : products) {
			if(produto.getNome().equals(nome)) {
				sb.append(produto.exibirInformacoes());
			}
		}
		return sb.toString();
	}
	public String buscaPorCategoria(CategoriaProdutoEnum categoria) {
		if(products.isEmpty() || products == null) {
			throw new IllegalArgumentException("Erro: Não foi possivel buscar produto, lista vazia!");
		}
		StringBuilder sb = new StringBuilder();
		for (Produto produto : products) {
			if(produto.getCategoria().equals(categoria)) {
				sb.append(produto.exibirInformacoes());
			}
		}
		return sb.toString();
	}
}
