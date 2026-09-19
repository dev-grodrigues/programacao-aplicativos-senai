<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;
	public class Universidade {
		static Scanner sc = new Scanner(System.in);
		ArrayList<Professor> professores = new ArrayList<Professor>();

	public void adicionarProfessor(){
			System.out.println("Digite o nome: ");
			String nome = sc.nextLine();
			System.out.println("Digite a matricula: ");
			String matricula = sc.nextLine();
			System.out.println("Digite a quantidade de horas semanais: ");
			int horasSemanais = sc.nextInt();
			System.out.println("Digite o Salario base: ");
			double salarioBase = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Digite o tipo de Professor\n[1]-Titular\n[2]-Substituto");
		int	opcao = sc.nextInt();
			if(opcao == 1) {
				ProfessorTitular novoProfessor = new ProfessorTitular(matricula, nome, horasSemanais, salarioBase, opcao);
				professores.add(novoProfessor);
			}
			else if(opcao == 2) {
				ProfessorSubstituto novoProfessor = new ProfessorSubstituto(matricula, nome, horasSemanais, salarioBase, opcao);
				professores.add(novoProfessor);
			}else {
				System.out.println("Opção invalida!");
			}
	}
	
	public Professor buscarProfessor(String matricula) {
		for(Professor professorAtual : professores) {
			if(professorAtual.getMatricula().equalsIgnoreCase(matricula)) {
				return professorAtual;
			}
		}
		return null;
	}
	public Professor removerProfessor(String matricula) {
		Professor pRemove = null;
		for(int i = 0;i < professores.size();i++) {
			if(professores.get(i).getMatricula().equalsIgnoreCase(matricula)) {
				pRemove = professores.remove(i);
			}
		}
		return pRemove;
	}
	public void listarProfessores() {
		if(professores.isEmpty()) {
			System.out.println("Não há nenhum professor cadastrado!");
		}else {
			for(Professor professorAtual : professores) {
				System.out.println("Nome:"+ professorAtual.getNome());
				professorAtual.tipoProfessor();
				System.out.println("Matricula:"+ professorAtual.getMatricula()+
						"\nHoras Semanais:"+professorAtual.getHorasSemanais()+"\nSalario base:"+ professorAtual.getSalarioBase());
			}
		}
	}
=======
import java.util.ArrayList;

	public class Universidade {
ArrayList<Professor> professores = new ArrayList<Professor>();

	public void adicionarProfessor(Professor p) {
 professores.add(p);
	}
	public Professor buscarProfessor(String matricula) {
		for(Professor professorAtual : professores) {
			if(professorAtual.getMatricula().equalsIgnoreCase(matricula)) {
				return professorAtual;
			}
		}
		return null;
	}
	public Professor removerProfessor(String matricula) {
		Professor pRemove = null;
		for(int i = 0;i < professores.size();i++) {
			if(professores.get(i).getMatricula().equalsIgnoreCase(matricula)) {
				pRemove = professores.remove(i);
			}
		}
		return pRemove;
	}
	public void listarProfessores() {
		if(professores.isEmpty()) {
			System.out.println("Não há nenhum professor cadastrado!");
		}else {
			for(Professor professorAtual : professores) {
				System.out.println("Nome:"+ professorAtual.getNome());
				professorAtual.tipoProfessor();
				System.out.println("Matricula:"+ professorAtual.getMatricula()+
						"\nHoras Semanais:"+professorAtual.getHorasSemanais()+"\nSalario base:"+ professorAtual.getSalarioBase());
			}
		}
	}
>>>>>>> 105c0b08ff6572be9bc4e4466b8ff20ab2d34e44
}