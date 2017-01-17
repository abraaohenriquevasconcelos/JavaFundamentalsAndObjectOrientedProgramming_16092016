package br.edu.fatesjc.filewriter_filereader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class File_Writer {

	public static void main(String[] args) {
		//FileWriter e FileReader servem para ler e escrever caracteres em arquivos
		File file = new File("arquivos/arquivo1.txt");
		try {
			/*
			 Para não sobreescrever o arquivo temos que mudar o cunstrutor de "FileWriter"
			 Consutrutor de FileWriter: FileWriter(String fileName, boolean append)
			 */
			FileWriter fw = new FileWriter(file, true);
			fw.write("Chiquinha 123");
			
			/*
			 O flush é para obrigar realmente a escrever os dados para o disco. O writer apenas escreve
			 para um buffer que depois escreve então para o disco.
			 FileWriter implementa OutputStreamWriter 
			 OutputStreamWriter implementa Writer
			 Writer implementa a interface Closeable
			 */
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
