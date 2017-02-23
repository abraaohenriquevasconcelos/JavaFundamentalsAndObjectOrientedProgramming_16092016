package parte3;

import java.util.ArrayList;
import java.util.List;

/*
 Para não precisar colocar "<T>" no método temos que colocar na classe
 */
public class Classe2<T>{

	/*
	 Nos Métodos genéricos definimos o tipo antes do retorno. 
	 */
	
	public void criarLista(T t){
		 
		List<T> lista = new ArrayList<>();
		
		lista.add(t);
		
		System.out.println(lista.toString());
	}
	
	public List<T> criarLista2(T t){
		 
		List<T> lista = new ArrayList<>();
		
		lista.add(t);
		
		return lista;
	}
	
}
