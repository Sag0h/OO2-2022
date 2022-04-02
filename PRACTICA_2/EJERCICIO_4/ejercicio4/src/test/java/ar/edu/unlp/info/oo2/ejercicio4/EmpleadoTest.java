/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	
	Temporario james;
	Pasante guido;
	Planta julia;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Temporario(5, 2, false);
		guido = new Pasante(3);
		julia = new Planta(5, 1 ,true);
	}
    @Test
    public void testSueldos() {
    	assertEquals(22505, james.sueldo());
    	assertEquals(23100, guido.sueldo());
    	assertEquals(59650, julia.sueldo());
    }
}
