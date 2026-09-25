
public class Principal {

	public static void main(String[] args) {
		Carro audi = new Carro("ABCDEF", 2,"Audi A5");
		Moto ducati = new Moto("EOSDVIDA", 2,"Ducati g500");
		System.out.println(ducati.getPlaca());
		System.out.println(audi.getPlaca());
		audi.setPlaca("ABCDEFE");
		ducati.setPlaca("2309261");
		System.out.println(audi.getPlaca());
		System.out.println(ducati.getPlaca());
		Estacionamento es = new Estacionamento("PillBox Hill");
		es.adicionarVaga(new Vaga(1));
		es.estacionarVeiculo(audi, 1);
		es.listarVeiculos();
		es.estacionarVeiculo(ducati, 1);
		es.retirarVeiculo(1);
		es.listarVeiculos();
		es.estacionarVeiculo(ducati, 1);
	}
}
