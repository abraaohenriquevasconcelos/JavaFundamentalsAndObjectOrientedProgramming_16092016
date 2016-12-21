package br.edu.fatecsjc;
import static org.junit.Assert.*;

import org.junit.Test;

public class CuboTest {

	@Test
	public void volumeTest(){
		assertEquals(27, Cubo.volume(3), 0);
	}

}
