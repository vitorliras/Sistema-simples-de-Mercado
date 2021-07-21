package Controlador;

import Modelo.ProdutosEstoque;

public interface IcontroladorVendedor {
	
	void InserirProduto(ProdutosEstoque produtosEstoque);
	
	void RemoverProduto(int codigo);
	
	void AlterarProduto(int codigo, ProdutosEstoque novoProduto);
	
	void AcrescentarProduto(int codigo,int quantidade);
	
	void retirarProduto(int codigo,int quantidade);
	
	String mostrarStatusProdutos(int codigo);
	
	ProdutosEstoque pesquisarProdutos(int codigo);
	
}
