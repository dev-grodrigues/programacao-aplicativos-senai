import java.util.ArrayList;

public class GestaoFrota {
	ArrayList<Veiculos> veiculo = new ArrayList<>();
	
	public void adicionarVeiculo(Veiculos novoVeiculo) {
		veiculo.add(novoVeiculo);
	}
	public Veiculos buscarVeiculo(String placa) {
		Veiculos buscaVeiculo = null;
		for(Veiculos veiculoAtual : veiculo) {
			if(veiculoAtual.getPlaca().equalsIgnoreCase(placa)) {
				buscaVeiculo = veiculoAtual;
			}
		}
		return buscaVeiculo;
	}
	public Veiculos removerVeiculo(String placa) {
		Veiculos veiculoRemover = null;
		for(int i = 0;i < veiculo.size();i++) {
			if(veiculo.get(i).getPlaca().equalsIgnoreCase(placa)) {
				veiculoRemover = veiculo.remove(i);
			}
		}
		return veiculoRemover;
	}
	public void listarVeiculos() {
		if(veiculo.isEmpty()) {
			System.out.println("Não há nenhum veiculo cadastrado");
		}else {
			for(Veiculos veiculoLista : veiculo) {
				System.out.println("Veiculo encontrado!");
				System.out.println("Carro:"+ veiculoLista.getModelo());
				veiculoLista.tipoVeiculo();
				System.out.println("Placa-"+ veiculoLista.getPlaca()+"\nInspeção:"+veiculoLista.exigeInspecaoAnual()+"\nSeguro:"+veiculoLista.calcularSeguro());
			}
		}
	}
}
