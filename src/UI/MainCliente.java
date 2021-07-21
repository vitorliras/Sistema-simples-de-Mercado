package UI;

import java.util.Random;
import java.util.Scanner;

import Controlador.Fachada;
import Modelo.Cliente;

public class MainCliente {
	static Scanner sc = new Scanner(System.in);

	public void mainCliente() {
		int opcao;
		InserirCliente();

		do {
			System.out.println("Para fazer outro seu cadastro, digite 1");
			System.out.println("Para remover seu cadastro, digite 2");
			System.out.println("Para mostrar seu cadastro, digite 3");
			System.out.println("Para alterar seu cadastro, digite 4");
			System.out.println("Para sair, digite 0");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				InserirCliente();
				break;
			case 2:
				RemoverCliente();
				break;
			case 3:
				PesquisarCliente();
				break;
			case 4:
				AlterarCadastro();
				break;
			case 0:
				break;
			default:
				System.out.println("Digite uma opÃ§Ã£o valida.");
				break;
			}

		} while (opcao != 0);

	}
	
	Cliente InserirCliente() {
		Cliente c = new Cliente();
		
		System.out.println("Diga-me o seu cpf, por favor ");
		c.setCpf(sc.next());
		
		System.out.println("Diga-me o seu RG, por favor ");
		c.setRG(sc.nextInt());
		
		System.out.println("Seu nome: ");
		c.setNome(sc.next());
		
		System.out.println("Sua a idade: ");
		c.setIdade(sc.nextInt());
		
		System.out.println("Qual cartão usa? ");
		c.setNomeCartao(sc.next());
		
		Random random = new Random(); 
		int id = random.nextInt(10000);
		c.setId_cliente(id);
		System.out.println("Seu id vai é " + id);
		
		Fachada.getInstancia().inserirCliente(c);
		System.out.println();
		System.out.println("Cliente inserido com sucesso.");
		System.out.println();

		return c;
	}

	private void RemoverCliente() {

		System.out.println("Você tem certeza que quer remover seu cadastro? (1-SIm/2-Não)");
		int resp = sc.nextInt();
		if(resp == 1) {
			System.out.println("OK, então informe seu ID, por gentileza: ");
			int id = sc.nextInt();
			Fachada.getInstancia().removerCliente(id);
			System.out.println();
			System.out.println("Seu cadastro foi removido com sucesso.");
			System.out.println();
		}else {
			System.out.println("OK, seu cadastro pernanmece no sistema ");
			System.out.println();
		}

	}

	private void PesquisarCliente() {

		System.out.println("Para ver seu cadastro, informe seu ID, por gentileza");
		int id = sc.nextInt();
		System.out.println(Fachada.getInstancia().mostrarCliente(id));
		System.out.println();

	}
	
	private void AlterarCadastro() {
		System.out.println("Deseja altera alguma informação? (1- Sim/ 2- Não)");
		int resp = sc.nextInt();
		if(resp == 1) {
			Cliente c = new Cliente();
			System.out.println("Informe seu ID: ");
			int id = sc.nextInt();
			System.out.println();
			System.out.println("Informe as suas novas informações");
			
			System.out.println("Digite o nome (Pode ser igual ou pode alterar)");
			c.setNome(sc.next());
			
			System.out.println("Diga-me o seu cpf, por favor (Pode ser igual ou pode alterar) ");
			c.setCpf(sc.next());
			
			System.out.println("Diga-me o seu RG, por favor (Pode ser igual ou pode alterar) ");
			c.setRG(sc.nextInt());
			
			System.out.println("Sua a idade: (Pode ser igual ou pode alterar)");
			c.setIdade(sc.nextInt());
			
			System.out.println("seu cartão: (Pode ser igual ou pode alterar) ");
			c.setNomeCartao(sc.next());
			
			c.setId_cliente(id);
			
			Fachada.getInstancia().alterarCliente(id, c);
			
			System.out.println("Cliente alterado com sucesso");

			
		}
	}
}
