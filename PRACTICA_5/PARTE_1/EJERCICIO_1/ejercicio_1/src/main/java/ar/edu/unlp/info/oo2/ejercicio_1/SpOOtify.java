package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SpOOtify {
	private List<Artist> artists;

	public SpOOtify() {
		this.artists = new ArrayList<Artist>();
	}
	
	public void addArtist(Artist a) {
		this.artists.add(a);
	}

	public List<Song> search(String str) {
		return this.artists.stream().flatMap(a -> a.search(str.toLowerCase()).stream()).collect(Collectors.toList());
	}

}
