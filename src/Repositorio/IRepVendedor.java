package Repositorio;

import Modelo.Vendedor;

public interface IRepVendedor {
	
	String mostrarStatusVendedor(int matricula);

	void inserirVendedor(Vendedor vendedor);
	
	void removerVendedor(int matricula);
	
	boolean existeVendedor(int matricula);
	
	void aumentarSalarioVendedor(int matricula);
	
	void aumentarSalarioVendedor(int matricula, int quantidade);
	
	void TrocarVendedor(int matricula,Vendedor v);
	
	Vendedor pesquisarVendedor(int matricula);
	
	
	
}
