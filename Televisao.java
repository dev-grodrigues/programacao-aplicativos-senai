
public class Televisao {
	boolean ligada;
	int volume;
	int canal;
	
	public Televisao() {
		ligada = false;
		volume = 0;
		canal = 0;
	}
	/* Exibe o status da televisao*/
	void status(){
		System.out.print("A Tv está");
		System.out.println(this.ligada ? "Ligada":"Desligada");
		System.out.println("Volume = "+this.volume +"\n Canal ="+ this.canal);
	}
	/* Funcao que checa se a Tv esta ligada, se não liga*/
	void ligar() {
		this.ligada = !this.ligada;
	}
	/* Funcao que aumenta volume*/
	void aumentarVolume(){

		if(this.volume == 100) {
			System.out.println("Volume Maximo");
		}else {
			this.volume++;	
		}
	}
	/* Funcao que diminui volume*/
	void diminuirVolume(){
		
		if(this.volume == 0) {
			System.out.println("Mudo");
		}else {
			this.volume--;	
		}
	}
	/* Funcao que passa o canal para frente*/
	void aumentarCanal(){

		if(this.canal == 0) {
			System.out.println("Canal 100");
		}else {
			this.canal++;	
		}
	}
	/* Funcao que diminui o canal*/
	void diminuirCanal(){
		if(this.canal == 0) {
			System.out.println("Canal 0");
		}else {
			this.canal--;	
		}
	}
}
