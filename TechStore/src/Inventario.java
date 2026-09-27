import java.util.ArrayList;

public class Inventario implements Operacoes {
	ArrayList<Produto> inventario;
	
	public Inventario() {
		super();
		this.inventario = new ArrayList<>();
	}

	@Override
	public void adicionarProduto(Produto produto) {
		this.inventario.add(produto);
	}

	@Override
	public void removerProduto(long id) {
	    boolean removido = this.inventario.removeIf(produto -> produto != null && produto.getId() == id);
	    if (removido) {
	        System.out.println("Produto com ID " + id + " removido com sucesso!");
	    } else {
	        System.out.println("Nenhum produto com ID " + id + " foi encontrado.");
	    }
	}

	@Override
	public String buscaProduto(long id) {
		StringBuilder resultado = new StringBuilder();
		if(inventario == null || inventario.isEmpty()) {
			return "Nenhum Produto Cadastrado";
		}else {
			for (Produto produtoAtual : inventario) {
				if(produtoAtual.getId() != null && produtoAtual.getId().equals(id)){
					resultado.append("Produto: ").append(produtoAtual.getNome())
	                .append("\nId: ").append(produtoAtual.getId())
	                .append("\nMarca: ").append(produtoAtual.getMarca())
	                .append("\nPreco: R$").append(produtoAtual.getPrecoVenda())
	                .append("\nCategoria: ").append(produtoAtual.getCategoria())
	                .append("\nEstado: ").append(produtoAtual.getEstado())
	                .append("\n-------------------------\n");
				}
			}
		}
		return resultado.toString();
	}

	@Override
	public String buscaProdutoPorCategoria(CategoriaProduto categoria) {
		StringBuilder resultado = new StringBuilder();
		if(inventario == null || inventario.isEmpty()) {
			return "Nenhum Produto Cadastrado";
		}else {
			for (Produto produtoAtual : inventario) {
				if(produtoAtual.getCategoria() != null && produtoAtual.getCategoria().equals(categoria)){
					resultado.append("Produto: ").append(produtoAtual.getNome())
	                .append("\nId: ").append(produtoAtual.getId())
	                .append("\nMarca: ").append(produtoAtual.getMarca())
	                .append("\nPreco: R$").append(produtoAtual.getPrecoVenda())
	                .append("\nCategoria: ").append(produtoAtual.getCategoria())
	                .append("\nEstado: ").append(produtoAtual.getEstado())
	                .append("\n-------------------------\n");
				}
			}
		}
		return resultado.toString();
	}
	@Override
	public void atualizarPreço(long id, double precoNovo) {
		if(inventario == null || inventario.isEmpty()) {
			System.out.println("Nenhum Produto Cadastrado");
		}else {
			for (Produto produtoAtual : inventario) {
				if(produtoAtual.getId() != null && produtoAtual.getId().equals(id)) {
					produtoAtual.setPrecoVenda(precoNovo);
					System.out.println("Preço do produto:"+ produtoAtual.getNome()+" Alterado!");
					break;
				}
			}
		}
	}

	@Override
	public String listarProdutos() {	
		if(inventario == null || inventario.isEmpty()) {
			return "Nenhum Produto Cadastrado";
		}else {
			StringBuilder resultado = new StringBuilder("---Lista de Produtos---\n");
			for (Produto produtoAtual : inventario) {		
				resultado.append("Produto: ").append(produtoAtual.getNome())
                .append("\nId: ").append(produtoAtual.getId())
                .append("\nMarca: ").append(produtoAtual.getMarca())
                .append("\nPreco: R$").append(produtoAtual.getPrecoVenda())
                .append("\nCategoria: ").append(produtoAtual.getCategoria())
                .append("\nEstado: ").append(produtoAtual.getEstado())
                .append("\n-------------------------\n");
			}
			return resultado.toString();
		}
	}
}