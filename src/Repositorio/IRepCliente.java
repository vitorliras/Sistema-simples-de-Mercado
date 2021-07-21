package Repositorio;

import Modelo.Cliente;

public interface IRepCliente {
	
	void inserirCliente(Cliente cliente);
	
	void removerCliente(int id_cliente);
	
	String MostrarCliente(int id_cliente);
	
	void alterarCliente(int id_cliente, Cliente novoCliente);
	
}
