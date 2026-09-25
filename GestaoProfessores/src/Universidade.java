import java.util.ArrayList;
import java.util.Scanner;

	public class Universidade {
		static Scanner sc = new Scanner(System.in);
ArrayList<Professor> professores = new ArrayList<Professor>();

	public void adicionarProfessor() {
		System.out.println("Digite o nome:");
		String nome = sc.nextLine();
		System.out.println("Digite a matricula: ");
		String matricula = sc.nextLine();
		System.out.println("Digite a quantidade de horas semanais: ");
		int horasSemanais = sc.nextInt();
		System.out.println("Digite o salario base: ");
		double salarioBase = sc.nextDouble();
		sc.nextLine();
		System.out.println("Tipo:\n[1]-Titular\n[2]-Substituto");
		int opcao; opcao = sc.nextInt();
		if(opcao == 1) {
			ProfessorTitular novoProfessor = new ProfessorTitular(nome, matricula, horasSemanais, salarioBase);
			professores.add(novoProfessor);
		}
		if(opcao ==  2) {
			ProfessorSubstituto novoProfessor = new ProfessorSubstituto(nome, matricula, horasSemanais, salarioBase);
			professores.add(novoProfessor);
		}
		}
	public String buscarProfessor(String matricula) {
	    if (professores == null || professores.isEmpty()) {
	        return "A lista de professores está vazia.";
	    }
	    for (Professor professorAtual : professores) {
	        if (professorAtual.getMatricula() != null && professorAtual.getMatricula().trim().equalsIgnoreCase(matricula.trim())) {
	            return "Nome: " + professorAtual.getNome() + "\n" +
	                   "Matricula: " + professorAtual.getMatricula() + "\n" +
	                   "Horas Semanais: " + professorAtual.getHorasSemanais() + "\n" +
	                   "Salario base: " + professorAtual.getSalarioBase();
	        }
	    }
	    return "Professor não encontrado com a matrícula: " + matricula;
	}
	public String removerProfessor(String matricula) {
		for(int i = 0;i < professores.size();i++) {
			buscarProfessor(matricula);
			if(professores.get(i).getMatricula().equalsIgnoreCase(matricula)) {
				professores.remove(i);
				return "Professor removido com a matrícula: " + matricula;
			}
		}
		return "Professor não encontrado com a matrícula: " + matricula;
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
}