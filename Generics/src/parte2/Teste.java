package parte2;

import java.util.ArrayList;
import java.util.List;

public class Teste {

	public static void main(String[] args) {
		MulherEstadoCivil mulherEstadoCivil = new MulherEstadoCivil();
		//Mulher mulher = mulherEstadoCivil.casarPrimeiraDaFila();
		//mulherEstadoCivil.divorciarMulher(mulher);
		
		System.out.println("\n\n***************************************\n\n");
		
		HomemEstadoCivil homemEstadoCivil = new HomemEstadoCivil();
		//Homem homem = homemEstadoCivil.casarPrimeiroDaFila();
		//	homemEstadoCivil.divorciarHomem(homem);
		
		System.out.println("\n\n***************************************\n\n");
		
		List<Mulher> mulheresSolteiras = new ArrayList<>();
		mulheresSolteiras.add(new Mulher("Silmara"));
		mulheresSolteiras.add(new Mulher("Creuza"));
		
		PessoaEstadoCivil<Mulher> pessoaEstadoCivil = new PessoaEstadoCivil<>(mulheresSolteiras);
		Mulher mulherGenerica = pessoaEstadoCivil.casarPrimeiroDaFila();
		pessoaEstadoCivil.divorciarPessoa(mulherGenerica);
	}

}
