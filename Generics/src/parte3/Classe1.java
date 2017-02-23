package parte3;

import java.util.ArrayList;
import java.util.List;

public class Classe1 {

	/*
	 Nos Métodos genéricos definimos o tipo antes do retorno. 
	 */
	
	public static <T> void criarLista(T t){
		 
		List<T> lista = new ArrayList<>();
		
		lista.add(t);
		
		System.out.println(lista.toString());
	}
	
	public <T> List<T> criarLista2(T t){
		 
		List<T> lista = new ArrayList<>();
		
		lista.add(t);
		
		return lista;
	}
	
	
	public <T extends Animal> List<T> crirarLista3(T t){
		List<T> lista = new ArrayList<>();
		
		lista.add(t);
		
		return lista;
	}
	
}
