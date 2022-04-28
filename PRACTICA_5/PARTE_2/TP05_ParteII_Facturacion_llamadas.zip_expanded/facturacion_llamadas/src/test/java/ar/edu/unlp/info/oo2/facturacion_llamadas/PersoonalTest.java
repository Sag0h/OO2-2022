package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersoonalTest {
	
	Persoonal sistema;
	Persoona emisorPersonaFisca, remitentePersonaFisica, emisorPersonaJuridica, remitentePersonaJuridica;
	
	@BeforeEach
	public void setUp() {
		this.sistema = new Persoonal();
		this.sistema.agregarTelefono("2214444554");
		this.sistema.agregarTelefono("2214444555");
		this.sistema.agregarTelefono("2214444556");
		this.sistema.agregarTelefono("2214444557");
		
		this.emisorPersonaFisca = sistema.registrarUsuario(new PersoonaFisica("Marcelo Tinelli" , "fisica", "11555666"));
		this.remitentePersonaFisica = sistema.registrarUsuario(new PersoonaFisica("Mirtha Legrand", "fisica", "00000001"));
		this.emisorPersonaJuridica = sistema.registrarUsuario(new PersoonaJuridica("Felfort", "juridica", "17555222"));
		this.remitentePersonaJuridica = sistema.registrarUsuario(new PersoonaJuridica("Moovistar", "juridica", "25765432"));
		
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaFisica, new LlamadaNacional(), 10);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaFisica, new LlamadaInternacional(), 8);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaJuridica, new LlamadaNacional(), 5);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaJuridica, new LlamadaInternacional(), 7);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaFisica, new LlamadaNacional(), 15);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaFisica, new LlamadaInternacional(), 45);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaJuridica, new LlamadaNacional(), 13);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaJuridica, new LlamadaInternacional(), 17);
		
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		DecimalFormat df = new DecimalFormat("#.00");
		assertEquals(df.format(emisorPersonaFisca.calcularMontoTotalLlamadas()), df.format(15105.640000000001));
		assertEquals(emisorPersonaJuridica.calcularMontoTotalLlamadas(), 3131.7825000000003);
		assertEquals(remitentePersonaFisica.calcularMontoTotalLlamadas(), 0);
		assertEquals(remitentePersonaJuridica.calcularMontoTotalLlamadas(), 0);
	}
	
	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		this.sistema.agregarTelefono("2214444558"); 
		Persoona nuevaPersona = this.sistema.registrarUsuario(new PersoonaFisica("fisica", "Chiche Gelblung", "2444555"));
		
		assertEquals(this.sistema.cantidadDeUsuarios(), 5);
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
		
	}
	
	@Test
	void testEliminarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		assertTrue(this.sistema.existeUsuario(emisorPersonaFisca));
		this.sistema.eliminarUsuario(emisorPersonaFisca);
		assertEquals(this.sistema.cantidadDeUsuarios(), 3);
		assertFalse(this.sistema.existeUsuario(emisorPersonaFisca));
	}

}
