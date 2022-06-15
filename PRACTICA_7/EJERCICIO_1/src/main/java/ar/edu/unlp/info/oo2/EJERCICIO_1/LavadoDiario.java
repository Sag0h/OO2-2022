package ar.edu.unlp.info.oo2.EJERCICIO_1;

public class LavadoDiario implements EstrategiaDeLavado{

	@Override
	public int lavar(Lavarropas lavarropas) {
		lavarropas.agregarAgua(50);
		lavarropas.agregarJabonEnPolvo();
		lavarropas.lavar(20);
		lavarropas.vaciarAgua();
		lavarropas.agregarAgua(50);
		lavarropas.agregarEnjuague();
		lavarropas.enjuagar(7);
		lavarropas.vaciarAgua();
		lavarropas.centrifugar(3);
		return 30;
	}


}
