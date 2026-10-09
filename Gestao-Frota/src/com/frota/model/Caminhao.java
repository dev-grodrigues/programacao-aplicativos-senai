package com.frota.model;
import com.frota.enums.*;


public class Caminhao extends Veiculo {
	private int capacidadeDeCarga;
	private int numeroEixos;
	CategoriaVeiculos categoria;
	EstadoVeiculo estado;
	public Caminhao(String modelo, String marca,String placa,EstadoVeiculo estado,double valorDiaria, int capacidadeDeCarga, int numeroEixos) {
		super(modelo, marca,placa,estado,valorDiaria);
		this.estado = estado;
		this.categoria = CategoriaVeiculos.CAMINHAO;
		this.capacidadeDeCarga = capacidadeDeCarga;
		this.numeroEixos = numeroEixos;
	}

	public int getCapacidadeDeCarga() {
		return capacidadeDeCarga;
	}

	public void setCapacidadeDeCarga(int capacidadeDeCarga) {
		this.capacidadeDeCarga = capacidadeDeCarga;
	}

	public int getNumeroEixos() {
		return numeroEixos;
	}

	public void setNumeroEixos(int numeroEixos) {
		this.numeroEixos = numeroEixos;
	}

	public CategoriaVeiculos getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaVeiculos categoria) {
		this.categoria = categoria;
	}

	public EstadoVeiculo getEstado() {
		return estado;
	}

	public void setEstado(EstadoVeiculo estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Caminhao [capacidadeDeCarga=" + capacidadeDeCarga + ", numeroEixos=" + numeroEixos + "]";
	}
	
}
