package ar.edu.unlp.info.oo2.EJERCICIO_1;

public class RopaMuySucia implements EstrategiaDeLavado {

	@Override
	public int lavar(Lavarropas lavarropas) {
		lavarropas.agregarAgua(100);
		lavarropas.agregarJabonEnPolvo();
		lavarropas.lavar(100);
		lavarropas.vaciarAgua();
		lavarropas.agregarAgua(100);
		lavarropas.agregarJabonEnPolvo();
		lavarropas.lavar(30);
		lavarropas.vaciarAgua();
		lavarropas.agregarAgua(100);
		lavarropas.agregarEnjuague();
		lavarropas.enjuagar(15);
		lavarropas.vaciarAgua();
		lavarropas.centrifugar(10);
		return 155;
	}

}
