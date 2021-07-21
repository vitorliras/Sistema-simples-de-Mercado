package Repositorio;

import java.util.ArrayList;
import java.util.List;

import Modelo.Cliente;

public class RepCliente implements IRepCliente {
	
	private List<Cliente> ListClient = new ArrayList<>();
	
	private static RepCliente instancia;
	
	public static RepCliente getInstancia() {
        if (instancia == null) {
            instancia = new RepCliente();
        }
        return instancia;
    }

	@Override
	public void inserirCliente(Cliente cliente) {
		ListClient.add(cliente);
	}

	@Override
	public void removerCliente(int id_Cliente) {
		for(int i = 0; i < ListClient.size(); i++) {
			if(ListClient.get(i) != null && ListClient.get(i).getId_cliente() == id_Cliente) {
				ListClient.remove(i);
			}
		}
	}



	@Override
	public void alterarCliente(int id_cliente, Cliente novoCliente) {
		for(int i = 0; i < ListClient.size(); i++) {
			if(ListClient.get(i) != null && ListClient.get(i).getId_cliente() == id_cliente) {
				ListClient.remove(i);
				ListClient.add(novoCliente);
            }
		
        }
	}

	@Override
	public String MostrarCliente(int id_cliente) {
		for(Cliente c: ListClient) {
			if(c != null && c.getId_cliente() == id_cliente) {
				return "Nome: "+ c.getNome() +
				   "\nCPF: "+ c.getCpf()+
				   "\nRG: "+c.getRG()+
				   "\nIdade: "+c.getIdade()+
				   "\nCartão: "+ c.getNomeCartao()+
				   "\nId Cliente: "+ c.getId_cliente();
		}
			}
		
		return null;
		
	}
	
	
	
}
