package ar.edu.unlp.info.oo2.ejercicio_2;

import java.time.LocalDate;

public abstract class FileDecorator implements FileOO2{
	protected FileOO2 component;
	
	public abstract String print();
	
	public String prettyPrint() {
		if(this.component.prettyPrint() != "") {
			return this.print() + " - " + this.component.prettyPrint();
		}
		return this.print();
	}
	
	public FileDecorator(FileOO2 c) {
		this.component = c;
	}
	
	@Override
	public String getNombre() {
		return this.component.getNombre();
	}

	@Override
	public String getExtension() {
		return this.component.getExtension();
	}

	@Override
	public Double getTamanio() {
		return this.component.getTamanio();
	}

	@Override
	public LocalDate getFechaCreacion() {
		return this.component.getFechaCreacion();
	}

	@Override
	public LocalDate getFechaModificacion() {
		return this.component.getFechaModificacion();
	}

	@Override
	public String getPermisos() {
		return this.component.getPermisos();
	}
}
