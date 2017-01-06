package br.edu.fatecsjc.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class Hash_Set {

	public static void main(String[] args) {
		//1)Todas as coleções que tem "hash" no nome usam o hashcode
		//2)Set não permite elementos duplicados
		//3)Um "Set" não é indexado e por isso não tem o método "get" das listas
		//4)HashSet não tem ordem
		//5)Um "Set" uso o método equals pra verificar se o elemento já existe
		//6)LinkedHashSet mantém a ordem de inserção dos elementos
		Set<String> conjuntoDePalavras = new HashSet<>();
		conjuntoDePalavras.add("jumento");
		conjuntoDePalavras.add("besta-fera");

	}

}
