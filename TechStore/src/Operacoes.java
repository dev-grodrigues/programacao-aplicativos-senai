
public interface Operacoes {
	public void adicionarProduto(Produto produto);
	public void removerProduto(long id);
	public String buscaProduto(long id);
	public String buscaProdutoPorCategoria(CategoriaProduto categoria);
	public void atualizarPreço(long id, double precoNovo);
	public String listarProdutos();
}
