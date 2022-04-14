package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.Comparator;
import java.util.List;

public class SimilarStrategy implements SuggestionStrategy {

	@Override
	public List<Movie> suggestMovies(Decoder d) {
		List<Movie> moviesNotPlayedSortedByNewest = d.getMovies().stream()
				.filter(m -> !(d.getPlayedMovies().contains(m)))
				.toList()
					.stream()
					.sorted(Comparator.comparing(Movie::getReleaseYear).reversed())
					.toList();
			
		return moviesNotPlayedSortedByNewest.stream()
				.filter(m -> m.getSimilarMovies().stream().anyMatch(aux -> aux.getSimilarMovies().contains(m))).limit(3).toList();
				
	}
}
