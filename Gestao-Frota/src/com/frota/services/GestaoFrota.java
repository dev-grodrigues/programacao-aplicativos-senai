package com.frota.services;

import com.frota.model.Veiculo;
import com.frota.enums.CategoriaVeiculos;
import com.frota.exception.*;
import java.util.ArrayList;

public class GestaoFrota implements Operacoes {

	ArrayList<Veiculo> gestao;

	public GestaoFrota() {
		super();
		this.gestao = new ArrayList<Veiculo>();
	}

	@Override
	public void adicionarVeiculo(Veiculo v) {
		for (Veiculo veiculo : gestao) {
			if (veiculo.getPlaca().equalsIgnoreCase(v.getPlaca())) {
				throw new VeiculoJaCadastradoException("Veiculo Já Cadastrado com essa Placa: " + v.getPlaca());
			}
		}
		gestao.add(v);
	}

	@Override
	public Veiculo removerVeiculo(int id) {
		Veiculo veiculoRemovido = null;
		for (int i = 0; i < gestao.size(); i++) {
			if (gestao.get(i).getId() == id) {
				veiculoRemovido = gestao.remove(i);
			}else{
				throw new IllegalArgumentException("Não foi possivel remover este veiculo!");
			}
		}
		return veiculoRemovido;
	}

	@Override
	public void buscaVeiculo(int id) throws VeiculoNaoEncontradoException {

		for (Veiculo veiculo : gestao) {
			if (veiculo.getId() == id) {
				System.out.println("=====Veiculo Encontrado=====");
				System.out.println("ID:" + veiculo.getId() + "\nVeiculo:" + veiculo.getCategoria() + "\nPlaca:"
						+ veiculo.getPlaca() + "\nMarca:" + veiculo.getMarca() + "\nModelo:" + veiculo.getModelo()
						+ "\nValor Diaria:" + veiculo.getValorDiaria());
				System.out.println("===========================");
			}
			throw new VeiculoNaoEncontradoException("Veículo com o código/placa '" + id + "' não foi encontrado!");
		}
	}

	@Override
	public void buscaVeiculoCategoria(CategoriaVeiculos categorias) throws VeiculoNaoEncontradoException {
		for (Veiculo veiculo : gestao) {
			if (veiculo.getCategoria().equals(categorias)) {
				System.out.println("=====CATEGORIA " + veiculo.getCategoria() + "=====");
				System.out.println("ID:" + veiculo.getId() + "\nVeiculo:" + veiculo.getCategoria() + "\nPlaca:"
						+ veiculo.getPlaca() + "\nMarca:" + veiculo.getMarca() + "\nModelo:" + veiculo.getModelo()
						+ "\nValor Diaria:" + veiculo.getValorDiaria());
				System.out.println("===========================");
			}
			throw new VeiculoNaoEncontradoException("Nenhum veiculo na categoria: " +categorias+" não foi encontrado!");
		}
	}

	@Override
	public void atualizaValorDiaria(int id, double valorDiaria) {
		if (gestao != null) {
			for (Veiculo veiculo : gestao) {
				if (veiculo.getId() == id) {
					veiculo.setValorDiaria(valorDiaria);
				}
			}
		}
	}

	@Override
	public void listarVeiculos() {
		if (gestao != null) {
			System.out.println("=====VEICULOS=====");
			for (Veiculo veiculo : gestao) {
				System.out.println("ID:" + veiculo.getId() + "\nVeiculo:" + veiculo.getCategoria() + "\nPlaca:"
						+ veiculo.getPlaca() + "\nMarca:" + veiculo.getMarca() + "\nModelo:" + veiculo.getModelo()
						+ "\nValor Diaria:" + veiculo.getValorDiaria());
			}
			System.out.println("==================");
		}
	}
}
