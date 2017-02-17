package novo_pacote_nio_java7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_Paths_Files_2 {

	public static void main(String[] args) {
		//Vamos criar um arquivo dentro de uma pasta
		Path path1 = Paths.get("pasta0//subpasta23//subpasta45");
		Path path2 = Paths.get("pasta0//subpasta23//subpasta45//arquivo23.txt");
		try{
			if(Files.notExists(path1))
				Files.createDirectories(path1);
			Files.createFile(path2);
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
