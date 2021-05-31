package servicio;



import java.util.List;

import modelo.Cliente;

public class ClienteServicio_1 extends Cliente {
	private static List<Cliente> listaCliente;
	
	
	

	public ClienteServicio_1() {
		super();
	}

	public ClienteServicio_1(List<Cliente> listaCliente) {
		super();
		this.setListaCliente(listaCliente);
	}

	public List<Cliente> getListaCliente() {
		return listaCliente;
	}

	public void setListaCliente(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}
/*
 * 	
 */
/* TEST */
/*
 * 
 */
	public void ClienteServicioT(List<Cliente> listaCliente) {
		this.listaCliente = listaCliente;
	}

	public List<Cliente> getClienteServicio() {
		return listaCliente;
	}

	public void listarClientes(List<Cliente> lista) {
		for (Cliente cliente : lista) {
			System.out.println(cliente.toString());
		}

	}

	public static String agregarCliente(Cliente cliente) {
//		listaCliente.add(cliente);
		return "Agregado";
	}

	public int editarCliente(Cliente cliente) {
		return 0;
	}

	@Override
	public String toString() {
		return "ClienteServicio [clienteServicio=" + listaCliente + "]";
	}

/*Fin TeST*/
	
	
	
	

}
