import java.time.Year;

public class CarroPasseio extends Veiculo {

	public CarroPasseio(String placa, String modelo, int anoFabricacao, double valorBaseLocado) {
		super(placa, modelo, anoFabricacao, valorBaseLocado);
	}

	@Override
	boolean exigeInspecaoAnual() {
	int anoAtual = Year.now().getValue();
	return (anoAtual - this.getAnoFabricacao()) > 4;
	}

	@Override
	double calcularSeguro() {

		return 0;
	}

}
