package ar.edu.unlp.info.oo2.ejercicio_4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NewestStrategy implements SuggestionStrategy {

	@Override
	public List<Movie> suggestMovie(Decoder d) {
		List<Movie> moviesNotPlayed = d.getMovies().stream().filter(m -> !(d.getPlayedMovies().contains(m))).toList();
		return moviesNotPlayed.stream().sorted(Comparator.comparing(Movie::getReleaseYear).reversed()).limit(3).collect(Collectors.toList());
	}



}
