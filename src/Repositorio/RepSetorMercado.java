package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Modelo.Blocos;

public class RepSetorMercado implements IRepSetorMercado {
	
	private List<Blocos> ListSetores = new ArrayList<>();
    private static RepSetorMercado instancia;
	
	public static RepSetorMercado getInstancia() {
        if (instancia == null) {
            instancia = new RepSetorMercado();
        }
        return instancia;
    }
	
	@Override
	public void InserirSetor(Blocos setor) {
		ListSetores.add(setor);
	}

	@Override
	public void RemoverSetor(int numeroSetor) {
		for(int i = 0; i < ListSetores.size(); i++) {
			if(ListSetores.get(i) != null && ListSetores.get(i).getNumeroSetor() == numeroSetor) {
				ListSetores.remove(i);
			}
		}
		
	}

	@Override
	public boolean existeSetor(int numeroSetor) {
		for(Blocos b : ListSetores) {
			if(b != null && b.getNumeroSetor() == numeroSetor) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void AlterarSetor(int numeroSetor, Blocos novoSetor) {
		for (int i = 0; i < ListSetores.size(); i++) {
            if (ListSetores.get(i) != null && ListSetores.get(i).getNumeroSetor() == numeroSetor) {
            	ListSetores.remove(i);
            	ListSetores.add(novoSetor);
            }
        }
	}

	@Override
	public Blocos PesquisarSetor(int numeroSetor) {
		for(Blocos b : ListSetores) {
			if(b != null && b.getNumeroSetor() == numeroSetor) {
				return b;
			}
		}
		return null;
	}

	@Override
	public String mostrarStatusSetor(int numeroSetor) {
		for(Blocos b: ListSetores) {
			if(b != null && b.getNumeroSetor() == numeroSetor) {
			return "Setor "+b.getNumeroSetor()+
					": "+b.getNome() + " no bloco "+b.getBloco();
			}
		}
		return"Não existe esse setor";
	}

}
