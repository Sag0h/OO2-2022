package ar.edu.unlp.info.oo2.ejercicio3_6;

public class Basico extends Subscripcion {

	public Basico() {
		super("Basico");
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calcular(Pelicula pelicula) {
		return pelicula.calcularCargoExtraPorEstreno();
	}

}
