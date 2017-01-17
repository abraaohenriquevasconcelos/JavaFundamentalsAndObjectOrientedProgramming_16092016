package Novo_Pacote_NIO_Java_7;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Nova_Classe_Path {
	//Path é uma interface do pacote "java.nio.file" veio para substituir a classe File.
	//Já "Paths" é a classe concreta de "Path"
	//Temos também uma outra classe chamada "Files" que possui métodos estáticos que vai trabalhar com os objetos do tipo Path

	public static void main(String[] args) {
		Path pastaArquivos = Paths.get("/home/abraao/workspaceEE/Arquivos/arquivos");
		String[] listaArquivos = pastaArquivos.toFile().list(); //list(): String[]
		for(String s : listaArquivos) System.out.println(s);
		
		/**********************************************************************************************************
		 **********************************************************************************************************
		 **********************************************************************************************************/
		
		Path arquivo = Paths.get("/home/abraao/workspaceEE/Arquivos/arquivos", "Teste1.txt");
		System.out.println(arquivo.toFile().getAbsolutePath());
		
		
		/**********************************************************************************************************
		 **********************************************************************************************************
		 **********************************************************************************************************/
		
		Path arquivo2 = Paths.get("home", "abraao", "workspaceEE", "Arquivos/arquivos", "arquivo1.txt");
		System.out.println(arquivo2.toFile().getAbsolutePath());
	}
}
