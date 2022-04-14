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
		assertEquals("transmitting data", d.send("Datos"));
	}

	@Test 
	public void conectarConTest() {
		assertEquals(d.conectarCon(new WifiConn()), "connecting method changed");
		assertEquals(d.conectarCon(new G4Adapter()), "connecting method changed");
	}
	
	@Test
	public void configurarCRCTest() {
		assertEquals(d.configurarCRC(new CRC32_Calculator()), "crc config changed");
	}
	
}
