/**
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Year;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DecoderTest {
	
	Decoder decoder;
	List<Movie> dataBaseMovies;
	
	Movie thor = new Movie("Thor", Year.of(2007), 7.9);
	Movie capitanAmerica = new Movie("Capitan America", Year.of(2016), 7.8);
	Movie ironMan = new Movie("Iron Man", Year.of(2010), 7.9);
	Movie dunkirk = new Movie("Dunkirk", Year.of(2017), 7.9);
	Movie rocky = new Movie("Rocky", Year.of(1976), 8.1);
	Movie rambo = new Movie("Rambo", Year.of(1979), 7.8);
	
 	@BeforeEach
	void setUp() throws Exception {
		decoder = new Decoder();
		// BASE DE DATOS 
		thor.addSimilarMovie(capitanAmerica);
		thor.addSimilarMovie(ironMan);
		capitanAmerica.addSimilarMovie(ironMan);
		rocky.addSimilarMovie(rambo);
		decoder.addMovie(thor);
		decoder.addMovie(capitanAmerica);
		decoder.addMovie(ironMan);
		decoder.addMovie(dunkirk);
		decoder.addMovie(rocky);
		decoder.addMovie(rambo);
		// Peliculas reproducidas
		decoder.addPlayed(thor);
		decoder.addPlayed(rocky);
 	}
    
 	@Test
    public void testNoveltyStrategy() {
    	decoder.setSuggestionStrategy(new NoveltyStrategy());
    	assertEquals("Dunkirk", decoder.suggestMovies().get(0).getTitle());
    	assertEquals("Capitan America", decoder.suggestMovies().get(1).getTitle());
    	assertEquals("Iron Man", decoder.suggestMovies().get(2).getTitle());
    }
    
    @Test
    public void testSimilarStrategy() {
    	decoder.setSuggestionStrategy(new SimilarStrategy());
    	assertEquals("Capitan America", decoder.suggestMovies().get(0).getTitle());
    	assertEquals("Iron Man", decoder.suggestMovies().get(1).getTitle());
    	assertEquals("Rambo", decoder.suggestMovies().get(2).getTitle());
    }
    
    @Test
    public void testScoreStrategy() {
    	decoder.setSuggestionStrategy(new ScoreStrategy());
    	assertEquals("Dunkirk", decoder.suggestMovies().get(0).getTitle());
    	assertEquals("Iron Man", decoder.suggestMovies().get(1).getTitle());
    	assertEquals("Capitan America", decoder.suggestMovies().get(2).getTitle());
    }
}
