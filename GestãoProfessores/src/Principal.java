<<<<<<< HEAD
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
			switch(op) {
			case 1:{
			senai.adicionarProfessor();		
				break;
			}
			case 2:{
				break;
			}
			case 3:{
				break;
			}
			case 4:{
				break;
			}
			case 5:{
				senai.listarProfessores();
				break;
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
=======
import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {

	}
	public static void menu() {
		int op;
		do {
			System.out.println("=====Gestão Professores=====\n1-Cadastrar Professor\n2-Buscar Professor(Matricula)\n3-Remover Professor(Matricula)\n4-Listar Professores\n5-Estatisticas Gerais\n6-Sair");
			op = sc.nextInt();
			switch(op) {
			case 1:{
				sc.nextLine();
				System.out.println("Digite o nome:");
				String nome = sc.nextLine();
				break;
			}
			case 2:{
				break;
			}
			case 3:{
				break;
			}
			case 4:{
				break;
			}
			case 5:{
				break;
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
>>>>>>> 105c0b08ff6572be9bc4e4466b8ff20ab2d34e44
