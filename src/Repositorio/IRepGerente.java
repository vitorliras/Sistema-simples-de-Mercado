package Repositorio;

import Modelo.Gerente;
  
    
public interface IRepGerente {

	void inserirGerente(Gerente gerente);
	
	void removerGerente(int matricula);
	
	void aumentarSalarioGerente(int matricula);
	
	void aumentarSalarioGerente(int matricula, int quantidadeSomaSalario);
	
	boolean existeGerente(int matricula);
			
	void TrocarGerente(int matricula,Gerente g);
	
	Gerente pesquisarGerente(int matricula);
	
	String mostrarStatusGerente(int matricula);
	
}

    

