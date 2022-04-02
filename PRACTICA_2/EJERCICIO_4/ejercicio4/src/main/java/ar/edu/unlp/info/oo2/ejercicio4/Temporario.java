package ar.edu.unlp.info.oo2.ejercicio4;

public class Temporario extends Empleado {
	private int horasTrabajadas;
	private int cantidadHijos;
	private boolean estaCasado;
	
	public Temporario(int h, int c, boolean casado) {
		super();
		this.setHorasTrabajadas(h);
		this.setCantidadHijos(c);
		this.setEstaCasado(casado);
	}
	
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getCantidadHijos() {
		return cantidadHijos;
	}

	public void setCantidadHijos(int cantidadHijos) {
		this.cantidadHijos = cantidadHijos;
	}

	public boolean estaCasado() {
		return estaCasado;
	}

	public void setEstaCasado(boolean estaCasado) {
		this.estaCasado = estaCasado;
	}

	@Override
	public double calcularBasico() {
		return 20000 + (this.getHorasTrabajadas() * 300);
	}

	@Override
	public double calcularAdicional() {
		if(this.estaCasado()) {
			return 5000 + (2000 * this.getCantidadHijos());
		}
		return 2000 * this.getCantidadHijos();
	}

}
