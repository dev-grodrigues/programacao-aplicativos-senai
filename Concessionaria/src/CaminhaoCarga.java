import java.time.Year;

public class CaminhaoCarga extends Veiculos {

	public CaminhaoCarga(String placa, String modelo, int anoFabricacao, double valorBaseLocacao) {
		super(placa, modelo, anoFabricacao, valorBaseLocacao);

	}

	@Override
	boolean exigeInspecaoAnual() {
		int anoAtual = Year.now().getValue();
		return (anoAtual - getAnoFabricacao()) > 2;
	}

	@Override
	double calcularSeguro() {
		double valorSeguro = (getValorBaseLocacao() * 0.05) + 500;
		return valorSeguro;
	}
	void tipoVeiculo() {
		System.out.println("Tipo:Caminhao de Carga");
	}
	
}
