package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaFisica extends Persoona{
	private String dni;
	
	public PersoonaFisica(String nombre, String tipoDeCliente, String telefono, String dni ,Persoonal sis) {
		super(nombre, tipoDeCliente, telefono, sis);
		this.dni = dni;
	}
	
	public PersoonaFisica(String nombre, String tipoDeCliente, String dni) {
		super(nombre, tipoDeCliente);
		this.dni = dni;
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}

}
