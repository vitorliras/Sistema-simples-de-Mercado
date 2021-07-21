package Controlador;

import Modelo.Blocos;
import Modelo.Cliente;
import Modelo.Gerente;
import Modelo.ProdutosEstoque;
import Modelo.Vendedor;
import Repositorio.IRepCliente;
import Repositorio.IRepSetorMercado;
import Repositorio.RepCliente;
import Repositorio.RepSetorMercado;
import Repositorio.RepVendedor;

public class Fachada implements IcontroladorVendedor, IControladorGerente, IControladorEmpresario, Ifachada {
		
		private static IRepSetorMercado repSetor;
		private static IRepCliente repCliente;
	    private final IControladorEmpresario controladorEmpresario;
	    private final IControladorGerente controladorGerente;
	    private final IcontroladorVendedor controladorVendedor;
	    
	    private static Fachada instancia;
	   
	    private Fachada() {
	    	controladorEmpresario = ControladorEmpresario.getInstancia();
	    	controladorGerente = ControladorGerente.getInstancia();
	    	controladorVendedor = ControladorVendedor.getInstancia();
	    	repSetor = RepSetorMercado.getInstancia();
	    	repCliente = RepCliente.getInstancia();
	    }
	    
	    public static Fachada getInstancia() {
	        if (instancia == null) {
	            instancia = new Fachada();
	        }
	        return instancia;
	    }

		@Override
		public void inserirGerente(Gerente gerente) {
			controladorEmpresario.inserirGerente(gerente);
			
		}

		@Override
		public void removerGerente(int matricula) {
			controladorEmpresario.removerGerente(matricula);
			
		}

		@Override
		public void aumentarSalarioGerente(int matricula) {
			controladorEmpresario.aumentarSalarioGerente(matricula);
			
		}

		@Override
		public boolean existeGerente(int matricula) {
			return controladorEmpresario.existeGerente(matricula);
		}

		@Override
		public void TrocarGerente(int matricula, Gerente g) {
			controladorEmpresario.TrocarGerente(matricula, g);
			
		}

		@Override
		public Gerente pesquisarGerente(int matricula) {
			return controladorEmpresario.pesquisarGerente(matricula);
		}

		@Override
		public void aumentarSalarioGerente(int matricula, int quantidadeSomaSalario) {
			controladorEmpresario.aumentarSalarioGerente(matricula, quantidadeSomaSalario);
		}

		@Override
		public String mostrarStatusGerente(int matricula) {
			return controladorEmpresario.mostrarStatusGerente(matricula);
		}

		@Override
		public void inserirVendendor(Vendedor vendedor) {
			controladorGerente.inserirVendendor(vendedor);
			
		}

		@Override
		public void removerVendendor(int matricula) {
			controladorGerente.removerVendendor(matricula);
			
		}

		@Override
		public boolean existeVendendor(int matricula) {
			return controladorGerente.existeVendendor(matricula);
		}

		@Override
		public void aumentarSalarioVendendor(int matricula) {
			controladorGerente.aumentarSalarioVendendor(matricula);
			
		}

		@Override
		public void aumentarSalarioVendendor(int matricula, int quantidade) {
			controladorGerente.aumentarSalarioVendendor(matricula, quantidade);
		}

		@Override
		public void TrocarVendendor(int matricula, Vendedor v) {
			controladorGerente.TrocarVendendor(matricula, v);
		}

		@Override
		public String mostrarStatusVendedor(int matricula) {
			return controladorGerente.mostrarStatusVendedor(matricula);
		}

		@Override
		public Vendedor pesquisarVendedor(int matricula) {
			return controladorGerente.pesquisarVendedor(matricula);
		}

		@Override
		public void InserirProduto(ProdutosEstoque produtosEstoque) {
			controladorVendedor.InserirProduto(produtosEstoque);
		}

		@Override
		public void RemoverProduto(int codigo) {
			controladorVendedor.RemoverProduto(codigo);
		}

		@Override
		public void AlterarProduto(int codigo, ProdutosEstoque novoProduto) {
			controladorVendedor.AlterarProduto(codigo, novoProduto);
		}

		@Override
		public void AcrescentarProduto(int codigo, int quantidade) {
			controladorVendedor.AcrescentarProduto(codigo, quantidade);
		}

		@Override
		public String mostrarStatusProdutos(int codigo) {
			return controladorVendedor.mostrarStatusProdutos(codigo);
		}

		@Override
		public ProdutosEstoque pesquisarProdutos(int codigo) {
			return controladorVendedor.pesquisarProdutos(codigo);
		}

		@Override
		public void InserirSetor(Blocos setor) {
			controladorEmpresario.InserirSetor(setor);
		}

		@Override
		public void RemoverSetor(int numeroSetor) {
			controladorEmpresario.RemoverSetor(numeroSetor);
		}

		@Override
		public void AlterarSetor(int numeroSetor, Blocos novoSetor) {
			controladorGerente.AlterarSetor(numeroSetor, novoSetor);
		}

		@Override
		public boolean existeSetor(int numeroSetor) {
			return repSetor.existeSetor(numeroSetor);
		}

		@Override
		public Blocos PesquisarSetor(int numeroSetor) {
			return repSetor.PesquisarSetor(numeroSetor);
		}

		@Override
		public String mostrarStatusSetor(int numeroSetor) {
			return repSetor.mostrarStatusSetor(numeroSetor);
		}

		@Override
		public void inserirCliente(Cliente cliente) {
			repCliente.inserirCliente(cliente);
		}

		@Override
		public void removerCliente(int id_Cliente) {	
			repCliente.removerCliente(id_Cliente);
		}

		@Override
		public String mostrarCliente(int id_cliente) {
			return repCliente.MostrarCliente(id_cliente);
		}


		@Override
		public void alterarCliente(int id_cliente, Cliente novoCliente) {
			repCliente.alterarCliente(id_cliente, novoCliente);
			
		}

		@Override
		public void retirarProduto(int codigo, int quantidade) {
			controladorVendedor.retirarProduto(codigo, quantidade);
			
		} 
		
}
