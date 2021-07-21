package Modelo;

public abstract class SetorMercado {
	
	private int numeroSetor;
	private String nome;

	public SetorMercado(int numeroSetor, String nome) {
		super();
		this.numeroSetor = numeroSetor;
		this.nome = nome;
	}

	public int getNumeroSetor() {
		return numeroSetor;
	}

	public void setNumeroSetor(int corredor) {
		this.numeroSetor = corredor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
