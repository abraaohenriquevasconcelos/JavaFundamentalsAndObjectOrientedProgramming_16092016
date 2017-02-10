package br.edu.fatecsjc.classes.generics;

import java.util.ArrayList;
import java.util.List;

public class MulherEstadoCivil {
	
	private List<Mulher> mulheresSolteiras = new ArrayList<>();
	
	{
		//Isso é um bloco de inicialização
		mulheresSolteiras.add(new Mulher("Silmara"));
		mulheresSolteiras.add(new Mulher("Creuza"));
		
	}
	
	public Mulher casarPrimeiraDaFila(){
		Mulher mulher = mulheresSolteiras.remove(0);
		System.out.println("Casando a mulher chamada "+mulher.getNome());
		System.out.println("Mulheres solteiras: "+mulheresSolteiras);
		return mulher;
	}
	
	public void divorciarMulher(Mulher mulher){
		System.out.println("Divorciando a mulher chamada "+mulher.getNome());
		mulheresSolteiras.add(mulher);
		System.out.println("Mulheres solteiras: "+mulheresSolteiras);
	}
	
	
}
