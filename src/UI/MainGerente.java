package UI;

import java.util.Random;
import java.util.Scanner;

import Constants.Constante;
import Controlador.Fachada;
import Modelo.TipoPDV;
import Modelo.Vendedor;

public class MainGerente {
	
	
	static Scanner sc = new Scanner(System.in);

	public void mainGerente() {
		int opcao;
		
		do {
			System.out.println("Para inserir Vendedor, digite 1");
			System.out.println("Para remover Vendedor, digite 2");
			System.out.println("Para mostrar Vendedor, digite 3");
			System.out.println("Para alterar o Vendedor, digite 4");
			System.out.println("Para aumentar o salrio do Vendedor, digite 5");
			System.out.println("Para sair, digite 0");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				InserirVendedor();
				break;
			case 2:
				RemoverVendedor();
				break;
			case 3:
				PesquisarVendedor();
				break;
			case 4:
				alterarVendedor();
			case 5:
                AumentarSalarioVendedor();
                break;
			case 0:
				break;
			default:
				System.out.println("Digite uma opção valida.");
				break;
			}

		} while (opcao != 0);

	}
	private Vendedor InserirVendedor() {
		Vendedor v = new Vendedor();
		TipoPDV pdv = new TipoPDV();
		
		System.out.println("Digite o nome do Vendedor: ");
		v.setNome(sc.next());
		
		System.out.println("Carga horaria");
		v.setCarga(sc.nextInt());
		
		v.setSalario(Constante.salarioVendedor);
		
		System.out.println("Tipo de ponto de venda do vendedor( preferencial, gestante, +10 compras, -10 compras etc...)");
		String tipo = sc.next();
		pdv.setTipoPDV(tipo);
	
		
		System.out.println("Numero da caixa");
		int n = sc.nextInt();
		pdv.setNumeroCaixa(n);
		
		v.setCaixa(pdv);
		
		System.out.println("");
		
		Random random = new Random(); 
		int mat = random.nextInt(10000);
		v.setMatricula(mat);
		System.out.println("matricula: " + mat);
		
		Fachada.getInstancia().inserirVendendor(v);
		System.out.println();
		System.out.println("Vendedor inserido com sucesso.");
		System.out.println();

		return v;
	}
		
	private void RemoverVendedor() {
            System.out.println("VocÃª tem certeza que gostaria de remover o Vendedor? (1-Sim/2-NÃ£o)");
		int resp = sc.nextInt();
		if(resp == 1) {
			System.out.println("OK. Informe a matricula do Vendedor: ");
			int id = sc.nextInt();
			Fachada.getInstancia().removerCliente(id);
			System.out.println();
			System.out.println("O Vendedor foi removido com sucesso.");
			System.out.println();
		}else {
			System.out.println("Vendedor permanece cadastrado. ");
			System.out.println();
		}
	
	}
	
	private void PesquisarVendedor() {
		
		System.out.println("Digite a matricula do vendedor: ");
		int mat = sc.nextInt();
		System.out.println(Fachada.getInstancia().mostrarStatusVendedor(mat));
		System.out.println();
	}
	
	private void alterarVendedor() {
		System.out.println("Deseja altera alguma informação? (1- Sim/ 2- Não)");
		int resp = sc.nextInt();
		if(resp == 1) {
			Vendedor v = new Vendedor();
			TipoPDV pdv = new TipoPDV();
			System.out.println("Informe a matricula: ");
			int mat = sc.nextInt();
			System.out.println();
			System.out.println("Informe as novas informações");
			
			System.out.println("Informe o nome do Vendedor ");
			v.setNome(sc.next());

			
			System.out.println("Informe a Carga horaria do Vendedor ");
			v.setCarga(sc.nextInt());
			
			System.out.println("Tipo de ponto de venda do vendedor( preferencial, gestante, +10 compras, -10 compras etc...)");
			String tipo = sc.next();
			pdv.setTipoPDV(tipo);
		
			
			System.out.println("Numero da caixa");
			int n = sc.nextInt();
			pdv.setNumeroCaixa(n);
			
			v.setCaixa(pdv);
			
			v.setSalario(Constante.salarioVendedor);
			
			v.setMatricula(mat);
			
			Fachada.getInstancia().TrocarVendendor(mat, v);
			
			System.out.println("Vendedor alterado com sucesso");
		}
	}
	private void AumentarSalarioVendedor() {
                                               
        System.out.println("1- aumento por quantidade / 2- aumento por porcentagem / qualquer outro numero se não for aumentar");
		int resp = sc.nextInt();
		if(resp == 1) {
			System.out.println("digite o numero da matricula do vendedor que vai ter o aumento: ");
			int mat = sc.nextInt();
			System.out.println("Digite a quantidade do aumento");
			int quant = sc.nextInt();
			Fachada.getInstancia().aumentarSalarioVendendor(mat, quant);;
		}
		else if(resp ==2) {
			System.out.println("digite o numero da matricula do Vendedor que vai ter o aumento: ");
			int mat = sc.nextInt();
			Fachada.getInstancia().aumentarSalarioVendendor(mat);
			System.out.println("salario aumentado em 8%");
		}else {
			System.out.println("Nenhum aumento de salário ");
		} 

	}
		
}
	
	

	        
	        
	        
	    
	   
	                    
	            
	            
	            

	    

	    

	    
	    

	    

	    

	    

	    

	    

	    

	    



