package br.edu.fatecsjc.exceções;

public class ClasseA {

	
	public int executaLaço(){
		int i;
		for(i = 0; i < 1000000; i++);
			for(int j = 0; j < 1000000; j++);
		return i;
	}
}
