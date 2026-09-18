
public class ProfessorTitular extends Professor {

	public ProfessorTitular(String matricula, String nome, int horasSemanais, double salarioBase,
			int totalProfessores) {
		super(matricula, nome, horasSemanais, salarioBase, totalProfessores);

	}

	@Override
	boolean elegivelAfastamento() {
			
		return (getHorasSemanais() >= 20);
	}

	@Override
	double calcularSalarioFinal() {
		double bonusFixo = 1200;
		return (getSalarioBase() + bonusFixo);
	}

	@Override
	void tipoProfessor() {
	System.out.println("Tipo:Professor Titular");
		
	}

}
