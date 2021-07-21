package Repositorio;

import Modelo.ProdutosEstoque;

public interface IRepProdutos {
	
	void InserirProduto(ProdutosEstoque produtosEstoque);
	
	void RemoverProduto(int codigo); //Remove tudo
	
	boolean existeProduto(String nome);
	
	void AlterarProduto(int codigo, ProdutosEstoque novoProduto);
	
	ProdutosEstoque PesquisarProduto(int codigo);
	
	void AcrescentarProduto(int codigo,int quantidade);
	
	void RetirarProduto(int codigo, int quantidade); // - 1 quant
	
	String mostrarStatusProdutos(int codigo);
	
}
