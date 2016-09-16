package br.edu.fatec;

import java.util.Date;

public class PerishableProduct extends Product{
	protected Date expirationDate;
	
	//Here we overriding the superclass method
	public void getDescription(){
		super.getDescription();
		System.out.println("My expiration date is: "+expirationDate);
	}
}
