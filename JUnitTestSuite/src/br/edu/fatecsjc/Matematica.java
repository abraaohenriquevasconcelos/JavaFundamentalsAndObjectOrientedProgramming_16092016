package br.edu.fatecsjc;

import java.util.Arrays;
import java.util.Collection;

public class Matematica {
	
	public double raiz(double d){
		return Math.sqrt(d);
	}
	
	public Boolean validar(final Integer n){
		for(int i = 2; i < (n / 2); i++){
			if(n % i == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Collection colecao1 = Arrays.asList(new Object[][]{
															{2, true},
															{6, false},
															{19, true}
										    });
		
		
		Collection colecao2 = Arrays.asList(new Object[]{2, 3, 4});
		
		System.out.println(colecao1.toString()+"\n\n");
		System.out.println(colecao2.toString());
	}
}
