
public class Smartphone extends Produto {
	private int capacidadeBateria;
	private int armazenamento;
	public Smartphone(String nome, String marca, double precoVenda,	EstadoProduto estado, CategoriaProduto categoria, int capacidadeBateria, int armazenamento) {
		super(nome, marca, precoVenda, estado, categoria);
		this.capacidadeBateria = capacidadeBateria;
		this.armazenamento = armazenamento;
		this.categoria = CategoriaProduto.SMARTPHONE;

	}

	public int getCapacidadeBateria() {
		return capacidadeBateria;
	}

	public void setCapacidadeBateria(int capacidadeBateria) {
		this.capacidadeBateria = capacidadeBateria;
	}

	public int getArmazenamento() {
		return armazenamento;
	}

	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}

	public CategoriaProduto getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return "Smartphone [capacidadeBateria=" + capacidadeBateria + ", armazenamento=" + armazenamento
				+ ", categoria=" + categoria + "]";
	}
	
}
