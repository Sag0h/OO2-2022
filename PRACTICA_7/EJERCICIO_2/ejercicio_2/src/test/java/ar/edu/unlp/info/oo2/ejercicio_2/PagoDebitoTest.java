/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_2;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PagoDebitoTest {
	
	Cliente james;
	Pedido pedido;
		
	@BeforeEach
	void setUp() throws Exception {
		james = new Cliente("James", "Glossing", "123", "jg@gmail.com");
		pedido = new Pedido(james, 1000);
	}
    @Test
    public void testPagoDebito() {
    	assertFalse(pedido.pagarCon(new DebitoGatewayAdapter()));
    }
}
