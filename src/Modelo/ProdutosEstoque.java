package Modelo;

public class ProdutosEstoque extends Produtos {

	
	private ProdutosAlimenticios produtosAlimenticios;
	private ProdutosFrios produtosFrios;
	private ProdutosCosmeticos 	produtosCosmeticos;
	private ProdutosOutros produtosOutros;
	private ProdutosQuimicos produtosQuimicos;
	
	
	/*
	public ProdutosEstoque(int codigo, int quantidade, double preco, String nome) {
		super(codigo, quantidade, preco, nome);
	}
	public ProdutosEstoque(int codigo, int quantidade, double preco, String nome, ProdutosAlimenticios produtosAlimenticios) {
		super(codigo, quantidade, preco, nome);
		this.produtosAlimenticios = produtosAlimenticios;
	}
	public ProdutosEstoque(int codigo, int quantidade, double preco, String nome, ProdutosFrios produtosFrios) {
		super(codigo, quantidade, preco, nome);
		this.produtosFrios = produtosFrios;
	}
	public ProdutosEstoque(int codigo, int quantidade, double preco, String nome, ProdutosCosmeticos produtosCosmeticos) {
		super(codigo, quantidade, preco, nome);
		this.produtosCosmeticos = produtosCosmeticos;
	}
	public ProdutosEstoque(int codigo, int quantidade, double preco, String nome, ProdutosOutros produtosOutros) {
		super(codigo, quantidade, preco, nome);
		this.produtosOutros = produtosOutros;
	}
	public ProdutosEstoque(int codigo, int quantidade, double preco, String nome, ProdutosQuimicos produtosQuimicos) {
		super(codigo, quantidade, preco, nome);
		this.produtosQuimicos = produtosQuimicos;
	}*/
	
	public ProdutosAlimenticios getProdutoAlimenticios() {
		return produtosAlimenticios;
	}
	public void setProdutoAlimenticios(ProdutosAlimenticios produtoAlimenticios) {
		this.produtosAlimenticios = produtoAlimenticios;
	}
	public ProdutosFrios getProdutosFrios() {
		return produtosFrios;
	}
	public void setProdutosFrios(ProdutosFrios produtosFrios) {
		this.produtosFrios = produtosFrios;
	}
	public ProdutosCosmeticos getProdutosCosmeticos() {
		return produtosCosmeticos;
	}
	public void setProdutosCosmeticos(ProdutosCosmeticos produtosCosmeticos) {
		this.produtosCosmeticos = produtosCosmeticos;
	}
	public ProdutosOutros getProdutosOutros() {
		return produtosOutros;
	}
	public void setProdutosOutros(ProdutosOutros produtosOutros) {
		this.produtosOutros = produtosOutros;
	}
	public ProdutosQuimicos getProdutosQuimicos() {
		return produtosQuimicos;
	}
	public void setProdutosQuimicos(ProdutosQuimicos produtosQuimicos) {
		this.produtosQuimicos = produtosQuimicos;
	}
	
	
	
}
