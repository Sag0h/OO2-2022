package ar.edu.unlp.info.oo2.ejercicio3_1;

public class EmpleadoPlanta extends Empleado {
	private int cantidadDeHijos;
	
	public EmpleadoPlanta(String nombre, String apellido) {
		super(nombre, apellido);
		this.setCantidadDeHijos(0);
	}
	
	public EmpleadoPlanta(String nombre, String apellido, double sueldo, int cantHijos) {
		super(nombre, apellido, sueldo);
		this.setCantidadDeHijos(cantHijos);
	}

	@Override
	public double calcularExtra() {
		return this.getCantidadDeHijos() * 2000;
	}

	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}


	
}
