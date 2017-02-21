package br.edu.fatecsjc.conjuntos;

import java.util.NavigableSet;
import java.util.TreeSet;

import br.edu.fatecsjc.conjuntos.Animal;

public class Tree_Set {

	public static void main(String[] args) {
		/*
		 <<interface>>
		   SortedSet
		   	   |
		   	   |
		   	   *
		  <<interface>>
		  NavigableSet
		  	   |
		  	   |
		  	   *
		  	TreeSet
		  	
		  Para inserir objetos de uma determinada classe num TreeSet, essa classe precisa
		  ter implementado a interface comparable ou podemos passar um comparator no construtor
		  do TreeSet
		  
		  O TreeSet ordena os elementos de acordo com o método compareTo() da classe e também
		  não permite elementos duplicados. No caso da classe "Animal", o método compareTo()
		  usa o atributo "espécie" para fazer as comparações.
		 */
		Animal jumento = new Animal("Jumento", "cavalos", "burro de carga");
		Animal galinha = new Animal("Galinha", "voadores", "sem charme");
		Animal avestruz = new Animal("Avestruz", "assanhadas", "barraqueira");
		Animal jumentu = new Animal ("Jumento", "cavalos", "não vale nada");
		
		//NavigableSet<Animal> animais = new TreeSet<>(new AnimalNomeComparator());
		NavigableSet<Animal> animais = new TreeSet<>();
		animais.add(jumento);
		animais.add(galinha);
		animais.add(avestruz);
		animais.add(jumentu);
		
		for(Animal animal : animais){
			System.out.println(animal);
		}
	}

}
