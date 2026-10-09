package com.frota.model;
import com.frota.enums.*;

public class Carro extends Veiculo {

	private int capacidadeMala;
	private String tipoCombustivel;
	 CategoriaVeiculos categoria;
	 EstadoVeiculo estado;
	public Carro(String modelo, String marca,String placa, EstadoVeiculo estado, double valorDiaria,int capacidadeMala, String tipoCombustivel) {
		super(modelo, marca, placa,estado, valorDiaria);
		this.estado = estado;
		this.categoria = CategoriaVeiculos.CARRO;
		this.capacidadeMala = capacidadeMala;
		this.tipoCombustivel = tipoCombustivel;
	}

	public int getCapacidadeMala() {
		return capacidadeMala;
	}

	public void setCapacidadeMala(int capacidadeMala) {
		this.capacidadeMala = capacidadeMala;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
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
		return "Carro  [capacidadeMala=" + capacidadeMala + ", tipoCombustivel=" + tipoCombustivel + "]";
	}

}
