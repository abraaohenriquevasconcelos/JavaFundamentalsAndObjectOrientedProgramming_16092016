package br.edu.fatecsjc.modificador_protected;

public class Funcionario extends Pessoa{
	private double salario;
	
	
	
	public Funcionario(String nome, int idade, double salario) {
		super(nome, idade);
		this.salario = salario;
	}

	public void imprime(){
		super.imprime();
		System.out.println("Salário: "+salario);
		imprimePraValer();
	}
	
	public void imprimePraValer(){
		System.out.println("Me chamam de "+getNome());
		//System.out.println("Meu nome é "+super.nome);//nome é "privado"
		System.out.println("Eu vivi até agora "+super.idade+" anos");//idade é "protected"
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
