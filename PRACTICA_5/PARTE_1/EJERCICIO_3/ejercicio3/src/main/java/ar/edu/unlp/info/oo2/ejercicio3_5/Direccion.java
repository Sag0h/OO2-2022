package ar.edu.unlp.info.oo2.ejercicio3_5;

public class Direccion {
	private String localidad;
	private String calle;
	private String numero;
	private String departamento;
	
	public Direccion(String localidad, String calle, String numero, String departamento) {
		super();
		this.localidad = localidad;
		this.calle = calle;
		this.numero = numero;
		this.departamento = departamento;
	}

	public String getLocalidad() {
		return localidad;
	}

	public String getCalle() {
		return calle;
	}

	public String getNumero() {
		return numero;
	}

	public String getDepartamento() {
		return departamento;
	}
	
	public String getDireccionFormateada() {
		return this.getLocalidad() + ", " +
				this.getCalle() + ", " +
				this.getNumero() + ", " +
				this.getDepartamento();
	}
	
}
