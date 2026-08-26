public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima = 280;
	boolean ligado;
	/* Construtor*/
	public Carro() {
		this.velocidadeAtual = 0;
	}
	/* Funcao pra exibir o Status atual do carro*/
	void status() {
		System.out.print("O Carro esta ");
		System.out.println(this.ligado ? "Ligado" : "Desligado");
		System.out.println("Velocidade Atual : "+this.velocidadeAtual);
		System.out.println("Marcha atual: "+passarMarcha());
	}
	/* Funcao que checa se o carro esta ligado, se não liga*/
	void ligar(){
		this.ligado = !this.ligado;
	}
	/* Funcao que acelera o carro atráves do parametro*/
	void acelerar(double quantidade){
		if(this.ligado && this.velocidadeAtual < velocidadeMaxima){
			this.velocidadeAtual = this.velocidadeAtual + quantidade;			
		}else {
			System.out.println("Carro Desligado");
		}
	}
	/* Funcao que retorna a marcha de acordo com a velocidade do carri*/
	public int passarMarcha(){
		if(this.ligado) {
			if(this.velocidadeAtual <= 20) {
				return 1;
			}else if(this.velocidadeAtual <= 40) {
				return 2;
			}
			else if(this.velocidadeAtual <= 60) {
				return 3;
			}
			else if(this.velocidadeAtual <= 100) {
				return 4;
			}else {
				return 5;
			}
		}else {
			return 0;
		}
	}
}