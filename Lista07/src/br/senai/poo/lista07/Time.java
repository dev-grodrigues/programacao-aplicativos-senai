package br.senai.poo.lista07;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Time {

	private String nome;
	private String nomeTecnico;

	private Set<Jogador> jogadores = new HashSet<>();
	private Map<Jogador, SituacaoEscalacaoEnum> jogadoresEscalados = new HashMap<>();

	public Time(String nome, String nomeTecnico) {
		this.nome = nome;
		this.nomeTecnico = nomeTecnico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeTecnico() {
		return nomeTecnico;
	}

	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}

	public Set<Jogador> getJogadores() {
		return jogadores;
	}

	public Map<Jogador, SituacaoEscalacaoEnum> getJogadoresEscalados() {
		return jogadoresEscalados;
	}

	public void contratarJogador(String nome, Integer numeroCamisa) {
		Jogador jogador = new Jogador(nome, numeroCamisa);
		boolean contratado = jogadores.add(jogador);
		if (contratado) {
			System.out.println("Jogador: " + jogador.getName()+" Contratado!");
		} else {
			System.out.println("Jogador: " + jogador.getName() + " Já faz parte do Elenco!!");
		}
	}

	public boolean escalarJogador(String nome, SituacaoEscalacaoEnum situacaoEscalacao) {
		boolean escalado = false;
		Jogador jogadorEncontrado = null;
		for (Jogador j : jogadores) {
			if (j.getName().equals(nome)) {
				jogadorEncontrado = j;
				break;
			}
		}

		if (jogadorEncontrado == null) {
			throw new IllegalArgumentException("Jogador: " + nome + " Não encontrado!");
		}
		if (jogadoresEscalados.containsKey(jogadorEncontrado)) {
			throw new IllegalArgumentException("Jogador: " + nome + " Já foi escalado!");
		}

		Integer contagem = 0;
		for (SituacaoEscalacaoEnum s : jogadoresEscalados.values()) {
			if (s == situacaoEscalacao) {
				contagem++;
			}
		}

		if (situacaoEscalacao == SituacaoEscalacaoEnum.TITULAR) {
			if (contagem >= 11) {
				throw new IllegalArgumentException("Erro: O time possui 11 jogadores escalados como Titular!");
			}

			if (situacaoEscalacao == SituacaoEscalacaoEnum.RESERVA) {
				if (contagem >= 12) {
					throw new IllegalArgumentException("Erro: o time possui 12 jogadores como Reserva!");
				}

			}

		}
		jogadoresEscalados.put(jogadorEncontrado, situacaoEscalacao);
		System.out.println("Jogador: " + jogadorEncontrado.getName() + " Escalado como "
				+ situacaoEscalacao);
		escalado = true;

		return escalado;
	}

	public void removerJogadorEscalacao(String nome) {
		Jogador jogadorRemover = null;
		if (jogadores.isEmpty()) {
			throw new IllegalArgumentException("Time vazio!");
		}
		
		for (Jogador j : jogadoresEscalados.keySet()) {
	        if (j.getName().equals(nome)) {
	            jogadorRemover = j;
	            break;
	        }
	    }
		jogadoresEscalados.remove(jogadorRemover);
		System.out.println("Jogador: "+nome+" Removido da Escalação!");
	}

	public String obterEscalacao() {
		if (jogadoresEscalados.isEmpty()) {
			throw new IllegalArgumentException("Não há nenhum jogador Escalado!");
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("=====ESCALACAO ATUAL=====\n");
		
		for (Jogador j : jogadoresEscalados.keySet()) {
			SituacaoEscalacaoEnum situacaoEscalacao = jogadoresEscalados.get(j);
			sb.append("Jogador:").append(j.getName());
			sb.append("| Camisa:").append(j.getNumeroCamisa());
			sb.append("| Escalado como:").append(situacaoEscalacao);
			sb.append("\n");
		}
		
		return sb.toString();
	}
}
