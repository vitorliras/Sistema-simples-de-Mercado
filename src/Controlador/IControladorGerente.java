package Controlador;

import Modelo.Blocos;
import Modelo.Vendedor;

public interface IControladorGerente {

	void inserirVendendor(Vendedor vendedor);
	
	void removerVendendor(int matricula);
	
	boolean existeVendendor(int matricula);
	
	void aumentarSalarioVendendor(int matricula);
	
	void aumentarSalarioVendendor(int matricula, int quantidade);
	
	void TrocarVendendor(int matricula,Vendedor v);
	
	String mostrarStatusVendedor(int matricula);
	
	Vendedor pesquisarVendedor(int matricula);
	
	void AlterarSetor(int numeroSetor, Blocos novoSetor);
	
}
