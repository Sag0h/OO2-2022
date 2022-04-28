package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persoona {
	private List<Llamada> llamadas;
	private String tipoDeCliente;
	private String nombreYApellido;
	private String telefono;
	private Persoonal sistema;
	protected double descuento;
	
	public Persoona(String nombre, String tipoDeCliente, String telefono, Persoonal sistema) {
		this.nombreYApellido = nombre;
		this.tipoDeCliente = tipoDeCliente;
		this.telefono = telefono;
		this.sistema = sistema;
		this.llamadas = new ArrayList<Llamada>();
	}
	
	public Persoona(String nombre, String tipoDeCliente) {
		this.nombreYApellido = nombre;
		this.tipoDeCliente = tipoDeCliente;
		this.llamadas = new ArrayList<Llamada>();
	}
	
	public void agregarLlamada(Llamada llamada) {
		this.llamadas.add(llamada);
	}
	
	public List<Llamada> getListaDeLlamadas() {
		return llamadas;
	}
	public void setListaDeLlamadas(List<Llamada> llamadas) {
		this.llamadas = llamadas;
	}
	public String getTipoDeCliente() {
		return tipoDeCliente;
	}
	public void setTipoDeCliente(String t) {
		this.tipoDeCliente = t;
	}
	public String getNombreYApellido() {
		return nombreYApellido;
	}
	public void setNombreYApellido(String nya) {
		this.nombreYApellido = nya;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelelfono(String tel) {
		this.telefono = tel;
	}

	public Persoonal getSis() {
		return sistema;
	}

	public void setSistema(Persoonal sistema) {
		this.sistema = sistema;
	}
	
	public double getDescuento() {
		return 0;
	}

	public double calcularMontoTotalLlamadas() {
		double total = 0;
		for(Llamada l: this.getListaDeLlamadas()) {
			total += l.calcularMonto() - (l.calcularMonto() * getDescuento());
		}
		return total;
		
		//return this.getListaDeLlamadas().stream().mapToDouble(l -> (l.calcularMonto() - (l.calcularMonto() * this.getDescuento()))).sum();
	};
	
}
