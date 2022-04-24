package ar.edu.unlp.info.oo2.ejercicio3_1;

public abstract class Empleado {
	protected String nombre;
    protected String apellido;
    protected double sueldoBasico;


	public Empleado(String nombre, String apellido){
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldoBasico = 0;
	}

	public Empleado(String nombre, String apellido, double sueldo){
		this(nombre, apellido);
		this.sueldoBasico = sueldo;
	}

	public double getSueldoBasico() {
		return sueldoBasico;
	}

	public void setSueldoBasico(double sueldoBasico) {
		this.sueldoBasico = sueldoBasico;
	}

	public abstract double calcularExtra();

	public double sueldo(){
		return this.getSueldoBasico() + this.calcularExtra() - (this.getSueldoBasico() * 0.13);
	}

	
}
