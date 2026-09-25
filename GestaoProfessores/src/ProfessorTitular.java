
public class ProfessorTitular extends Professor {

	public ProfessorTitular(String nome, String matricula, int horasSemanais, double salarioBase) {
		super(nome, matricula, horasSemanais, salarioBase);

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
