package br.edu.fatecsjc;

/**
 * JUnit 4 has introduced a new feature called 
 * parameterized tests. Parameterized tests allow a 
 * developer to run the same test over and over again 
 * using different values.
 * 
 * 1)Annotate test class with @RunWith(Parameterized.class)
 * 
 * 2)Create a public static method annotated with @Parameters
 * that returns a Collection of Objects (as Array)
 */

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MatematicaTestParameterized {
	private Integer numero;
	private Boolean resultado;
	private Matematica matematica;
	
	@Before
	public void initialize(){
		matematica = new Matematica();
	}
	
	public MatematicaTestParameterized(Integer numero, Boolean resultado){
		this.numero = numero;
		this.resultado = resultado;

	}
	
	@Parameterized.Parameters
	public static Collection passaParametros(){
		return Arrays.asList(new Object[][]{
												{ 2, true },
										        { 6, false },
										        { 19, true },
										        { 22, false },
										        { 23, true }
							 });
	}
	
	@Test
	public void validaTest(){
		System.out.println("Numero atual é: "+numero);
		assertEquals(resultado, matematica.validar(numero));

	}

}
