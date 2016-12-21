package br.edu.fatecsjc.fixMethodOrder;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * 1)Using Suite as as runner allows you to manually build a suite(conjunto)
 * containing tests from many classes. To use it, annotate a class with 
 * @RunWith(Suite.class) ans @SuiteClasses(class1, class2). When you run 
 * this class, it will run all the tests in all the suite classes
 * 
 * 2)Test suite is a collection of some test cases from different classes that
 * can be run all together 
 * 
 * 3)When a class is annotated with @RunWith, JUnit invoke the class in which is
 * annotated so as to run the tests, instead of using the runner built into JUnit
 * 
 * 4)The @SuiteClasses annotation specifies the classes to be executed when 
 * when a class annotated with @RunWith(suite.class) is run
 */

@RunWith(Suite.class)
@SuiteClasses({ ClasseATest.class, ClasseBTest.class })
public class AllTests {
	
}
