package ar.edu.unlp.info.oo2.ejercicio_2;

public class Cliente {

	private String nombre;
	private String apellido;
	private String CBU;
	private String email;

	public Cliente(String nombre, String apellido, String CBU, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.CBU = CBU;
		this.email = email;
	}
	
	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}
	
	public String getCBU() {
		return this.CBU;
	}
	
	public String getEmail() {
		return this.email;
	}
	
}
