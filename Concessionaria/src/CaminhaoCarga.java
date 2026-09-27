public class CaminhaoCarga extends Veiculo {

	public CaminhaoCarga(String placa, String modelo, int anoFabricacao, double valorBaseLocado) {
		super(placa, modelo, anoFabricacao, valorBaseLocado);
		
	}

	@Override
	boolean exigeInspecaoAnual() {
		
		return false;
	}

	@Override
	double calcularSeguro() {
		
		return 0;
	}

}
