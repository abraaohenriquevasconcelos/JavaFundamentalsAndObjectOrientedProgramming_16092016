package br.edu.fatecsjc.mapas;

import java.util.HashMap;
import java.util.Map;


//OBS:Não pode haver chaves duplicadas por isso que o método keySet retorna um "set"
public class Hash_Map {

	public static void main(String[] args) {
		
		//Com HashMap não garantimos a ordem de inserção porque ele utiliza um "hash" na chave
		//Já LinkedHashMap consegue marter a ordem de inserção
		Map<String, String> mapa = new HashMap<>();
		mapa.put("a", "vaca");
		mapa.put("b", "jumento");
		
		
		/*
		 **************************************************************************************************
		 ***************************************************************************************************
		 ****************************************************************************************************
		*/
		
		
		//values(): Collection<String>
		for(String valor : mapa.values()){
			System.out.println(valor);
		}
		
		/*
		 **************************************************************************************************
		 ***************************************************************************************************
		 ****************************************************************************************************
		*/
		
		//vamos usar uma classe interna chamada Entry que na verdade é uma interface
		for(Map.Entry<String, String> entry : mapa.entrySet()){ //entrySet(): set<Entry<String, String>>
			System.out.println("Chave: "+entry.getKey()+"\n"+"Valor: "+entry.getValue()+"\n\n***********\n\n");
		}
	}

}
