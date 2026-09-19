public class TesteCarro {
	public static void main(String[] args) {
		Carro ferrari = new Carro();
		ferrari.cor = "Vermelha";
		ferrari.modelo = "Puro Sangue";
		ferrari.status();
		ferrari.ligar();
		ferrari.status();
		ferrari.acelerar(101);
		ferrari.status();
		ferrari.acelerar(180);
		ferrari.status();
		ferrari.acelerar(20);
		ferrari.status();
	}
}
