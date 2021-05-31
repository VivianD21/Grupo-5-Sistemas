package vista;

import java.util.List;
import java.util.Scanner;

import modelo.*;
import servicio.*;
import utilidades.Utilidad;

public abstract class MenuVista {

	protected ClienteServicio clienteServicio = new ClienteServicio();
	protected ArchivoServicio archivoServicio = new ArchivoServicio();
	protected ExportadorCsv exportarCsv = new ExportadorCsv();
	protected ExportadorTxt exportarTxt = new ExportadorTxt();
	protected String fileName = "Clientes";
	protected String fileName1 = "DBClientes.csv";
	protected Scanner scanner = new Scanner(System.in);

	public Utilidad utilidad = new Utilidad();

	public abstract void listarCliente();

	public abstract void agregarCliente();

	public abstract void editarCliente();

	public abstract void importarDatos();

	public abstract void exportarDatos();

	public abstract void terminarPrograma();

	public final void iniciarMenu() {

		ArchivoServicio as = new ArchivoServicio();

//		Scanner ingreso = new Scanner(System.in);
//		String rutCliente;
//		String nombreCliente;
//		String apellidoCliente;
//		int antiguedad;
		String rut;
		int opcion;
		boolean op = true;

		{
			while (op) {
//				utilidad.borrar();
				System.out.println();
				System.out.println("Opciones");
				System.out.println("1 Listar Clientes");
				System.out.println("2 Agregar Cliente");
				System.out.println("3 Editar Cliente");
				System.out.println("4 Cargar Datos");
				System.out.println("5 Exportar Datos");
				System.out.println("6 Salir\n");
				System.out.println("Ingrese una opción:  ");
				opcion = Integer.parseInt(scanner.nextLine());

				if (opcion == 6) {
					System.out.println(" Programa finalizado  ");
					break;
				} else {
					switch (opcion) {
					case 1:
						listarCliente();
						utilidad.pausa();
						break;

					case 2:
						agregarCliente();
						utilidad.pausa();
						break;

					case 3:
						editarCliente();
						utilidad.pausa();
						break;

					case 4:
//						as.cargarDatos(fileName1);
						importarDatos();
						break;

					case 5:
						exportarDatos();
						break;

					default:
						System.out.println("Esa opción no es válida");
					}
				}
			}
		}

	}

//	private void exportarDatos() {
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
