
public class MedicoAuxiliar extends Medico {

	public MedicoAuxiliar(String crm, String nome, int idade, double salario) {
		super(crm, nome, idade, salario);
	}

	@Override
	boolean medicoAposentado() {
		return this.getIdade() < 60;
	}

	@Override
	public double valorAposentadoria() {
		return this.getSalario() * 0.8;
	}

	@Override
	void exibirFuncao() {
		System.out.println("Funcao:Medico Auxiliar");
		
	}

}
