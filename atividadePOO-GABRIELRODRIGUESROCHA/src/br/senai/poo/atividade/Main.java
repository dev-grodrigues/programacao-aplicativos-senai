package br.senai.poo.atividade;

import java.util.ArrayList;

import br.senai.poo.atividade.enums.CategoriaProdutoEnum;
import br.senai.poo.atividade.model.Eletronico;
import br.senai.poo.atividade.model.Produto;
import br.senai.poo.atividade.service.Loja;

/*Crie uma loja.
 Adicione 6 produtos utilizando o construtor definido.
Liste todos os produtos com:
Informações detalhadas (chame exibirInformacoes(true)).
Informações resumidas (chame exibirInformacoes(false)).
 Liste os produtos da categoria SMARTPHONE.
 Liste os produtos da categoria NOTEBOOK.*/

public class Main {

	public static void main(String[] args) {

		Loja samsung = new Loja();
		Eletronico n1 = new Eletronico("Alienware 15", 1510, 5500, CategoriaProdutoEnum.NOTEBOOK);
		Eletronico n2 = new Eletronico("Lenovo Loq-E", 1511, 4500, CategoriaProdutoEnum.NOTEBOOK);
		Eletronico n3 = new Eletronico("Acer Nitro V15", 1512, 4600, CategoriaProdutoEnum.NOTEBOOK);
		Eletronico n4 = new Eletronico("Iphone 18 Pro Max", 1810, 5500, CategoriaProdutoEnum.SMARTPHONE);
		Eletronico n5 = new Eletronico("Samsung S27 Ultra", 1811, 5500, CategoriaProdutoEnum.SMARTPHONE);
		Eletronico n6 = new Eletronico("Razer DeathAdder V2 X HyperSpeed", 1210, 400, CategoriaProdutoEnum.PERIFERICO);
		ArrayList<Eletronico> eletronicos = null;
		try {
			samsung.adicionarProduto(n1);
			samsung.adicionarProduto(n2);
			samsung.adicionarProduto(n3);
			samsung.adicionarProduto(n4);
			samsung.adicionarProduto(n5);
			samsung.adicionarProduto(n6);
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		try {
			eletronicos = samsung.listarProdutos();
			System.out.println("========== INFORMAÇÕES DETALHADAS ===========\n");
			for (Eletronico e : eletronicos) {
				System.out.println(e.exibirInformacoes(true));
			}
			System.out.println("========== INFORMAÇÕES SIMPLES ===========\n");
			for (Eletronico e : eletronicos) {
				System.out.println(e.exibirInformacoes(false));
			}
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println(samsung.buscaPorCategoria(CategoriaProdutoEnum.SMARTPHONE));
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
		try {
			System.out.println(samsung.buscaPorCategoria(CategoriaProdutoEnum.NOTEBOOK));
		} catch (IllegalArgumentException e) {
			System.err.println(e.getMessage());
		}
	}
}
