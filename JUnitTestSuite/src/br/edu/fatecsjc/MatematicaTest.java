package br.edu.fatecsjc;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MatematicaTest {

	Matematica m;
	
	@Before
	public void setUp() {
		System.out.println("@Before\n");
		m = new Matematica();
	}

	@Test
	public void raizTest(){
		assertEquals(2.6457513110645907, m.raiz(7), 0);
	}
	
	@Test
	public void raizTest2(){
		assertTrue(m.raiz(7) == 2.6457513110645907);
	}
}
