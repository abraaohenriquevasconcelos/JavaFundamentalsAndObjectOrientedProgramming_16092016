package br.edu.fatecsjc.equals;


/* O método EQUALS da classe Object retorna FALSE se os objetos não estiverem no mesmo endereço de memória
 *  */

public class Animal {
	private String nome;
	private String especie;
	
	
	
	public Animal(String nome, String especie) {
		this.nome = nome;
		this.especie = especie;
	}

	//Reflexivo = mesmoObjeto.equals(mesmoObjeto) tem que ser TRUE
	//Simétrico = para x e y diferentes de null, se x.equals(y) == true logo y.equals(x) == true
	@Override
	public boolean equals(Object obj){
		if(obj == null) return false;
		if(this == obj) return true; //se os dois objetos estão no mesmo endereço de memória
		if(this.getClass() != obj.getClass()) return false;
		Animal outroAnimal = (Animal) obj;
		if(this.especie == null){
			if(outroAnimal.especie != null) return false;
		}else if(!this.especie.equals(outroAnimal.especie)) 
			return false;
		else if(this.nome == null){
			if(outroAnimal.nome != null) return false;
		}else if(!this.nome.equals(outroAnimal.nome))
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

	


	
	
	
	
}
