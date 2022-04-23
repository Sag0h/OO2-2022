package ar.edu.unlp.info.oo2.ejercicio_1;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Artist extends Content {

	private List<Album> albums;

	public Artist(String name){
		super(name);
		this.albums = new ArrayList<Album>();
	}

	public Artist(String name, List<Album> albums){
		super(name);
		this.albums = albums;
	}

	public void addAlbum(Album a){
		this.albums.add(a);
	}

	@Override
	public List<Song> search(String s) {
		if(this.isInOrEqual(s)){
			return this.albums.stream().flatMap(a -> a.getSongs().stream()).collect(Collectors.toList());
		}
		return this.albums.stream().flatMap(a -> a.search(s).stream()).collect(Collectors.toList());
	}

}
