
public class MedicoCirurgiao extends Medico {

	public MedicoCirurgiao(String crm, String nome, int idade, double salario) {
		super(crm, nome, idade, salario);
	}

	@Override
	boolean medicoAposentado() {
		return getIdade() > 60;
	}

	@Override
	double valorAposentadoria() {
		return (getSalario() * 0.8) + 800;
	}

	@Override
	void exibirFuncao() {
		System.out.println("Funcao:Medico Cirurgiao");
	}

}
