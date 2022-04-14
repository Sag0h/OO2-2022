package ar.edu.unlp.info.oo2.ejercicio_2;

public class DecoratorTamanio extends FileDecorator {

	public DecoratorTamanio(FileOO2 c) {
		super(c);
	}

	@Override
	public String print() {
		return this.component.getTamanio().toString();
	}


}
