package br.edu.fatecsjc.fixMethodOrder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class ClasseA {

	public static String[] pegaMateriaisEscolares(){
		String[] materiais  = {"livros", "canetas", "cadernos", "lapis"};
		System.out.println("Os materiais escolares são: "+Arrays.toString(materiais));
		return materiais;
	}
	
	public String[] adicionaBorrachas(){
		String[] materiais  = {"livros", "canetas", "cadernos", "lapis", "borrachas"};
		System.out.println("Os materiais escolares são: "+Arrays.toString(materiais));
		return materiais;
	}
	
	
	
	
}
