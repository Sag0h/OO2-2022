package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class SuggestionStrategy {
	
	
	public List<Movie> suggestMovies(Decoder d){
		return this.apply(d.getMovies().stream()
				.filter(m -> !d.watchedMovie(m))
				.collect(Collectors.toList())).limit(3).collect(Collectors.toList());
	}

	protected abstract Stream<Movie> apply(List<Movie> collect);
	
}
