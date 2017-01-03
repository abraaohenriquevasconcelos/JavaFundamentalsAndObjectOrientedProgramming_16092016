package br.edu.fatecsjc;

import java.io.Serializable;

//Na serialização a gente faz um streaming do objeto para um arquivo
public class Aluno implements Serializable{
	private Long id;
	private String nome;
	private String senha; 
	private static String nomeEscola = "Escola XXX";
	
	
	
	public Aluno(Long id, String nome, String senha) {
		this.id = id;
		this.nome = nome;
		this.senha = senha;
	}

	@Override
	public String toString(){
		return "Aluno("+"id="+id+", nome="+nome+", senha="+senha+", nomeEscola="+nomeEscola+")";
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public static String getNomeEscola() {
		return nomeEscola;
	}
	public static void setNomeEscola(String nomeEscola) {
		Aluno.nomeEscola = nomeEscola;
	}
}
