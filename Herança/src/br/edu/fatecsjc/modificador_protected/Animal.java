package br.edu.fatecsjc.modificador_protected;

public class Animal {

	public static void main(String[] args) {
		Funcionario clovis = new Funcionario("Clovinho", 24, 5063.34);
		clovis.imprime();
		System.out.println("Tenho "+clovis.idade);
		clovis.idade = 23;
		System.out.println("Ai eu sou mais novo tenho "+clovis.idade);
	}

}
