package parte3;

import java.util.ArrayList;
import java.util.List;

public class Classe3 {

	/*
	 Nos Métodos genéricos definimos o tipo antes do retorno. 
	 */
	

	
	public <T extends Animal> List<T> criarLista(T t){
		List<T> lista = new ArrayList<>();
		
		lista.add(t);
		
		return lista;
	}
	
}
