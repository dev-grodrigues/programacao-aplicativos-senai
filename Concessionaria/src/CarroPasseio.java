import java.time.Year;

public class CarroPasseio extends Veiculos {

	public CarroPasseio(String placa, String modelo, int anoFabricacao, double valorBaseLocacao) {
		super(placa, modelo, anoFabricacao, valorBaseLocacao);

	}

	@Override
	boolean exigeInspecaoAnual() {
        int anoAtual = Year.now().getValue();
		return (anoAtual - getAnoFabricacao()) > 5;
	}

	@Override
	double calcularSeguro() {
		double valorSeguro = getValorBaseLocacao() * 0.05;
		return valorSeguro;
	}

	@Override
	void tipoVeiculo() {
		System.out.println("Tipo:Carro Passeio");
	}
	
}
