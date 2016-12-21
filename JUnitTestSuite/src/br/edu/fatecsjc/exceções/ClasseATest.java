package br.edu.fatecsjc.exceções;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ClasseATest {

	private static ClasseA classeA;
	
	/**
	 * Com a última versão do JUnit podemos determinar que um teste tem um tempo 
	 * máximo para ser executado. Por exemplo caso desejamos que nosso teste não
	 * demore mais que 10 milisegundos podemos realizar a seguinte anotação:
	 * @Test(timeout = 10)
	 * 
	 */
	@BeforeClass
	public static void inicializar(){
		System.out.println("Executando @BeforeClass");
		classeA = new ClasseA();
		
	}
	
	
	@Test(timeout = 2)
	public void executaLaçoTest(){
		assertEquals(1000000, classeA.executaLaço());
	}
}
