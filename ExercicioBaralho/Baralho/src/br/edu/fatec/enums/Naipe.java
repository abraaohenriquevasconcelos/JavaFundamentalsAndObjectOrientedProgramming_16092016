package br.edu.fatec.enums;

import java.util.ArrayList;
import java.util.List;

public enum Naipe {
	OUROS, PAUS, COPAS, ESPADA, CORINGA;
	
	public static Naipe[] getValues(){
		List<Naipe> lista = new ArrayList<>();
		
		for(Naipe naipe : Naipe.values()){ //values(): Naipe[]
			if(naipe != CORINGA)
				lista.add(naipe);
		}
		
		return lista.toArray(new Naipe[lista.size()]);
	}
}
