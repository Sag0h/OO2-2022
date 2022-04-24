package ar.edu.unlp.info.oo2.ejercicio3_1;

public class EmpleadoTemporario extends Empleado {
	private double horasTrabajadas;
	private int cantidadDeHijos;
	
	public EmpleadoTemporario(String nombre, String apellido, double sueldo, double horas, int cantHijos) {
		super(nombre, apellido, sueldo);
		this.setHorasTrabajadas(horas);
		this.setCantidadDeHijos(cantHijos);
	}
	
	public EmpleadoTemporario(String nombre, String apellido, double sueldo) {
		this(nombre, apellido, sueldo, 0, 0);
	}

	public EmpleadoTemporario(String nombre, String apellido) {
		this(nombre, apellido, 0);
	}

	@Override
	public double calcularExtra() {
		return (this.getHorasTrabajadas() * 500)+(this.getCantidadDeHijos() * 1000);
	}

	public double getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(double horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public int getCantidadDeHijos() {
		return cantidadDeHijos;
	}

	public void setCantidadDeHijos(int cantidadDeHijos) {
		this.cantidadDeHijos = cantidadDeHijos;
	}


	
}
