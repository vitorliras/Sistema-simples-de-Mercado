package UI;

import java.text.DecimalFormat;
import java.util.Scanner;

import Constants.Constante;
import Controlador.Fachada;
import Modelo.Blocos;
import Modelo.ProdutosAlimenticios;
import Modelo.ProdutosCosmeticos;
import Modelo.ProdutosEstoque;
import Modelo.ProdutosFrios;
import Modelo.ProdutosOutros;
import Modelo.ProdutosQuimicos;
import Modelo.TipoPagamento;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Seja bem-vindo!!!");
		System.out.println("Identifique-se: ");
		System.out.println(" 1-Fazer compras(Cliente)");
		System.out.println(" 2-Area de estoque(gestão dos produtos)");
		System.out.println(" 3-Area gerencial(gestão dos vendedores)");
		System.out.println(" 4-Area empresarial(gestão da gerencia)");
		System.out.println(" 0-Sair");
		
		
		int ind = sc.nextInt();
		
		while(ind != 0) {
			
			if(ind == 1) {
				
				System.out.println("Seja bem-vindo ao mercado");
				System.out.println();
				Blocos[] setores = new Blocos[5];
				setores[0] = new Blocos(1,"Frios","A");
				setores[1] = new Blocos(2,"Alimentos","B");
				setores[2] = new Blocos(3,"Eletronicos","C");
				setores[3] = new Blocos(4,"Limpeza","D");
				setores[4] = new Blocos(5,"Moda","E");
				Fachada.getInstancia().InserirSetor(setores[0]);
				Fachada.getInstancia().InserirSetor(setores[1]);
				Fachada.getInstancia().InserirSetor(setores[2]);
				Fachada.getInstancia().InserirSetor(setores[3]);
				Fachada.getInstancia().InserirSetor(setores[4]);
			
				
				int quant = 5000;
				
				System.out.println(Fachada.getInstancia().mostrarStatusSetor(setores[0].getNumeroSetor()));
				System.out.println(Fachada.getInstancia().mostrarStatusSetor(setores[1].getNumeroSetor()));
				System.out.println(Fachada.getInstancia().mostrarStatusSetor(setores[2].getNumeroSetor()));
				System.out.println(Fachada.getInstancia().mostrarStatusSetor(setores[3].getNumeroSetor()));
				System.out.println(Fachada.getInstancia().mostrarStatusSetor(setores[4].getNumeroSetor()));
				
				
				
				while(quant == 5000) {
					
				System.out.println("Qual setor você deseja ir? (Digite o numero do setor)");
				System.out.println();
				
				int set = sc.nextInt();
				double alimentos = 0, frios = 0, outros = 0, comesticos = 0, quimicos = 0;
				while(set != 0) {
					if(set == 1) { 
						
						/*****************FRIOS COMEÇO*********************/
						ProdutosEstoque pe = new ProdutosEstoque();
						ProdutosFrios pf = new ProdutosFrios();
						System.out.println("1- Todynho R$1.20");
						System.out.println("2- Iorgut fermentado R$3.40");
						System.out.println("3- Manteiga com sal R$4.20");
						System.out.println();
						
						//pe[0] = new ProdutosEstoque(1, 0, 1.2, "chocolatado", new ProdutosFrios("200ml","todynho"));
						//pe[1] = new ProdutosEstoque(2, 0, 3.4, "Iorgut", new ProdutosFrios("fermentado","Grego"));
						//pe[2] = new ProdutosEstoque(3, 0, 4.2, "Manteiga", new ProdutosFrios("com sal","Itambé"));
						
					/*	
						
						pe[0].setCodigo(411);
						pe[0].setNome("Chocolatado");
						pe[0].setPreco(1.20);
						pe[0].setQuantidade(0);
						pf[0].setMarcaFrios("todynho");
						pf[0].setTipoFrios("200ml");
						pe[0].setProdutosFrios(pf[0]);
						
						pe[1].setCodigo(194);
						pe[1].setNome("Iorgut");
						pe[1].setPreco(3.40);
						pe[1].setQuantidade(0);
						pf[1].setMarcaFrios("Grego");
						pf[1].setTipoFrios("Fermentado");
						pe[1].setProdutosFrios(pf[1]);
						
						pe[2].setCodigo(140);
						pe[2].setNome("Manteiga");
						pe[2].setPreco(4.20);
						pe[2].setQuantidade(0);
						pf[2].setMarcaFrios("Itambé");
						pf[2].setTipoFrios("Com sal");
						pe[2].setProdutosFrios(pf[2]);
						*/
						
						System.out.println("Qual Produto você deseja?");
						System.out.println();
						
						int set2 =  sc.nextInt();
						
						if(set2 == 1) {
							pe.setCodigo(411);
							pe.setNome("Chocolatado");
							pe.setPreco(1.20);
							pe.setQuantidade(0);
							pf.setMarcaFrios("todynho");
							pf.setTipoFrios("200ml");
							pe.setProdutosFrios(pf);
							Fachada.getInstancia().InserirProduto(pe);
							System.out.println("Quantos você quer? ");
							System.out.println();
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe.getCodigo(), quantidade);
							pe.setPreco(pe.getQuantidade() * pe.getPreco());
							frios += pe.getPreco();
						}
						
						if(set2 == 2) {
							
							pe.setCodigo(194);
							pe.setNome("Iorgut");
							pe.setPreco(3.40);
							pe.setQuantidade(0);
							pf.setMarcaFrios("Grego");
							pf.setTipoFrios("Fermentado");
							pe.setProdutosFrios(pf);
							Fachada.getInstancia().InserirProduto(pe);
							System.out.println("Quantos você quer? ");
							System.out.println();
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe.getCodigo(), quantidade);
							pe.setPreco(pe.getQuantidade() * pe.getPreco());
							frios += pe.getPreco();
						}
						
						if(set2 == 3) {
							
							pe.setCodigo(140);
							pe.setNome("Manteiga");
							pe.setPreco(4.20);
							pe.setQuantidade(0);
							pf.setMarcaFrios("Itambé");
							pf.setTipoFrios("Com sal");
							pe.setProdutosFrios(pf);
							Fachada.getInstancia().InserirProduto(pe);
							System.out.println("Quantos você quer? ");
							System.out.println();
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe.getCodigo(), quantidade);
							pe.setPreco(pe.getQuantidade() * pe.getPreco());
							frios += pe.getPreco();
						}
						
						
						if(set2 != 1 &&set2 != 2 &&set2 != 3) {
							System.out.println("Não existe esse produto escolha o produto correto");
							System.out.println("Volte a escolher os setores");
							System.out.println();
						}
						
						System.out.println("Qual outro setor você deseja ir? (Digite o numero do setor/ 6 ou mais- para o valor total)");
						
						set = sc.nextInt();
						
						/******************FRIOOS ACABADO***************/
					}
					
					if(set == 2) {
						/******************ALIMENTOS COMEÇO***************/
					
						ProdutosEstoque pe1 = new ProdutosEstoque();
						ProdutosAlimenticios pa = new ProdutosAlimenticios();
					
						System.out.println("1- Arroz R$5.20");
						System.out.println("2- Macarrão R$2.80");
						System.out.println("3- Feijão R$7.50");
						System.out.println();
						System.out.println("Qual Produto você deseja?");
						System.out.println();
	
						//pe1[0] = new ProdutosEstoque(1, 0, 5.20, "Arroz", new ProdutosAlimenticios("Parboilizado","Emoções"));
						//pe1[1] = new ProdutosEstoque(2, 0, 2.80, "Macarrão", new ProdutosAlimenticios("Integral","Vitarela"));
						//pe1[2] = new ProdutosEstoque(3, 0, 7.20, "Feijão", new ProdutosAlimenticios("Carioca","KiCaldo"));
												
						
						int set2 = sc.nextInt();
						
						if(set2 == 1) {		
							pe1.setCodigo(911);
							pe1.setNome("Arroz");
							pe1.setPreco(5.20);
							pe1.setQuantidade(0);
							pa.setMarcaAlimento("Parboilizado");
							pa.setTipoAlimento("Emoções");
							pe1.setProdutoAlimenticios(pa);
							Fachada.getInstancia().InserirProduto(pe1);
							System.out.println("Quantos você quer? ");
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe1.getCodigo(), quantidade);
							pe1.setPreco(pe1.getQuantidade() * pe1.getPreco());
							alimentos += pe1.getPreco();
						}
						
						if(set2 == 2) {
							pe1.setCodigo(111);
							pe1.setNome("Macarrão");
							pe1.setPreco(2.80);
							pe1.setQuantidade(0);
							pa.setMarcaAlimento("Integral");
							pa.setTipoAlimento("Vitarela");
							pe1.setProdutoAlimenticios(pa);
							Fachada.getInstancia().InserirProduto(pe1);
							System.out.println("Quantos você quer? ");
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe1.getCodigo(), quantidade);
							pe1.setPreco(pe1.getQuantidade() * pe1.getPreco());
							alimentos += pe1.getPreco();
						}
						
						if(set2 == 3) {
							pe1.setCodigo(222);
							pe1.setNome("Feijão");
							pe1.setPreco(7.20);
							pe1.setQuantidade(0);
							pa.setMarcaAlimento("Carioca");
							pa.setTipoAlimento("KiCaldo");
							pe1.setProdutoAlimenticios(pa);
							Fachada.getInstancia().InserirProduto(pe1);
							System.out.println("Quantos você quer? ");
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe1.getCodigo(), quantidade);
							pe1.setPreco(pe1.getQuantidade() * pe1.getPreco());
							alimentos += pe1.getPreco();
						}
						
						if(set2 != 1 &&set2 != 2 &&set2 != 3) {
							System.out.println("Não existe esse produto escolha o produto correto");
							System.out.println("Volte a escolher os setores");
							System.out.println();
						}
	
				
						System.out.println("Qual outro setor você deseja ir? (Digite o numero do setor/ 6- para total)");
						set = sc.nextInt();
						}
						
						/******************ALIMENTOS ACABADO***************/
					
					
					if(set == 3) {
						/******************OUTROS COMEÇO***************/
					
							ProdutosEstoque pe2 = new ProdutosEstoque();
							ProdutosOutros po = new ProdutosOutros();
							
							System.out.println("1-Notbook Dell R$ 4502.99");
							System.out.println("2-Impressora HP R$ 682.00");
							System.out.println("3-Desktop Lenovo R$ 3570.99");
							
							System.out.println();
							System.out.println("Qual Produto você deseja?");
							System.out.println();
							int set2 = sc.nextInt(); 
							
							//pe2[0] = new ProdutosEstoque(1,0,4502.99, "Notbook", new ProdutosOutros ("Dell", "A74568"));
							//pe2[1] = new ProdutosEstoque(1,0,682.00, "Impressora", new ProdutosOutros ("HP", "AS524"));
							//pe2[2] = new ProdutosEstoque(1,0,3570.99, "Desktop", new ProdutosOutros ("Lenovo", "SFDAF5"));
							
							
						
						if(set2 == 1) {
							pe2.setCodigo(076);
							pe2.setNome("Notbook");
							pe2.setPreco(4502.99);
							pe2.setQuantidade(0);
							po.setMarcaOutros("Dell");
							po.setTipoOutros("A74568");
							pe2.setProdutosOutros(po);
							Fachada.getInstancia().InserirProduto(pe2);
							System.out.println("Quantos você quer? ");
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe2.getCodigo(), quantidade);
							pe2.setPreco(pe2.getQuantidade() * pe2.getPreco());
							outros += pe2.getPreco();
						}
						if(set2 == 2) {		
							pe2.setCodigo(123);
							pe2.setNome("Impressora");
							pe2.setPreco(682.00);
							pe2.setQuantidade(0);
							po.setMarcaOutros("HP");
							po.setTipoOutros("AS524");
							pe2.setProdutosOutros(po);
							Fachada.getInstancia().InserirProduto(pe2);
							System.out.println("Quantos você quer? ");
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe2.getCodigo(), quantidade);
							outros += pe2.getPreco();	
						}	
						if(set2 == 3) {
							pe2.setCodigo(113);
							pe2.setNome("Desktop");
							pe2.setPreco(3570.99);
							pe2.setQuantidade(0);
							po.setMarcaOutros("lenovo");
							po.setTipoOutros("SFDAF5");
							pe2.setProdutosOutros(po);
							Fachada.getInstancia().InserirProduto(pe2);
							System.out.println("Quantos você quer? ");
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe2.getCodigo(), quantidade);
							pe2.setPreco(pe2.getQuantidade() * pe2.getPreco());
							outros += pe2.getPreco();
						}
						
						if(set2 != 1 &&set2 != 2 &&set2 != 3) {
							System.out.println("Não existe esse produto escolha o produto correto");
							System.out.println("Volte a escolher os setores");
							System.out.println();
						}
						
						
						System.out.println("Qual outro setor você deseja ir? (Digite o numero do setor/ 6 ou mais- para valor total)");
						
						set = sc.nextInt();
						
					}
					
					/******************OUTROS ACABADO***************/
					
					if(set == 4) {
						/******************MODA COMEÇO***************/
					
							ProdutosEstoque pe3 = new ProdutosEstoque();
							ProdutosCosmeticos pc = new ProdutosCosmeticos();
							
							System.out.println("1-Casaco R$ 110.99");
							System.out.println("2-Sapatos R$ 199.99");
							System.out.println("3-Maquiagem R$ 89.99");
							
							System.out.println();
							System.out.println("Qual Produto você deseja?");
							System.out.println();
							int set2 = sc.nextInt(); 
							
							//pe3[0] = new ProdutosEstoque(1,0,110.99, "Casaco", new ProdutosCosmeticos ("quiksilver", "moletom"));
							//pe3[1] = new ProdutosEstoque(1,0,199.99, "Sapatos", new ProdutosCosmeticos ("Nike", "tênis"));
							//pe3[2] = new ProdutosEstoque(1,0,89.99, "Maquiagem", new ProdutosCosmeticos ("Boticário", "Kit"));
							
							
						
						if(set2 == 1) {
							pe3.setCodigo(566);
							pe3.setNome("Casaco");
							pe3.setPreco(110.99);
							pe3.setQuantidade(0);
							pc.setMarcaComesticos("quiksilver");
							pc.setMarcaComesticos("moletom");
							pe3.setProdutosCosmeticos(pc);
							Fachada.getInstancia().InserirProduto(pe3);
							System.out.println("Quantos você quer? ");
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe3.getCodigo(), quantidade);
							pe3.setPreco(pe3.getQuantidade() * pe3.getPreco());
							comesticos += pe3.getPreco();
						}
						if(set2 == 2) {		
							pe3.setCodigo(516);
							pe3.setNome("Sapatos");
							pe3.setPreco(199.99);
							pe3.setQuantidade(0);
							pc.setMarcaComesticos("Nike");
							pc.setMarcaComesticos("tênis");
							pe3.setProdutosCosmeticos(pc);
							Fachada.getInstancia().InserirProduto(pe3);
							System.out.println("Quantos você quer? ");
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe3.getCodigo(), quantidade);
							comesticos += pe3.getPreco();	
						}	
						if(set2 == 3) {
							pe3.setCodigo(549);
							pe3.setNome("Maquiagem");
							pe3.setPreco(89.99);
							pe3.setQuantidade(0);
							pc.setMarcaComesticos("Boticário");
							pc.setMarcaComesticos("Kit");
							pe3.setProdutosCosmeticos(pc);
							Fachada.getInstancia().InserirProduto(pe3);
							System.out.println("Quantos você quer? ");
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe3.getCodigo(), quantidade);
							pe3.setPreco(pe3.getQuantidade() * pe3.getPreco());
							comesticos += pe3.getPreco();
						}
						if(set2 != 1 &&set2 != 2 &&set2 != 3) {
							System.out.println("Não existe esse produto escolha o produto correto");
							System.out.println("Volte a escolher os setores");
							System.out.println();
						}
						
						
						System.out.println("Qual outro setor você deseja ir? (Digite o numero do setor/ 6 ou mais - para valor total)");
						
						set = sc.nextInt();
						
					}
					
							/******************MODA ACABADO***************/
					
					if(set == 5) {
						/******************LIMPEZA COMEÇO***************/
						
							ProdutosEstoque pe4 = new ProdutosEstoque();
							ProdutosQuimicos pq = new ProdutosQuimicos();
							
							System.out.println("1-Detergente R$ 30.99");
							System.out.println("2-Sabão  R$ 3.99");
							System.out.println("3-Desinfetante R$ 12.20");
							
							System.out.println();
							System.out.println("Qual Produto você deseja?");
							System.out.println();
							int set2 = sc.nextInt(); 
							
							//pe4[0] = new ProdutosEstoque(1,0,30.99, "Detergente", new ProdutosQuimicos ("limpol", "sem glicerina"));
							//pe4[1] = new ProdutosEstoque(1,0,3.99, "Sabão", new ProdutosQuimicos ("ypê", "neutro"));
							//pe4[2] = new ProdutosEstoque(1,0,12.20, "Desinfetante", new ProdutosQuimicos ("Pinho sol", "SFDAF5"));
							
						if(set2 == 1) {
							pe4.setCodigo(613);
							pe4.setNome("Detergente");
							pe4.setPreco(30.99);
							pe4.setQuantidade(0);
							pq.setMarcaQuimicos("limpol");
							pq.setMarcaQuimicos("sem glicerina");
							pe4.setProdutosQuimicos(pq);
							Fachada.getInstancia().InserirProduto(pe4);
							System.out.println("Quantos você quer? ");
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe4.getCodigo(), quantidade);
							pe4.setPreco(pe4.getQuantidade() * pe4.getPreco());
							quimicos += pe4.getPreco();
						}
						if(set2 == 2) {		
							pe4.setCodigo(641);
							pe4.setNome("Sabão");
							pe4.setPreco(3.99);
							pe4.setQuantidade(0);
							pq.setMarcaQuimicos("ypê");
							pq.setMarcaQuimicos("neutro");
							pe4.setProdutosQuimicos(pq);
							Fachada.getInstancia().InserirProduto(pe4);
							System.out.println("Quantos você quer? ");
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe4.getCodigo(), quantidade);
							quimicos += pe4.getPreco();	
						}	
						if(set2 == 3) {
							pe4.setCodigo(598);
							pe4.setNome("Casaco");
							pe4.setPreco(12.20);
							pe4.setQuantidade(0);
							pq.setMarcaQuimicos("Pinho sol");
							pq.setMarcaQuimicos("nível intermediário");
							pe4.setProdutosQuimicos(pq);
							Fachada.getInstancia().InserirProduto(pe4);
							System.out.println("Quantos você quer? ");
							int quantidade = sc.nextInt();
							Fachada.getInstancia().AcrescentarProduto(pe4.getCodigo(), quantidade);
							pe4.setPreco(pe4.getQuantidade() * pe4.getPreco());
							quimicos += pe4.getPreco();
						}
						if(set2 != 1 &&set2 != 2 &&set2 != 3) {
							System.out.println("Não existe esse produto escolha o produto correto");
							System.out.println("Volte a escolher os setores");
							System.out.println();
						}
						
						
						System.out.println("Qual outro setor você deseja ir? (Digite o numero do setor/ 6 ou mais- para valor total)");
						
						set = sc.nextInt();
						
					}
					
					/******************LIMPEZA ACABADO***************/
					
					if(set >= 6) { 
						double total = outros + frios + alimentos + comesticos + quimicos;
						if(total != 0) {
							DecimalFormat df = new DecimalFormat("#.00");
							System.out.println("Valor total foi R$"+df.format(total));
							set = 0;
						}else {
							System.out.println("por favor escolha algum produto para poder saber o valor total");
							System.out.println("Escolha em qual setores o você deseja ir");
							System.out.println();
							System.out.println("Qual outro setor você deseja ir? (Digite o numero do setor/ 6 ou mais- para valor total)");
							set = sc.nextInt();
						}
					}
					
				}
				System.out.println();
				System.out.println("Qual tipo de pagamento desejas? \n1-Dinheiro\n2-ticket\n3-Debito\n4-Crédito\n5-À vista");
				int pag = sc.nextInt();
				
				DecimalFormat df = new DecimalFormat("#.00");
				
				double total = outros + frios + alimentos+ comesticos + quimicos;
				TipoPagamento tp = new TipoPagamento();
				while(pag != 0) {
				if (pag == 1) {
					tp.setDinheiro(true);
					System.out.println("Valor R$"+df.format(total)+" "+tp.pagamentoDinheiro(tp.isDinheiro()));
				}
				else if (pag == 2) {
					 tp.setTicket(true);
					 System.out.println("Valor R$"+df.format(total)+" "+tp.pagamentoTicket(tp.isTicket()));
				}
				else if (pag == 3) {
					 tp.setDebito(true);;
					 System.out.println("Valor R$"+df.format(total)+" "+tp.pagamentoDebito(tp.isDebito()));
				}
				else if (pag == 4) {
					 tp.setCredito(true);
					 total +=  (total * Constante.Taxa);
					 System.out.println("Dividir em quantas vezes? (taxa de 2%)");
					 int div = sc.nextInt();
					 double divTotal= total/div;
					 System.out.println("Valor R$"+df.format(total)+" "+div+"x de "+df.format(divTotal)+" "+tp.pagamentoCredito(tp.isCredito()));
				}
				else if (pag == 5) {
					 tp.setaVista(true);;
					 System.out.println("Valor R$"+df.format(total)+" "+tp.pagamentoAVista(tp.isaVista()));
				}
				else {
					System.out.println("Não tem essa opção");
					System.out.println("Qual tipo de pagamento desejas? \n1-Dinheiro\n1-ticket\n1-Debito\n1-Crédito\n1-À vista");
					
				}
				System.out.println();
				break;
				}
				break;
			}
				System.out.println("Deseja fazer o cadastro no nosso mercado (1- Sim / 2- Não)");
				int cadastro = sc.nextInt();
				if(cadastro == 1) {
					MainCliente mc = new MainCliente();
					mc.mainCliente();
					
				}
				System.out.println();
				
				break;
			}
			
			if(ind == 2) {
				
					MainVendedor mv = new MainVendedor();
					mv.mainVendedor();
					break;
				
			}
			
			if(ind == 3) {
			
				MainGerente mg = new MainGerente();
				mg.mainGerente();
				break;
						
			}
			
			if(ind == 4) {
				
				MainEmpresario me = new MainEmpresario();
				me.mainEmpresario();
				break;
			}
			
			if(ind >= 5) {
				
				System.out.println("N existe, escolha as opções corretas");
				System.out.println(" 1-Fazer compras(Cliente)");
				System.out.println(" 2-Area de estoque(gestão dos produtos)");
				System.out.println(" 3-Area gerencial(gestão dos vendedores)");
				System.out.println(" 4-Area empresarial(gestão da gerencia)");
				System.out.println(" 0-Sair");
				
				ind = sc.nextInt();
			}
		}
		System.out.println();
		System.out.println("Obrigado pela sua presença");
		System.out.println("Volte sempre");
		

	}

}
