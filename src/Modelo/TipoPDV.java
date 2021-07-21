package Modelo;

public class TipoPDV extends PontoDeVenda{
	
	private String tipoPDV;
	
	
	

	public String getTipoPDV() {
		return tipoPDV;
	}

	public void setTipoPDV(String tipoPDV) {
		this.tipoPDV = tipoPDV;
	}
	
	public String localCompra(int numeroCaixa) {
		if(numeroCaixa >= 6) {
			return "Apenas compas de mais de 10 produtos";
		}
		else if(numeroCaixa >= 3) {
		return "Apenas compra de menos de 10 produtos";
		}else {
			return "Preferencial";
		}
			
	}
	
	public String localCompra() {
		return "Preferencial";
	}
	
}
