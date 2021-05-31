package servicio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import modelo.CategoriaEnum;
import modelo.Cliente;
import utilidades.Utilidad;

public class ArchivoServicio extends ClienteServicio  {
	private Scanner sc = new Scanner(System.in);

	public void cargarDatos(String fileName) {
		

		List<Cliente> listaCliente= new ArrayList<Cliente>();

		String filePath = sc.nextLine(); // asigna ruta ingresada
		String file = filePath + File.separator + fileName;

		File fichero = new File(file); // importa el archivo

		try {
			// lectura archivo
			FileReader f = new FileReader(fichero);
			BufferedReader linea = new BufferedReader(f);

			String lineaLeida = linea.readLine(); // lee linea del archivo
					if (lineaLeida==null) {			//archivo vacio 
						System.out.println("archivo vacio");
					}
					else {
			do{//while (lineaLeida != null) {
				Cliente cliente = new Cliente();

				String[] corte = lineaLeida.split(",");// separa por "," la linea leida e ingresa cada cadena
														// a una posicion de un arreglo

				// ingreso de datos a ArrayList
				cliente.setRutCliente(corte[0]);

				cliente.setNombreCliente(corte[1]);

				cliente.setApellidoCliente(corte[2]);
				int ant = Integer.parseInt(corte[3]);
				cliente.setAntiguedad(ant);

				if (corte[4].equalsIgnoreCase("ACTIVO")) {
					cliente.setCategoria(CategoriaEnum.ACTIVO);
				} else {
					cliente.setCategoria(CategoriaEnum.INACTIVO);
				}

				listaClientes.add(cliente);

				lineaLeida = linea.readLine();

			}  while (lineaLeida != null);
					//}
			System.out.println("los datos del archivo DBClientes.csv");
			System.out.println("se han cargado correctamente\n");
			System.out.println("volviendo al menu principal....");
			Utilidad.pausa();
//			for (int i = 0; i < listaClientes.size(); i++) { // lista productos cargados en ArrayList
//				System.out.println(listaClientes.get(i));
//			}
//			Utilidad.pausa();
		}
			linea.close();
		} catch (Exception e) {
			System.out.println("no se pudo leer el archivo");
			System.out.println ("El error es: " + e.getMessage());
		} 

		// C:\Users\vitar\eclipse-workspace
	}

}
