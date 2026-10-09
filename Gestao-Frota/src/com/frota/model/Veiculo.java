package com.frota.model;
import com.frota.enums.*;

public abstract class Veiculo {

	private static int contadorId = 1;
	private int id;
	private String modelo;
	private String marca;
	private String placa;
	private double valorDiaria;
	 EstadoVeiculo estado;
	 CategoriaVeiculos categoria;
	private static int totalVeiculosInstanciados;

	public Veiculo(String modelo, String marca, String placa, EstadoVeiculo estado,double valorDiaria) {
		super();
		this.id = contadorId++;
		totalVeiculosInstanciados++;
		this.modelo = modelo;
		this.marca = marca;
		this.placa = placa;
		this.estado = estado;
		this.categoria = categoria;
		setValorDiaria(valorDiaria);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public static void setTotalVeiculosInstanciados(int totalVeiculosInstanciados) {
		Veiculo.totalVeiculosInstanciados = totalVeiculosInstanciados;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValorDiaria() {
		return valorDiaria;
	}
	public void setValorDiaria(double valorDiaria) {
		if(valorDiaria > 0) {
			System.out.println("Valor da Diaria do Veiculo:"+getId()+" Atualizado!");
			this.valorDiaria = valorDiaria;			
		}else {
			throw new IllegalArgumentException("Valor Invalido!");
		}
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

	public static int getTotalVeiculosInstanciados() {
		return totalVeiculosInstanciados;
	}
	@Override
	public String toString() {
		return "Veiculo [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", valorDiaria=" + valorDiaria
				+ ", categoria=" + categoria + ", estado=" + estado + "]";
	}
	
}
