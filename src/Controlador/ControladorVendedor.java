package Controlador;

import Modelo.ProdutosEstoque;  //CRIAR CRUD COM CORREDOR
import Repositorio.IRepProdutos;
import Repositorio.RepProdutos;

public class ControladorVendedor implements IcontroladorVendedor {
	
	private static IRepProdutos repProduto;
	
	private static ControladorVendedor instancia;

    private ControladorVendedor() {
        repProduto = RepProdutos.getInstancia();
    }

    public static ControladorVendedor getInstancia() {
        if (instancia == null) {
            instancia = new ControladorVendedor();
        }
        return instancia;
    }

	@Override
	public  void InserirProduto(ProdutosEstoque produtosEstoque) {
		repProduto.InserirProduto(produtosEstoque);
	}

	@Override
	public void RemoverProduto(int codigo) {
		repProduto.RemoverProduto (codigo);
		
	}

	@Override
	public void AlterarProduto(int codigo, ProdutosEstoque novoProduto) {
		repProduto.AlterarProduto (codigo, novoProduto);
	}

	@Override
	public void AcrescentarProduto(int codigo, int quantidade) {
		repProduto.AcrescentarProduto (codigo, quantidade);
	}

	@Override
	public String mostrarStatusProdutos(int codigo) {
		return repProduto.mostrarStatusProdutos(codigo);
	}

	@Override
	public ProdutosEstoque pesquisarProdutos(int codigo) {
		return repProduto.PesquisarProduto(codigo);
	}

	@Override
	public void retirarProduto(int codigo, int quantidade) {
		repProduto.RetirarProduto(codigo, quantidade);
		
	}
	
}
