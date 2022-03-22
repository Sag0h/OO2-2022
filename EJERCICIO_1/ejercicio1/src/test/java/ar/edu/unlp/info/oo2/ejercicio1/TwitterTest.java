/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TwitterTest {
	
	Twitter app;
	Usuario james;
	Usuario guido;
	@BeforeEach
	void setUp() throws Exception {
		app = new Twitter();
		james = new Usuario("James");
		guido = new Usuario("Guido");
		app.registrarUsuario(james);
		app.registrarUsuario(guido);
	}
    @Test
    public void testCantidadDeUsuariosYEliminar() {
        assertEquals(2, app.getUsuarios().size());
        app.eliminarUsuario(james);
        assertEquals(1, app.getUsuarios().size());
        app.eliminarUsuario("sag0h");
    }
    
    @Test
    public void testTweets() {
    	Tweet correcto = james.tweetear("hola mundo");
    	Tweet fallaPorCero = james.tweetear("");
    	Tweet fallaPorMaximo = james.tweetear("Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque sagittis turpis eu enim efficitur scelerisque. Curabitur aliquam tincidunt..");
    	
    	Assertions.assertNotNull(correcto);
    	Assertions.assertNull(fallaPorCero);
    	Assertions.assertNull(fallaPorMaximo);
    }
    
    @Test
    public void testReTweet() {
    	Tweet tweetDeGuido = guido.tweetear("hola mundo");
    	Assertions.assertNotNull(james.retweetear(tweetDeGuido));
    }
    
    
}
