package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.Vector;

public class TopografiaMixta extends Topografia {
	private Vector<Topografia> componentes;
	
	public TopografiaMixta(Topografia c1, Topografia c2, Topografia c3, Topografia c4) {
		componentes = new Vector<Topografia>(4);
		componentes.add(c1);
		componentes.add(c2);
		componentes.add(c3);
		componentes.add(c4);
	}

	
	@Override
	public Vector<Topografia> getComponentes(){
		return this.componentes;
	}
	
	@Override
	public double calcularProporcionAgua() {
		return this.componentes.stream().mapToDouble(c -> c.calcularProporcionAgua()).sum() / 4;
	}
	
	@Override
	public boolean equals(Topografia c) {
		return this.getComponentes().equals(c.getComponentes());
	// redefiniendo el equals de object 
	}
	
}
