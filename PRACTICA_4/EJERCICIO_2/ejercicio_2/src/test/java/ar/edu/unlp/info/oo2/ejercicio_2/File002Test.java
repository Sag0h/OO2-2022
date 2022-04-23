/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class File002Test {
	
	FileOO2 archivo;
	
	@BeforeEach
	void setUp() throws Exception {
		this.archivo = new File("pip", ".txt", 64.00, LocalDate.of(1999, 7, 13), LocalDate.of(2000, 3, 16), "lectura");
	}
    @Test
    public void testPrimerCaso() {
    	//test -> nombre - extension
    	FileOO2 e = new DecoratorExtension(archivo);
    	FileOO2 n = new DecoratorName(e);
    	assertEquals("pip - .txt", n.prettyPrint());
    }
    
    @Test
    public void testSegundoCaso() {
    	// test -> nombre - extension - fecha de creacion
    	FileOO2 f = new DecoratorFechaCreacion(archivo);
    	FileOO2 e = new DecoratorExtension(f);
    	FileOO2 n = new DecoratorName(e);
    	assertEquals("pip - .txt - 1999-07-13", n.prettyPrint());	
    }
    
    @Test
    public void testTercerCaso() {
    	// test -> permisos - nombre - extension - tamaño
    	FileOO2 f = new DecoratorTamanio(archivo);
    	FileOO2 e = new DecoratorExtension(f);
    	FileOO2 n = new DecoratorName(e);
    	FileOO2 p = new DecoratorPermisos(n);
    	assertEquals("lgectura - pip - .txt - 64.0", p.prettyPrint());	
    }
}
