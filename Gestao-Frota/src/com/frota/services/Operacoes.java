package com.frota.services;
import com.frota.enums.CategoriaVeiculos;
import com.frota.exception.VeiculoNaoEncontradoException;
import com.frota.model.Veiculo;
public interface Operacoes {
	public void adicionarVeiculo(Veiculo v);
	public Veiculo removerVeiculo(int id);
	public void buscaVeiculo(int id) throws VeiculoNaoEncontradoException;
	public void buscaVeiculoCategoria(CategoriaVeiculos categorias) throws VeiculoNaoEncontradoException;
	public void atualizaValorDiaria(int id, double valorDiaria);
	public void listarVeiculos();

}
