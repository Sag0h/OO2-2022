package ar.edu.unlp.info.oo2.ejercicio_2;

public class DecoratorPermisos extends FileDecorator {

	public DecoratorPermisos(FileOO2 c) {
		super(c);
	}

	@Override
	public String print() {
		return this.component.getPermisos();
	}


}
