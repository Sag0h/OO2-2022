/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SpOOtifyTest {
	
	SpOOtify spoti = new SpOOtify();
	
	@BeforeEach
	void setUp() throws Exception{
		
		// EMINEM
		
		Song s1 = new Song("The Real Slim Shady");
		Song s2 = new Song("Stan");
		Album a1 = new Album("The Marshall Mathers LP");
		a1.addSong(s1);
		a1.addSong(s2);
		

		Song s3 = new Song("Just Lose It");
		Song s4 = new Song("Lose Yourself");
		Album a2 = new Album("Just Lose It");
		a2.addSong(s3);
		a2.addSong(s4);

		Artist eminem = new Artist("Eminem");
		eminem.addAlbum(a1);
		eminem.addAlbum(a2);

		// THE CURE
		
		Song st1 = new Song("High");
		Song st2 = new Song("Friday im in love");
		Album tc1 = new Album("Wish"); 
		Artist thecure = new Artist("The cure");
		tc1.addSong(st1);
		tc1.addSong(st2);
		thecure.addAlbum(tc1);

		// DUA LIPA BB <3

		Song sd1 = new Song("Physical");
		Song sd2 = new Song("Levitating");
		Album d1 = new Album("Future nostalgia");
		Artist dualipa = new Artist("Dua Lipa"); 
		d1.addSong(sd1);
		d1.addSong(sd2);
		dualipa.addAlbum(d1);
		
		spoti.addArtist(eminem);
		spoti.addArtist(thecure);
		spoti.addArtist(dualipa);
		
		
	}
	
	@Test
	public void searchArtist(){
		assertEquals(2,spoti.search("Dua Lipa".toLowerCase()).size());
	}
	
	@Test
	public void searchSubString(){
		assertEquals(4,spoti.search("the").size());
	}

	@Test
	public void searchSingleSong(){
		assertEquals(1, spoti.search("Stan".toLowerCase()).size());
	}

	@Test
	public void searchNotFound(){
		assertEquals(0, spoti.search("Metallica".toLowerCase()).size());
	}

	
}
