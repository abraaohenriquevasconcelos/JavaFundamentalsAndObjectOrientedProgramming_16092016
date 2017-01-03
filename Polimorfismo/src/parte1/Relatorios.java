package parte1;

public class Relatorios {

	public void relatorioPagamentoGerente(Gerente gerente){
		gerente.calcularSalario();
		System.out.println("Nome: "+gerente.getNome());
		System.out.println("Salário: "+gerente.getSalario());
	}
	
	public void relatorioPagamentoVendedor(Vendedor vendedor){
		vendedor.calcularSalario();
		System.out.println("Nome: "+vendedor.getNome());
		System.out.println("Salário: "+vendedor.getSalario());
	}
	
	public void relatorioPagamentoGenerico(Funcionario funcionario){
		funcionario.calcularSalario();
		System.out.println("Nome: "+funcionario.getNome());
		System.out.println("Salário: "+funcionario.getSalario());
	}
}
