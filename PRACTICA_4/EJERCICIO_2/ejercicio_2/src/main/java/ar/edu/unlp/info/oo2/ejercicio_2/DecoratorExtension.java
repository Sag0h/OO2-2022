package ar.edu.unlp.info.oo2.ejercicio_2;

public class DecoratorExtension extends FileDecorator {

	public DecoratorExtension(FileOO2 c) {
		super(c);
	}

	@Override
	public String print() {
		return this.component.getExtension();
	}


}
