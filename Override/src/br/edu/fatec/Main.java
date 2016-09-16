package br.edu.fatec;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		PerishableProduct pp = new PerishableProduct();
		pp.description = "grape";
		pp.expirationDate = new Date();
		pp.getDescription();
	}

}
