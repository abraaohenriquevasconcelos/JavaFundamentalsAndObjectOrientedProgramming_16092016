package br.edu.fatecsjc.fixMethodOrder;



import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Estrutura Completa
 * |java.lang.Object
 * ---
 *	  |org.junit.runner.Runner -> 
 *	   ---
 *        |org.junit.runners.Suite
 *        ---
 *
 * 1)Runner: public abstract class Runner extends java.lang.Object implements Describable
 * A Runner runs tests and notifies a RunNotifier of significant events as it does so. You will
 * need to subclass Runner when using RunWith to invoke a custom runner. When creating a custom 
 * runner, in addition to implementing the abstract methods here you must also provide a constructor
 * 
 * 2)Thanks to parameterized unit tests we can set up a test method that retrieves data
 * from some data source. This data source can be a collection of objects, external file, or
 * maybe even a database.
 * 
 * 3)When running a parameterized test class , instances are created for the cross-product
 * of the test methods 
 */	  

/**
 * 1)When a class is annotated with @RunWith, JUnit will invoke the class it references to run 
 * the tests in that class instead of the runner built into JUnit
 */

@RunWith(Parameterized.class)
public class ClasseBTest {
	private int a;
	private int b;
	private int c;
	ClasseB classeB;
	
	@Before
	public void inicializar(){
		classeB = new ClasseB();
	}
	
	public ClasseBTest(int a, int b, int c){
		this.a = a;
		this.b = b;
		this.c = c;
	}

	
	@Parameters //Annotation for a method which provides parameters to be injected into the test class constructor by Parameterized
	public static Collection<Object[]> passaParametrosParaConstrutor(){
		return Arrays.asList(new Object[][]{ {6,2,3}, {3,5,1}, {8,2,4 } });
	}
	
	@Test
	public void validaTest(){
		System.out.println("Testantdo "+a+" dividido por "+b+" = "+ c);
		assertEquals(c, classeB.divide(a, b), 0);
	}
}
