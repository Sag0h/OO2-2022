package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersoonaJuridica extends Persoona{
	private String cuit;
	
	public PersoonaJuridica(String nombre, String tipoDeCliente, String telefono, String cuit ,Persoonal sis) {
		super(nombre, tipoDeCliente, telefono, sis);
		this.cuit = cuit;
	}

	public String getCuit() {
		return cuit;
	}
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	@Override
	public double getDescuento() {
		return 0.15;
	}
}
