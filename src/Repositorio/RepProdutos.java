package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Modelo.ProdutosEstoque;


public class RepProdutos implements IRepProdutos  {
	private List<ProdutosEstoque> ListProdutos = new ArrayList<>();
	
	
	private static RepProdutos instancia;
	
	public static RepProdutos getInstancia() {
        if (instancia == null) {
            instancia = new RepProdutos();
        }
        return instancia;
    }

	@Override
	public void InserirProduto(ProdutosEstoque produtosEstoque) {
		ListProdutos.add(produtosEstoque);
		
	}

	@Override
	public void RemoverProduto(int codigo) {
		for(int i = 0; i < ListProdutos.size(); i++) {
			if(ListProdutos.get(i) != null && ListProdutos.get(i).getCodigo() == codigo) {
				ListProdutos.remove(i);
			}
		}
		
	}

	
	@Override
	public boolean existeProduto(String nome) {
		
			for(int i = 0; i < ListProdutos.size();i++) {
				if(ListProdutos.get(i) != null && ListProdutos.get(i).getNome() == nome) {
					System.out.println("existe");
					return true;
				}
			}
		
		
		return false;
		
	}

	@Override
	public void AlterarProduto(int codigo, ProdutosEstoque novoProduto) {
		for(int i = 0; i < ListProdutos.size(); i++) {
			if(ListProdutos.get(i) != null && ListProdutos.get(i).getCodigo() == codigo) {
				ListProdutos.remove(i);
				ListProdutos.add(novoProduto);
            }
        }
		
	}

	@Override
	public void AcrescentarProduto(int codigo, int quantidade) {
		
		for(int i = 0; i < ListProdutos.size(); i++) {
			if(ListProdutos.get(i) != null && ListProdutos.get(i).getCodigo() == codigo && quantidade > 0) {
				
				ListProdutos.get(i).setQuantidade(ListProdutos.get(i).getQuantidade()+quantidade);
				
			}
		}
		
	}

	@Override
	public void RetirarProduto(int codigo, int quantidade) {
		
		for(int i = 0; i < ListProdutos.size(); i++) {
			if(ListProdutos.get(i) != null && ListProdutos.get(i).getCodigo() == codigo && quantidade > 0) {
				if(ListProdutos.get(i).getQuantidade() >= quantidade) {
					ListProdutos.get(i).setQuantidade(ListProdutos.get(i).getQuantidade()-quantidade);
				}else {
					System.out.println("Não dá para retirar produtos acima da quatidade original");
				}
			}
		}
		
	}

	@Override
	public String mostrarStatusProdutos(int codigo) {
		
		for(ProdutosEstoque p  : ListProdutos) {
			if(p != null && p.getCodigo() == codigo ) {
				if(p.getProdutoAlimenticios() != null && p.getProdutosOutros() == null && p.getProdutosCosmeticos() == null && p.getProdutosFrios() == null && p.getProdutosQuimicos() == null) {
					return "Codigo do Produto: "+ p.getCodigo() +
							   "\n Nome: "+ p.getNome()+
							   "\n Quantidade: "+p.getQuantidade()+
							   "\n Preco: "+ p.getPreco()+
							   "\n Tipo produto alimenticio: "+
							   p.getProdutoAlimenticios().getTipoAlimento()+
							   "\n Marca do alimento: "+
							   p.getProdutoAlimenticios().getMarcaAlimento();
			}		
				else if(p.getProdutoAlimenticios() == null && p.getProdutosOutros() != null && p.getProdutosCosmeticos() == null && p.getProdutosFrios() == null && p.getProdutosQuimicos() == null)  {
						return "Codigo do Produto: "+ p.getCodigo() +
								   "\n Nome: "+ p.getNome()+
								   "\n Quantidade: "+p.getQuantidade()+
								   "\n Preco: R$"+ p.getPreco()+
								   "\n Tipo: "+
								   p.getProdutosOutros().getTipoOutros()+
								   "\n Marca: "+
								   p.getProdutosOutros().getMarcaOutros();
					}
					else if(p.getProdutoAlimenticios() == null && p.getProdutosOutros() == null && p.getProdutosCosmeticos() != null && p.getProdutosFrios() == null && p.getProdutosQuimicos() == null) {
						return "Codigo do Produto: "+ p.getCodigo() +
								   "\n Nome: "+ p.getNome()+
								   "\n Quantidade: "+p.getQuantidade()+
								   "\n Preco: R$"+ p.getPreco()+
								   "\n Tipo produto Cosmeticos: "+
								   p.getProdutosCosmeticos().getTipoCosmeticos()+
								   "\n Marca do Cosmeticos: "+
								   p.getProdutosCosmeticos().getMarcaComesticos();
					}
					else if(p.getProdutoAlimenticios() == null && p.getProdutosOutros() == null && p.getProdutosCosmeticos() == null && p.getProdutosFrios() != null && p.getProdutosQuimicos() == null) {
						return "Codigo do Produto: "+ p.getCodigo() +
								   "\n Nome: "+ p.getNome()+
								   "\n Quantidade: "+p.getQuantidade()+
								   "\n Preco: R$"+ p.getPreco()+
								   "\nTipo Frios: "+
								   p.getProdutosFrios().getTipoFrios()+
								   "\n Marca do Cosmeticos: "+
								   p.getProdutosFrios().getMarcaFrios();
					}
					if(p.getProdutoAlimenticios() == null && p.getProdutosOutros() == null && p.getProdutosCosmeticos() == null && p.getProdutosFrios() == null && p.getProdutosQuimicos() != null) {
						return " Codigo do Produto: "+ p.getCodigo() +
								   "\nNome: "+ p.getNome()+
								   "\nQuantidade: "+p.getQuantidade()+
								   "\nPreco: R$"+ p.getPreco()+
								   "\nTipo Limpeza: "+
								   p.getProdutosQuimicos().getTipoQuimicos()+
								   "\n Marca do quimico: "+
								   p.getProdutosQuimicos().getMarcaQuimicos();
					}else {
						return "Não existe produto com esse código!!";
					}
			}
		}
		
		return null;
	}

	@Override
	public ProdutosEstoque PesquisarProduto(int codigo) {
		for(ProdutosEstoque p: ListProdutos) {
			if(p != null && p.getCodigo() == codigo) {
				return p;
			}
		}
		return null;
	}
}
