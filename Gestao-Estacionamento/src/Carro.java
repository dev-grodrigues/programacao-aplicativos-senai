
public class Carro extends Veiculo {
	

	public Carro(String placa, int horasEstacionado, String modelo) {
		super(placa, horasEstacionado, modelo);
		this.tipo = TipoVeiculo.CARRO;
	}

	TipoVeiculo tipo;


	@Override
	double calcularValorTotal() {
		double valorHora = 10;
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
		 return "Carro Modelo:" + this.getModelo() + ", Placa:" + this.getPlaca() + ", Horas Estacionado:" + this.getHorasEstacionado() +", Valor:"+ calcularValorTotal();
	}
	
}
