package UI;

import java.util.Random;
import java.util.Scanner;

import Controlador.Fachada;
import Modelo.ProdutosAlimenticios;
import Modelo.ProdutosCosmeticos;
import Modelo.ProdutosEstoque;
import Modelo.ProdutosFrios;
import Modelo.ProdutosOutros;
import Modelo.ProdutosQuimicos;

public class MainVendedor {
	static Scanner sc = new Scanner(System.in);

	public void mainVendedor() {
		int opcao;

		do {
			System.out.println("Para inserir Produtos, digite 1");
			System.out.println("Para remover Produtos, digite 2");
			System.out.println("Para mostrar Produtos, digite 3");
			System.out.println("Para alterar Produtos, digite 4");
			System.out.println("Para acrescentar quantidade de Produto, digite 5");
			System.out.println("Para retirar quantidade de produto Produto, digite 6");
			System.out.println("Para sair, digite 0");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				InserirProduto();
				break;
			case 2:
				RemoverProduto();
				break;
			case 3:
				MostrarProduto();
				break;
			case 4:
				AlterarProduto();
				break;
			case 5:
				acrescentarProduto();
				break;
			case 6:
				retirarProduto();
				break;
			case 0:
				break;
			default:
				System.out.println("Digite uma opcao valida.");
				break;
			}

		} while (opcao != 0);

	}

	

	private ProdutosEstoque InserirProduto() {
		ProdutosEstoque p = new ProdutosEstoque();

		System.out.println("Escolha o tipo do produto que queira inserir:");
		System.out.println();
		System.out.println("Para inserir protudos frios no estoque, digite 1");
		System.out.println("Para inserir alimentos no estoque, digite 2");
		System.out.println("Para inserir protudos Eletronicos no estoque, digite 3");
		System.out.println("Para inserir protudos de moda no estoque, digite 4");
		System.out.println("Para inserir protudos de limpeza no estoque, digite 5");
		System.out.println("digite 0 para sair");
		System.out.println();

		int prod = sc.nextInt();
		if (prod == 1) {
			ProdutosFrios pf = new ProdutosFrios();
			System.out.println("Digite o nome do Produto: ");
			p.setNome(sc.next());
			System.out.println("Digite o preço do produto: ");
			p.setPreco(sc.nextDouble());
			System.out.println("Digite a quantidade de produtos: ");
			p.setQuantidade(sc.nextInt());

			Random random = new Random();
			int cod = random.nextInt(10000);

			System.out.println("Digite a marca do produto frio: ");
			pf.setMarcaFrios(sc.next());

			System.out.println("Digite Tipo do produto frio: ");
			pf.setTipoFrios(sc.next());

			p.setProdutosFrios(pf);

			p.setCodigo(cod);
			System.out.println("codigo do produto: " + cod);

			Fachada.getInstancia().InserirProduto(p);
			System.out.println();
			System.out.println("Produto inserido com sucesso.");
			System.out.println();

			return p;
		}
		if (prod == 2) {
			ProdutosAlimenticios pa = new ProdutosAlimenticios();
			System.out.println("Digite o nome do Produto: ");
			p.setNome(sc.next());
			System.out.println("Digite o preço do produto: ");
			p.setPreco(sc.nextDouble());
			System.out.println("Digite a quantidade de produtos: ");
			p.setQuantidade(sc.nextInt());

			Random random = new Random();
			int cod = random.nextInt(10000);

			System.out.println("Digite a marca do aliemento: ");
			pa.setMarcaAlimento(sc.next());

			System.out.println("Digite Tipo do alimento: ");
			pa.setTipoAlimento(sc.next());

			p.setProdutoAlimenticios(pa);

			p.setCodigo(cod);
			System.out.println("codigo do produto: " + cod);

			Fachada.getInstancia().InserirProduto(p);
			System.out.println();
			System.out.println("Produto inserido com sucesso.");
			System.out.println();

			return p;
		}
		if (prod == 3) {
			ProdutosOutros po = new ProdutosOutros();
			System.out.println("Digite o nome do Produto: ");
			p.setNome(sc.next());
			System.out.println("Digite o preço do produto: ");
			p.setPreco(sc.nextDouble());
			System.out.println("Digite a quantidade de produtos: ");
			p.setQuantidade(sc.nextInt());

			Random random = new Random();
			int cod = random.nextInt(10000);

			System.out.println("Digite a marca do eletronico: ");
			po.setMarcaOutros(sc.next());

			System.out.println("Digite Tipo do eletronico: ");
			po.setTipoOutros(sc.next());

			p.setProdutosOutros(po);

			p.setCodigo(cod);
			System.out.println("codigo do produto: " + cod);

			Fachada.getInstancia().InserirProduto(p);
			System.out.println();
			System.out.println("Produto inserido com sucesso.");
			System.out.println();

			return p;
		}
		if (prod == 4) {
			ProdutosCosmeticos pc = new ProdutosCosmeticos();
			System.out.println("Digite o nome do Produto: ");
			p.setNome(sc.next());
			System.out.println("Digite o preço do produto: ");
			p.setPreco(sc.nextDouble());
			System.out.println("Digite a quantidade de produtos: ");
			p.setQuantidade(sc.nextInt());

			Random random = new Random();
			int cod = random.nextInt(10000);

			System.out.println("Digite a marca do produto moda: ");
			pc.setMarcaComesticos(sc.next());

			System.out.println("Digite Tipo do produto moda: ");
			pc.setTipoCosmeticos(sc.next());

			p.setProdutosCosmeticos(pc);

			p.setCodigo(cod);
			System.out.println("codigo do produto: " + cod);

			Fachada.getInstancia().InserirProduto(p);
			System.out.println();
			System.out.println("Produto inserido com sucesso.");
			System.out.println();

			return p;
		}
		if (prod == 5) {
			ProdutosQuimicos pq = new ProdutosQuimicos();
			System.out.println("Digite o nome do Produto: ");
			p.setNome(sc.next());
			System.out.println("Digite o preço do produto: ");
			p.setPreco(sc.nextDouble());
			System.out.println("Digite a quantidade de produtos: ");
			p.setQuantidade(sc.nextInt());

			Random random = new Random();
			int cod = random.nextInt(10000);

			System.out.println("Digite a marca do produto de limpeza: ");
			pq.setMarcaQuimicos(sc.next());

			System.out.println("Digite Tipo do produto de limpeza: ");
			pq.setTipoQuimicos(sc.next());

			p.setProdutosQuimicos(pq);

			p.setCodigo(cod);
			System.out.println("codigo do produto: " + cod);

			Fachada.getInstancia().InserirProduto(p);
			System.out.println();
			System.out.println("Produto inserido com sucesso.");
			System.out.println();

			return p;
		}
		if (prod != 1 && prod != 2 && prod != 3 && prod != 4 && prod != 5) {
			System.out.println("Nada inserido");
			System.out.println();
		}
		return p;
	}

	private void RemoverProduto() {
		System.out.println("Você tem certeza que gostaria de remover algum produto? (1-Sim/2-NÃ£o)");
		int resp = sc.nextInt();
		if (resp == 1) {
			System.out.println("Informe o codigo do produto: ");
			int cod = sc.nextInt();
			Fachada.getInstancia().RemoverProduto(cod);
			System.out.println();
			System.out.println("O produto do código " + cod + " foi removido com sucesso.");
			System.out.println();
		} else {
			System.out.println("Código inexistente. Nenhum produto foi removido ");
			System.out.println();
		}

	}

	private void MostrarProduto() {
		System.out.println("informe o codigo: ");
		int cod = sc.nextInt();
		System.out.println(Fachada.getInstancia().mostrarStatusProdutos(cod));
		System.out.println();
	}

	private void AlterarProduto() {

		System.out.println("Deseja altera alguma informação? (1- Sim/ 2- Não)");
		int resp = sc.nextInt();
		if(resp == 1) {
			ProdutosEstoque p = new ProdutosEstoque();

			System.out.println("Escolha o tipo do produto que queira alterar:");
			System.out.println();
			System.out.println("Para alterar protudos frios no estoque, digite 1");
			System.out.println("Para alterar alimentos no estoque, digite 2");
			System.out.println("Para alterar protudos Eletronicos no estoque, digite 3");
			System.out.println("Para alterar protudos de moda no estoque, digite 4");
			System.out.println("Para alterar protudos de limpeza no estoque, digite 5");


			int prod = sc.nextInt();
			if (prod == 1) {
				System.out.println("Digite o código do produto que vai ser alterado");
				int cod = sc.nextInt();
				ProdutosFrios pf = new ProdutosFrios();
				
				System.out.println("Digite o nome do Produto: ");
				p.setNome(sc.next());
				System.out.println("Digite o preço do produto: ");
				p.setPreco(sc.nextDouble());
				System.out.println("Digite a quantidade de produtos: ");
				p.setQuantidade(sc.nextInt());

				
				

				System.out.println("Digite a marca do produto frio: ");
				pf.setMarcaFrios(sc.next());

				System.out.println("Digite Tipo do produto frio: ");
				pf.setTipoFrios(sc.next());

				p.setProdutosFrios(pf);

				p.setCodigo(cod);
				

				Fachada.getInstancia().AlterarProduto(cod, p);
				System.out.println();
				System.out.println("Produto alterado com sucesso.");
				System.out.println();

				
			}
			if (prod == 2) {
				ProdutosAlimenticios pa = new ProdutosAlimenticios();
				System.out.println("Digite o código do produto que vai ser alterado");
				int cod = sc.nextInt();
				System.out.println("Digite o nome do Produto: ");
				p.setNome(sc.next());
				System.out.println("Digite o preço do produto: ");
				p.setPreco(sc.nextDouble());
				System.out.println("Digite a quantidade de produtos: ");
				p.setQuantidade(sc.nextInt());

				

				System.out.println("Digite a marca do aliemento: ");
				pa.setMarcaAlimento(sc.next());

				System.out.println("Digite Tipo do alimento: ");
				pa.setTipoAlimento(sc.next());

				p.setProdutoAlimenticios(pa);

				p.setCodigo(cod);
				

				Fachada.getInstancia().AlterarProduto(cod, p);
				System.out.println();
				System.out.println("Produto alterado com sucesso.");
				System.out.println();

				
			}
			if (prod == 3) {
				ProdutosOutros po = new ProdutosOutros();
				System.out.println("Digite o código do produto que vai ser alterado");
				int cod = sc.nextInt();
				System.out.println("Digite o nome do Produto: ");
				p.setNome(sc.next());
				System.out.println("Digite o preço do produto: ");
				p.setPreco(sc.nextDouble());
				System.out.println("Digite a quantidade de produtos: ");
				p.setQuantidade(sc.nextInt());

				

				System.out.println("Digite a marca do eletronico: ");
				po.setMarcaOutros(sc.next());

				System.out.println("Digite Tipo do eletronico: ");
				po.setTipoOutros(sc.next());

				p.setProdutosOutros(po);

				p.setCodigo(cod);
				

				Fachada.getInstancia().AlterarProduto(cod, p);
				System.out.println();
				System.out.println("Produto alterado com sucesso.");
				System.out.println();

				
			}
			if (prod == 4) {
				System.out.println("Digite o código do produto que vai ser alterado");
				int cod = sc.nextInt();
				
				ProdutosCosmeticos pc = new ProdutosCosmeticos();
				System.out.println("Digite o nome do Produto: ");
				p.setNome(sc.next());
				System.out.println("Digite o preço do produto: ");
				p.setPreco(sc.nextDouble());
				System.out.println("Digite a quantidade de produtos: ");
				p.setQuantidade(sc.nextInt());

				

				System.out.println("Digite a marca do produto moda: ");
				pc.setMarcaComesticos(sc.next());

				System.out.println("Digite Tipo do produto moda: ");
				pc.setTipoCosmeticos(sc.next());

				p.setProdutosCosmeticos(pc);

				p.setCodigo(cod);
				

				Fachada.getInstancia().AlterarProduto(cod, p);
				System.out.println();
				System.out.println("Produto alterado com sucesso.");
				System.out.println();

				
			}
			if (prod == 5) {
				ProdutosQuimicos pq = new ProdutosQuimicos();
				System.out.println("Digite o código do produto que vai ser alterado");
				int cod = sc.nextInt();
				System.out.println("Digite o nome do Produto: ");
				p.setNome(sc.next());
				System.out.println("Digite o preço do produto: ");
				p.setPreco(sc.nextDouble());
				System.out.println("Digite a quantidade de produtos: ");
				p.setQuantidade(sc.nextInt());

				
				System.out.println("Digite a marca do produto de limpeza: ");
				pq.setMarcaQuimicos(sc.next());

				System.out.println("Digite Tipo do produto de limpeza: ");
				pq.setTipoQuimicos(sc.next());

				p.setProdutosQuimicos(pq);

				p.setCodigo(cod);
		

				Fachada.getInstancia().AlterarProduto(cod, p);
				System.out.println();
				System.out.println("Produto alterado com sucesso.");
				System.out.println();

				
			}
			if (prod != 1 && prod != 2 && prod != 3 && prod != 4 && prod != 5) {
				System.out.println("Nenhuma alteração");
				System.out.println();
			}
		}else {
			System.out.println("Nenhuma alteração");
		}
		
	}

	private void retirarProduto() {
		System.out.println("Insira o código  do protudo que deseja retirar: ");
		int cod = sc.nextInt();
		System.out.println("Insira a quantidade que deseja retirar: ");
		int quant = sc.nextInt();
		if (quant > 0) {
			Fachada.getInstancia().retirarProduto(cod, quant);
		} else {
			System.out.println("quantidade invalida");
			System.out.println();
		}
	}

	private void acrescentarProduto() {
		System.out.println("Insira o código do protudo que deseja acrescentar: ");
		int cod = sc.nextInt();
		System.out.println("Insira a quantidade que deseja acrescentar: ");
		int quant = sc.nextInt();
		if (quant > 0) {
			Fachada.getInstancia().AcrescentarProduto(cod, quant);
			System.out.println();
		} else {
			System.out.println("quantidade invalida");
			System.out.println();
		}
	}

}
