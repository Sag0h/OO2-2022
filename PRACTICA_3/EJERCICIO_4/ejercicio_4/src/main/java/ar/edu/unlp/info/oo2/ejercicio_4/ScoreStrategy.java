package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ScoreStrategy implements SuggestionStrategy {

	@Override
	public List<Movie> suggestMovies(Decoder d) {
		List<Movie> moviesNotPlayed = d.getMovies().stream()
				.filter(m -> !(d.getPlayedMovies().contains(m))).collect(Collectors.toList());
		return moviesNotPlayed.stream()
	            .sorted(Comparator.comparingDouble(Movie::getScore).reversed()
	                    .thenComparing(Comparator.comparing(Movie::getReleaseYear).reversed()))
	                    .limit(3)
	                    .collect(Collectors.toList()); 	
	}
}
