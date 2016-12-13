package br.edu.fatec.baralho;

import br.edu.fatec.enums.Naipe;
import br.edu.fatec.enums.Valor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Carta {
	@Getter @Setter
	private Naipe naipe;
	@Getter @Setter
	private Valor valor;
	
	
	public void imprimir(){
		StringBuilder sb = new StringBuilder();
		
		sb.append(valor);
		sb.append(" de ");
		sb.append(naipe.toString());

		
		System.out.println(sb.toString());
	}
}
