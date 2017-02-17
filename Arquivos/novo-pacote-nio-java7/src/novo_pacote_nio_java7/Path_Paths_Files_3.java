package novo_pacote_nio_java7;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Path_Paths_Files_3 {

	public static void main(String[] args) {
		//Vamos criar um arquivo dentro de uma pasta
		Path path1 = Paths.get("pasta0//subpasta23//subpasta45");
		Path path2 = Paths.get("pasta0//subpasta23//subpasta45//arquivo23.txt");
		Path path3 = Paths.get("pasta0//subpasta23//subpasta45//arquivo23(copia1).txt");
		Path path4 = Paths.get("pasta0//subpasta23//arquivo23(copia2).txt");
		try{
			if(Files.notExists(path1))
				Files.createDirectories(path1);
			Files.createFile(path2);
			/********************************************************************************************
			 ********************************************************************************************
			 ********************************************************************************************/
			FileWriter fw = new FileWriter(path2.toFile(), true);//FileWriter(String fileName, boolean append)
			fw.write("As vezes nos apresenta as ternuras de todas as coisas");
			fw.flush();
			fw.close();
			/********************************************************************************************
			 ********************************************************************************************
			 ********************************************************************************************/
			Files.copy(path2, path3);
			Files.copy(path2, path4);
			
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
}
