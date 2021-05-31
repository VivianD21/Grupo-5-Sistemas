package pruebaUnid_I.BonBonJovi;

import static org.junit.Assert.assertEquals;

import java.util.logging.Logger;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import modelo.Cliente;
import servicio.ClienteServicio_1;

public class ClienteServicioTest {
	private ClienteServicio_1 clienteServicio = new ClienteServicio_1();
	private static Logger logger = Logger.getLogger("curso.java.ClienteServicioTest");
	@BeforeAll
	static void setup() { 
		logger.info("Inicio clase de prueba ClienteServicioTest");
	}
	@BeforeEach
	void init() {
		logger.info("Inicio metodo de prueba ClienteServicioTest2");
	}
	

	@Test
	public void testAgregarClientes() {
		logger.info("Testeando AgregarClientes...");
		Cliente pedro = new Cliente("1-3","POL","PAL","25");
		assertEquals("Agregado",clienteServicio.agregarCliente(pedro));
			
	}
	@Test
	public void testAgregarClienteNull() {
		logger.info("Testeando AgregarClienteNull...");
		Cliente cliente = new Cliente();
		assertEquals("Agregado",clienteServicio.agregarCliente(cliente));
	}
		

	

}
