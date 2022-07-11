package parciales.primerparcial;

public class Provisoria extends Estado {

	public Provisoria(Excursion e) {
		super(e);
		// TODO Auto-generated constructor stub
	}
	
	public void inscribir(Usuario usuario) {
		super.inscribir(usuario);
		if(this.excursion.alcanzoCupoMinimo()) {
			this.excursion.setEstado(new Definitiva(this.excursion));
		}
	}

	@Override
	protected String getInfo() {
		// TODO Auto-generated method stub
		return Integer.toString(excursion.getCantidadFaltanteCupoMinimo());
	}

}
