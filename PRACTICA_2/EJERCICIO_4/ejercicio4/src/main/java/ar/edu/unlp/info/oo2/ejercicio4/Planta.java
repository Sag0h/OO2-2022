package ar.edu.unlp.info.oo2.ejercicio4;

public class Planta extends Empleado {
	private int añosAntiguedad;
	private boolean casado;
	private int cantHijos;
	
	public Planta(int a, int h, boolean casado) {
		this.añosAntiguedad = a;
		this.cantHijos = h;
		this.casado = casado;
	}
	
	@Override
	public double calcularBasico() {
		return 50000;
	}

	@Override
	public double calcularAdicional() {
		if(this.estaCasado()) {
			return 5000 + (2000*this.getCantHijos())+(2000*this.getAñosAntiguedad());
		}
		return (2000*this.getCantHijos()) + (2000*this.getAñosAntiguedad());
	}

	public int getCantHijos() {
		return cantHijos;
	}

	public void setCantHijos(int cantHijos) {
		this.cantHijos = cantHijos;
	}

	public boolean estaCasado() {
		return casado;
	}

	public void setEstaCasado(boolean casado) {
		this.casado = casado;
	}

	public int getAñosAntiguedad() {
		return añosAntiguedad;
	}

	public void setAñoAntiguedad(int añoAntiguedad) {
		this.añosAntiguedad = añoAntiguedad;
	}

}
