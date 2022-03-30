/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MediaTest {
	
	MediaPlayer reproductor;
	
	@BeforeEach
	void setUp() throws Exception {
		reproductor = new MediaPlayer();
		reproductor.addMedia(new VideoStreamAdapter(new VideoStream()));
		reproductor.addMedia(new Audio());
		reproductor.addMedia(new VideoFile());
	}
    @Test
    public void testCantidadDeArchivos() {
    	assertEquals(3, reproductor.getMedia().size());
    }
    
    @Test
    public void testPlay() {
    	for(Media m: reproductor.getMedia()) {
    		m.play();
    	}
    }
    
    
}
