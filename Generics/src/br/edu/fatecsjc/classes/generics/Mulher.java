package br.edu.fatecsjc.classes.generics;

public class Mulher {

	private String nome;
	
	public Mulher(String nome){
		this.nome = nome;
	}

	
	
	@Override
	public String toString() {
		return "Pessoa[nome=" + nome + "]";
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
