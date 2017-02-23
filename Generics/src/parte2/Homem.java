package parte2;

public class Homem {

	private String nome;
	
	public Homem(String nome){
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
