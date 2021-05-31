package servicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import modelo.*;
import utilidades.Utilidad;

public class ClienteServicio {

//	public static List<Cliente> listaClientes;
	public static List<Cliente> listaClientes = new ArrayList<Cliente>();

	public ClienteServicio(List<Cliente> listaClientes) {
		super();
		this.listaClientes = listaClientes;
	}

	public ClienteServicio() {
		// TODO Auto-generated constructor stub
	}

//	public void listarClientes() {
//		if (listaClientes != null) {
//		}
//	}

	public void retornolistarClientes(List<Cliente> listaClientes) {
		if (listaClientes.size() != 0) {

			for (Cliente cliente : listaClientes) {
				System.out.println();
				System.out.println("----------Datos del Cliente:----------\n");
				System.out.println("Rut del Cliente: " + cliente.getRutCliente());
				System.out.println("Nombre del Cliente: " + cliente.getNombreCliente());
				System.out.println("Apellido del Cliente: " + cliente.getApellidoCliente());
				System.out.println("Antiguedad del Cliente: " + cliente.getAntiguedad());
				System.out.println("Estado del Cliente: " + cliente.getCategoria());
				System.out.println("\n---------------------------------------");
				// Cliente.get()); //CategoriaEnum Categoria;

			}
		} else {
			System.out.println("No hay elementos en la lista de clientes.");
			System.out.println("Volviendo al Menu principal...");

		}
		// llamar utilidad
		// Utilidades.utilidad();

	}

	public void agregarCliente(Cliente cliente) {
		listaClientes.add(cliente);
		System.out.println("Cliente agregado....");
		Utilidad.pausa();

	}

	public void editarCliente(Cliente cliente) {
		int opcion = 0;
		Scanner recibe = new Scanner(System.in);

		System.out.println("----Actualizando datos del Cliente-----");
		System.out.println("1.- El RUT del Cliente es: " + cliente.getRutCliente());
		System.out.println("2.- El Nombre del Cliente es: " + cliente.getNombreCliente());
		System.out.println("3.- El Apellido del Cliente es: " + cliente.getApellidoCliente());
		System.out.println("4.- Los anios como Cliente son: " + cliente.getAntiguedad());
		System.out.println("5.- Cancelar y volver al menu principal.\n");
		System.out.println("Ingrese opcion a editar de los datos del cliente: ");
		try {
			opcion = Integer.parseInt(recibe.nextLine());
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		switch (opcion) {
		case 1:
			System.out.println("Ingrese nuevo rut:");
			cliente.setRutCliente(recibe.nextLine());
			System.out.println("Datos cambiados con exito, volviendo al menu principal.");
			break;
		case 2:
			System.out.println("Ingrese nuevo nombre: ");
			cliente.setNombreCliente(recibe.nextLine());
			System.out.println("Datos cambiados con exito, volviendo al menu principal.");
			break;

		case 3:
			System.out.println("Ingrese nuevo apellido: ");
			cliente.setApellidoCliente(recibe.nextLine());
			System.out.println("Datos cambiados con exito, volviendo al menu principal.");
			break;

		case 4:
			System.out.println("Ingrese nueva antiguedad del cliente: ");
			cliente.setAntiguedad(Integer.parseInt(recibe.nextLine()));
			System.out.println("Datos cambiados con exito, volviendo al menu principal.");
			break;
		case 5:
			System.out.println("Ha decidido cancelar la operacion.");
			System.out.println("Volviendo al menu principial...");
			Utilidad.pausa();
			break;
		default:
			System.out.println("Ha ingresado una opcion no valida.");
			Utilidad.pausa();
			editarCliente(cliente);
		}
	}

	public void editarEstadoCliente(Cliente cliente) {
		int opcion = 0;
		Scanner recibe = new Scanner(System.in);
		System.out.println("-----Actualizando estado del Cliente----");
		System.out.println("El estado actual: " + cliente.getCategoria());
		System.out.println("1.- Si desea cambiar el estado del Cliente a: "
				+ (cliente.getCategoria() == CategoriaEnum.ACTIVO ? "INACTIVO" : "ACTIVO"));
		System.out.println("2.- Si desea mantener el estado del Cliente : " + cliente.getCategoria());
		System.out.println("3.- Para cancelar la operacion y volver al Menu principal.\n");
		System.out.println("Ingrese opcion: ");
		try {
			opcion = Integer.parseInt(recibe.nextLine());
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		switch (opcion) {
		case 1:
			cliente.setCategoria(
					cliente.getCategoria() == CategoriaEnum.ACTIVO ? CategoriaEnum.INACTIVO : CategoriaEnum.ACTIVO);
			System.out.println("Se ha cambiado el estado del cliente a: " + cliente.getCategoria());
			break;
		case 2:
			System.out.println("Se ha mantenido el estado del cliente : " + cliente.getCategoria());
			break;
		case 3:
			System.out.println("Ha decidido cancelar la operacion.");
			System.out.println("Volviendo al Menu principal...");
			break;
		default:
			System.out.println("Ha ingresado una opcion no valida. ");
			Utilidad.pausa();
			editarEstadoCliente(cliente);
		}
	}

	public List<Cliente> getListaClientes() {
		return listaClientes;
	}

	public void setListaClientes(List<Cliente> listaClientes) {
		this.listaClientes = listaClientes;
	}

}
