
abstract class Produto {
	private String nomeProduto;
	private String codigo;
	private double precoCusto;
	private int quantidadeEstoque;
	
	public Produto(String nomeProduto, String codigo, double precoCusto, int quantidadeEstoque) {
		this.nomeProduto = nomeProduto;
		this.codigo = codigo;
		this.precoCusto = precoCusto;
		this.quantidadeEstoque = quantidadeEstoque;
	}
	abstract boolean precisaReposicao();
	abstract double calcularPrecoVenda();
	abstract void exibirCategoria();
	public String getNome() {
		return nomeProduto;
	}
	public void setNome(String nomeProduto){
		this.nomeProduto = nomeProduto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	public double getPrecoCusto() {
		return precoCusto;
	}
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}

}
