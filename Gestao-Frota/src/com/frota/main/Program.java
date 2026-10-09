
package com.frota.main;

import com.frota.model.Caminhao;
import com.frota.model.Carro;
import com.frota.model.Veiculo;
import com.frota.enums.CategoriaVeiculos;
import com.frota.enums.EstadoVeiculo;
import com.frota.services.GestaoFrota;
import com.frota.exception.*;

public class Program {

	public static void main(String[] args) throws VeiculoNaoEncontradoException {
		GestaoFrota gs = new GestaoFrota();
		Caminhao m = new Caminhao("Muriçoca", "Mercedes", "ABCDEFGH",EstadoVeiculo.DISPONIVEL,550, 100000, 2);
		
		Carro c = new Carro("Lancer", "Mitsubshi", "ABCDEFGB",EstadoVeiculo.EM_MANUNTENCAO,250,550, "Gasolina");
		System.out.println("Total Veiculos Instanciados:"+Veiculo.getTotalVeiculosInstanciados());
		try {
			gs.adicionarVeiculo(m);
			gs.adicionarVeiculo(c);
		}catch(VeiculoJaCadastradoException e){
			System.err.println("Erro:"+e.getMessage());
		}
//		gs.adicionarVeiculo(m);
		gs.listarVeiculos();
		try {
			gs.buscaVeiculo(2);
		}catch(VeiculoNaoEncontradoException e) {
			System.err.println("Erro: "+e.getMessage());
		}
		try {
			gs.buscaVeiculoCategoria(CategoriaVeiculos.CAMINHAO);			
		}catch(VeiculoNaoEncontradoException e) {
			System.err.println("Erro: "+e.getMessage());
		}
		try {
			gs.atualizaValorDiaria(2, 0);			
		}catch(IllegalArgumentException e) {
			System.err.println("Erro: "+e.getMessage());
		}
		try {
			gs.removerVeiculo(2);
		}catch(IllegalArgumentException e) {
			System.err.println("Erro: "+ e.getMessage());
		}
		gs.listarVeiculos();
		try {
			gs.buscaVeiculo(2);
		}catch(VeiculoNaoEncontradoException e) {
			System.err.println("Erro:" +e.getMessage());
		}
		}

}
