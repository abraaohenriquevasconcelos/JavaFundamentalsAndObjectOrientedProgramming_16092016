package br.edu.fatecsjc.exceções;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class ClasseB2Test {

	static ClasseB  classeB;
	static ClasseB2 classeB2;
	
	/**
	 * Por fim em nossa última anotação temos uma das mais importantes
	 * anotaçõse para testes unitários. Nesta anotação podemos verificar
	 * se o método está retornando uma uma exception. Essa funcionalidade 
	 * é muito importante por exemplo para sabermos se o sistema está
	 * realmente tratando exceções
	 */
	
	@BeforeClass
	public static void inicializar(){
		classeB = new ClasseB("juju");
		classeB2 = new ClasseB2();
	}
	
	@Test(expected=NullPointerException.class)
	public void validaTest(){
		assertEquals(classeB.getNome(), classeB2.getClasseB().getNome());
	}
}
