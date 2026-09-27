
public class Laptop extends Produto {

	private int polegadas;
	private String processador;
	
	public Laptop(String nome, String marca, double precoVenda,EstadoProduto estado,CategoriaProduto categoria, int polegadas, String processador) {
		super(nome, marca, precoVenda,estado,categoria);
		this.processador = processador;
		this.polegadas = polegadas;
		this.categoria = CategoriaProduto.LAPTOP;
	}

	public int getPolegadas() {
		return polegadas;
	}

	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}

	public String getProcessador() {
		return processador;
	}

	public void setProcessador(String processador) {
		this.processador = processador;
	}

	public CategoriaProduto getCategoria() {
		return categoria;
	}

	@Override
	public String toString() {
		return "Laptop [polegadas=" + polegadas + ", processador=" + processador + ", categoria=" + categoria + "]";
	}
	
}
