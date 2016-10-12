package br.edu.fatec;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class Parse_XML_Document {
	/**
	 * Esta classe contém métodos que extraem informações de um Arquivo
	 * em XML.
	 *
	 * @author Abraão
	 */
	
	//Passo 1: Criar um objeto Document que representa o documento XML
	private Document doc;
	
	public Parse_XML_Document(File file) throws DocumentException{
		SAXReader saxReader = new SAXReader();
		doc = saxReader.read(file);
	}
	
	public void getRootElement(){
		System.out.println(doc+"\n\n\n\n");
		System.out.println(doc.getRootElement().getName());
	}
	
	public void getNodes(){
		List<Node>  nodes = doc.selectNodes("//Alunos/Aluno");
		System.out.println("\n\n"+nodes+"\n\n");
		
		for(Node node : nodes){
			//System.out.println(node.getName()+" -> Matrícula="+node.valueOf("@matricula"));
			System.out.println(node.getStringValue());
		}
		
	}
	
	public void getNomes(){
		List<Node>  nodes = doc.selectNodes("//Alunos/Aluno");
		//System.out.println("\n\n"+nodes+"\n\n");
		
		for(Node node : nodes){
			System.out.println(node);
			System.out.println(node.selectSingleNode("Nome").getStringValue()+"\n\n");
		}
		
	}
	
	
	public void getAlunos(){
		List<Node>  nodes = doc.selectNodes("//Alunos/Aluno");
		//System.out.println("\n\n"+nodes+"\n\n");
		
		for(Node node : nodes){
			System.out.println("Elemento Atual:"+node.getName());
			System.out.println("Atributo Matricula: "+node.valueOf("@matricula")); 
			System.out.println("Nome do Aluno: "+node.selectSingleNode("Nome").getStringValue());
			System.out.println("Idade do Aluno: "+node.selectSingleNode("Idade").getStringValue());
			System.out.println("Sexo do Aluno: "+node.selectSingleNode("Sexo").getStringValue()+"\n\n");
		}
		
	}
}
