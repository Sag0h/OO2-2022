package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SimilarStrategy implements SuggestionStrategy {

	@Override
	public List<Movie> suggestMovie(Decoder d) {
		List<Movie> moviesNotPlayedSortedByNewest = d.getMovies().stream()
				.filter(m -> !(d.getPlayedMovies().contains(m)))
				.toList()
				.stream()
					.sorted(Comparator.comparing(Movie::getReleaseYear).reversed())
					.collect(Collectors.toList());
			
		return moviesNotPlayedSortedByNewest.stream()
				.filter(m -> m.getSimilarMovies().contains(m))
				.limit(3)
				.collect(Collectors.toList());
	}


}
