package br.edu.fatecsjc.conjuntos;

import java.util.Comparator;

public class AnimalNomeComparator implements Comparator<Animal>{
	@Override
	public int compare(Animal a, Animal b){
		return a.getNome().compareTo(b.getNome());
	}
}
