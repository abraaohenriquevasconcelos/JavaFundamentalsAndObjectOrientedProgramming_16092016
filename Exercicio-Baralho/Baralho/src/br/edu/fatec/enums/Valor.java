package br.edu.fatec.enums;

import java.util.ArrayList;
import java.util.List;


public enum Valor {
	AIS, DOIS, TRES, QUATRO, CINCO, SEIS, SETE, OITO, NOVE, DEZ, DAMA, VALETE, REIS, CORINGA;
	
	public static Valor[] getValues(){
		List<Valor>  lista = new ArrayList<>();
		
		for(Valor valor : Valor.values()){
			if(valor != CORINGA){
				lista.add(valor);
			}
		}
		
		return lista.toArray(new Valor[lista.size()]);
	}
}
