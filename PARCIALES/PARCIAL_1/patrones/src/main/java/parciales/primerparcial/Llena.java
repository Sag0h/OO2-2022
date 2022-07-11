package parciales.primerparcial;

public class Llena extends Estado {

	public Llena(Excursion e) {
		super(e);
		// TODO Auto-generated constructor stub
	}

	public void inscribir(Usuario usuario) {
		this.excursion.getListaEspera().add(usuario);
	}
	
	@Override
	protected String getInfo() {
		// TODO Auto-generated method stub
		return "";
	}

}
