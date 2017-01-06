package br.edu.fatecsjc.modificador_protected.outro_pacote;

import br.edu.fatecsjc.modificador_protected.Funcionario;

public class Coisa {

	public static void main(String[] args) {
		Funcionario alguem = new Funcionario("Inanimado", 21, 734.34);
		//alguem.idade = 27; ERRO "protected" não é visível em outros pacotes
		System.out.println(alguem.getIdade());
	}

}
