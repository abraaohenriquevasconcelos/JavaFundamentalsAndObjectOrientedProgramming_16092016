package br.edu.fatecsjc.conjuntos;

public class Animal implements Comparable<Animal>{
	private String nome;
	private String especie;
	private String apelido;
	
	
	
	
	public Animal(String nome, String especie, String apelido) {
		this.nome = nome;
		this.especie = especie;
		this.apelido = apelido;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((especie == null) ? 0 : especie.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	
	
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (especie == null) {
			if (other.especie != null)
				return false;
		} else if (!especie.equals(other.especie))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getEspecie() {
		return especie;
	}




	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	
	public String getApelido() {
		return apelido;
	}




	public void setApelido(String apelido) {
		this.apelido = apelido;
	}
	
	@Override
	public int compareTo(Animal outroAnimal){
		return this.especie.compareTo(outroAnimal.getEspecie());
	}
	
}
