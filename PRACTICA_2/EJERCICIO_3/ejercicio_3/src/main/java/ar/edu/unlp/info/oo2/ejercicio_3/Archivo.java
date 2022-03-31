package ar.edu.unlp.info.oo2.ejercicio_3;

import java.time.LocalDate;

public class Archivo extends FileSystem{

	
    public Archivo(String nombre, LocalDate fecha, int tamano) {
    	super(nombre, fecha, tamano);
    }

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

    
   
    
}
