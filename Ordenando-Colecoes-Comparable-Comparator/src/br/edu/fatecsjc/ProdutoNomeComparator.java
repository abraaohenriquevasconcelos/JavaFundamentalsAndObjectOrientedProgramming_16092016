package br.edu.fatecsjc;

import java.util.Comparator;

public class ProdutoNomeComparator implements Comparator<Produto>{
	public int compare(Produto a, Produto b){
		return a.getNome().compareTo(b.getNome());
	}
}