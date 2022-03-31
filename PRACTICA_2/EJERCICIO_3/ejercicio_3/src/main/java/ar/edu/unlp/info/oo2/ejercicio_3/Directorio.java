package ar.edu.unlp.info.oo2.ejercicio_3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Directorio extends FileSystem{
	private List<FileSystem> contenido;
	
    public Directorio(String nombre, LocalDate fecha) {
    	super(nombre, fecha, 32);
    	this.contenido = new ArrayList<FileSystem>();
    }

    public void agregar(FileSystem f) {
    	this.contenido.add(f);
    }
    
   	 /**
* Retorna el espacio total ocupado, incluyendo su contenido.
*/
    
    public int tamanoTotalOcupado() {
    	return this.tamano + this.contenido.stream().mapToInt(f -> f.tamanoTotalOcupado()).sum();
    }

    	/**
* Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
* filesystem contenido por directorio receptor
*/
	public Archivo archivoMasGrande(){
        return this.contenido.stream().map(c -> c.archivoMasGrande()).max(Comparator.comparingInt(c -> c.tamanoTotalOcupado())).orElse(null);
    }
   
	 /**
* Retorna el archivo con fecha de creación más reciente en cualquier nivel 
* del filesystem contenido por directorio receptor.
*/
    public Archivo archivoMasNuevo() {
    	return this.contenido.stream().map(c -> c.archivoMasNuevo()).max(Comparator.comparing(c -> c.getFecha())).orElse(null);
    }
    
}

