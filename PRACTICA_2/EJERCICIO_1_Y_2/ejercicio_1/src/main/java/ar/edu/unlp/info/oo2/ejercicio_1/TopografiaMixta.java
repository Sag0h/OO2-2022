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
		if(this.calcularProporcionAgua() == c.calcularProporcionAgua()) {
			if(this.getComponentes().size() == c.getComponentes().size()) {
				for(int i=0; i<this.getComponentes().size(); i++) {
					if(!(this.getComponentes().get(i).equals(c.getComponentes().get(i)))) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}
	
}
