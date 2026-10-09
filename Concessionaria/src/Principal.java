import java.util.Scanner;
public class Principal {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		GestaoFrota mercedes = new GestaoFrota();
		int op;
		do {
			System.out.println("=====Gestão de Frota=====\n1-Cadastrar Veiculo\n2-Buscar Veiculo(Via Placa)\n3-Remover Veiculo(Via Placa)\n4-Listar Veiculos\n5-Sair");
			op = sc.nextInt();
			switch(op) {
			case 1:{
				sc.nextLine();
				System.out.println("Digite a placa do carro:");
				String placa = sc.nextLine();
				System.out.println("Digite o modelo do carro:");
				String modelo = sc.nextLine();
				System.out.println("Digite o ano de fabricacao");
				int anoFabricacao = sc.nextInt();
				System.out.println("Digite o valor base de locacao:");
				double valorBaseLocacao = sc.nextDouble();
				System.out.println("Tipo do Veiculo\n[1]-Carro Passeio\n[2]-Caminhao de Carga");
				int opcao = sc.nextInt();
				if(opcao == 1) {
					CarroPasseio novoCarro = new CarroPasseio(placa, modelo, anoFabricacao, valorBaseLocacao);
					mercedes.adicionarVeiculo(novoCarro);
				}if(opcao == 2) {
					CaminhaoCarga novoCaminhao = new CaminhaoCarga(placa, modelo, anoFabricacao, valorBaseLocacao);
					mercedes.adicionarVeiculo(novoCaminhao);
				}
				break;
			}
			case 2:{
				sc.nextLine();
				System.out.println("Digite a placa do carro: ");
				String placa = sc.nextLine();
				Veiculos veiculo = mercedes.buscarVeiculo(placa);
				if(veiculo != null) {
					System.out.println("Veiculo encontrado!");
					System.out.println("Carro:"+ veiculo.getModelo());
					veiculo.tipoVeiculo();
					System.out.println("Placa:"+veiculo.getPlaca()+"\nInspeção:"+veiculo.exigeInspecaoAnual()+"\nSeguro:"+veiculo.calcularSeguro());
				}else {
					System.out.println("Não existe nenhum veiculo cadastrado com esta placa!");
				}
				break;
			}
			case 3:{
				sc.nextLine();
				System.out.println("Digite a placa do carro:");
				String placa = sc.nextLine();
				Veiculos veiculoRemover = mercedes.removerVeiculo(placa);
				if(veiculoRemover != null) {
					System.out.println("Veiculo removido com sucesso!");
				}
				break;
			}
			case 4:{
				mercedes.listarVeiculos();
				break;
			}
			case 5:{
				System.out.println("Saindo...");
				break;
			}
			default:{
				System.out.println("Erro:400 :LOG(Somente numeros de 1 a 5!)");
			}
			}
		}while(op != 5);
	}
}
