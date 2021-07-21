package Controlador;

import Modelo.Blocos;
import Modelo.Vendedor;
import Repositorio.IRepSetorMercado;
import Repositorio.IRepVendedor;
import Repositorio.RepVendedor;

public class ControladorGerente implements IControladorGerente{
	
	private static IRepVendedor repVendedor;
	private static IRepSetorMercado repSetor;
	
	private static ControladorGerente instancia;

    private ControladorGerente() {
        repVendedor = RepVendedor.getInstancia();
    }

    public static ControladorGerente getInstancia() {
        if (instancia == null) {
            instancia = new ControladorGerente();
        }
        return instancia;
    }

	@Override
	public void inserirVendendor(Vendedor vendedor) {
		repVendedor.inserirVendedor(vendedor);
		
	}

	@Override
	public void removerVendendor(int matricula) {
		repVendedor.removerVendedor(matricula);
	}

	@Override
	public boolean existeVendendor(int matricula) {

        return repVendedor.existeVendedor(matricula);
	}

	@Override
	public void aumentarSalarioVendendor(int matricula) {
		repVendedor.aumentarSalarioVendedor(matricula);
	}

	@Override
	public void TrocarVendendor(int matricula, Vendedor v) {
		repVendedor.TrocarVendedor(matricula, v);
	}

	@Override
	public String mostrarStatusVendedor(int matricula) {
		return repVendedor.mostrarStatusVendedor(matricula);
	}

	@Override
	public void aumentarSalarioVendendor(int matricula, int quantidade) {
		repVendedor.aumentarSalarioVendedor(matricula, quantidade);
		
	}

	@Override
	public Vendedor pesquisarVendedor(int matricula) {
		return repVendedor.pesquisarVendedor(matricula);
	}

	@Override
	public void AlterarSetor(int numeroSetor, Blocos novoSetor) {
		repSetor.AlterarSetor(numeroSetor, novoSetor);
		
	}
	
	
}
