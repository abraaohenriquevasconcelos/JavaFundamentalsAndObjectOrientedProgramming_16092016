package br.edu.fatecsjc.assertions;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertionsTest {

	Object obj = new Object();
	/**
	 * JUnit provides overloaded assertion methods for all primitive types and Objects and 
	 * arrays. Optionally the first parameter can be a String message that is output on 
	 * failure. 
	 */
	
	@Test
	public void testAssertArrayEquals(){
		byte[] esperado = "julgamento".getBytes();
		byte[] atual = "julgamento".getBytes();
		for(byte b : atual){
			System.out.println(b);
		}
		
		assertArrayEquals("Deu Errado", esperado, atual);
	}
	
	@Test
	public void testAssertNotNull(){
		assertNotNull("Não deve ser nulo!", new Object());
	}
	
	@Test
	public void testAssertNotSame(){
		//assertNotSame("Não deve ser o mesmo objeto", new Object(), new Object());
		assertNotSame(obj, obj);
	}
}
