package br.edu.fatecsjc.conjuntos;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Hash_Set {

	public static void main(String[] args) {
		//1)Todas as coleções que tem "hash" no nome usam o hashcode
		//2)Set não permite elementos duplicados
		//3)Um "Set" não é indexado e por isso não tem o método "get" das listas
		//4)HashSet não tem ordem
		//5)Um "Set" uso o método equals pra verificar se o elemento já existe no conjunto
		//6)LinkedHashSet mantém a ordem de inserção dos elementos
		
		Animal jumento = new Animal("Jumento", "cavalos", "burro de carga");
		Animal galinha = new Animal("Galinha", "voadores", "sem charme");
		Animal jumentu = new Animal ("Jumento", "cavalos", "não vale nada");//Não vai ser adicionado porque de acordo com o equals já existe um jumento na coleção
		
		Set<Animal> animais = new HashSet<>();
		
		animais.add(jumento);
		animais.add(galinha);
		animais.add(jumentu);
		
		for(Animal animal : animais){
			//System.out.println("Nome: "+animal.getNome()+" - Espécie: "+animal.getEspecie()+" - Apelido: "+animal.getApelido());
		}
		
		/*
		 * ********************************************************************************
		 * ********************************************************************************
		 */
		
		Set<Animal> animais_ordenados = new LinkedHashSet<>();
		animais_ordenados.add(jumentu);
		animais_ordenados.add(jumento);
		animais_ordenados.add(galinha);
		
		for(Animal animal : animais_ordenados){
			System.out.println("Nome: "+animal.getNome()+" - Espécie: "+animal.getEspecie()+" - Apelido: "+animal.getApelido());
		}
	}

}
