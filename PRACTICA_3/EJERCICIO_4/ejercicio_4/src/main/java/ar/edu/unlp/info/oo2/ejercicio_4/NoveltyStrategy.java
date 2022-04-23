package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class NoveltyStrategy extends SuggestionStrategy {

	@Override
	public Stream<Movie> apply(List<Movie> l) {
		return l.stream().sorted(Comparator.comparing(Movie::getReleaseYear).reversed());
	}
}
