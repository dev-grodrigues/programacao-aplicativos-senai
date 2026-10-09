
public class Notebook extends Produto {

	public Notebook(String nomeProduto, String codigo, double precoCusto, int quantidadeEstoque) {
		super(nomeProduto, codigo, precoCusto, quantidadeEstoque);
	}

	@Override
	boolean precisaReposicao() {
		return (getQuantidadeEstoque() < 5);
	}

	@Override
	double calcularPrecoVenda() {
		double taxaGarantia = 150.00;
		double valorFinal = (getPrecoCusto() * 0.5) + taxaGarantia;
		return valorFinal;
	}

	@Override
	void exibirCategoria() {
		System.out.println("Categoria:Notebook");
	}

}
