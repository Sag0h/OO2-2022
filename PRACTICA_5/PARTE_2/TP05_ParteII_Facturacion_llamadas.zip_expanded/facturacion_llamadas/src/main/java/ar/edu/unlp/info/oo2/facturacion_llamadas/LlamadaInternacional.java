package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional implements TipoDeLlamada {

	@Override
	public double calcularMonto(int duracion) {
		return duracion *200 + (duracion*200*0.21);
	}

}
