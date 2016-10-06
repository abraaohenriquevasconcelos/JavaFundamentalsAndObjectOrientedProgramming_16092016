package br.edu.fatec;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class ClasseFile {

	public static void main(String[] args) {
		File file = new File("//home//henrique//esteCerto.txt");
		try {
			boolean newFile = file.createNewFile();
			System.out.println("created = "+newFile);
			System.out.println("canRead ="+file.canRead());
			System.out.println("Path ="+file.getPath());
			System.out.println("AbsolutePath ="+file.getAbsolutePath());
			System.out.println("lastModified ="+new Date(file.lastModified()));
			
			boolean exists = file.exists();
			if(exists){
				System.out.println("Deleted = "+file.delete());
			}
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
