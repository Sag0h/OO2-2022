package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.List;

public interface SuggestionStrategy {
	public List<Movie> suggestMovies(Decoder d);
}
