package utilidades;

public class Utilidad {
	
	public static void borrar() {
		for (int i = 0; i < 50; i++) {
			System.out.println("");

			
		}
		
	}
	
	public static void pausa() {
/*		for (int i = 0; i < 1000000; i++) {
			
			
		}*/try {
			Thread.sleep(2000);
		} catch (Exception e) {
			System.out.println("en pausa");
		}
		
	}

}
