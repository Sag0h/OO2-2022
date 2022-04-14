package ar.edu.unlp.info.oo2.ejercicio_2;

public class DecoratorName extends FileDecorator {

	public DecoratorName(FileOO2 c) {
		super(c);
	}

	@Override
	public String print() {
		return this.component.getNombre();
	}


}
