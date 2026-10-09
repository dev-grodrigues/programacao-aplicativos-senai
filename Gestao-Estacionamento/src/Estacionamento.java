import java.util.ArrayList;

public class Estacionamento {
	private String nome;
	ArrayList<Vaga> vagas;

 	public Estacionamento(String nome) {
	super();
	this.nome = nome;
	this.vagas = new ArrayList<>();
}
 	public void adicionarVaga(Vaga vaga) {
 		this.vagas.add(vaga);
 	}
	public boolean estacionarVeiculo(Veiculo veiculo, int numeroVaga) {
 		for(Vaga vaga : vagas) {
 			if(vaga.getNumero() == numeroVaga) {
 				if(!vaga.estaOcupada()) {
 					vaga.setVeiculo(veiculo);
 					System.out.println("Veiculo:"+vaga.getVeiculo()+" Vinculado a Vaga!");
 					return true;
 				}else {
 					System.out.println("Vaga:"+vaga.getNumero()+" Está ocupada!");
 					return false;
 				}
 			}
 		}
 		System.out.println("Erro: Vaga " + numeroVaga + " não encontrada!");
        return false;
 	}
 	public boolean retirarVeiculo(int numeroVaga) {
 		for(Vaga vaga : vagas) {
 			if(vaga.getNumero() == numeroVaga) {
 				if(vaga.estaOcupada()) {
 					System.out.println("Veiculo:"+vaga.getVeiculo()+" Retirado da vaga!");
 					vaga.setVeiculo(null);
 					return true;
 				}else {
 					System.out.println("A Vaga:"+numeroVaga+" já está vazia!");
 					return false;
 				}
 			}
 		}
 		System.out.println("Erro: Vaga"+numeroVaga+" Não encontrada!");
 		return false;
 	}
 	public void listarVeiculos() {
 		if(vagas.isEmpty()) {
 			System.out.println("Não há nenhum carro estacionado!");
 		}else {
 			for(Vaga vaga : vagas) {
 				System.out.println("Veiculo:"+vaga.getVeiculo()+" Vaga:"+vaga.getNumero());
 			}
 		}
 	}
}
