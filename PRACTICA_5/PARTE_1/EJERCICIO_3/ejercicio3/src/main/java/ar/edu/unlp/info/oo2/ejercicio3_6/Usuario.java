package ar.edu.unlp.info.oo2.ejercicio3_6;

public class Usuario {
	private	String nombre;
	private Integer telefono;
	private String email;
	private Subscripcion tipoSubscripcion;
		
	public Usuario(String nombre, Integer telefono, String email, Subscripcion tipoSubscripcion) {
		super();
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
		this.tipoSubscripcion = tipoSubscripcion;
	}
	
	public void setTipoSubscripcion(Subscripcion unTipo) {
		this.tipoSubscripcion = unTipo;
	}

	public double calcularCostoPelicula(Pelicula pelicula) {
		return this.tipoSubscripcion.calcularCostoPelicula(pelicula);
	}

	public String getNombre() {
		return nombre;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public String getEmail() {
		return email;
	}

	public Subscripcion getTipoSubscripcion() {
		return tipoSubscripcion;
	}
		
}