package parte3;

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
		
		if(funcionario instanceof Gerente){
			//se o objeto que a variável de referência "funcionario" aponta é um gerente vai passar no if
			System.out.println("PNL: "+((Gerente) funcionario).getPnl());
		}
		if(funcionario instanceof Vendedor){
			System.out.println("Total das Vendas: "+((Vendedor) funcionario).getTotalVendas());
		}
	}
}
