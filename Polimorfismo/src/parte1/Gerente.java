package parte2;

public class Gerente extends Funcionario{

	double pnl;

	public Gerente(String nome, double salario, double pnl) {
		super(nome, salario);
		this.pnl = pnl;
	}

	@Override
	public void calcularSalario(){
		this.salario = this.salario + pnl;
	}
	
	public double getPnl() {
		return pnl;
	}

	public void setPnl(double pnl) {
		this.pnl = pnl;
	}
	
	
}
