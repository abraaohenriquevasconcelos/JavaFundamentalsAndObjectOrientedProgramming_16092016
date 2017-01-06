package br.edu.fatecsjc.equals;

public class Pool_De_Strings {
	
	
	public static void main(String[] args) {
		String a = "jumento";
		String b = "jumento";
		String c = new String("jumento");
		
		/*OBS::: Se dois objetos não estão no mesmo endereço de memória é FALSO */
		System.out.println(a == b);
		System.out.println(c == a);
		System.out.println(c == b);
		
		/*
		 Existem dois lugares em que objetos do tipo String podem ser armazenados: no Heap e no Pool de Strings
		 Tudo depende de como você inicializa uma String.
		 
		 Heap: Onde ficam armazenados todos os objetos instanciados, classes e variáveis de instância.
		 Pool de Strings: Onde ficam armazenadas as Strings com valores únicos, inicializadas de forma
		 literal.
		 
		 A JVM trata a criação de Strings de uma forma especial, a fim de otimizar a utilização de memória.
		 Sempre que inicializamos uma String com um valor literal, a JVM irá procurar no Pool de Strings
		 um objeto com exatamente aquele valor. Caso encontre, a referência a este objeto será retornada
		 para a variável que estamos atribuindo este valor. 
		 Lembre-se que strings ficam armazenas no pool de strings
		 
		String s1 = "Hello, world!";                ->forma literal Pool de Strings
        String s2 = "Hello, world!"; 				->forma literal Pool de Strings
        String s3 = new String("Hello, world!");	->HEAP Aqui estamos forçando a criação dos objetos, através da palavra reservada new.
        String s4 = new String("Hello, world!");	->HEAP Aqui estamos forçando a criação dos objetos, através da palavra reservada new.
        String s5 = new String("Hello, world!");	->HEAP Aqui estamos forçando a criação dos objetos, através da palavra reservada new.
		 */
		
		
		/*************************************************************************************************
		 *************************************************************************************************
		 *************************************************************************************************
		 */
		
		
		/*Vale a mesma história pra as classes Wrapper*/
		Integer i1 = 5;
		Integer i2 = 5;
		Integer i3 = new Integer(5);
		System.out.println("\n****************************************\n");
		System.out.println(i1 == i2);
		System.out.println(i3 == i1);
		System.out.println(i3 == i2);
		
		
		
		/*************************************************************************************************
		 *************************************************************************************************
		 *************************************************************************************************
		 */
		
		
		
		/*E como podemos fazer pra usar o conteúdo de um objeto e não o endereço de memória pra dizer que
		  dois objetos são iguais ?????????? Resposta: Equals!!!*/
		String animal1 = "lagartixa";
		String animal2 = new String("lagartixa");
		String animal3 = new String("lagartixa");
		
		System.out.println("\n****************************************\n");
		System.out.println(animal1.equals(animal2));
		System.out.println(animal2.equals(animal3));
	
		Integer numero1 = 5;
		Integer numero2 = new Integer(5);
		System.out.println(numero1.equals(numero2));
	}
}
