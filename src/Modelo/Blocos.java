package Modelo;

public class Blocos extends SetorMercado {

	private String bloco;
	
	public Blocos(int numeroSetor, String nome, String bloco) {
		super(numeroSetor, nome);
		this.bloco = bloco;
	}

	public String getBloco() {
		return bloco;
	}

	public void setBloco(String bloco) {
		this.bloco = bloco;
	}
	
}
