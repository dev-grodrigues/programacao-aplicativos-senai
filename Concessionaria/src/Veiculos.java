
abstract class Veiculos {
	private String placa;
	private String modelo;
	private int anoFabricacao;
	private double valorBaseLocacao;
	
	public Veiculos(String placa, String modelo, int anoFabricacao, double valorBaseLocacao) {
		super();
		this.placa = placa;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.valorBaseLocacao = valorBaseLocacao;
	}
	abstract boolean exigeInspecaoAnual();
	abstract double calcularSeguro();
	abstract void tipoVeiculo();
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(int anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public double getValorBaseLocacao() {
		return valorBaseLocacao;
	}
	public void setValorBaseLocacao(double valorBaseLocacao) {
		this.valorBaseLocacao = valorBaseLocacao;
	}
}
