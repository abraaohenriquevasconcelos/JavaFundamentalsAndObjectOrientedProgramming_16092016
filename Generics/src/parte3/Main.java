package parte3;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		//Classe1.criarLista(new Cachorro());
		
		Classe1 classe1 = new Classe1();
		
		List<Cachorro> lista = classe1.criarLista2(new Cachorro());
		//System.out.println(lista);
		
		/*
		 ******************************************************************************************
		 ******************************************************************************************
		 ******************************************************************************************
		 */
		
		Classe2 classe2 = new Classe2();
		List<Cachorro> lista2 = classe2.criarLista2(new Cachorro());
		//System.out.println(lista2);
		
		/*
		 ******************************************************************************************
		 ******************************************************************************************
		 ******************************************************************************************
		 */
		
		Classe3 classe3 = new Classe3();
		List<Cachorro> lista3 = classe3.criarLista(new Cachorro());
		System.out.println(lista2);
	}

}
