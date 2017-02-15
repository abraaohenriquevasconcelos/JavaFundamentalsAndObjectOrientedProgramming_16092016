package novo_pacote_nio_java_7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nova_Classe_Path {
	//Path é uma interface do pacote "java.nio.file" veio para substituir a classe File.
	//Já "Paths" é a classe concreta de "Path"
	//Temos também uma outra classe chamada "Files" que possui métodos estáticos que vai trabalhar com os objetos do tipo Path

	public static void main(String[] args) {
		/*
		 A "Path" represents a path that is hierarchical and composed of a sequence of directory and file name 
		 separated by a special separator or delimiter. "Paths" consists exclusively of static methods that 
		 return a "Path" by converting(convertendo) a path string or URI. 
		 */
		Path pastaArquivos = Paths.get("/home/abraao/workspaceEE/Arquivos/arquivos");
		String[] arrayDeArquivos = pastaArquivos.toFile().list(); //list(): String[]
		for(String s : arrayDeArquivos) System.out.println(s);
		
		/**********************************************************************************************************
		 **********************************************************************************************************
		 **********************************************************************************************************/
		
		Path path1 = Paths.get("/home/abraao/workspaceEE/Arquivos/arquivos", "Teste1.txt");
		System.out.println(path1.toFile().getAbsolutePath());
		
		
		/**********************************************************************************************************
		 **********************************************************************************************************
		 **********************************************************************************************************/
		
		Path path2 = Paths.get("home", "abraao", "workspaceEE", "Arquivos/arquivos", "arquivo1.txt");
		System.out.println(path2.toAbsolutePath());
		
		/**********************************************************************************************************
		 **********************************************************************************************************
		 **********************************************************************************************************/
		
		//Podemos brincar de transformar um File num Path e vice-versa
		Path path3 = Paths.get("home", "abraao", "workspaceEE", "Arquivos/arquivos", "arquivo1.txt");
		File viraFile = path3.toFile();
		Path voltaPath = viraFile .toPath();
		
		/**********************************************************************************************************
		 **********************************************************************************************************
		 **********************************************************************************************************/
		
		//Vamos criar um diretorio com Path
		Path path4 = Paths.get("arquivos//pasta52");
		try{
			if(Files.notExists(path4))Files.createDirectory(path4);
		}catch(IOException e){
			e.printStackTrace();
		}
		
		/**********************************************************************************************************
		 **********************************************************************************************************
		 **********************************************************************************************************/
		
		//Vamos criar varios diretórios de uma vez
		/*Path path5 = Paths.get("pasta1//pasta2");
		try{
			Files.createDirectories(path5);
		}catch(IOException e){
			e.printStackTrace();
		}*/
		
		/**********************************************************************************************************
		 **********************************************************************************************************
		 **********************************************************************************************************/
	}
}
