package br.senai.poo.lista07;

import java.util.Objects;

public class Jogador {

	private String name;
	private Integer numeroCamisa;
	private SituacaoEscalacaoEnum situacaoEscalacao;
	
	public Jogador(String name, Integer numeroCamisa) {
		this.name = name;
		this.numeroCamisa = numeroCamisa;
		situacaoEscalacao = null;
	}
	public Jogador() {}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getNumeroCamisa() {
		return numeroCamisa;
	}
	public void setNumeroCamisa(Integer numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}
	public SituacaoEscalacaoEnum getSituacaoEscalacao() {
		return situacaoEscalacao;
	}
	public void setSituacaoEscalacao(SituacaoEscalacaoEnum situacaoEscalacao) {
		this.situacaoEscalacao = situacaoEscalacao;
	}
	@Override
	public String toString() {
		return "Jogador [name=" + name + ", numeroCamisa=" + numeroCamisa + ", situacaoEscalacao=" + situacaoEscalacao
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, numeroCamisa, situacaoEscalacao);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		return Objects.equals(name, other.name) && Objects.equals(numeroCamisa, other.numeroCamisa)
				&& situacaoEscalacao == other.situacaoEscalacao;
	}
	
	
	
}
