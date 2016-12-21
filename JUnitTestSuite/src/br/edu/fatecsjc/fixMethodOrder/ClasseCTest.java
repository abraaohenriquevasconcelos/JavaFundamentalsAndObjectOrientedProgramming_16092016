package br.edu.fatecsjc.fixMethodOrder;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * 
 * A partir da versão 4.11 do JUnit usamos a anotação @FixMethodOrder
 * para especificar uma ordem para a execução dos testes
 *
 *@FixMethodOrder(MethodSorters.JVM) -> Deixa a ordem dos testes 
 *por conta da Máquina Virtual. Isso não garante a mesma ordem sempre
 *
 *@FixMethodOrder(MethodSorters.NAME_ASCENDING) -> ordena os testes
 *por ordem crescente dos nomes dos métodos
 */

//@FixMethodOrder(MethodSorters.JVM)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ClasseCTest {

	 @Test
	    public void testA() {
	        System.out.println("testeA");
	    }
	    @Test
	    public void testB() {
	        System.out.println("testeB");
	    }
	    @Test
	    public void testC() {
	        System.out.println("testeC");
	    }

}
