package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional implements TipoDeLlamada {
	
	@Override
	public double calcularMonto(int duracion) {
		return duracion *3 + (duracion*3*0.21);
	}

}
