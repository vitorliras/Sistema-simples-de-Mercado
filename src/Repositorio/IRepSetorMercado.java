package Repositorio;

import Modelo.Blocos;

public interface IRepSetorMercado {

	void InserirSetor(Blocos setor);
	
	void RemoverSetor(int numeroSetor);
	
	boolean existeSetor(int numeroSetor);
	
	void AlterarSetor(int numeroSetor, Blocos novoSetor);
	
	Blocos PesquisarSetor(int numeroSetor);
	
	String mostrarStatusSetor(int numeroSetor);
	
}
