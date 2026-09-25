
abstract class Veiculo implements IValidavel{
	private String modelo;
	private String placa;
	private int horasEstacionado;
	private static int totalVeiculosAtendidos;
	
	public Veiculo(String placa, int horasEstacionado, String modelo) {
		super();
		this.modelo = modelo;
		setPlaca(placa);
		this.horasEstacionado = horasEstacionado;
		totalVeiculosAtendidos++;
	}
	abstract double calcularValorTotal();
	
	public String getPlaca() {
		return this.placa;
	}
	public void setPlaca(String placa) {
		if(placa != null && placa.length() == 7) {
			this.placa = placa;
		}else {
			System.out.println("Erro: Não foi possivel alterar a placa!");
		}
	}
	public int getTotalVeiculosAtendidos(){
		return totalVeiculosAtendidos++;
	}
	public int getHorasEstacionado() {
		return horasEstacionado;
	}
	public void setHorasEstacionado(int horasEstacionado) {
		this.horasEstacionado = horasEstacionado;
	}
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Veiculo: Modelo: " + modelo + ", Placa:" + placa + ", Horas Estacionado:" + horasEstacionado;
	}
	@Override
	public boolean validarPlaca() {
		return (this.placa.length() == 7);
	}
}
