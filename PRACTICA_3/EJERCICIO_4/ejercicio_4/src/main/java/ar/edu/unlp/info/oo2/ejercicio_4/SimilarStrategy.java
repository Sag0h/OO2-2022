package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimilarStrategy extends SuggestionStrategy {

	protected Stream<Movie> apply(List<Movie> l) {
					return l.stream().sorted(Comparator.comparing(Movie::getReleaseYear).reversed())
					.collect(Collectors.toList()).stream().filter(m -> m.getSimilarMovies().stream().anyMatch(aux -> aux.getSimilarMovies().contains(m)));
				
	}
}
