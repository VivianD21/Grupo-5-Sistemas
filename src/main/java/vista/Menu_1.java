package vista;

import java.util.List;
import java.util.Scanner;

import modelo.Cliente_p;
import servicio.ArchivoServicio;
import servicio.ClienteServicio_1;
import servicio.ClienteServicio;
import servicio.Exportador;
import utilidades.Utilidad;


//listarCliente.
//agregarCliente.
//editarCliente.
//importarDatos.
//exportarDatos.
//terminarPrograma.

public class Menu_1 {
	

	enum Estado {
		ACTIVO, INACTIVO
	}
	
	 //private ArchivoServicio archivoServicio;
	//private ClienteServicio clienteServicio;
	//private Exportador exportador;
	//private ExportadorCsv exportadorCsv;
	//private ExportadorTxt exportadorTxt;
	static String fileName1 = "DBClientes.csv";


	public static void ejecutarMenu() {
		ArchivoServicio as= new ArchivoServicio();
		
		Scanner ingreso = new Scanner(System.in);
		String rutCliente;
		String nombreCliente;
		String apellidoCliente;
		int antiguedad;
		int opcion;

		boolean op = true;
		{
			while (op) {

				System.out.println("Opciones");
				System.out.println("1 Listar Clientes");
				System.out.println("2 Agregar Cliente");
				System.out.println("3 Editar Cliente");
				System.out.println("4 Cargar Datos");
				System.out.println("5 Exportar Datos");
				System.out.println("6 Terminar Programa");
				System.out.println("Ingrese una opción:  ");
				opcion = ingreso.nextInt();

				if (opcion == 6) {
					System.out.println(" Programa finalizado  ");
					break;
				} else {
					switch (opcion) {
					case 1:
						listarCliente();
						System.out.println("xxxxxxxxx:  ");

						break;

					case 2:
						agregarCliente();
						System.out.println("xxxxxxxxx:  ");

						break;

					case 3:
						editarCliente();
						System.out.println("xxxxxxxxx:  ");
						break;

					case 4:
						as.cargarDatos(fileName1);
						System.out.println("xxxxxxxxx:  ");
						break;

					case 5:
//						exportarDatos();
						System.out.println("xxxxxxxxx:  ");
						break;

					default:
						System.out.println("Esa opción no es válida");
					}
				}
			}
		}

	}

	private static void listarCliente() {
	}

	private static void agregarCliente() {
	
	}

	private static void editarCliente() {
	
	}

 //	private static void cargarDatos() {
	
//	}

//	private static void exportarDatos() {
	
//	}
	
//static Scanner scanner = new Scanner(System.in);
//static ClienteServicio clienteServicio = new ClienteServicio();
//	
//	private static void exportarDatos() {
//		System.out.println("Exportar Datos");
//		System.out.println("Ingrese la opción 1 para exportar:");
//		
//		List<Cliente_p> listaClientes = clienteServicio.getListaClientes();
//		int opcion = scanner.nextInt();
//		switch (opcion) {
//		case 1:
//			exportartxt.exportar(fileName + ".txt", listaClientes);
//			Utilidad.pausa();
//			break;
//		case 2:
//			exportartxt.exportar(fileName + ".txt", listaClientes);
//			Utilidad.pausa();
//			break;
//		default:
//			System.out.println("Selección invalida");
//		}
//	}
}
