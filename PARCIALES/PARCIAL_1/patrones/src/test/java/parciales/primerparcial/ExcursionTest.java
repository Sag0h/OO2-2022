/**
 * 
 */
package parciales.primerparcial;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ExcursionTest {
	
	Excursion excursion;
	Usuario usuario;
	@BeforeEach
	void setUp() throws Exception {
		excursion = new Excursion("Dos dias en kayak bajando el Paraná", LocalDate.now(), LocalDate.of(2022, 12, 20), "Bs As", 25.000, 1, 2);
		usuario = new Usuario("Miqueas", "Brambilla", "mikybrambilla@gmail.com");
		excursion.inscribir(new Usuario("Ignacio", "Carrera", "imnacho2000@gmail.com"));
		excursion.inscribir(new Usuario("Dante", "Fernandez", "dfernandez_99@gmail.com"));
	}
    @Test
    public void testNombreCompleto() {
    	assertEquals(excursion.getListaInscriptos().size(), 2);
    	excursion.inscribir(usuario);
    	assertEquals(excursion.getListaEspera().size(), 1);
    }
}
