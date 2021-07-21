package Modelo;

public class CondicaoPagamento extends TipoPagamento {
	
	private boolean debito;
	private boolean credito;
	private boolean aVista;
	
	public String pagamentoDinheiro(boolean dinheiro) {
		if(dinheiro == true) {
		return"pagamento em dinheiro";
		}
		return null;
	}
	public String pagamentoTicket(boolean ticket) {
		if(ticket == true) {
		return"pagamento em ticket";
		}
		return null;
	}
	
	public String pagamentoDebito(boolean debito) {
		if(debito == true) {
		return"pagamento em debito";
		}
		return null;
	}
	public String pagamentoCredito(boolean credito) {
		if(credito == true) {
		return"pagamento em credito";
		}
		return null;
	}
	public String pagamentoAVista(boolean aVista) {
		if(aVista == true) {
		return"pagamento em à vista";
		}
		return null;
	}
	
	public boolean isDebito() {
		return debito;
	}
	public void setDebito(boolean debito) {
		this.debito = debito;
	}
	public boolean isCredito() {
		return credito;
	}
	public void setCredito(boolean credito) {
		this.credito = credito;
	}
	public boolean isaVista() {
		return aVista;
	}
	public void setaVista(boolean aVista) {
		this.aVista = aVista;
	}
	
	
	
	
	
	
}
