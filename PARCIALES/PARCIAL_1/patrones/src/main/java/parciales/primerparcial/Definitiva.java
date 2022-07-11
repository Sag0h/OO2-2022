package parciales.primerparcial;

public class Definitiva extends Estado {

	public Definitiva(Excursion e) {
		super(e);
		// TODO Auto-generated constructor stub
	}
	
	public void inscribir(Usuario usuario) {
		super.inscribir(usuario);
		if(this.excursion.alcanzoCupoMaximo()) {
			this.excursion.setEstado(new Llena(this.excursion));
		}
	}

	@Override
	protected String getInfo() {
		// TODO Auto-generated method stub
		return "Mail de los Inscriptos: "+
				this.excursion.getMailInscriptos() +
				"\n Usuarios faltantes para llegar al Cupo Maximo:" +
				this.excursion.getCantidadFaltanteCupoMaximo();
	}

}
