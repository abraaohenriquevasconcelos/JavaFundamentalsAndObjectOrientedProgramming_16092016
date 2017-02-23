package parte1;

import java.util.ArrayList;
import java.util.List;

public class Generics {

	public static void main(String[] args) {
	
		/* 
		 **************************************************************************************************
		 **************************************************************************************************
		 ************************************************************************************************** 
		 */
					
		//ARRAYS
		
		//Cachorro[] cachorros = new Cachorro[2];
		Cachorro[] cachorrosArray = {new Cachorro(), new Cachorro()};
		Gato[] gatosArray = {new Gato(), new Gato()};
		//consultarAnimaisArray(cachorrosArray); 
		//consultarAnimaisArray(gatosArray);
		Animal[] animaisGeraisArray = {new Cachorro(), new Gato()};
		//consultarAnimaisArray(animaisGeraisArray);
		
		/* 
		 **************************************************************************************************
		 **************************************************************************************************
		 ************************************************************************************************** 
		 */
		
		//LISTAS
		List<Cachorro> listaCachorros = new ArrayList<>();
		listaCachorros.add(new Cachorro());
		
		List<Gato> listaGatos = new ArrayList<>();
		listaGatos.add(new Gato());
		
		/*
		 consultarAnimaisLista(listaCachorros);
		 consultarAnimaisLista(listaGatos);
		 Se passarmos a lista de Gatos para o método consultarAnimaisLista vamos ter um erro em tempo 
		 de compilação. Porque quando trabalhamos com listas precisamos passar o mesmo tipo de dados.
		 Mesmo subclasses não valem. 
		 consultarAnimaisLista(listaGatos); 
		 */
		
		List<Animal> animaisGeraisLista = new ArrayList<>();
		animaisGeraisLista.add(new Gato());
		animaisGeraisLista.add(new Cachorro());
		//consultarAnimaisLista(animaisGeraisLista);
		
		/* 
		 **************************************************************************************************
		 **************************************************************************************************
		 ************************************************************************************************** 
		 */
		
		//LISTA CORINGA
		
		consultarAnimaisListaCaracterCoringa(listaCachorros);
	}
	
	
	
	

	public static void consultarAnimaisArray(Animal[] animais){
		for(Animal animal : animais){
			animal.consulta();
		}
		/*
		 Fazer animais[1] = new Cachorro(); quando o parametro passado é um array de gatos não dá erro
		 em tempo de compilação mas o erro aparece em tempo de execução, "ArrayStoreException". Tudo isso
		 porque a JVM sabe exatamente o tipo do array em tempo de execução. Não podemos fazer esse polimor
		 fismo quando estamos trabalhando com as collections
		 */
	}
	
	public static void consultarAnimaisLista(List<Animal> animais){
		for(Animal animal : animais){
			animal.consulta();
		}
	}
	
	public static void consultarAnimaisListaCaracterCoringa(List<? extends Animal> animais){
		/*
		 List<? extends Animal> significa que podemos receber como parâmetro qualquer lista de subclasses
		 de Animal.
		 Podemos usar um caracter coringa que significa dizer que vamos passar qualquer coisa dentro
		 de uma lista que seja uma "subclasse"
		 */
		
		for(Animal animal : animais){
			animal.consulta();
		}
	}
	
	public static void adicionarCachorros(List<? super Cachorro> listaCachorros){
		/*
		 List<? super cachorro> significa que podemos passar como parâmetro para esse método uma lista
		 de cachorros ou um lista com superclasses de cachorro. Podemos então inserir cachorros mas não
		 podemos inserir um objeto da superclasse
		 */
		listaCachorros.add(new Cachorro());
		//listaCachorros.add(new Animal());
	}
}
