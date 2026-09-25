import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	static Universidade senai = new Universidade();
	public static void main(String[] args) {
		menu();
	}
	public static void menu() {
		int op;
		do {
			System.out.println("=====Gestão Professores=====\n1-Cadastrar Professor\n2-Buscar Professor(Matricula)\n3-Remover Professor(Matricula)\n4-Listar Professores\n5-Estatisticas Gerais\n6-Sair");
			op = sc.nextInt();
			sc.nextLine();
			switch(op) {
			case 1:{
				senai.adicionarProfessor();
				break;
			}
			case 2:{
				System.out.println("Digite a matricula:");
			    System.out.println(senai.buscarProfessor(sc.nextLine()));
				break;
			}
			case 3:{
				System.out.println("Digite a matricula:");
				System.out.println(senai.removerProfessor(sc.nextLine()));
				break;
			}
			case 4:{
				senai.listarProfessores();
				break;
			}
			case 5:{
				System.out.println("Total de instancias de professores: "+Professores.getTotalProfessores());
			}
			case 6:{
				System.out.println("Saindo...");
				break;
			}
			default:{
				System.out.println("Somente numeros de 1 a 6!");
			}
			sc.close();
			}
		}while(op != 5);
	}

}
