package br.edu.fatec.baralho;

public class Main {
	public static void main(String[] args) {
		Baralho b = new Baralho();
		b.embaralhar();
		
		while(b.hasCarta()){
			Carta c = b.distribuirCarta();
			c.imprimir();
		}
		
	}
}
