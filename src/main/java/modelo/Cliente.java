package modelo;

public class Cliente {

	private String rutCliente;
	private String nombreCliente;
	private String apellidoCliente;
	private int antiguedad;
	private CategoriaEnum Categoria;
	
	//constructores
	public Cliente() {
		super();
	}

	public Cliente(String rutCliente, String nombreCliente, String apellidoCliente, int antiguedad,
			CategoriaEnum categoria) {
		super();
		this.rutCliente = rutCliente;
		this.nombreCliente = nombreCliente;
		this.apellidoCliente = apellidoCliente;
		this.antiguedad = antiguedad;
		Categoria = categoria;
	}

//TEST
	public Cliente(String string, String string2, String string3, String string4) {
		// TODO Auto-generated constructor stub
	}
//FIN TEST
	public String getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getApellidoCliente() {
		return apellidoCliente;
	}

	public void setApellidoCliente(String apellidoCliente) {
		this.apellidoCliente = apellidoCliente;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	public CategoriaEnum getCategoria() {
		return Categoria;
	}

	public void setCategoria(CategoriaEnum categoria) {
		Categoria = categoria;
	}

	@Override
	public String toString() {
		return "Cliente [rutCliente=" + rutCliente + ", nombreCliente=" + nombreCliente + ", apellidoCliente="
				+ apellidoCliente + ", antiguedad=" + antiguedad + ", Categoria=" + Categoria + "]";
	}

	
	
}
