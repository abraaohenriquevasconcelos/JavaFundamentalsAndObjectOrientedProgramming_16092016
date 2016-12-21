package br.edu.fatecsjc;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/**
 * 1)JUnitCore is a facade for running tests.
 * 2)It supports running JUnit 4 tests, JUnit 3.8.x tests, and mixtures.
 * 3)For one-shot test runs, use the static method runClasses(Class[]) 
 * 4)Method runClasses -> Run the tests contained in classes .
 * @author abraao
 *
 */
public class MatematicaTestParameterizedRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(MatematicaTestParameterized.class);
		for(Failure failure : result.getFailures()){
			System.out.println(failure.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}
}
