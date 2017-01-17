package br.edu.fatesjc.filewriter_filereader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File_Reader {
	public static void main(String[] args) {
		File file = new File("arquivos/arquivo1.txt");
		
		try {
			FileReader fr = new FileReader(file);
			char[] arrayDeCaracteresLidos = new char[500];
			/*
			 O método read() retorna o número de caracteres lidos ou -1 se o fim do stream foi atingido
			 */
			int quantosCaracteresForamLidos = fr.read(arrayDeCaracteresLidos); //read(char[] array): int
			
			System.out.println(quantosCaracteresForamLidos);
			
			for(char c : arrayDeCaracteresLidos)
				System.out.print(c);
			
			fr.close();
		} catch (IOException e) {	
			e.printStackTrace();
		}
	}
}
