
public class Smartphone extends Produto {

	public Smartphone(String nomeProduto, String codigo, double precoCusto, int quantidadeEstoque) {
		super(nomeProduto, codigo, precoCusto, quantidadeEstoque);

	}

	@Override
	boolean precisaReposicao() {
		return (getQuantidadeEstoque() < 10);
	}

	@Override
	double calcularPrecoVenda() {
		double valorFinal = getPrecoCusto() * 0.4;
		return valorFinal;
	}

	@Override
	void exibirCategoria() {
		System.out.println("Categoria:Smartphone");
	}
}
