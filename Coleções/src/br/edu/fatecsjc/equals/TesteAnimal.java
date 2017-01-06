package br.edu.fatecsjc.equals;

public class TesteAnimal {

	public static void main(String[] args) {
		Animal jegue = new Animal("jumento", "cavalo");
		Animal jega = new Animal("jumento", "cavalo");
		
		System.out.println(jegue.equals(jega));
	}

}
