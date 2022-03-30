package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.Vector;

public abstract class Topografia {

	public abstract double calcularProporcionAgua();
	
	public double calcularProporcionTierra() {
		return 1 - this.calcularProporcionAgua();
	}
	
	public Vector<Topografia> getComponentes() {
		Vector<Topografia> v = new Vector<Topografia>();
		v.add(this);
		return v;
	}
	
	public boolean equals(Topografia c) {
		return this.calcularProporcionAgua() == c.calcularProporcionAgua();
	}
	
}
