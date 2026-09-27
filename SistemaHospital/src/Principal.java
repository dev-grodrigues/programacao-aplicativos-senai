import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		menu();
	}
	private static void menu() {
		Hospital santaHelena = new Hospital();
		int op;
		System.out.println("=====GESTÃO HOSPITAL=====");
		do {
			System.out.println("1-Cadastrar Medico\n2-Buscar Medico(CRM)\n3-Remover Medico(CRM)\n4-Listar Todos os Medicos\n5-Sair");
			op = sc.nextInt();
			switch(op) {
			case 1:{
				sc.nextLine();
				System.out.println("Digite o CRM: ");
				String crm = sc.nextLine();
				System.out.println("Digite o nome: ");
				String nome = sc.nextLine();
				System.out.println("Digite a idade: ");
				int idade = sc.nextInt();
				sc.nextLine();
				System.out.println("Digite o Salario:");
				double salario = sc.nextDouble();
				sc.nextLine();
				int opcao;
				System.out.println("FUNÇÃO DO MEDICO\n[1]Cirurgiao\n[2]Auxiliar\n");
				opcao = sc.nextInt();
				sc.nextLine();
				if(opcao == 1) {
					MedicoCirurgiao novoMedico = new MedicoCirurgiao(crm, nome, idade, salario);
					santaHelena.adicionarMedico(novoMedico);
				}if(opcao == 2) {
					MedicoAuxiliar novoMedico = new MedicoAuxiliar(crm, nome, idade, salario);
					santaHelena.adicionarMedico(novoMedico);	
				}
				break;
			}
			case 2:{
				sc.nextLine();
				System.out.println("Digite o CRM: ");
				String crm = sc.nextLine();
				Medico buscaMedico = santaHelena.buscarMedico(crm);
				if(buscaMedico != null) {
					System.out.println("Medico:"+buscaMedico.getNome());
					buscaMedico.exibirFuncao();
					System.out.println("CRM:"+buscaMedico.getCrm()+"\nIdade:"+buscaMedico.getIdade()+"\nSalario:"
							+"R$"+buscaMedico.getSalario()+"\nAposentado:"+buscaMedico.medicoAposentado()+"\nValor Aposentadoria:"+buscaMedico.valorAposentadoria());
					break;
				}else {
					System.out.println("Nenhum médico cadastrado com este CRM!");
				}
			}				
			case 3:{
				sc.nextLine();
				System.out.println("Digite o CRM");
				String crm = sc.nextLine();
				Medico remover = santaHelena.removerMedico(crm);
				if(remover != null) {
					System.out.println("Medico Removido!");
				}
				break;
			}
			case 4:{
				santaHelena.listarMedicos();
				break;
			}
			case 5:{
				System.out.println("Obrigado por utilizar nosso Sistema!");
				break;
			}
			default:
				System.out.println("Erro: Somente números de 1 até 5!!");
			}
		}while(op != 5);
	}
}