package UI;

import java.util.Random;
import java.util.Scanner;

import Constants.Constante;
import Controlador.Fachada;
import Modelo.Gerente;

public class MainEmpresario {
	static Scanner sc = new Scanner(System.in);

	public void mainEmpresario() {
		
		int opcao;
		

		do {
			System.out.println("Para inserir um novo gerente, digite 1");
			System.out.println("Para remover um gerente, digite 2");
			System.out.println("Para alterar um gerente, digite 3");
			System.out.println("Para mostrar um gerente, digite 4");
			System.out.println("Para aumentar salario do gerente, digite 5");
			System.out.println("Para sair, digite 0");
			opcao = sc.nextInt();

			switch (opcao) {

			case 1:
				inserirGerente();
				break;
			case 2:
				removerGerente();
				break;
			case 3:
				trocarGerente();
				break;
				
			case 4:
				mostrarGerente();
				break;
			case 5:
				aumentarSalarioGerente();
				break;
			case 0:
				break;
			default:
				System.out.println("Digite uma opção valida.");
				break;
			}

		} while (opcao != 0);

	}

	Gerente inserirGerente() {
		Gerente g = new Gerente();
		
		System.out.println("Informe o nome do Gerente ");
		g.setNome(sc.next());

		
		System.out.println("Informe o Carga horaria do Gerente ");
		g.setCarga(sc.nextInt());
		
		g.setSalario(Constante.salarioGerente);
		
		Random random = new Random(); 
		int matricula = random.nextInt(10000);
		g.setMatricula(matricula);
		System.out.println("A matricula do Gerente vai ser " + matricula);
		
		Fachada.getInstancia().inserirGerente(g);
		System.out.println();
		System.out.println("Gerente inserido com sucesso.");
		System.out.println();

		return g;
	}
		
	private void trocarGerente() {

		System.out.println("Deseja altera alguma informação? (1- Sim/ 2- Não)");
		int resp = sc.nextInt();
		if(resp == 1) {
			Gerente g = new Gerente();
			System.out.println("Informe a matricula: ");
			int mat = sc.nextInt();
			System.out.println();
			System.out.println("Informe as novas informações");
			
			
			
			System.out.println("Informe o nome do Gerente ");
			g.setNome(sc.next());

			
			System.out.println("Informe a Carga horaria do Gerente ");
			g.setCarga(sc.nextInt());
			
			g.setSalario(Constante.salarioGerente);
			
			g.setMatricula(mat);
			
			Fachada.getInstancia().TrocarGerente(mat, g);
			
			System.out.println("Gerente alterado com sucesso");
		}

	}

	private void removerGerente() {

		System.out.println("Você tem certeza que quer remover o Gerente? (1-SIm/2-Não)");
		int resp = sc.nextInt();
		if(resp == 1) {
			System.out.println(" informe a matricula do Gerente, por gentileza: ");
			int matricula = sc.nextInt();
			Fachada.getInstancia().removerGerente(matricula);
			System.out.println();
			System.out.println("O gerente foi removido com sucesso.");
			System.out.println();
		}else {
			System.out.println(" O cadastro do Gerente permanece no sistema ");
			System.out.println();
		}

	}

	private void mostrarGerente() {
		
		System.out.println("Digite o numero da matricula para pesquisar o gerente: ");
		int mat = sc.nextInt();
		System.out.println(Fachada.getInstancia().mostrarStatusGerente(mat));
		System.out.println();
		
	}
	
	private void aumentarSalarioGerente(){
		System.out.println("1- aumento por quantidade / 2- aumento por porcentagem / qualquer outro numero se não for aumentar");
		int resp = sc.nextInt();
		if(resp == 1) {
			System.out.println("digite o numero da matricula do gerente que vai ter o aumento: ");
			int mat = sc.nextInt();
			System.out.println("Digite a quantidade do aumento");
			int quant = sc.nextInt();
			Fachada.getInstancia().aumentarSalarioGerente(mat, quant);
		}
		else if(resp ==2) {
			System.out.println("digite o numero da matricula do gerente que vai ter o aumento: ");
			int mat = sc.nextInt();
			Fachada.getInstancia().aumentarSalarioGerente(mat);
			System.out.println("salario aumentado em 8%");
		}else {
			System.out.println("Nenhum aumento de salário ");
		}
		
		
		
	}

	
	
	
}
