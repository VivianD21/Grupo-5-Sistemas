package servicio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import modelo.Cliente;

public class ExportadorTxt extends Exportador {

//	String filePath = "Temporal"; //TEMPORAL
	
	@Override
	public void exportar(String fileName, List<Cliente> listaClientes) {
		if (listaClientes == null) {
			System.out.println("La lista está vacía...");
		} else {

			String cvsSeparatorValue = ",";
			String file = "src/" + fileName;
			File fl = new File(fileName);
			if (fl.exists()) {
				fl.delete();
			}

			try {
				PrintWriter pWriter = new PrintWriter(new FileWriter(file));
				listaClientes.forEach(cliente -> {
					System.out.println(cliente.getRutCliente());
					pWriter.append(cliente.getRutCliente()).append(cvsSeparatorValue).append(cliente.getNombreCliente())
					.append(cvsSeparatorValue).append(cliente.getApellidoCliente()).append(cvsSeparatorValue)
					.append(String.valueOf(cliente.getAntiguedad())).append(cvsSeparatorValue).append(String.valueOf(cliente.getCategoria())); 
					pWriter.println();
				});
				pWriter.close();
				System.out.println("Datos del cliente exportados correctamente en formato .txt");
			} catch (IOException error) {
				System.out.println("El archivo no pudo ser creado en formato .txt");
			} finally {
				System.out.println("---------------------------------------");
			}
		}
	}

}
