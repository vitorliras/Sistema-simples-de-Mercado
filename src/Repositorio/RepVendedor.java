package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Modelo.Vendedor;

public class RepVendedor implements IRepVendedor {
	
	private List<Vendedor> ListVendedor = new ArrayList<>();
	
	private static RepVendedor instancia;
	
	public static RepVendedor getInstancia() {
        if (instancia == null) {
            instancia = new RepVendedor();
        }
        return instancia;
    }

	
	@Override
	public void inserirVendedor(Vendedor vendedor) {
		ListVendedor.add(vendedor);
	}

	@Override 
	public void removerVendedor(int matricula) {
		
		for(int i = 0; i < ListVendedor.size(); i++) {
			if(ListVendedor.get(i) != null && ListVendedor.get(i).getMatricula() == matricula) {
				ListVendedor.remove(i);
			}
		}
	}

	@Override
	public boolean existeVendedor(int matricula) {
		
		for(Vendedor v : ListVendedor) {
			if( v.getMatricula() == matricula) {
				System.out.println("Existe");
				return true;
			}
			
		}
		System.out.println("n existe");
		return false;
		
	}

	@Override
	public void aumentarSalarioVendedor(int matricula) {
		for (Vendedor v : ListVendedor) {
            if (v != null && v.getMatricula() == matricula) {
                v.setSalario(v.getSalario() + (v.getSalario() * 0.08));
            }
        }
	}

	@Override
	public void TrocarVendedor(int matricula, Vendedor novoVendedor) {
		
		for(int i = 0; i < ListVendedor.size(); i++) {
			if(ListVendedor.get(i) != null && ListVendedor.get(i).getMatricula() == matricula) {
				ListVendedor.remove(i);
            	ListVendedor.add(novoVendedor);
            }
        }
	}
	
	@Override
	public void aumentarSalarioVendedor(int matricula, int quantidade) {
		for (Vendedor v : ListVendedor) {
            if (v != null && v.getMatricula() == matricula) {
                v.setSalario(v.getSalario() + quantidade);
            }
        }
	}

	

	@Override
	public String mostrarStatusVendedor(int matricula) {
		
		for(Vendedor v : ListVendedor) {
			if(v != null && v.getMatricula() == matricula) {
				
				return "Nome: "+ v.getNome() +
					   "\nSalario: "+ v.getSalario()+
					   "\nCarga Horaria: "+v.getCarga()+
					   "\nMatricula: "+ v.getMatricula()+
					   "\nTipo da caixa: "+v.getCaixa().getTipoPDV()+
					   "\nNumero da caixa: "+v.getCaixa().getNumeroCaixa();
			}
				
		}
		
		return "";
	}


	@Override
	public Vendedor pesquisarVendedor(int matricula) {
		for(Vendedor v : ListVendedor) {
			if(v != null && v.getMatricula() == matricula) {
				return v;
			}
		}
		return null;
	}


	

	
	
	
}
