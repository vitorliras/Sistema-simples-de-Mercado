package Controlador;

import Modelo.Blocos;
import Modelo.Cliente;

public interface Ifachada {
	
	boolean existeSetor(int numeroSetor);
	
	Blocos PesquisarSetor(int numeroSetor);
	
	String mostrarStatusSetor(int numeroSetor);
	
	void inserirCliente(Cliente cliente);
	
	void removerCliente(int id_Cliente);
	
	String mostrarCliente(int id_cliente);
	
	

	void alterarCliente(int id_cliente, Cliente novoCliente);
	
}
