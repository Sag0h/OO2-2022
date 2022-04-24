package ar.edu.unlp.info.oo2.ejercicio3_6;

public class Familia extends Subscripcion {

	public Familia() {
		super("Familia");
		// TODO Auto-generated constructor stub
	}


	@Override
	public double calcular(Pelicula pelicula) {
		// TODO Auto-generated method stub
		return pelicula.calcularCargoExtraPorEstreno() * 0.90;
	}

}
