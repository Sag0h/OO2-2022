/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DeviceTest {
	
	Dispositivo d;
	
	@BeforeEach
	void setUp()throws Exception{
		d = new Dispositivo();
	
	}
	
	@Test
	public void sendTest() {
		assertEquals("Datos", d.send("Datos"));
	}

	@Test 
	public void conectarConTest() {
		assertEquals(d.conectarCon(new WifiConn()), "WIFI SYMB");
		assertEquals(d.conectarCon(new G4Adapter()), "4G SYMB");
	}
	
	@Test
	public void configurarCRCTest() {
		// ni puta idea idea
	}
	
}
