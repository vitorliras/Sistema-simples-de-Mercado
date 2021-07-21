package Modelo;

public abstract class  Produtos {
	
	private int codigo;
	private int quantidade;
	private double preco;
	private String nome;
	
		/*
	public Produtos(int codigo, int quantidade, double preco, String nome) {
		super();
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.preco = preco;
		this.nome = nome;
	}  */
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
