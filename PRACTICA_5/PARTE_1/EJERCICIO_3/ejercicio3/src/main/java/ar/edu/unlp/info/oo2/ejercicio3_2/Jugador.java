package ar.edu.unlp.info.oo2.ejercicio3_2;

public class Jugador {
	private int puntuacion;
    // ......
    
	public Jugador(int cant) {
		this.puntuacion = cant;
	}
	
	public void incrementar(int cant) {
    	this.puntuacion += cant;
    }
    
    public int getPuntuacion() {
    	return this.puntuacion;
    }

	public void decrementar(int cant) {
		this.puntuacion -= cant;
	}
	
}
