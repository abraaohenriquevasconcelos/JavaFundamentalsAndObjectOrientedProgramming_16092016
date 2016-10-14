package br.edu.fatec;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

public class Parse_XML_Document {
	/**
	 * Esta classe contém métodos que extraem informações de documentos xml.
	 *
	 *
	 * @author Abraão
	 */
	
	private Document doc;
	
	public Parse_XML_Document(File file) throws DocumentException{
		SAXReader reader = new SAXReader();
	    doc = reader.read(file);
	}
	
	public String getNomeCompleto(){
		Node node = doc.selectSingleNode("//CURRICULO-VITAE/DADOS-GERAIS");
		String nome_completo = node.valueOf("@NOME-COMPLETO");
		return nome_completo.toUpperCase();
	}
	
	public Integer getArtigosPublicadosCompletos(){
		List<Node> artigos_publicados = doc.selectNodes("//PRODUCAO-BIBLIOGRAFICA/ARTIGOS-PUBLICADOS/ARTIGO-PUBLICADO");
		Integer contador=0;
		
		for(Node artigo_publicado : artigos_publicados){
			Node dados_basicos_do_artigo = artigo_publicado.selectSingleNode("./DADOS-BASICOS-DO-ARTIGO");
			String natureza = dados_basicos_do_artigo.valueOf("@NATUREZA");
			if(natureza.equalsIgnoreCase("COMPLETO")){ contador++; };
		}
		return contador;
		
	}
}
