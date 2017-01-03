package br.edu.fatecsjc;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		gravaObjeto();

	}
	
	private static void gravaObjeto(){
		//Serializar é mais ou menos salvar um objeto num arquivo
		Aluno jão = new Aluno(1L, "Joilson Sousa", "abc123");
		try {
			FileOutputStream fileOutputStream = new FileOutputStream("aluno.ser");//Com FileOutputStream passamos um streaming diretamente pra um arquivo 
			
			//1)Criamos um streaming
			//2)Passamos esse streaming para um buffer
			
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);//É assim que salvamos um objeto num arquivo 
			objectOutputStream.writeObject(jão);
			objectOutputStream.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
