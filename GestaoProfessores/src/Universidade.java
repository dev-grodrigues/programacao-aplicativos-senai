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
}