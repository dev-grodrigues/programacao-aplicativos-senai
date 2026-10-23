package br.senai.poo.lista07;

public class Principal {

	public static void main(String[] args) {
		Time maiorTime = new Time("Real Madrid","Zinedine Zidane");
		maiorTime.contratarJogador("Cristiano Ronaldo", 7);
		maiorTime.contratarJogador("Neymar JR", 11);
		maiorTime.contratarJogador("Lionel Messi", 10);
		maiorTime.contratarJogador("Luiz Suarez", 9);
		maiorTime.contratarJogador("Andrea Pirlo", 8);
		
		try {
			maiorTime.escalarJogador("Cristiano Ronaldo", SituacaoEscalacaoEnum.TITULAR);
			maiorTime.escalarJogador("Neymar JR", SituacaoEscalacaoEnum.TITULAR);
			maiorTime.escalarJogador("Lionel Messi", SituacaoEscalacaoEnum.TITULAR);
			maiorTime.escalarJogador("Luiz Suarez", SituacaoEscalacaoEnum.RESERVA);
			maiorTime.escalarJogador("Andrea Pirlo", SituacaoEscalacaoEnum.RESERVA);
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(maiorTime.obterEscalacao());
		}catch(IllegalArgumentException e) {
			e.printStackTrace();
		}
		maiorTime.removerJogadorEscalacao("Luiz Suarez");
		System.out.println(maiorTime.obterEscalacao());
	}

}
