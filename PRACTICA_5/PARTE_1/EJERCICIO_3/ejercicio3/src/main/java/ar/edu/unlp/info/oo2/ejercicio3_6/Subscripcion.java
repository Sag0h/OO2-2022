package ar.edu.unlp.info.oo2.ejercicio3_6;

public abstract class Subscripcion {
	protected String nombreTipo;
	
	public Subscripcion(String nombre) {
		this.nombreTipo = nombre;
	}
	
	public abstract double calcular(Pelicula pelicula);
	
	public double calcularCostoPelicula(Pelicula pelicula) {
		return pelicula.getCosto() + this.calcular(pelicula);
	}
	
}
