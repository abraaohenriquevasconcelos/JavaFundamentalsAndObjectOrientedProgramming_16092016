package br.edu.fatecsjc.classes.generics;

import java.util.ArrayList;
import java.util.List;

public class HomemEstadoCivil {
	
	private List<Homem> homensSolteiros = new ArrayList<>();
	
	{
		//Isso é um bloco de inicialização
		homensSolteiros.add(new Homem("arão"));
		homensSolteiros.add(new Homem("Jacó"));
		
	}
	
	public Homem casarPrimeiroDaFila(){
		Homem homem = homensSolteiros.remove(0);
		System.out.println("Casando a homem chamado "+homem.getNome());
		System.out.println("Homens Solteiros: "+homensSolteiros);
		return homem;
	}
	
	public void divorciarHomem(Homem homem){
		System.out.println("Divorciando o homem chamado "+homem.getNome());
		homensSolteiros.add(homem);
		System.out.println("Homens Solteiros: "+homensSolteiros);
	}
	
	
}
