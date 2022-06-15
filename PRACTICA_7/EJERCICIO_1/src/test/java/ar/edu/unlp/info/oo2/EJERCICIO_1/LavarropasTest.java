/**
 * 
 */
package ar.edu.unlp.info.oo2.EJERCICIO_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LavarropasTest {
	
	Lavarropas lavarropas;

	@BeforeEach
	void setUp() throws Exception {
		lavarropas = new Lavarropas();
	}
    @Test
    public void LavadoDiario() {
    	lavarropas.modoLavadoDiario();
    	assertEquals(lavarropas.comenzarLavado(), 30);
    }
}
