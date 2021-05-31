package vista;

import java.util.List;
import java.util.Scanner;

import modelo.*;
import servicio.*;
import utilidades.Utilidad;

public class Menu extends MenuVista {
	int cargar = 0;
	@Override
	public void listarCliente() {
		clienteServicio.retornolistarClientes(clienteServicio.getListaClientes());
	}

	@Override
	public void agregarCliente() {
		int validar;
		int val = 0;
		Cliente cliente = new Cliente();
		Scanner scanner = new Scanner(System.in);

		System.out.println("-------------Crear Cliente-------------\n");
		System.out.println("Ingresa RUT del Cliente:");
		String rut = scanner.nextLine();
		for (int i = 0; i < clienteServicio.getListaClientes().size(); i++) { // recorre ArrayList
			if (clienteServicio.getListaClientes().get(i).getRutCliente().equalsIgnoreCase(rut)) {
				val = 1;
			}
		}
		if (val != 1) {
			cliente.setRutCliente(rut);

			System.out.println("Ingresa Nombre del Cliente:");
			String nom = scanner.nextLine();
			cliente.setNombreCliente(nom);

			System.out.println("Ingresa Apellido del Cliente:");
			String ape = scanner.nextLine();
			cliente.setApellidoCliente(ape);
			do {
				validar = 1;
				try {
					System.out.println("Ingresa años como Cliente:");
					String anios = scanner.nextLine();
					cliente.setAntiguedad(Integer.parseInt(anios));

				} catch (Exception e) {
					System.out.println("Debes ingresar un numero"); // validacion numero
					validar = 0;

				}
			} while (validar != 1);
			cliente.setCategoria(CategoriaEnum.ACTIVO);

			clienteServicio.agregarCliente(cliente);
		} else {
			System.out.println("el rut ingresado ya existe");
			System.out.println("volviendo al menu principal");
		}

	}

//	@Override
//	public void editarCliente() {
//		// TODO Auto-generated method stub
//
//	}
	@Override
	public void editarCliente() {

		if (clienteServicio.getListaClientes().size() != 0) {
			System.out.println("-------------Editar Cliente-------------");
			System.out.println("Seleccione que desea hacer: ");
			System.out.println("1.- Cambiar el estado del Cliente");
			System.out.println("2.- Editar los datos ingresados del Cliente");
			System.out.println("3.- Cancelar operacion y volver al menu principal.\n");
			System.out.println("Ingrese opcion: ");
			String rut;
			int hallado = 0;
			int opcion = 0;
			try {
				opcion = Integer.parseInt(scanner.nextLine());
			} catch (Exception ex) {
				System.out.println("Error: " + ex.getMessage());
			}
			switch (opcion) {
			case 1:
				System.out.println("Ingrese RUT del Cliente a editar: ");
				rut = scanner.nextLine();
				for (Cliente cliente : clienteServicio.getListaClientes()) {
					if (cliente.getRutCliente().equalsIgnoreCase(rut)) {
						++hallado;
						clienteServicio.editarEstadoCliente(cliente);
					}

				}
				if (hallado == 0) {
					System.out.println("No se encontro el RUT ingresado.");
					utilidad.pausa();
					editarCliente();
				}
				break;
			case 2:
				System.out.println("Ingrese RUT del Cliente a editar: ");
				rut = scanner.nextLine();
				for (Cliente cliente : clienteServicio.getListaClientes()) {
					if (cliente.getRutCliente().equalsIgnoreCase(rut)) {
						++hallado;
						clienteServicio.editarCliente(cliente);
					}
				}
				if (hallado == 0) {
					System.out.println("No se encontro el RUT ingresado.");
					utilidad.pausa();
					editarCliente();
				}
				break;
			case 3:
				System.out.println("Ha decidido cancelar la operacion.");
				System.out.println("Volviendo al Menu principal...");
				break;
			default:
				System.out.println("Ha ingresado una opcion no valida.");
				utilidad.pausa();
				editarCliente();
			}
		} else {
			System.out.println("La lista de clientes no contiene elementos para editar.");
			System.out.println("Volviendo al menu principal...");
		}
	}

	@Override
	public void importarDatos() {
		if (cargar == 1) {
			System.out.println("el archivo csv ya ha sido cargado");
			utilidad.pausa();
		} else {
			System.out.println("ingrese la ruta donde se encuentra el archivo DBClientes.csv (src) ");
			System.out.println("para prueba el archivo se encuentra dentro de src, ingrese src ");
			archivoServicio.cargarDatos(fileName1);
			cargar = 1;
		}
	}

	@Override
	public void exportarDatos() {
		System.out.println("----------Exportar Datos----------");
		System.out.println("Seleccione el formato a exportar:");
		System.out.println("1.- Formato csv");
		System.out.println("2.- Formato txt");
		System.out.println("99.- Volver al menu\n");
		System.out.println("Ingrese una opcion para exportar:");
		System.out.println("----------------------------------");
//		System.out.println("lista1 --> " +listaClientes);
		List<Cliente> listaClientes = clienteServicio.getListaClientes();
//		System.out.println("lista --> " +listaClientes);
		int opcion = Integer.parseInt(scanner.nextLine());
		switch (opcion) {
		case 1:
			exportarCsv.exportar(fileName + ".cvs", listaClientes);
			utilidad.pausa();
			break;
		case 2:
			exportarCsv.exportar(fileName + ".txt", listaClientes);
			utilidad.pausa();
			break;
		case 99:
			System.out.println("Volviendo al menu principal....");
			utilidad.pausa();
			break;
		default:
			System.out.println("Número de opción ingresado incorrectamente.");
			utilidad.pausa();
			exportarDatos();
		}

	}

	@Override
	public void terminarPrograma() {
		// TODO Auto-generated method stub

	}

}
