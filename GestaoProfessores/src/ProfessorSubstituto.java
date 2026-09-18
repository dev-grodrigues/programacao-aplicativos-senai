
public class ProfessorSubstituto extends Professor {

	public ProfessorSubstituto(String matricula, String nome, int horasSemanais, double salarioBase,
			int totalProfessores) {
		super(matricula, nome, horasSemanais, salarioBase, totalProfessores);

	}

	@Override
	boolean elegivelAfastamento() {

		return (getHorasSemanais() > 35);
	}

	@Override
	double calcularSalarioFinal() {
		return getSalarioBase();
	}

	@Override
	void tipoProfessor() {
		System.out.println("Tipo:Professor Substituto");
	}

}
