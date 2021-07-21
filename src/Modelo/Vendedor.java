package Modelo;

public class Vendedor extends Funcionario {
	
	private TipoPDV caixa;
	/*
	public Vendedor(double salario, int cargo, String nome, int matricula, TipoPDV caixa) {
		super(salario, cargo, nome, matricula);
		this.caixa = caixa;
	}
*/
	public TipoPDV getCaixa() {
		return caixa;
	}

	public void setCaixa(TipoPDV caixa) {
		this.caixa = caixa;
	}
	
}
