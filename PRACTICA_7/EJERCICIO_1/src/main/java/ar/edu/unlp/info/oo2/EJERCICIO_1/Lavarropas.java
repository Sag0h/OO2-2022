package ar.edu.unlp.info.oo2.EJERCICIO_1;

public class Lavarropas {

	@SuppressWarnings("unused")
	private int porcentajeAgua;
	private EstrategiaDeLavado modo;

	public Lavarropas() {
		this.porcentajeAgua = 0;
		this.modoLavadoDiario();
	}
	
	public void agregarAgua(int porcentaje) {
		this.porcentajeAgua = porcentaje;
	}
	
	public void agregarJabonEnPolvo() {
		
	}
	
	public void agregarEnjuague() {
	
	}
	
	public void lavar(int minutos) {
		
	}
	
	public void vaciarAgua() {
		this.porcentajeAgua = 0;
	}
	
	public void enjuagar(int minutos) {
		
	}
	
	public void centrifugar(int minutos) {
		
	}
	
	public int comenzarLavado() {
		return this.modo.lavar(this);
	}
	
	public void cambiarModo(EstrategiaDeLavado modo) {
		this.modo = modo;
	}
	
	public void modoLavadoDiario() {
		this.modo = new LavadoDiario();
	}
	
	public void modoRopaDelicada() {
		this.modo = new RopaDelicada();
	}
	
	public void modoRopaMuySucia() {
		this.modo = new RopaMuySucia();
	}
	

}
