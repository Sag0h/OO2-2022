package ar.edu.unlp.info.oo2.ejercicio3_6;

public class Premium extends Subscripcion {

	public Premium() {
		super("Premium");
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcular(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return (-1 * pelicula.getCosto()) - (pelicula.getCosto() * 0.75);
	}

}
