
public class Vaga {
	private int numero;
	private Veiculo veiculo;
	
	public Vaga(int numero) {
		this.numero = numero;
		this.veiculo = null;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	} 
	public boolean estaOcupada() {
		return this.veiculo != null;
	}
	@Override
	public String toString() {
		return ", Vaga numero:"+this.numero;
	}
	
}
