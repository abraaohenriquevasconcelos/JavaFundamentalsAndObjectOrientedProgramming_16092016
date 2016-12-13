package br.edu.fatecsjc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;



public class Main{

	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		Produto produto1 = new Produto("123", "a", 45.8);
		Produto produto2 = new Produto("456", "b", 75.9);
		Produto produto3 = new Produto("789", "c", 66.0);
		Produto produto4 = new Produto("123", "d", 90.0);
		produtos.add(produto4); produtos.add(produto3); produtos.add(produto2); produtos.add(produto1);
	
		//Collections.sort(produtos);
		Collections.sort(produtos, new ProdutoNomeComparator());
		
//		for(Produto produto : produtos){
//			System.out.println(produto);
//		}
		
		Produto[] produtosArray = new Produto[4];
		
		produtosArray[0] = produto2;
		produtosArray[1] = produto3;
		produtosArray[2] = produto1;
		produtosArray[3] = produto4;
		Arrays.sort(produtosArray, new ProdutoNomeComparator());
		
		for(Produto produto : produtosArray){
			System.out.println(produto);
		}
		
		
	}
	
	
	
}


