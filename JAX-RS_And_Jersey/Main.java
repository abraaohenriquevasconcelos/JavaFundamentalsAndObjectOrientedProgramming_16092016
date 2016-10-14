package br.edu.fatec;

import java.io.File;
import java.util.TreeMap;

import org.dom4j.DocumentException;

public class Main {
	/**
	 * Classe principal do projeto.
	 *
	 * @author Abraão
	 */
	
	public static void main(String[] args) throws DocumentException{
		String baseDir = "Data/";
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		File dir = new File(baseDir);
		File[] lista_de_arquivos = dir.listFiles();
		
		
		for(File file : lista_de_arquivos){
			Parse_XML_Document parse = new Parse_XML_Document(file);
			
			if(parse.getArtigosPublicadosCompletos() != 0){
				treeMap.put(parse.getNomeCompleto(), parse.getArtigosPublicadosCompletos());
			}
		}
		
		System.out.println(treeMap.toString());
	}

}
