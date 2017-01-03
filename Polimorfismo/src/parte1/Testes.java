package parte1;

public class Testes {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("zé", 4000.10, 500.10);
		Vendedor vendedor = new Vendedor("Jão", 807.3, 433.3);
		
		/*************************************************************************************
		 **************************************************************************************/
		
		Relatorios relatorio = new Relatorios();
		//relatorio.relatorioPagamentoGerente(gerente);
		//relatorio.relatorioPagamentoVendedor(vendedor);
		
		/*************************************************************************************
		 **************************************************************************************/
		
		//as variáveis de referência "funcionario" e "gerente"
		//estão referenciando o mesmo objeto.
		//Então podemos ter uma variável de referência da superclasse referenciando 
		//um objeto da subclasse. Ou seja estamos dizendo que uma variável de referência da 
		//superclasse mais genérica faz referência a um objeto de uma subclasse 
		Funcionario funcionario = gerente;  
		//System.out.println("\n\n"+funcionario.getSalario());
		
		/*************************************************************************************
		 **************************************************************************************/
		relatorio.relatorioPagamentoGenerico(gerente);
		//relatorio.relatorioPagamentoVendedor(vendedor);
		
	}
}
