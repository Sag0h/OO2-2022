package ar.edu.unlp.info.oo2.EJERCICIO_1;

public class RopaDelicada implements EstrategiaDeLavado {

	public int lavar(Lavarropas lavarropas) {
		lavarropas.agregarAgua(100);
		lavarropas.agregarJabonEnPolvo();
		lavarropas.lavar(40);
		lavarropas.vaciarAgua();
		lavarropas.agregarAgua(100);
		lavarropas.agregarEnjuague();
		lavarropas.enjuagar(15);
		lavarropas.vaciarAgua();
		return 55;
	}

}
