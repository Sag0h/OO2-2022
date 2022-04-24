package ar.edu.unlp.info.oo2.ejercicio3_1;

public class EmpleadoPasante extends Empleado {
	
	public EmpleadoPasante(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	public EmpleadoPasante(String nombre, String apellido, double sueldo) {
		super(nombre, apellido, sueldo);
	}

	@Override
	public double calcularExtra() {
		return 0; 
	}


	
}
