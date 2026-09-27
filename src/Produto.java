import java.util.concurrent.atomic.AtomicLong;

public abstract class Produto {
	private static final AtomicLong ids = new AtomicLong(1L);
	private final Long id;
	private String nome;
	private String marca;
	private double precoVenda;
	EstadoProduto estado;
	CategoriaProduto categoria;
	private static int totalProdutos;
	public Produto(String nome, String marca, double precoVenda, EstadoProduto estado, CategoriaProduto categoria) {
		super();
		this.id = ids.incrementAndGet();
		this.nome = nome;
		this.marca = marca;
		this.precoVenda = precoVenda;
		this.estado = estado;
		this.categoria = categoria;
		totalProdutos++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(double precoVenda) {
		if(precoVenda > 0) {
		this.precoVenda = precoVenda;
		}else {
			System.out.println("Erro:Preço inválido!");
		}
	}
	
	public CategoriaProduto getCategoria() {
		return categoria;
	}

	public EstadoProduto getEstado() {
		return estado;
	}
	
	public void setEstado(EstadoProduto estado) {
		this.estado = estado;
	}
	
	public Long getId() {
		return id;
	}
	
	public static int getTotalProdutos() {
		return totalProdutos;
	}


	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", marca=" + marca + ", precoVenda=" + precoVenda + ", estado="
				+ estado + ", totalProdutos=" + totalProdutos + "]";
	}

}

