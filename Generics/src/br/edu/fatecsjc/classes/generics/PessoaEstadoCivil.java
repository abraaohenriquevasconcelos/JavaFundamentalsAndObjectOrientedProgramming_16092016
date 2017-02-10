package br.edu.fatecsjc.classes.generics;

import java.util.ArrayList;
import java.util.List;

//o "T" significa "type"
public class PessoaEstadoCivil<T> {
	
	private List<T> pessoasSolteiras;
	
	public PessoaEstadoCivil(List<T> pessoasSolteiras){
		this.pessoasSolteiras = pessoasSolteiras;
	}
	
	public T casarPrimeiroDaFila(){
		T t = pessoasSolteiras.remove(0);
		System.out.println("Casando a pessoa chamada "+t);
		System.out.println("Pessoas solteiras: "+pessoasSolteiras);
		return t;
	}
	
	public void divorciarPessoa(T t){
		System.out.println("Divorciando a pessoa chamada "+t);
		pessoasSolteiras.add(t);
		System.out.println("Pessoas solteiras: "+pessoasSolteiras);
	}
}
