package parciales.primerparcial;

public abstract class Estado {
	protected Excursion excursion;
	
	public Estado(Excursion e) {
		this.excursion = e;
	}
	
	public void inscribir(Usuario usuario) {
		this.excursion.getListaInscriptos().add(usuario);
	}
	
	protected abstract String getInfo();
	
	public String obtenerInformacion() {
		return this.excursion.getInfoBasica() + this.getInfo();
	}
	
}
