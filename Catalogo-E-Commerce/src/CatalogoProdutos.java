import java.util.ArrayList;

public class CatalogoProdutos {
ArrayList<Produto> catalogo = new ArrayList<>();

public void adicionarProduto(Produto novoProduto) {
	catalogo.add(novoProduto);
}
public Produto buscarProduto(String codigo) {
	Produto buscaProduto = null;
	for(Produto produtoAtual : catalogo){
		if(produtoAtual.getCodigo().equalsIgnoreCase(codigo)) {
			buscaProduto = produtoAtual;
		}
		}
	return buscaProduto;
	}
public Produto removerProduto(String codigo) {
	Produto remover = null;
	for(int i = 0;i < catalogo.size();i++) {
			if(catalogo.get(i).getCodigo().equalsIgnoreCase(codigo));
			remover = catalogo.remove(i);
			}
	return remover;
	}
public void listarProduto() {
	if(catalogo.isEmpty()) {
		System.out.println("Não há nenhum produto cadastrado!");
	}else {
		for(Produto produtoAtual : catalogo) {
			System.out.println("Produto:"+produtoAtual.getNome());
			produtoAtual.exibirCategoria();
			System.out.println("Codigo:"+produtoAtual.getCodigo()+"\nPreco Custo:" + produtoAtual.getPrecoCusto()+"Quantidade Estoque:"+produtoAtual.getQuantidadeEstoque());
		}
		}
	}
}
