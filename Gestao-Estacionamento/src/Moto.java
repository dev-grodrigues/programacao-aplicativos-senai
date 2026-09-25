
public class Moto extends Veiculo {
	private TipoVeiculo tipo;
	public Moto(String placa, int horasEstacionado, String modelo) {
		super(placa, horasEstacionado, modelo);
		this.tipo = TipoVeiculo.MOTO;
	}

	@Override
	double calcularValorTotal() {
		double valorHora = 5;
		return (valorHora * getHorasEstacionado());
	}

	public TipoVeiculo getTipo() {
		return tipo;
	}

	public void setTipo(TipoVeiculo tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
	 return "Moto Modelo:" + this.getModelo() + ", Placa:" + this.getPlaca() + ", Horas Estacionado:" + this.getHorasEstacionado() +", Valor:"+ calcularValorTotal();
	}
	
}
