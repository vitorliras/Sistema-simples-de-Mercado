package Controlador;

import Modelo.Blocos;
import Modelo.Gerente;

public interface IControladorEmpresario {
	
void inserirGerente(Gerente gerente);
	
	void removerGerente(int matricula);
	
	void aumentarSalarioGerente(int matricula);
	
	boolean existeGerente(int matricula);
			
	void TrocarGerente(int matricula,Gerente g);
	
	Gerente pesquisarGerente(int matricula);
	
	void aumentarSalarioGerente(int matricula, int quantidadeSomaSalario);
	
	String mostrarStatusGerente(int matricula);
	
	void InserirSetor(Blocos setor);
	
	void RemoverSetor(int numeroSetor);
	
}
