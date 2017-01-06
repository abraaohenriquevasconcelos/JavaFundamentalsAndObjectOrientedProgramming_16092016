package br.edu.fatecsjc.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		
		/*
		 ***************************************************************************************************
		 ***************************************************************************************************
		 ****************************************************************************************************
		 */
		
		Object[] objetos  = lista.toArray();
		for(Object o : objetos){
			int numero = (int) o;
			System.out.println(numero);
		}
		
		/*
		 ***************************************************************************************************
		 ***************************************************************************************************
		 ****************************************************************************************************
		 */
		
		
		Integer[] numerosArray = new Integer[lista.size()];//a array fica assim [null, null, null]
		lista.toArray(numerosArray);
		System.out.println("\n\n"+Arrays.toString(numerosArray)+"\n\n");
		
		/*
		 ***************************************************************************************************
		 ***************************************************************************************************
		 ****************************************************************************************************
		 */
		
		String[] letrasArray = new String[3];
		letrasArray[0] = "a";
		letrasArray[1] = "b";
		letrasArray[2] = "c";
		
		List<String> listaLetras = Arrays.asList(letrasArray); //asList(): List<T>
		System.out.println("\n\n"+listaLetras.toString());
	}
}
