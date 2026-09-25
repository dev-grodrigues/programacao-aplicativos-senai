
public class ProfessorSubstituto extends Professor {

	public ProfessorSubstituto(String nome, String matricula, int horasSemanais, double salarioBase) {
		super(nome, matricula, horasSemanais, salarioBase);

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
