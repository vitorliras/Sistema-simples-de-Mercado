package Controlador;

import Modelo.Blocos;
import Modelo.Gerente;
import Repositorio.IRepGerente;
import Repositorio.IRepSetorMercado;
import Repositorio.RepGerente;
import Repositorio.RepSetorMercado;

public class ControladorEmpresario implements IControladorEmpresario {
	
	private static IRepGerente repGerente;
	private static IRepSetorMercado repSetor;
	
	private static ControladorEmpresario instancia;

    private ControladorEmpresario() {
    	repGerente = RepGerente.getInstancia();
    	repSetor = RepSetorMercado.getInstancia();
    }
    
   
    public static ControladorEmpresario getInstancia() {
        if (instancia == null) {
            instancia = new ControladorEmpresario();
        }
        return instancia;
    }

	@Override
	public void inserirGerente(Gerente gerente) {
		repGerente.inserirGerente(gerente);
		
		
	}

	@Override
	public void removerGerente(int matricula) {
		repGerente.removerGerente(matricula);
		
	}

	@Override
	public void aumentarSalarioGerente(int matricula) {
		repGerente.aumentarSalarioGerente(matricula);
		
	}

	@Override
	public boolean existeGerente(int matricula) {
		return repGerente.existeGerente(matricula);
	}

	@Override
	public void TrocarGerente(int matricula, Gerente g) {
		repGerente.TrocarGerente(matricula, g);
		
	}

	@Override
	public Gerente pesquisarGerente(int matricula) {
		return repGerente.pesquisarGerente(matricula);
	}

	@Override
	public void aumentarSalarioGerente(int matricula, int quantidadeSomaSalario) {
		repGerente.aumentarSalarioGerente(matricula, quantidadeSomaSalario);
		
		
	}

	@Override
	public String mostrarStatusGerente(int matricula) {
		return repGerente.mostrarStatusGerente(matricula);
	}

	@Override
	public void InserirSetor(Blocos setor) {
		repSetor.InserirSetor(setor);
		
	}

	@Override
	public void RemoverSetor(int numeroSetor) {
		repSetor.RemoverSetor(numeroSetor);	
	}

}
