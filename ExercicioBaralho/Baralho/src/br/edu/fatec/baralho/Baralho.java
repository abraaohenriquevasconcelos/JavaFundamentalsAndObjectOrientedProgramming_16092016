package br.edu.fatec.baralho;

import br.edu.fatec.enums.Naipe;
import br.edu.fatec.enums.Valor;

public class Baralho {
	private static final int NR_EMBARALHADAS = 100;
	private Carta[] cartas;
	private int nrCartas = 56;
	
	public Baralho(){
		cartas = new Carta[nrCartas];
		int i = 0;
		for(Naipe naipe : Naipe.getValues()){
			for(Valor valor : Valor.getValues()){
				cartas[i++] = new Carta(naipe, valor);
			}
		}
		while(i < 56){
			cartas[i++] = new Carta(Naipe.CORINGA, Valor.CORINGA);
		}
	}
	
	public void embaralhar(){
		for(int i = 1; i < NR_EMBARALHADAS; i++){
			int j = (int)(Math.random()*nrCartas);
			int k = (int)(Math.random()*nrCartas);
			Carta auxiliar = cartas[j];
			cartas[j] = cartas[k];
			cartas[k] = auxiliar;
			
		}
	}
	
	public Carta distribuirCarta(){
		if(nrCartas != 0){
			return cartas[--nrCartas];
		}else{
			return null;
		}
	}
	
	public boolean hasCarta(){
		return nrCartas != 0;
	}
	
	public void imprimirBaralho(){
		for(int i = 0; i < nrCartas; i++){
			cartas[i].imprimir();
		}
	}
}

//http://www.k19.com.br/artigos/numeros-aleatorios-em-java-a-classe-random/