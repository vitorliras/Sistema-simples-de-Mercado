package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Modelo.Gerente;


public class RepGerente implements IRepGerente {
        private List<Gerente> ListGerente = new ArrayList<>();
        private static RepGerente instancia;
    	
    	public static RepGerente getInstancia() {
            if (instancia == null) {
                instancia = new RepGerente();
            }
            
            return instancia;
        }

        
        
        public void inserirGerente(Gerente gerente) {
        	ListGerente.add(gerente);
        }
        
        public void removerGerente(int matricula) {
			for(int i = 0; i < ListGerente.size(); i++) {
				if(ListGerente.get(i) != null && ListGerente.get(i).getMatricula() == matricula) {
					ListGerente.remove(i);
				}
	                    
			}
        }
        
        public boolean existeGerente(int matricula) {
		for(Gerente g1 : ListGerente) {
			if(g1 != null && g1.getMatricula() == matricula) {
				System.out.println("Existe");
				return true;
				
			}
		}
		
		return false;
		
	}
        
        public void TrocarGerente(int matricula, Gerente g) {
	        for (int i = 0; i < ListGerente.size(); i++) {
	            if (ListGerente.get(i) != null && ListGerente.get(i).getMatricula() == matricula) {
	            	ListGerente.remove(i);
	            	ListGerente.add(g);
	            }
	        }
        }
        @Override
		public void aumentarSalarioGerente(int matricula) {
        	for (Gerente g : ListGerente) {
                if (g != null && g.getMatricula() == matricula) {
                    g.setSalario(g.getSalario() + (g.getSalario() * 0.08));
                }
            }
		}
        
        @Override
		public void aumentarSalarioGerente(int matricula, int quantidadeSomaSalario) {
        	for(Gerente g : ListGerente) {
        		if(g != null && g.getMatricula() == matricula) {
        			g.setSalario(g.getSalario() + quantidadeSomaSalario );
        		}
        	}
			
        }
		
		@Override
		public String mostrarStatusGerente(int matricula) {
			for(Gerente g : ListGerente) {
				if(g != null && g.getMatricula() == matricula) {
					
					return "Nome: "+ g.getNome() +
						   "\nSalario: "+ g.getSalario()+
						   "\nCarga Horaria: "+g.getCarga()+
						   "\nMatricula: "+ g.getMatricula();
				}
					
			}
			
			return "";
		}

		@Override
		public Gerente pesquisarGerente(int matricula) {
			for(Gerente g : ListGerente) {
				if(g != null && g.getMatricula() == matricula) {
					return g;
				}
			}
			return null;
		}
		  
}
