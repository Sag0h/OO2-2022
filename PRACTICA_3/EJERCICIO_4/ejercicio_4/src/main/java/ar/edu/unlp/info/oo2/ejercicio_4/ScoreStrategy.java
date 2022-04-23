package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ScoreStrategy extends SuggestionStrategy {

	public Stream<Movie> apply(List<Movie> l){
	            return l.stream().sorted(Comparator.comparingDouble(Movie::getScore).reversed()
	                    .thenComparing(Comparator.comparing(Movie::getReleaseYear).reversed()));
	}
}
