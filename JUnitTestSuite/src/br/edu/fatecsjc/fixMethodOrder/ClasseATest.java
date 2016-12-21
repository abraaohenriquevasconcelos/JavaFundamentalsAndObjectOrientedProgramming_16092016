package br.edu.fatecsjc.fixMethodOrder;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClasseATest {

	ClasseA classeA = new ClasseA();
	String[] materiais = {"livros", "canetas", "cadernos", "lapis"};
	
	@Test
	public void validaTest(){
		assertArrayEquals(materiais, classeA.pegaMateriaisEscolares());
	}

}
