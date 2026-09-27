
abstract class Veiculo {

	private String placa;
	private String modelo;
	private int anoFabricacao;
	private double valorBaseLocado;
	
	public Veiculo(String placa, String modelo, int anoFabricacao, double valorBaseLocado) {
		this.placa = placa;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.valorBaseLocado = valorBaseLocado;
	}
	
	abstract boolean exigeInspecaoAnual();
	abstract double calcularSeguro();
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
	public double getValorBaseLocado() {
		return valorBaseLocado;
	}
	public void setValorBaseLocado(double valorBaseLocado) {
		this.valorBaseLocado = valorBaseLocado;
	}
	
}
