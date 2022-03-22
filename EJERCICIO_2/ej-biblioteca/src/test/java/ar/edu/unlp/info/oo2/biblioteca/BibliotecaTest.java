package ar.edu.unlp.info.oo2.biblioteca;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {

	Biblioteca biblio;
	Socio arya;
	Socio tyron;
	
	@BeforeEach
	public void setUp() throws Exception{
		biblio = new Biblioteca();
		arya = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		tyron = new Socio("Tyron Lannister", "tyron@thelannisters.com", "2345-2");
		biblio.agregarSocio(arya);
		biblio.agregarSocio(tyron);
	}

	@Test
	public void testBiblioteca() {
		System.out.println(biblio.exportarSocios());
		Assertions.assertEquals("[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"nombre\": \"Tyron Lannister\",\n"
				+ "		\"email\": \"tyron@thelannisters.com\",\n"
				+ "		\"legajo\": \"2345-2\"\n"
				+ "	}\n"
				+ "]", biblio.exportarSocios());
	}
	
}
