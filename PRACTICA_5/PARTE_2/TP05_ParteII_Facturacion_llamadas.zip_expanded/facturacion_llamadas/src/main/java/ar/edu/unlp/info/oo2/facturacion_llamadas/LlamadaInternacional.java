package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaInternacional extends Llamada {

	public LlamadaInternacional(String tipoDeLLamada, String emisor, String remitente, int dur) {
		super(tipoDeLLamada, emisor, remitente, dur);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularMonto() {
		return this.getDuracion() *200 + (this.getDuracion()*200*0.21);
	}

}
