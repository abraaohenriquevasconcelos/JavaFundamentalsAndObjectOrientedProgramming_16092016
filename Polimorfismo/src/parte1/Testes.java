package parte2;

public class Testes {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("zé", 5323.3, 234.9);
		Vendedor vendedor = new Vendedor("Jão", 807.3, 433.3);
		Relatorios relatorio = new Relatorios();
		
		//relatorio.relatorioPagamentoGerente(gerente);
		relatorio.relatorioPagamentoVendedor(vendedor);
	}
}
