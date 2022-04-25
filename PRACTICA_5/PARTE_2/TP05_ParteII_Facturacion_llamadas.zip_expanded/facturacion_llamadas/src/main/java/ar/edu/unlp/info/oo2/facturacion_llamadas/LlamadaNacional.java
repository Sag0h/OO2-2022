package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class LlamadaNacional extends Llamada {


	public LlamadaNacional(String tipoDeLLamada, String emisor, String remitente, int dur) {
		super(tipoDeLLamada, emisor, remitente, dur);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calcularMonto() {
		return this.getDuracion() *3 + (this.getDuracion()*3*0.21);
	}

}
