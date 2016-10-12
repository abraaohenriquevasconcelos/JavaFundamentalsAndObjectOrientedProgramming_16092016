package br.edu.fatec;

import java.io.File;

import org.dom4j.DocumentException;

public class Main {
	/**
	 * Esta classe é a classe principal.
	 *
	 * @author Abraão
	 */
	
	public static void main(String[] args) throws DocumentException{
		String path = "/home/henrique/git/Java_DOM4J_Parser_Parse_XML_Document/arquivo.xml";
		File f = new File(path);
		
		Parse_XML_Document parse = new Parse_XML_Document(f);
		
		parse.getRootElement();
		parse.getAlunos();
	}

}
